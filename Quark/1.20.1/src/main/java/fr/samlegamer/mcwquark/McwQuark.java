package fr.samlegamer.mcwquark;

import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.List;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import javax.annotation.Nonnull;

@Mod(McwQuark.MODID)
public class McwQuark {
	public static final String MODID = "mcwquark";
	private static final Logger LOGGER = LogManager.getLogger();

	private static final List<String> stone = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks",
			"red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks", "mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks",
			"andesite_bricks", "calcite_bricks", "dripstone_bricks", "tuff_bricks", "raw_iron_bricks", "raw_gold_bricks", "raw_copper_bricks");
	private static final List<String> leaves = List.of("blue_blossom", "lavender_blossom", "orange_blossom", "red_blossom", "yellow_blossom", "ancient");
	private static final List<String> wood = List.of("blossom", "azalea", "ancient");

	private static final DeferredRegister<Block> BLOCKS = Registration.blocks(MODID);
	private static final DeferredRegister<Item> ITEMS = Registration.items(MODID);
	private static final DeferredRegister<CreativeModeTab> CT = Registration.creativeModeTab(MODID);

	public static final RegistryObject<CreativeModeTab> MCWQUARK_TAB = CT.register("tab", () -> CreativeModeTab.builder()
	.icon(McwQuark::getIcon).title(Component.translatable(MODID + ".tab")).build());

	public McwQuark() {

		List<String> rockClassic = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks",
				"red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks", "mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks",
				"andesite_bricks", "raw_iron_bricks", "raw_gold_bricks", "raw_copper_bricks");

		BlockBehaviour.Properties propDrip = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.DRIPSTONE_BLOCK);
		BlockBehaviour.Properties propCalcite = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.CALCITE);
		BlockBehaviour.Properties propTuff = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.TUFF);

		LOGGER.info("Macaw's Quark Loading...");
		Registration.init(BLOCKS, ITEMS, CT);
		Bridges.setRegistrationWood(wood, BLOCKS, ITEMS);
		Bridges.setRegistrationRock(rockClassic, BLOCKS, ITEMS);
		Bridges.setRegistrationRockModLoaded(List.of("calcite_bricks"), BLOCKS, ITEMS, propCalcite);
		Bridges.setRegistrationRockModLoaded(List.of("dripstone_bricks"), BLOCKS, ITEMS, propDrip);
		Bridges.setRegistrationRockModLoaded(List.of("tuff_bricks"), BLOCKS, ITEMS, propTuff);
		Roofs.setRegistrationWood(wood, BLOCKS, ITEMS);
		Roofs.setRegistrationRock(rockClassic, BLOCKS, ITEMS);
		Roofs.setRegistrationRockModLoaded(List.of("calcite_bricks"), BLOCKS, ITEMS, propCalcite);
		Roofs.setRegistrationRockModLoaded(List.of("dripstone_bricks"), BLOCKS, ITEMS, propDrip);
		Roofs.setRegistrationRockModLoaded(List.of("tuff_bricks"), BLOCKS, ITEMS, propTuff);
		Fences.setRegistrationWood(wood, BLOCKS, ITEMS);
		Fences.setRegistrationRock(rockClassic, BLOCKS, ITEMS);
		Fences.setRegistrationRockModLoaded(List.of("calcite_bricks"), BLOCKS, ITEMS, propCalcite);
		Fences.setRegistrationRockModLoaded(List.of("dripstone_bricks"), BLOCKS, ITEMS, propDrip);
		Fences.setRegistrationRockModLoaded(List.of("tuff_bricks"), BLOCKS, ITEMS, propTuff);
		Fences.setRegistrationHedges(leaves, BLOCKS, ITEMS);
		Furnitures.setRegistrationWood(wood, BLOCKS, ITEMS);
		Stairs.setRegistrationWood(wood, BLOCKS, ITEMS);
		Doors.setRegistrationWood(wood, BLOCKS, ITEMS);
		Trapdoors.setRegistrationWood(wood, BLOCKS, ITEMS);
		Paths.setRegistrationWood(wood, BLOCKS, ITEMS);
		Windows.setRegistrationWood(wood, BLOCKS, ITEMS);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
		LOGGER.info("Macaw's Quark Is Charged !");
	}

	private void addTotab(BuildCreativeModeTabContentsEvent event)
	{
		if (MCWQUARK_TAB != null)
		{
			Bridges.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
			Bridges.addToTabStone(event, MODID, stone, MCWQUARK_TAB.get());
			Roofs.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
			Roofs.addToTabStone(event, MODID, stone, MCWQUARK_TAB.get());
			Fences.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
			Fences.addToTabStone(event, MODID, stone, MCWQUARK_TAB.get());
			Fences.addToTabHedge(event, MODID, leaves, MCWQUARK_TAB.get());
			Furnitures.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
			Stairs.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
			Doors.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
			Trapdoors.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
			Paths.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
			Windows.addToTab(event, MODID, wood, MCWQUARK_TAB.get());
		}
	}

	@Nonnull
	private static ItemStack getIcon()
	{
		NewIconRandom.NewProperties propIcon = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, "limestone_bricks_roof"),
				Finder.findBlock(MODID, "orange_blossom_hedge"),
				Finder.findBlock(MODID, "blossom_bookshelf"),
				Finder.findBlock(MODID, "marble_bricks_bridge"),
				Finder.findBlock(MODID, "azalea_shutter"),
				Finder.findBlock(MODID, "blossom_beach_door"),
				Finder.findBlock(MODID, "azalea_paper_trapdoor"),
				Finder.findBlock(MODID, "blossom_planks_path"),
				Finder.findBlock(MODID, "ancient_balcony"));

		propIcon
				.addType(BlockType.BRIDGES)
				.addType(BlockType.ROOFS)
				.addType(BlockType.FENCES)
				.addType(BlockType.FURNITURES)
				.addType(BlockType.STAIRS)
				.addType(BlockType.WINDOWS)
				.addType(BlockType.DOORS)
				.addType(BlockType.TRAPDOORS)
				.addType(BlockType.PATHS);
		Block icon = propIcon.buildIcon(BlockType.BRIDGES, BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES,
				BlockType.STAIRS, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS);
		return new ItemStack(icon);
	}
}