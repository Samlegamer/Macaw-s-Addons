package fr.samlegamer.mcwaurora;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;

@Mod(McwAurora.MODID)
public class McwAurora extends McwMod
{
	public static final String MODID = "mcwaurora";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final List<String> WOOD_ENHANCED_MUSH = List.of("mushroom"); // enhanced_mushrooms
	public static final List<String> WOOD_NOMANSLAND = List.of("maple", "pine", "walnut", "willow"); // nomansland
	public static final List<String> LEAVE_NOMANSLAND = List.of("maple", "pine", "walnut", "willow", "autumnal_oak", "frosted", "pale_cherry", "yellow_birch", "red_maple"); // nomansland

    private static final DeferredRegister.Blocks block = Registration.blocks(MODID);
    private static final DeferredRegister.Items item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWAURORA_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwAurora::getIcon).title(Component.translatable(MODID+".tab")).build());
    
    public McwAurora(IEventBus modBus)
    {
        super(modBus);
        LOGGER.info("Macaw's Aurora Mod Loading...");
    	Registration.init(modBus, block, item, ct);
		final List<String> leaveClassic = List.of("maple", "pine", "walnut", "willow", "autumnal_oak", "frosted", "yellow_birch", "red_maple");
		Map<String, SoundType> leaveSoundCherry = McwRegistry.makeDefaultFromList(List.of("pale_cherry"), SoundType.CHERRY_LEAVES);

		McwRegistry.setRegistriesWood(WOOD_ENHANCED_MUSH, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesWood(WOOD_NOMANSLAND, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(leaveClassic, block, item);
		McwRegistry.setRegistriesLeave(leaveSoundCherry, block, item);

		modBus.addListener(this::addToFurnitureStorage);
		modBus.addListener(this::clientSetup);
        modBus.addListener(this::commonSetup);
        modBus.addListener(this::dataSetup);
        modBus.addListener(this::tabSetup);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(event, MODID, WOOD_NOMANSLAND, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVE_NOMANSLAND);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD_ENHANCED_MUSH);
            McwLootTables.addBlockAllWood(MODID, WOOD_NOMANSLAND);
            McwLootTables.addBlockHedges(MODID, LEAVE_NOMANSLAND);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, registries, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
                    addAllMcwTagsWood(MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());

					addAllMcwTagsWood(MODID, WOOD_NOMANSLAND, Registration.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, LEAVE_NOMANSLAND);
                }
            };

            generator.addProvider(true, new Recipes(output, registries));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, registries, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
					addAllMcwTagsWood(MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());

					addAllMcwTagsWood(MODID, WOOD_NOMANSLAND, Registration.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, LEAVE_NOMANSLAND);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        ModList modList = ModList.get();
        if (modList.isLoaded("enhanced_mushrooms")) {
            APICreativeTab.initAllWood(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get(), Registration.getAllModTypeWood());
        }

        if (modList.isLoaded("nomansland")) {
            APICreativeTab.initAllWood(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get(), Registration.getAllModTypeWood());
            APICreativeTab.initAllLeave(event, MODID, LEAVE_NOMANSLAND, MCWAURORA_TAB.get());
        }
    }

    public void addToFurnitureStorage(BlockEntityTypeAddBlocksEvent event)
	{
		McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD_ENHANCED_MUSH);
		McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD_NOMANSLAND);
	}
    
    private static ItemStack getIcon()
    {
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, randomNaming()+"_roof"),
				Finder.findBlock(MODID, randomNaming()+"_picket_fence"),
				Finder.findBlock(MODID, randomNaming()+"_wardrobe"),
				Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
				Finder.findBlock(MODID, randomNaming()+"_pane_window"),
				Finder.findBlock(MODID, randomNaming()+"_modern_door"),
				Finder.findBlock(MODID, randomNaming()+"_mystic_trapdoor"),
				Finder.findBlock(MODID, randomNaming()+"_planks_path"),
				Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));

		prop.addType(ModType.BRIDGES)
				.addType(ModType.ROOFS)
				.addType(ModType.FENCES)
				.addType(ModType.FURNITURES)
				.addType(ModType.STAIRS)
				.addType(ModType.PATHS)
				.addType(ModType.WINDOWS)
				.addType(ModType.DOORS)
				.addType(ModType.TRAPDOORS);
		Block icon = prop.buildIcon(ModType.BRIDGES, ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.STAIRS,
				ModType.PATHS, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS);
    	return new ItemStack(icon);
    }

	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("nomansland") && ModList.get().isLoaded("enhanced_mushrooms"))
		{
			int i = rand.nextInt(2);

			switch(i)
			{
				case 0:
					return "walnut";
				case 1:
					return "mushroom";
				default:
					return "mushroom";
			}
		}
		else
		{
			if(ModList.get().isLoaded("enhanced_mushrooms"))
			{
				return "mushroom";
			}

			if(ModList.get().isLoaded("nomansland"))
			{
				return "walnut";
			}
		}
		return "mushroom";
	}
}