package fr.samlegamer.mcwbetters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.registry.RegistryUtils;
import fr.samlegamer.addonslib.tab.IconRandom;
import fr.samlegamer.addonslib.util.IModList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;

public class McwBetters
{
	public static final String MODID = "mcwbetters";
    private static final Logger LOGGER = LogManager.getLogger();

	public static final List<String> WOOD_BETTER_END = Arrays.asList("dragon_tree", "end_lotus", "helix_tree", "jellyshroom", "lacugrove", "lucernia",
			"mossy_glowshroom", "pythadendron", "tenanea", "umbrella_tree");
	public static final Map<String, SoundType> WOOD_BETTER_NETHER = RegistryUtils.makeDefaultFromList(List.of("anchor_tree", "mushroom_fir", "mushroom", "nether_sakura", "rubeus", "stalagnate",
			"wart", "willow"), SoundType.NETHER_WOOD);

	public static final List<String> LEAVE_BETTER_END = Arrays.asList("dragon_tree", "lacugrove", "lucernia", "pythadendron", "tenanea");
	public static final List<String> LEAVE_BETTER_NETHER = Arrays.asList("nether_sakura", "rubeus", "willow");

	public static void startLog()
	{
		LOGGER.info("Macaw's Betters Mod Loading...");
	}

	public static void finishLog()
	{
		LOGGER.info("Macaw's Betters Mod Finish !");
	}

	public static ItemStack icon(IModList iModList) {
		String wood, leaves;
		if(iModList.isLoaded("betterend") && !iModList.isLoaded("betternether"))
		{
			wood = getRandomInList(WOOD_BETTER_END);
			leaves = getRandomInList(LEAVE_BETTER_END);
		}
		else if(iModList.isLoaded("betternether") && !iModList.isLoaded("betterend"))
		{
			wood = getRandomInList(WOOD_BETTER_NETHER.keySet().stream().toList());
			leaves = getRandomInList(LEAVE_BETTER_NETHER);
		}
		else
		{
			Random rand = new Random();
			boolean rnd = rand.nextBoolean();
			wood = getRandomInList(rnd ? WOOD_BETTER_END : WOOD_BETTER_NETHER.keySet().stream().toList());
			leaves = getRandomInList(rnd ? LEAVE_BETTER_END : LEAVE_BETTER_NETHER);
		}

		return IconRandom.buildIcon(
				iModList,
				Finder.findBlock(MODID, wood+"_roof"),
				Finder.findBlock(MODID, leaves+"_hedge"),
				Finder.findBlock(MODID, wood+"_wardrobe"),
				Finder.findBlock(MODID, wood+"_log_bridge_middle"),
				Finder.findBlock(MODID, wood+"_window"),
				Finder.findBlock(MODID, wood+"_japanese_door"),
				Finder.findBlock(MODID, wood+"_glass_trapdoor"),
				Finder.findBlock(MODID, wood+"_planks_path"),
				Finder.findBlock(MODID, wood+"_loft_stairs"),
				ModType.getAllModTypeWood());
	}

	public static String getRandomInList(List<String> list)
	{
		Random rand = new Random();
		int index = rand.nextInt(list.size());
		return list.get(index);
	}
}