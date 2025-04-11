package fr.samlegamer.mcwbiomesoplenty;

import java.util.List;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
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
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class McwBOP implements ModInitializer
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal",
	"pine",
	"orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");

    public static final ItemGroup MCWBOP_TAB = FabricItemGroup.builder()
    .icon(McwBOP::getIcon).displayName(Text.translatable("mcwbiomesoplenty.tab")).build();

	private static final Identifier TAB_ID = new Identifier(MODID + ".tab");

	@Override
	public void onInitialize()
	{
		AbstractBlock.Settings prop_crimson = AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS);
		AbstractBlock.Settings prop_cherry = AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS);

		List<String> woodClassic = List.of("dead", "fir", "mahogany", "palm", "redwood", "willow", "pine");
		List<String> woodCrimson = List.of("hellbark", "umbran", "empyreal");
		List<String> woodCherry = List.of("magic", "jacaranda", "maple");

		List<String> leaveClassic = List.of("dead", "fir", "hellbark", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "pine", "cypress", "flowering_oak", "rainbow_birch", "origin");
		List<String> leaveCherry = List.of("snowblossom", "orange_maple", "red_maple", "yellow_maple", "jacaranda", "magic");

		LOGGER.info("Macaw's Biomes O' Plenty Loading...");
		Bridges.setRegistrationWood(MODID, woodClassic);
		Fences.setRegistrationWood(MODID, woodClassic);
		Fences.setRegistrationHedges(MODID, leaveClassic);
		Furnitures.setRegistrationWood(MODID, woodClassic);
		Roofs.setRegistrationWood(MODID, woodClassic);
		Trapdoors.setRegistrationWood(MODID, woodClassic);
		Paths.setRegistrationWood(MODID, woodClassic);
		Doors.setRegistrationWood(MODID, woodClassic);
		Windows.setRegistrationWood(MODID, woodClassic);
		Stairs.setRegistrationWood(MODID, woodClassic);

		Bridges.setRegistrationWoodModLoaded(MODID, woodCrimson, prop_crimson);
		Fences.setRegistrationWoodModLoaded(MODID, woodCrimson, prop_crimson);
		Furnitures.setRegistrationWoodModLoaded(MODID, woodCrimson, prop_crimson);
		Roofs.setRegistrationWoodModLoaded(MODID, woodCrimson, prop_crimson);
		Trapdoors.setRegistrationWoodModLoaded(MODID, woodCrimson, AbstractBlock.Settings.copy(Blocks.CRIMSON_TRAPDOOR));
		Paths.setRegistrationWoodModLoaded(MODID, woodCrimson, prop_crimson);
		Doors.setRegistrationWoodModLoaded(MODID, woodCrimson, AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR), AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR));
		Windows.setRegistrationWoodModLoaded(MODID, woodCrimson, prop_crimson);
		Stairs.setRegistrationWoodModLoaded(MODID, woodCrimson, prop_crimson);

		Bridges.setRegistrationWoodModLoaded(MODID, woodCherry, prop_cherry);
		Fences.setRegistrationWoodModLoaded(MODID, woodCherry, prop_cherry);
		Fences.setRegistrationHedgesModLoaded(MODID, leaveCherry, AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES));
		Furnitures.setRegistrationWoodModLoaded(MODID, woodCherry, prop_cherry);
		Roofs.setRegistrationWoodModLoaded(MODID, woodCherry, prop_cherry);
		Trapdoors.setRegistrationWoodModLoaded(MODID, woodCherry, AbstractBlock.Settings.copy(Blocks.CHERRY_TRAPDOOR));
		Paths.setRegistrationWoodModLoaded(MODID, woodCherry, prop_cherry);
		Doors.setRegistrationWoodModLoaded(MODID, woodCherry, AbstractBlock.Settings.copy(Blocks.CHERRY_DOOR), AbstractBlock.Settings.copy(Blocks.CHERRY_DOOR));
		Windows.setRegistrationWoodModLoaded(MODID, woodCherry, prop_cherry);
		Stairs.setRegistrationWoodModLoaded(MODID, woodCherry, prop_cherry);

		Registry.register(Registries.ITEM_GROUP, TAB_ID, MCWBOP_TAB);
        RegistryKey<ItemGroup> group_key = RegistryKey.of(RegistryKeys.ITEM_GROUP, TAB_ID);

    	Bridges.addToTabWood(MODID, WOOD, group_key);
    	Fences.addToTabWood(MODID, WOOD, group_key);
    	Fences.addToTabLeave(MODID, LEAVES, group_key);
    	Furnitures.addToTabWood(MODID, WOOD, group_key);
    	Roofs.addToTabWood(MODID, WOOD, group_key);
    	Trapdoors.addToTabWood(MODID, WOOD, group_key);
    	Paths.addToTabWood(MODID, WOOD, group_key);
    	Doors.addToTabWood(MODID, WOOD, group_key);
    	Windows.addToTabWood(MODID, WOOD, group_key);
    	Stairs.addToTabWood(MODID, WOOD, group_key);

    	Bridges.fuelWood(MODID, WOOD);
    	Fences.fuelWood(MODID, WOOD);
    	Fences.fuelHedge(MODID, LEAVES);
    	Furnitures.fuelWood(MODID, WOOD);
    	Roofs.fuelWood(MODID, WOOD);
    	Trapdoors.fuelWood(MODID, WOOD);
    	Paths.fuelWood(MODID, WOOD);
    	Doors.fuelWood(MODID, WOOD);
    	Windows.fuelWood(MODID, WOOD);
    	Stairs.fuelWood(MODID, WOOD);

		Mapping.configDataFixerFiles();
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
	}

	private static ItemStack getIcon()
	{
    	NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "redwood_roof"), Finder.findBlock(MODID, "redwood_picket_fence"), Finder.findBlock(MODID, "redwood_wardrobe"), 
    	        Finder.findBlock(MODID, "redwood_log_bridge_middle"), Finder.findBlock(MODID, "redwood_window"), Finder.findBlock(MODID, "redwood_japanese_door"), Finder.findBlock(MODID, "redwood_glass_trapdoor"), 
    	        Finder.findBlock(MODID, "redwood_planks_path"), Finder.findBlock(MODID, "redwood_loft_stairs"));
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
       return new ItemStack(woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS));
	}
}