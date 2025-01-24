package fr.samlegamer.mcwabnormals;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
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
    public static final List<String> ROCK_BB = List.of("honeycomb_brick", "honeycomb_tile");
    public static final List<String> WOOD_ATMO = List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel");
    public static final List<String> ROCK_ATMO = List.of("arid_sandstone", "red_arid_sandstone");
    public static final List<String> WOOD_AUTU = List.of("maple");
    public static final List<String> ROCK_AUTU = List.of("snail_shell_bricks", "snail_shell_tiles");
    public static final List<String> WOOD_ENVI = List.of("plum", "wisteria", "willow", "pine");
    public static final List<String> WOOD_UAQUA = List.of("driftwood", "river");
    public static final List<String> WOOD_ENDER = List.of("poise");
    
    public static final List<String> LEAVES_ATMO = List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca", "laurel");
    public static final List<String> LEAVES_AUTU = List.of("maple", "red_maple", "yellow_maple","orange_maple");
    public static final List<String> LEAVES_ENVI = List.of("plum", "blue_wisteria", "pink_wisteria", "white_wisteria", "purple_wisteria", "willow", "pine");
    public static final List<String> LEAVES_UAQUA = List.of("river");
    
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final RegistryObject<Item> LOGO = item.register("logo", () -> new Item(new Item.Properties()));
	
	public static final RegistryObject<CreativeModeTab> MCWABNORMALS_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(() -> { return new ItemStack(LOGO.get()); }).title(Component.translatable(MODID+".tab")).build());
	
    public McwAbnormals()
    {
    	LOGGER.info("Macaw's Abnormals Mod Loading...");
    	Registration.init(block, item, ct);
    	
    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
    	final BlockBehaviour.Properties stone = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE);
    	final BlockBehaviour.Properties honey = BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);
    	
    	Bridges.setRegistrationRockModLoaded(ROCK_BB, block, item, null, "buzzier_bees", honey);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, null, "atmospheric", wood);
    	Bridges.setRegistrationRockModLoaded(ROCK_ATMO, block, item, null, "atmospheric", stone);
    	Bridges.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, null, "autumnity", wood);
    	Bridges.setRegistrationRockModLoaded(ROCK_AUTU, block, item, null, "autumnity", stone);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, null, "environmental", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, null, "upgrade_aquatic", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, null, "endergetic", wood);
    	
    	Roofs.setRegistrationRockModLoaded(ROCK_BB, block, item, null, "buzzier_bees", honey);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, null, "atmospheric", wood);
    	Roofs.setRegistrationRockModLoaded(ROCK_ATMO, block, item, null, "atmospheric", stone);
    	Roofs.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, null, "autumnity", wood);
    	Roofs.setRegistrationRockModLoaded(ROCK_AUTU, block, item, null, "autumnity", stone);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, null, "environmental", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, null, "upgrade_aquatic", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, null, "endergetic", wood);
    	
    	Fences.setRegistrationRockModLoaded(ROCK_BB, block, item, null, "buzzier_bees", honey);
    	Fences.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, null, "atmospheric", wood);
    	Fences.setRegistrationRockModLoaded(ROCK_ATMO, block, item, null, "atmospheric", stone);
    	Fences.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, null, "autumnity", wood);
    	Fences.setRegistrationRockModLoaded(ROCK_AUTU, block, item, null, "autumnity", stone);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, null, "environmental", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, null, "upgrade_aquatic", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, null, "endergetic", wood);

    	Fences.setRegistrationHedgesModLoaded(LEAVES_ATMO, block, item, null, "atmospheric", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_AUTU, block, item, null, "autumnity", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_ENVI, block, item, null, "environmental", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_UAQUA, block, item, null, "upgrade_aquatic", leaves);
    	
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, null, "atmospheric");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, null, "autumnity");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, null, "environmental");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, null, "upgrade_aquatic");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, null, "endergetic");

    	Stairs.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, null, "atmospheric", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, null, "autumnity", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, null, "environmental", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, null, "upgrade_aquatic", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, null, "endergetic", wood);

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
    	MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }
    
    private void addTotab(BuildCreativeModeTabContentsEvent event)
    {
    	if(MCWABNORMALS_TAB != null)
    	{
    		if(ModList.get().isLoaded("buzzier_bees"))
    		{
            	Bridges.addToTabStone(event, MODID, ROCK_BB, MCWABNORMALS_TAB.get());
            	Roofs.addToTabStone(event, MODID, ROCK_BB, MCWABNORMALS_TAB.get());
            	Fences.addToTabStone(event, MODID, ROCK_BB, MCWABNORMALS_TAB.get());
    		}
    		
    		if(ModList.get().isLoaded("atmospheric"))
    		{
            	Bridges.addToTab(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get());
            	Bridges.addToTabStone(event, MODID, ROCK_ATMO, MCWABNORMALS_TAB.get());
            	Roofs.addToTab(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get());
            	Roofs.addToTabStone(event, MODID, ROCK_ATMO, MCWABNORMALS_TAB.get());
            	Fences.addToTab(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get());
            	Fences.addToTabStone(event, MODID, ROCK_ATMO, MCWABNORMALS_TAB.get());
            	Fences.addToTabHedge(event, MODID, LEAVES_ATMO, MCWABNORMALS_TAB.get());
            	Furnitures.addToTab(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get());
            	Stairs.addToTab(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get());
    		}
    		
    		if(ModList.get().isLoaded("autumnity"))
    		{
            	Bridges.addToTab(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get());
            	Bridges.addToTabStone(event, MODID, ROCK_AUTU, MCWABNORMALS_TAB.get());
            	Roofs.addToTab(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get());
            	Roofs.addToTabStone(event, MODID, ROCK_AUTU, MCWABNORMALS_TAB.get());
            	Fences.addToTab(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get());
            	Fences.addToTabStone(event, MODID, ROCK_AUTU, MCWABNORMALS_TAB.get());
            	Fences.addToTabHedge(event, MODID, LEAVES_AUTU, MCWABNORMALS_TAB.get());
            	Furnitures.addToTab(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get());
            	Stairs.addToTab(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get());
    		}
    		
    		if(ModList.get().isLoaded("environmental"))
    		{
            	Bridges.addToTab(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get());
            	Roofs.addToTab(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get());
            	Fences.addToTab(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get());
            	Fences.addToTabHedge(event, MODID, LEAVES_ENVI, MCWABNORMALS_TAB.get());
            	Furnitures.addToTab(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get());
            	Stairs.addToTab(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get());
    		}
    		
    		if(ModList.get().isLoaded("upgrade_aquatic"))
    		{
            	Bridges.addToTab(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get());
            	Roofs.addToTab(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get());
            	Fences.addToTab(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get());
            	Fences.addToTabHedge(event, MODID, LEAVES_UAQUA, MCWABNORMALS_TAB.get());
            	Furnitures.addToTab(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get());
            	Stairs.addToTab(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get());
    		}
    		
    		if(ModList.get().isLoaded("endergetic"))
    		{
            	Bridges.addToTab(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get());
            	Roofs.addToTab(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get());
            	Fences.addToTab(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get());
            	Furnitures.addToTab(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get());
            	Stairs.addToTab(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get());
    		}
    	}
    }
}