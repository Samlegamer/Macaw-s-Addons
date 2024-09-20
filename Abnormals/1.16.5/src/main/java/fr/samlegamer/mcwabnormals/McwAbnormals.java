package fr.samlegamer.mcwabnormals;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;

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
	
	public static final ItemGroup MCWABNORMALS_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(LOGO.get());
	    }
	};
	
    public McwAbnormals()
    {
    	LOGGER.info("Macaw's Abnormals Mod Loading...");
    	Registration.init(block, item);
    	
    	final AbstractBlock.Properties wood = AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).strength(0.5F, 2.5F).sound(SoundType.WOOD);
    	final AbstractBlock.Properties stone = AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE);
    	final AbstractBlock.Properties honey = AbstractBlock.Properties.of(Material.CLAY).strength(0.6F).sound(SoundType.CORAL_BLOCK).harvestTool(ToolType.PICKAXE);
    	final AbstractBlock.Properties leaves = AbstractBlock.Properties.copy(Blocks.OAK_LEAVES);
    	
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

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Bridges::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Roofs::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Fences::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Furnitures::setupClient);
		MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }
}