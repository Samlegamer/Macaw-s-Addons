package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.registry.RegistryUtils;
import fr.samlegamer.addonslib.tab.IconRandom;
import fr.samlegamer.addonslib.util.IModList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;

public class McwBOP
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal", "pine", "orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");

	public static Map<String, SoundType> mapWoodSoundCrimson() {
		return RegistryUtils.makeDefaultFromList(List.of("hellbark", "umbran", "empyreal"), SoundType.NETHER_WOOD);
	}

	public static Map<String, SoundType> mapWoodSoundCherry() {
		return RegistryUtils.makeDefaultFromList(List.of("magic", "jacaranda", "maple"), SoundType.CHERRY_WOOD);
	}

	public static Map<String, SoundType> mapLeaveSoundCherry() {
		return RegistryUtils.makeDefaultFromList(List.of("snowblossom", "orange_maple", "red_maple", "yellow_maple", "jacaranda", "magic"), SoundType.CHERRY_LEAVES);
	}

	public static List<String> woodClassic() {
		return List.of("dead", "fir", "mahogany", "palm", "redwood", "willow", "pine");
	}

	public static List<String> leaveClassic() {
		return List.of("dead", "fir", "hellbark", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "pine", "cypress", "flowering_oak",
				"rainbow_birch", "origin");
	}

	public static void startLog()
	{
		LOGGER.info("Macaw's Biomes O' Plenty Loading...");
	}

	public static void finishLog()
	{
		LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
	}

	public static ItemStack getIcon(IModList modList)
	{
		return IconRandom.buildIcon(
				modList,
				Finder.findBlock(MODID, "redwood_roof"),
				Finder.findBlock(MODID, "redwood_picket_fence"),
				Finder.findBlock(MODID, "redwood_wardrobe"),
				Finder.findBlock(MODID, "redwood_log_bridge_middle"),
				Finder.findBlock(MODID, "redwood_pane_window"),
				Finder.findBlock(MODID, "redwood_modern_door"),
				Finder.findBlock(MODID, "redwood_mystic_trapdoor"),
				Finder.findBlock(MODID, "redwood_planks_path"),
				Finder.findBlock(MODID, "redwood_skyline_stairs"),
				ModType.getAllModTypeWood());
	}
}