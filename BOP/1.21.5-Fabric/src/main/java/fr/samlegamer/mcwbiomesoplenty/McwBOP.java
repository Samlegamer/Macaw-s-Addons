package fr.samlegamer.mcwbiomesoplenty;

import java.util.List;
import java.util.Map;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import net.minecraft.sound.BlockSoundGroup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class McwBOP implements ModInitializer
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal", "pine", "orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");

    public static final ItemGroup MCWBOP_TAB = APICreativeTab.initGroup(MODID, McwBOP::getIcon);

	@Override
	public void onInitialize()
	{
		List<String> woodClassic = List.of("dead", "fir", "mahogany", "palm", "redwood", "willow", "pine");
		List<String> leaveClassic = List.of("dead", "fir", "hellbark", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "pine", "cypress", "flowering_oak", "rainbow_birch", "origin");

		Map<String, BlockSoundGroup> mapWoodSoundCrimson = McwRegistry.makeDefaultFromList(List.of("hellbark", "umbran", "empyreal"), BlockSoundGroup.NETHER_WOOD);
		Map<String, BlockSoundGroup> mapWoodSoundCherry = McwRegistry.makeDefaultFromList(List.of("magic", "jacaranda", "maple"), BlockSoundGroup.CHERRY_WOOD);
		Map<String, BlockSoundGroup> mapLeaveSoundCherry = McwRegistry.makeDefaultFromList(List.of("snowblossom", "orange_maple", "red_maple", "yellow_maple", "jacaranda", "magic"), BlockSoundGroup.CHERRY_LEAVES);

		LOGGER.info("Macaw's Biomes O' Plenty Loading...");
		McwRegistry.setRegistriesWood(MODID, woodClassic, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesWood(MODID, mapWoodSoundCrimson, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesWood(MODID, mapWoodSoundCherry, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(MODID, leaveClassic);
		McwRegistry.setRegistriesLeave(MODID, mapLeaveSoundCherry);

		APICreativeTab.registerGroup(MODID, MCWBOP_TAB);
		APICreativeTab.initAllWood(MODID, WOOD, MCWBOP_TAB, Registration.getAllModTypeWood());
		APICreativeTab.initAllLeave(MODID, LEAVES, MCWBOP_TAB);

		APIFuels.initAllWood(MODID, WOOD, Registration.getAllModTypeWood());
		APIFuels.initAllLeave(MODID, LEAVES);

		McwCommon.addCompatibleBlocksToFurnitureStorage(MODID, WOOD);

		LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
	}

	private static ItemStack getIcon()
	{
    	NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "redwood_roof"), Finder.findBlock(MODID, "redwood_picket_fence"), Finder.findBlock(MODID, "redwood_wardrobe"), 
    	        Finder.findBlock(MODID, "redwood_log_bridge_middle"), Finder.findBlock(MODID, "redwood_window"), Finder.findBlock(MODID, "redwood_japanese_door"), Finder.findBlock(MODID, "redwood_glass_trapdoor"), 
    	        Finder.findBlock(MODID, "redwood_planks_path"), Finder.findBlock(MODID, "redwood_loft_stairs"));
    	    	woodProperties
    	    	.addType(ModType.ROOFS)
    	    	.addType(ModType.FENCES)
    	    	.addType(ModType.FURNITURES)
    	    	.addType(ModType.BRIDGES)
    	    	.addType(ModType.WINDOWS)
    	    	.addType(ModType.DOORS)
    	    	.addType(ModType.TRAPDOORS)
    	    	.addType(ModType.PATHS)
    	    	.addType(ModType.STAIRS);
		return new ItemStack(woodProperties.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.BRIDGES, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.STAIRS));
	}
}