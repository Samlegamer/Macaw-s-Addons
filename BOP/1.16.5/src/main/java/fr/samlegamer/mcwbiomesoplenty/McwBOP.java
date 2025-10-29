package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.util.McwMod;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.List;
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

@Mod(McwBOP.MODID)
public class McwBOP extends McwMod
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = Arrays.asList("cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow");
	public static final List<String> LEAVES = Arrays.asList("pink_cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "maple", 
	"orange_autumn", "yellow_autumn", "white_cherry", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

	public static final ItemGroup MCWBOP_TAB = new ItemGroup(MODID + ".tab") {
        @Override
        @MethodsReturnNonnullByDefault
	    public ItemStack makeIcon() {
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
	    	        Block icon = woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS);
	    	        return new ItemStack(icon);
	    }
	};
	
    public McwBOP()
    {
    	LOGGER.info("Macaw's Biomes O' Plenty Loading...");
    	Registration.init(block, item);
    	Bridges.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Roofs.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Fences.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Fences.setRegistrationHedges(LEAVES, block, item, MCWBOP_TAB);
		Furnitures.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Trapdoors.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Paths.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Doors.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Windows.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	Stairs.setRegistrationWood(WOOD, block, item, MCWBOP_TAB);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::dataSetup);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e) {
        APIRenderTypes.initAllWood(e, MODID, WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(e, MODID, LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent e) {
        e.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent e) {
        if(e.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(e.getGenerator(), MODID, e.getExistingFileHelper()) {
                @Override
                protected void addTags() {
                    addAllMcwTags(MODID, WOOD, LEAVES);
                }
            };
            e.getGenerator().addProvider(new Recipes(e.getGenerator()));
            e.getGenerator().addProvider(mcwBlockTags);
            e.getGenerator().addProvider(new McwItemTags(e.getGenerator(), mcwBlockTags, MODID, e.getExistingFileHelper()) {
                @Override
                protected void addTags() {
                    addAllMcwTags(MODID, WOOD, LEAVES);
                }
            });
        }
    }
}
