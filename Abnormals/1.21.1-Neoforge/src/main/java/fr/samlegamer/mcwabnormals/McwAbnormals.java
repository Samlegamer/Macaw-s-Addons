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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;

import java.util.List;

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
    
    private static final DeferredRegister.Blocks block = Registration.blocks(MODID);
    private static final DeferredRegister.Items item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final DeferredItem<Item> LOGO = item.register("logo", () -> new Item(new Item.Properties()));
	
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWABNORMALS_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(() -> { return new ItemStack(LOGO.get()); }).title(Component.translatable(MODID+".tab")).build());
	
	public McwAbnormals(IEventBus bus)
    {
    	LOGGER.info("Macaw's Abnormals Mod Loading...");
    	Registration.init(bus, block, item, ct);
    	
    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS);
    	final BlockBehaviour.Properties stone = BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE);
    	final BlockBehaviour.Properties honey = BlockBehaviour.Properties.ofFullCopy(Blocks.HONEYCOMB_BLOCK);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES);
    	
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

		Doors.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, wood, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, wood, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, wood, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, wood, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, wood, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));
		Doors.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, wood, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

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

		bus.addListener(this::addToTab);
		bus.addListener(this::client);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }

	private void client(FMLClientSetupEvent event)
	{
		APIRenderTypes.initAllWood(event, MODID, WOOD_ATMO, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(event, MODID, WOOD_AUTU, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(event, MODID, WOOD_ENVI, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(event, MODID, WOOD_UAQUA, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(event, MODID, WOOD_ENDER, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(event, MODID, WOOD_CAVERNSCHASMS, Registration.getAllModTypeWood());

		APIRenderTypes.initAllLeave(event, MODID, LEAVES_ATMO);
		APIRenderTypes.initAllLeave(event, MODID, LEAVES_AUTU);
		APIRenderTypes.initAllLeave(event, MODID, LEAVES_ENVI);
		APIRenderTypes.initAllLeave(event, MODID, LEAVES_UAQUA);

		APIRenderTypes.initAllStone(event, MODID, ROCK_BB, Registration.getAllModTypeStone());
		APIRenderTypes.initAllStone(event, MODID, ROCK_ATMO, Registration.getAllModTypeStone());
		APIRenderTypes.initAllStone(event, MODID, ROCK_AUTU, Registration.getAllModTypeStone());
	}

    private void addToTab(BuildCreativeModeTabContentsEvent event)
    {
		ModList modList = ModList.get();

		if(modList.isLoaded("atmospheric"))
		{
			APICreativeTab.initAllWood(event, MODID, WOOD_ATMO, MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllLeave(event, MODID, LEAVES_ATMO, MCWABNORMALS_TAB.get());
			APICreativeTab.initAllStone(event, MODID, ROCK_ATMO, MCWABNORMALS_TAB.get(), Registration.getAllModTypeStone());
		}

		if(modList.isLoaded("autumnity"))
		{
			APICreativeTab.initAllWood(event, MODID, WOOD_AUTU, MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllLeave(event, MODID, LEAVES_AUTU, MCWABNORMALS_TAB.get());
			APICreativeTab.initAllStone(event, MODID, ROCK_AUTU, MCWABNORMALS_TAB.get(), Registration.getAllModTypeStone());
		}

		if(modList.isLoaded("environmental"))
		{
			APICreativeTab.initAllWood(event, MODID, WOOD_ENVI, MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllLeave(event, MODID, LEAVES_ENVI, MCWABNORMALS_TAB.get());
		}

		if(modList.isLoaded("upgrade_aquatic"))
		{
			APICreativeTab.initAllWood(event, MODID, WOOD_UAQUA, MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
			APICreativeTab.initAllLeave(event, MODID, LEAVES_UAQUA, MCWABNORMALS_TAB.get());
		}

		if(modList.isLoaded("endergetic"))
		{
			APICreativeTab.initAllWood(event, MODID, WOOD_ENDER, MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
		}

		if(modList.isLoaded("caverns_and_chasms"))
		{
			APICreativeTab.initAllWood(event, MODID, WOOD_CAVERNSCHASMS, MCWABNORMALS_TAB.get(), Registration.getAllModTypeWood());
		}

		if(modList.isLoaded("buzzier_bees"))
		{
			APICreativeTab.initAllStone(event, MODID, ROCK_BB, MCWABNORMALS_TAB.get(), Registration.getAllModTypeStone());
		}
    }
}