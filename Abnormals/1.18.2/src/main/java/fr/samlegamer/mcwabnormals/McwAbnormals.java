package fr.samlegamer.mcwabnormals;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;

@Mod(McwAbnormals.MODID)
public class McwAbnormals
{
	public static final String MODID = "mcwabnormals";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> ROCK_BB = Arrays.asList("honeycomb_brick", "honeycomb_tile");
    public static final List<String> WOOD_ATMO = Arrays.asList("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca");
    public static final List<String> ROCK_ATMO = Arrays.asList("arid_sandstone", "red_arid_sandstone");
    public static final List<String> WOOD_AUTU = Arrays.asList("maple");
    public static final List<String> ROCK_AUTU = Arrays.asList("snail_shell_bricks", "snail_shell_tiles");
    public static final List<String> WOOD_ENVI = Arrays.asList("cherry", "wisteria", "willow");
    public static final List<String> WOOD_UAQUA = Arrays.asList("driftwood", "river");
    public static final List<String> WOOD_ENDER = Arrays.asList("poise");
    
    public static final List<String> LEAVES_ATMO = Arrays.asList("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca");
    public static final List<String> LEAVES_AUTU = Arrays.asList("maple", "red_maple", "yellow_maple","orange_maple");
    public static final List<String> LEAVES_ENVI = Arrays.asList("cherry", "blue_wisteria", "pink_wisteria", "white_wisteria", "purple_wisteria", "willow");
    public static final List<String> LEAVES_UAQUA = Arrays.asList("river");
    
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

	public static final RegistryObject<Item> LOGO = item.register("logo", () -> new Item(new Item.Properties()));
	
	public static final CreativeModeTab MCWABNORMALS_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(LOGO.get());
	    }
	};
	
    public McwAbnormals()
    {
    	LOGGER.info("Macaw's Abnormals Mod Loading...");
    	Registration.init(block, item);
    	
    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
    	final BlockBehaviour.Properties stone = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE);
    	final BlockBehaviour.Properties honey = BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);
    	
    	Bridges.setRegistrationRockModLoaded(ROCK_BB, block, item, MCWABNORMALS_TAB, "buzzier_bees", honey);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", wood);
    	Bridges.setRegistrationRockModLoaded(ROCK_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", stone);
    	Bridges.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", wood);
    	Bridges.setRegistrationRockModLoaded(ROCK_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", stone);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic", wood);
    	
    	Roofs.setRegistrationRockModLoaded(ROCK_BB, block, item, MCWABNORMALS_TAB, "buzzier_bees", honey);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", wood);
    	Roofs.setRegistrationRockModLoaded(ROCK_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", stone);
    	Roofs.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", wood);
    	Roofs.setRegistrationRockModLoaded(ROCK_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", stone);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic", wood);
    	
    	Fences.setRegistrationRockModLoaded(ROCK_BB, block, item, MCWABNORMALS_TAB, "buzzier_bees", honey);
    	Fences.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", wood);
    	Fences.setRegistrationRockModLoaded(ROCK_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", stone);
    	Fences.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", wood);
    	Fences.setRegistrationRockModLoaded(ROCK_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", stone);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic", wood);

    	Fences.setRegistrationHedgesModLoaded(LEAVES_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_ENVI, block, item, MCWABNORMALS_TAB, "environmental", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", leaves);
    	
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic");

    	Stairs.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic", wood);
    	
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
		MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }
    
    private void client(FMLClientSetupEvent e)
    {
    	Bridges.clientStone(e, MODID, ROCK_BB);
    	Bridges.clientWood(e, MODID, WOOD_ATMO);    	
    	Bridges.clientStone(e, MODID, ROCK_ATMO);
    	Bridges.clientWood(e, MODID, WOOD_AUTU);
    	Bridges.clientStone(e, MODID, ROCK_AUTU);
    	Bridges.clientWood(e, MODID, WOOD_ENVI);
    	Bridges.clientWood(e, MODID, WOOD_UAQUA);
    	Bridges.clientWood(e, MODID, WOOD_ENDER);
    	
    	Roofs.clientStone(e, MODID, ROCK_BB);
    	Roofs.clientWood(e, MODID, WOOD_ATMO);    	
    	Roofs.clientStone(e, MODID, ROCK_ATMO);
    	Roofs.clientWood(e, MODID, WOOD_AUTU);
    	Roofs.clientStone(e, MODID, ROCK_AUTU);
    	Roofs.clientWood(e, MODID, WOOD_ENVI);
    	Roofs.clientWood(e, MODID, WOOD_UAQUA);
    	Roofs.clientWood(e, MODID, WOOD_ENDER);

    	Fences.clientStone(e, MODID, ROCK_BB);
    	Fences.clientWood(e, MODID, WOOD_ATMO);    	
    	Fences.clientStone(e, MODID, ROCK_ATMO);
    	Fences.clientWood(e, MODID, WOOD_AUTU);
    	Fences.clientStone(e, MODID, ROCK_AUTU);
    	Fences.clientWood(e, MODID, WOOD_ENVI);
    	Fences.clientWood(e, MODID, WOOD_UAQUA);
    	Fences.clientWood(e, MODID, WOOD_ENDER);
    	
    	Fences.clientHedge(e, MODID, LEAVES_ATMO);    	
    	Fences.clientHedge(e, MODID, LEAVES_AUTU);
    	Fences.clientHedge(e, MODID, LEAVES_ENVI);
    	Fences.clientHedge(e, MODID, LEAVES_UAQUA);
    	
    	Furnitures.clientWood(e, MODID, WOOD_ATMO);    	
    	Furnitures.clientWood(e, MODID, WOOD_AUTU);
    	Furnitures.clientWood(e, MODID, WOOD_ENVI);
    	Furnitures.clientWood(e, MODID, WOOD_UAQUA);
    	Furnitures.clientWood(e, MODID, WOOD_ENDER);

    	Stairs.clientWood(e, MODID, WOOD_ATMO);    	
    	Stairs.clientWood(e, MODID, WOOD_AUTU);
    	Stairs.clientWood(e, MODID, WOOD_ENVI);
    	Stairs.clientWood(e, MODID, WOOD_UAQUA);
    	Stairs.clientWood(e, MODID, WOOD_ENDER);
    }
}