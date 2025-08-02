package fr.samlegamer.mcwabnormals;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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
	public static final List<String> WOOD_CAVERNSCHASMS = List.of("azalea");

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
    	
    	Bridges.setRegistrationRockModLoaded(ROCK_BB, block, item, honey);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
    	Bridges.setRegistrationRockModLoaded(ROCK_ATMO, block, item, stone);
    	Bridges.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
    	Bridges.setRegistrationRockModLoaded(ROCK_AUTU, block, item, stone);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Bridges.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

		Roofs.setRegistrationRockModLoaded(ROCK_BB, block, item, honey);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
    	Roofs.setRegistrationRockModLoaded(ROCK_ATMO, block, item, stone);
    	Roofs.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
    	Roofs.setRegistrationRockModLoaded(ROCK_AUTU, block, item, stone);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Roofs.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

		Fences.setRegistrationRockModLoaded(ROCK_BB, block, item, honey);
    	Fences.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
    	Fences.setRegistrationRockModLoaded(ROCK_ATMO, block, item, stone);
    	Fences.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
    	Fences.setRegistrationRockModLoaded(ROCK_AUTU, block, item, stone);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Fences.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

    	Fences.setRegistrationHedgesModLoaded(LEAVES_ATMO, block, item, leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_AUTU, block, item, leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_ENVI, block, item, leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_UAQUA, block, item, leaves);
    	
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
    	Furnitures.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
    	Furnitures.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Furnitures.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

    	Stairs.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Stairs.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

		Paths.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
		Paths.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
		Paths.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
		Paths.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
		Paths.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Paths.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

		Doors.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood, BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood, BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood, BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood, BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood, BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood, BlockBehaviour.Properties.copy(Blocks.OAK_DOOR));

		Trapdoors.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR));
		Trapdoors.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR));
		Trapdoors.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR));
		Trapdoors.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR));
		Trapdoors.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR));
		Trapdoors.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR));

		Windows.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
    	MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }

	private void client(FMLClientSetupEvent e)
	{
		APIRenderTypes.initAllWood(e, MODID, WOOD_ATMO, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_AUTU, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_ENVI, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_UAQUA, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_ENDER, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_CAVERNSCHASMS, Registration.getAllModTypeWood());

		APIRenderTypes.initAllLeave(e, MODID, LEAVES_ATMO);
		APIRenderTypes.initAllLeave(e, MODID, LEAVES_AUTU);
		APIRenderTypes.initAllLeave(e, MODID, LEAVES_ENVI);
		APIRenderTypes.initAllLeave(e, MODID, LEAVES_UAQUA);

		APIRenderTypes.initAllStone(e, MODID, ROCK_BB, Registration.getAllModTypeStone());
		APIRenderTypes.initAllStone(e, MODID, ROCK_ATMO, Registration.getAllModTypeStone());
		APIRenderTypes.initAllStone(e, MODID, ROCK_AUTU, Registration.getAllModTypeStone());
	}
    
    private void addTotab(BuildCreativeModeTabContentsEvent e)
    {
    	if(MCWABNORMALS_TAB != null)
    	{
			APICreativeTab.initAllWood(e, MODID, WOOD_ATMO, "atmospheric", MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllWood(e, MODID, WOOD_AUTU, "autumnity", MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllWood(e, MODID, WOOD_ENVI, "environmental", MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllWood(e, MODID, WOOD_UAQUA, "upgrade_aquatic", MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllWood(e, MODID, WOOD_ENDER, "endergetic", MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllWood(e, MODID, WOOD_CAVERNSCHASMS, "caverns_and_chasms", MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());

			APICreativeTab.initAllLeave(e, MODID, LEAVES_ATMO, "atmospheric", MCWABNORMALS_TAB.get());
			APICreativeTab.initAllLeave(e, MODID, LEAVES_AUTU, "autumnity", MCWABNORMALS_TAB.get());
			APICreativeTab.initAllLeave(e, MODID, LEAVES_ENVI, "environmental", MCWABNORMALS_TAB.get());
			APICreativeTab.initAllLeave(e, MODID, LEAVES_UAQUA, "upgrade_aquatic", MCWABNORMALS_TAB.get());

			APICreativeTab.initAllStone(e, MODID, ROCK_BB, "buzzier_bees", MCWABNORMALS_TAB.get(), Registration.getAllModTypeStone());
			APICreativeTab.initAllStone(e, MODID, ROCK_ATMO, "atmospheric", MCWABNORMALS_TAB.get(), Registration.getAllModTypeStone());
			APICreativeTab.initAllStone(e, MODID, ROCK_AUTU, "autumnity", MCWABNORMALS_TAB.get(), Registration.getAllModTypeStone());
    	}
    }
}