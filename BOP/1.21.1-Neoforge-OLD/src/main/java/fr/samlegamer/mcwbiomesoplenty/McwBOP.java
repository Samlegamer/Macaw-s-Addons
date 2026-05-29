package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.mapping.MappingMissing;
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
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;

@Mod(McwBOP.MODID)
public class McwBOP extends McwMod
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal", "pine", "orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");
    protected static final DeferredRegister.Blocks block = Registration.blocks(MODID);
	protected static final DeferredRegister.Items item = Registration.items(MODID);
	protected static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwBOP.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
			.title(Component.translatable(McwBOP.MODID + "." + "tab")).icon(McwBOP::getIcon).build());

	public McwBOP(IEventBus bus)
    {
        super(bus);
		
		List<String> woodClassic = List.of("dead", "fir", "mahogany", "palm", "redwood", "willow", "pine");
		List<String> leaveClassic = List.of("dead", "fir", "hellbark", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "pine", "cypress", "flowering_oak", "rainbow_birch", "origin");

		Map<String, SoundType> mapWoodSoundCrimson = McwRegistry.makeDefaultFromList(List.of("hellbark", "umbran", "empyreal"), SoundType.NETHER_WOOD);
		Map<String, SoundType> mapWoodSoundCherry = McwRegistry.makeDefaultFromList(List.of("magic", "jacaranda", "maple"), SoundType.CHERRY_WOOD);
		Map<String, SoundType> mapLeaveSoundCherry = McwRegistry.makeDefaultFromList(List.of("snowblossom", "orange_maple", "red_maple", "yellow_maple", "jacaranda", "magic"), SoundType.CHERRY_LEAVES);

		LOGGER.info("Macaw's Biomes O' Plenty Loading...");
		Registration.init(bus, block, item, ct);

		McwRegistry.setRegistriesWood(woodClassic, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesWood(mapWoodSoundCrimson, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesWood(mapWoodSoundCherry, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(leaveClassic, block, item);
		McwRegistry.setRegistriesLeave(mapLeaveSoundCherry, block, item);

		final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbop", McwBOP.MODID, McwBOP.WOOD);
		final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbop", McwBOP.MODID, McwBOP.WOOD);
		final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbop", McwBOP.MODID, McwBOP.WOOD);
		final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbop", McwBOP.MODID, McwBOP.WOOD);

		McwBOP.LOGGER.info("Start convert blocks");
		fences.leavesAdding(McwBOP.LEAVES);
		bridges.missingnoWoodBlock(McwBOP.block);
		furnitures.missingnoWoodBlock(McwBOP.block);
		fences.missingnoWoodBlock(McwBOP.block);
		roofs.missingnoWoodBlock(McwBOP.block);
		McwBOP.LOGGER.info("Finish convert blocks");
		McwBOP.LOGGER.info("Start convert items");
		fences.leavesAdding(McwBOP.LEAVES);
		bridges.missingnoWoodItem(McwBOP.item);
		furnitures.missingnoWoodItem(McwBOP.item);
		fences.missingnoWoodItem(McwBOP.item);
		roofs.missingnoWoodItem(McwBOP.item);
		McwBOP.LOGGER.info("Finish convert items");

		bus.addListener(this::addFurnitures);
		bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
		LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

	private void addFurnitures(BlockEntityTypeAddBlocksEvent event)
	{
		McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD);
	}

    @Override
    public void clientSetup(FMLClientSetupEvent event)
    {
        APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        McwBlockTags mcwBlockTags = new McwBlockTags(output, registries, MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
				addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
				addAllMcwTagsLeave(MODID, LEAVES);
            }
        };

        generator.addProvider(true, new Recipes(output, registries));
        generator.addProvider(true, mcwBlockTags);
        generator.addProvider(true, new McwItemTags(output, registries, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
				addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
				addAllMcwTagsLeave(MODID, LEAVES);
            }
        });
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWBOP_TAB.get(), Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWBOP_TAB.get());
    }

	private static ItemStack getIcon()
    {
    	NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "redwood_roof"), Finder.findBlock(MODID, "redwood_picket_fence"), Finder.findBlock(MODID, "redwood_wardrobe"), 
    	        Finder.findBlock(MODID, "redwood_log_bridge_middle"), Finder.findBlock(MODID, "redwood_window"), Finder.findBlock(MODID, "redwood_japanese_door"), Finder.findBlock(MODID, "redwood_glass_trapdoor"), 
    	        Finder.findBlock(MODID, "redwood_planks_path"), Finder.findBlock(MODID, "redwood_loft_stairs"));
    	    	woodProperties
    	    	.addType(ModType.ROOFS)
    	    	.addType(ModType.FENCES)
    	    	.addType(ModType.FURNITURES)
    	    	.addType(ModType.BRIDGES)
    	    	.addType(ModType.WINDOWS)
    	    	.addType(ModType.DOORS)
    	    	.addType(ModType.TRAPDOORS)
    	    	.addType(ModType.PATHS)
    	    	.addType(ModType.STAIRS);
    	return new ItemStack(woodProperties.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.BRIDGES, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.STAIRS));
    }
}