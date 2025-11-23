package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import org.jetbrains.annotations.NotNull;

@Mod(McwBOP.MODID)
public class McwBOP extends McwMod
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow");
	public static final List<String> LEAVES = List.of("pink_cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "maple", 
	"orange_autumn", "yellow_autumn", "white_cherry", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
	public static CreativeModeTab MCWBOP_TAB;
	
    public McwBOP()
    {
        LOGGER.info("Macaw's Biomes O' Plenty Loading...");
    	Registration.init(block, item);

    	Bridges.setRegistrationWood(WOOD, block, item);
    	Fences.setRegistrationWood(WOOD, block, item);
    	Fences.setRegistrationHedges(LEAVES, block, item);
    	Furnitures.setRegistrationWood(WOOD, block, item);
    	Roofs.setRegistrationWood(WOOD, block, item);
    	Trapdoors.setRegistrationWood(WOOD, block, item);
    	Paths.setRegistrationWood(WOOD, block, item);
    	Doors.setRegistrationWood(WOOD, block, item);
    	Windows.setRegistrationWood(WOOD, block, item);
    	Stairs.setRegistrationWood(WOOD, block, item);

        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        bus().addListener(this::tabRegistry);
        bus().addListener(this::tabSetup);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
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
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = gatherDataEvent.getLookupProvider();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, lookupProvider, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTags(MODID, WOOD, LEAVES);
                }
            };

            generator.addProvider(true, new Recipes(output));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, lookupProvider, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTags(MODID, WOOD, LEAVES);
                }
            });
        }
    }

    @Override
    public void tabRegistry(CreativeModeTabEvent.Register event) {
        NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "cherry_roof"), Finder.findBlock(MODID, "cherry_picket_fence"), Finder.findBlock(MODID, "cherry_wardrobe"),
                Finder.findBlock(MODID, "cherry_log_bridge_middle"), Finder.findBlock(MODID, "cherry_window"), Finder.findBlock(MODID, "cherry_japanese_door"), Finder.findBlock(MODID, "cherry_glass_trapdoor"),
                Finder.findBlock(MODID, "cherry_planks_path"), Finder.findBlock(MODID, "cherry_loft_stairs"));
        woodProperties
                .addType(BlockType.ROOFS)
                .addType(BlockType.FENCES)
                .addType(BlockType.FURNITURES)
                .addType(BlockType.BRIDGES)
                .addType(BlockType.WINDOWS)
                .addType(BlockType.DOORS)
                .addType(BlockType.TRAPDOORS)
                .addType(BlockType.PATHS)
                .addType(BlockType.STAIRS);
        final Block icon = woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS);
        MCWBOP_TAB = Registration.tabs(event, MODID, "tab", icon);
    }

    @Override
    public void tabSetup(CreativeModeTabEvent.BuildContents event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWBOP_TAB, Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWBOP_TAB);
    }
}