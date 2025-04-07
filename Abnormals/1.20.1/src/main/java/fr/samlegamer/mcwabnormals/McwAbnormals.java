package fr.samlegamer.mcwabnormals;

import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.path.Paths;
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

		Trapdoors.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
		Trapdoors.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
		Trapdoors.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
		Trapdoors.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
		Trapdoors.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Trapdoors.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

		Windows.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood);
		Windows.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
    	MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }
    
    private void addTotab(BuildCreativeModeTabContentsEvent event)
    {
    	if(MCWABNORMALS_TAB != null)
    	{
			Bridges.addToTabStoneModLoaded(event, MODID, ROCK_BB, MCWABNORMALS_TAB.get(), "buzzier_bees");
			Roofs.addToTabStoneModLoaded(event, MODID, ROCK_BB, MCWABNORMALS_TAB.get(), "buzzier_bees");
			Fences.addToTabStoneModLoaded(event, MODID, ROCK_BB, MCWABNORMALS_TAB.get(), "buzzier_bees");

			Bridges.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Bridges.addToTabStoneModLoaded(event, MODID, ROCK_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Roofs.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Roofs.addToTabStoneModLoaded(event, MODID, ROCK_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Fences.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Fences.addToTabStoneModLoaded(event, MODID, ROCK_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Fences.addToTabHedgeModLoaded(event, MODID, LEAVES_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Furnitures.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Stairs.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Paths.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Doors.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Trapdoors.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");
			Windows.addToTabModLoaded(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), "atmospheric");

			Bridges.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Bridges.addToTabStoneModLoaded(event, MODID, ROCK_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Roofs.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Roofs.addToTabStoneModLoaded(event, MODID, ROCK_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Fences.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Fences.addToTabStoneModLoaded(event, MODID, ROCK_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Fences.addToTabHedgeModLoaded(event, MODID, LEAVES_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Furnitures.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Stairs.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Paths.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Doors.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Trapdoors.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");
			Windows.addToTabModLoaded(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), "autumnity");

			Bridges.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Roofs.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Fences.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Fences.addToTabHedgeModLoaded(event, MODID, LEAVES_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Furnitures.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Stairs.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Paths.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Doors.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Trapdoors.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");
			Windows.addToTabModLoaded(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), "environmental");

			Bridges.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Roofs.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Fences.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Fences.addToTabHedgeModLoaded(event, MODID, LEAVES_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Furnitures.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Stairs.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Paths.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Doors.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Trapdoors.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");
			Windows.addToTabModLoaded(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), "upgrade_aquatic");

			Bridges.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");
			Roofs.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");
			Fences.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");
			Furnitures.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");
			Stairs.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");
			Paths.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");
			Doors.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");
			Trapdoors.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");
			Windows.addToTabModLoaded(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), "endergetic");

			Bridges.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
			Roofs.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
			Fences.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
			Furnitures.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
			Stairs.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
			Paths.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
			Doors.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
			Trapdoors.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
			Windows.addToTabModLoaded(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), "caverns_and_chasms");
    	}
    }
}