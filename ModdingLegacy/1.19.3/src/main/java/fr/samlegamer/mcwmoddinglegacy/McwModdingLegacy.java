package fr.samlegamer.mcwmoddinglegacy;

import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import java.util.List;
import java.util.Random;

@Mod(McwModdingLegacy.MODID)
public class McwModdingLegacy
{
	public static final String MODID = "mcwmoddinglegacy";
    private static final Logger LOGGER = LogManager.getLogger();

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public static final List<String> wood_blue_skies = List.of("bsky_bluebright", "bsky_cherry", "bsky_dusk", "bsky_frostbright", "bsky_lunar", "bsky_maple", "bsky_starlit");
    public static final List<String> wood_premium_wood = List.of("pwood_magic", "pwood_maple", "pwood_purple_heart", "pwood_silverbell", "pwood_tiger", "pwood_willow");
    public static final List<String> wood_crystallized = List.of("bsky_crystallized");
    
    public static CreativeModeTab MCWMODDINGLEGACY_TAB;

    public McwModdingLegacy()
    {
    	LOGGER.info("Macaw's Modding Legacy Mod Loading...");
    	Registration.init(block, item);

    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);
    	final BlockBehaviour.Properties glass = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.GLASS);
    	
    	Bridges.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
    	Roofs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
    	Fences.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
		Fences.setRegistrationHedgesModLoaded(wood_blue_skies, block, item, leaves);
    	Furnitures.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
    	Stairs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
		Paths.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
		Doors.setRegistrationWood(wood_blue_skies, block, item);
		Trapdoors.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
		Windows.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);

		Bridges.setRegistrationWoodModLoaded(wood_crystallized, block, item, glass);
    	Roofs.setRegistrationWoodModLoaded(wood_crystallized, block, item, glass);
    	Fences.setRegistrationHedgesModLoaded(wood_crystallized, block, item, leaves);

    	Bridges.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
    	Roofs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
    	Fences.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
		Fences.setRegistrationHedgesModLoaded(wood_premium_wood, block, item, leaves);
    	Furnitures.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
    	Stairs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
		Paths.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
		Doors.setRegistrationWood(wood_premium_wood, block, item);
		Trapdoors.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
		Windows.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerTab);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
		MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Modding Legacy Mod Finish !");
    }

	private void registerTab(CreativeModeTabEvent.Register event)
	{
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, randomNaming()+"_roof"),
				Finder.findBlock(MODID, randomNaming()+"_picket_fence"),
				Finder.findBlock(MODID, randomNaming()+"_wardrobe"),
				Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
				Finder.findBlock(MODID, randomNaming()+"_blinds"),
				Finder.findBlock(MODID, randomNaming()+"_mystic_door"),
				Finder.findBlock(MODID, randomNaming()+"_barrel_trapdoor"),
				Finder.findBlock(MODID, randomNaming()+"_planks_path"),
				Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));

		prop.addType(BlockType.BRIDGES)
				.addType(BlockType.FENCES)
				.addType(BlockType.FURNITURES)
				.addType(BlockType.ROOFS)
				.addType(BlockType.STAIRS)
				.addType(BlockType.WINDOWS)
				.addType(BlockType.DOORS)
				.addType(BlockType.TRAPDOORS)
				.addType(BlockType.PATHS);
		Block icon = prop.buildIcon(BlockType.BRIDGES, BlockType.FENCES, BlockType.FURNITURES, BlockType.ROOFS, BlockType.STAIRS
				, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS);
		MCWMODDINGLEGACY_TAB = Registration.tabs(event, MODID, "tab", icon);
	}

	private void addTotab(CreativeModeTabEvent.BuildContents event)
	{
		Bridges.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Roofs.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Fences.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Fences.addToTabHedgeModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Furnitures.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Stairs.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Paths.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Doors.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Trapdoors.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");
		Windows.addToTabModLoaded(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB, "blue_skies");

		Bridges.addToTabModLoaded(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB, "blue_skies");
		Roofs.addToTabModLoaded(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB, "blue_skies");
		Fences.addToTabHedgeModLoaded(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB, "blue_skies");

		Bridges.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Roofs.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Fences.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Fences.addToTabHedgeModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Furnitures.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Stairs.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Paths.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Doors.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Trapdoors.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
		Windows.addToTabModLoaded(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB, "premium_wood");
	}

	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("blue_skies") && ModList.get().isLoaded("premium_wood"))
		{
			int i = rand.nextInt(0, 1);

			switch(i)
			{
			case 0:
					return "pwood_purple_heart";
			case 1:
					return "bsky_bluebright";
			}
		}
		else
		{
			if(ModList.get().isLoaded("blue_skies"))
			{
				return "bsky_bluebright";
			}

			if(ModList.get().isLoaded("premium_wood"))
			{
				return "pwood_purple_heart";
			}
		}
		return "bsky_bluebright";
	}
}