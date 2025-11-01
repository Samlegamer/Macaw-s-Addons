package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.data.McwBlocksIdBase;
import fr.samlegamer.addonslib.data.ModType;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import javax.annotation.Nonnull;

@Mod(McwByg.MODID)
@Mod.EventBusSubscriber(modid = McwByg.MODID, bus = Bus.MOD)
public class McwByg extends McwMod
{
	public static final String MODID = "mcwbyg";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> fences_rockable = Arrays.asList("soapstone", "travertine", "dacite", "red_rock", "scoria_stone");
    public static final List<String> bridges_rockable = Arrays.asList("cryptic_stone", "dacite_bricks", "polished_travertine", "purpur_stone", "red_rock_bricks", "scoria_stone_bricks", "soapstone_bricks");
    public static final List<String>  LEAVES = Arrays.asList("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
    "palm","pine","rainbow_eucalyptus","redwood","skyris","mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", 
    "orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
    "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");
    public static final List<String> WOOD = Arrays.asList("aspen","baobab", "blue_enchanted","cherry","cika","cypress","ebony","ether","fir","green_enchanted","holly","jacaranda",
    "lament","mahogany","mangrove","maple","nightshade","palm","pine","rainbow_eucalyptus","redwood","skyris", "willow", "witch_hazel", "zelkova", "bulbis", "imparius", "sythian");

	public static final ItemGroup MCWBYG_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
					Finder.findBlock(MODID, "aspen_roof"),
					Finder.findBlock(MODID, "aspen_picket_fence"),
					Finder.findBlock(MODID, "aspen_wardrobe"),
	        		Finder.findBlock(MODID, "aspen_log_bridge_middle"),
					Finder.findBlock(MODID, "aspen_plank_window2"),
					Finder.findBlock(MODID, "aspen_paper_door"),
					Finder.findBlock(MODID, "aspen_blossom_trapdoor"),
					Finder.findBlock(MODID, "aspen_planks_path"),
					Finder.findBlock(MODID, "aspen_bulk_stairs"));
	    	
					prop
					.addType(BlockType.ROOFS)
					.addType(BlockType.FENCES)
					.addType(BlockType.BRIDGES)
					.addType(BlockType.FURNITURES)
					.addType(BlockType.STAIRS)
					.addType(BlockType.DOORS)
					.addType(BlockType.TRAPDOORS)
					.addType(BlockType.PATHS)
					.addType(BlockType.WINDOWS);
	    	Block icon = prop.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.BRIDGES, BlockType.FURNITURES, BlockType.STAIRS,
					BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.WINDOWS);
	        return new ItemStack(icon);
	    }
	};
	
    public McwByg()
    {
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::dataSetup);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
            McwLootTables.addBlock(MODID, bridges_rockable, McwBlocksIdBase.BRIDGES_STONE_BLOCKS);
            McwLootTables.addBlock(MODID, fences_rockable, McwBlocksIdBase.ROOFS_STONE_BLOCKS);
            McwLootTables.addBlock(MODID, fences_rockable, McwBlocksIdBase.FENCES_STONE_BLOCKS);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        if(gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(gatherDataEvent.getGenerator(), MODID, gatherDataEvent.getExistingFileHelper()) {
                @Override
                protected void addTags() {
                    addAllMcwTags(MODID, WOOD, LEAVES);
                    mcwBridgesTagsStone(MODID, bridges_rockable);
                    mcwFencesTags(MODID, new ArrayList<>(), new ArrayList<>(), fences_rockable);
                }
            };

            gatherDataEvent.getGenerator().addProvider(new Recipes(gatherDataEvent.getGenerator()));
            gatherDataEvent.getGenerator().addProvider(mcwBlockTags);
            gatherDataEvent.getGenerator().addProvider(new McwItemTags(gatherDataEvent.getGenerator(), mcwBlockTags, MODID, gatherDataEvent.getExistingFileHelper()) {
                @Override
                protected void addTags() {
                    addAllMcwTags(MODID, WOOD, LEAVES);
                    mcwFencesTags(MODID, new ArrayList<>(), new ArrayList<>(), fences_rockable);
                }
            });
        }
    }

    public void clientSetup(FMLClientSetupEvent event)
    {
		APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(event, MODID, LEAVES);
		APIRenderTypes.initAllStone(event, MODID, bridges_rockable, ModType.BRIDGES);
		APIRenderTypes.initAllStone(event, MODID, fences_rockable, ModType.FENCES, ModType.ROOFS);
	}
    
    @SubscribeEvent
    public static void registry(final RegistryEvent.Register<Block> event)
    {
    	Bridges.registryWood(event, MODID, WOOD, MCWBYG_TAB);
    	Bridges.registryStone(event, MODID, bridges_rockable, MCWBYG_TAB);
    	Roofs.registryWood(event, MODID, WOOD, MCWBYG_TAB);
    	Roofs.registryStone(event, MODID, fences_rockable, MCWBYG_TAB);
    	Fences.registryWood(event, MODID, WOOD, MCWBYG_TAB);
    	Fences.registryHedges(event, MODID, LEAVES, MCWBYG_TAB);
    	Fences.registryStone(event, MODID, fences_rockable, MCWBYG_TAB);
    	Furnitures.registryWood(event, MODID, WOOD, MCWBYG_TAB);
    	Stairs.registryWood(event, MODID, WOOD, MCWBYG_TAB);
		Paths.registryWood(event, MODID, WOOD, MCWBYG_TAB);
		Doors.registryWood(event, MODID, WOOD, MCWBYG_TAB);
		Trapdoors.registryWood(event, MODID, WOOD, MCWBYG_TAB);
		Windows.registryWood(event, MODID, WOOD, MCWBYG_TAB);
    }
}