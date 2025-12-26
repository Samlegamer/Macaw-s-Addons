package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import org.jspecify.annotations.NonNull;

@Mod(McwBOP.MODID)
public class McwBOP extends McwMod
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal",
	"pine",
	"orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwBOP.MODID);

	public static final RegistryObject<CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwBOP::getIcon).title(Component.translatable(McwBOP.MODID+".tab")).build());

	public McwBOP(FMLJavaModLoadingContext context)
    {
        super(context);

		List<String> woodClassic = List.of("dead", "fir", "mahogany", "palm", "redwood", "willow", "pine");
		List<String> leaveClassic = List.of("dead", "fir", "hellbark", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "pine", "cypress", "flowering_oak", "rainbow_birch", "origin");

		Map<String, SoundType> mapWoodSoundCrimson = McwRegistry.makeDefaultFromList(List.of("hellbark", "umbran", "empyreal"), SoundType.NETHER_WOOD);
		Map<String, SoundType> mapWoodSoundCherry = McwRegistry.makeDefaultFromList(List.of("magic", "jacaranda", "maple"), SoundType.CHERRY_WOOD);
		Map<String, SoundType> mapLeaveSoundCherry = McwRegistry.makeDefaultFromList(List.of("snowblossom", "orange_maple", "red_maple", "yellow_maple", "jacaranda", "magic"), SoundType.CHERRY_LEAVES);

		LOGGER.info("Macaw's Biomes O' Plenty Loading...");
		Registration.init(context, block, item, ct);

		McwRegistry.setRegistriesWood(woodClassic, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesWood(mapWoodSoundCrimson, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesWood(mapWoodSoundCherry, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(leaveClassic, block, item);
		McwRegistry.setRegistriesLeave(mapLeaveSoundCherry, block, item);

		BusGroup modBusGroup = context.getModBusGroup();
		FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::commonSetup);
		FMLClientSetupEvent.getBus(modBusGroup).addListener(this::clientSetup);
        GatherDataEvent.getBus(modBusGroup).addListener(this::dataSetup);
		BuildCreativeModeTabContentsEvent.getBus(modBusGroup).addListener(this::tabSetup);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event)
	{
		APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(event, MODID, LEAVES);
	}

    @Override
    public void commonSetup(FMLCommonSetupEvent event)
	{
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
			McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD);
        });
	}

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer()) {
            generator.addProvider(true, new Recipes.Runner(output, registries));
            generator.addProvider(true, new McwBlockTags(output, registries, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NonNull Provider p_256380_) {
					addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
            generator.addProvider(true, new McwItemTags(output, registries, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NonNull Provider p_255639_) {
					addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWBOP_TAB.get(), Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWBOP_TAB.get());
    }

    private static ItemStack getIcon()
	{
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, "redwood_roof"),
				Finder.findBlock(MODID, "redwood_picket_fence"),
				Finder.findBlock(MODID, "redwood_wardrobe"),
				Finder.findBlock(MODID, "redwood_log_bridge_middle"),
				Finder.findBlock(MODID, "redwood_pane_window"),
				Finder.findBlock(MODID, "redwood_modern_door"),
				Finder.findBlock(MODID, "redwood_mystic_trapdoor"),
				Finder.findBlock(MODID, "redwood_planks_path"),
				Finder.findBlock(MODID, "redwood_skyline_stairs"));

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
}