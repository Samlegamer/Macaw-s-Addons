package fr.samlegamer.mcwbetters;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.IconRandomFabric;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class McwBettersFabric implements ModInitializer
{
	public static final String MODID = "mcwbetters";
    private static final Logger LOGGER = LogManager.getLogger();

    public static ItemGroup MCWBYG_TAB = FabricItemGroupBuilder.build(new Identifier(MODID + ".tab"), McwBettersFabric::icon);

	public static final List<String> WOOD_BETTER_END = Arrays.asList("dragon_tree", "end_lotus", "helix_tree", "jellyshroom", "lacugrove", "lucernia",
			"mossy_glowshroom", "pythadendron", "tenanea", "umbrella_tree");
	public static final List<String> WOOD_BETTER_NETHER = Arrays.asList("anchor_tree", "mushroom_fir", "mushroom", "nether_sakura", "rubeus", "stalagnate",
			"wart", "willow");

	public static final List<String> LEAVE_BETTER_END = Arrays.asList("dragon_tree", "lacugrove", "lucernia", "pythadendron", "tenanea");
	public static final List<String> LEAVE_BETTER_NETHER = Arrays.asList("nether_sakura", "rubeus", "willow");

	@Override
	public void onInitialize()
	{
		LOGGER.info("Macaw's Betters Mod Loading...");

		McwRegistry.setRegistriesWood(MODID, WOOD_BETTER_END, MCWBYG_TAB, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(MODID, LEAVE_BETTER_END, MCWBYG_TAB);
		McwRegistry.setRegistriesWood(MODID, WOOD_BETTER_NETHER, MCWBYG_TAB, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(MODID, LEAVE_BETTER_NETHER, MCWBYG_TAB);

		APIFuels.initAllWood(MODID, WOOD_BETTER_END);
		APIFuels.initAllLeave(MODID, LEAVE_BETTER_END);
		APIFuels.initAllWood(MODID, WOOD_BETTER_NETHER);
		APIFuels.initAllLeave(MODID, LEAVE_BETTER_NETHER);

		LOGGER.info("Macaw's Betters Mod Finish !");
	}

	public static ItemStack icon() {
		String wood, leaves;
		if(FabricLoader.getInstance().isModLoaded("betterendforge") && !FabricLoader.getInstance().isModLoaded("betternether"))
		{
			wood = getRandomInList(WOOD_BETTER_END);
			leaves = getRandomInList(LEAVE_BETTER_END);
		}
		else if(FabricLoader.getInstance().isModLoaded("betternether") && !FabricLoader.getInstance().isModLoaded("betterendforge"))
		{
			wood = getRandomInList(WOOD_BETTER_NETHER);
			leaves = getRandomInList(LEAVE_BETTER_NETHER);
		}
		else
		{
			Random rand = new Random();
			boolean rnd = rand.nextBoolean();
			wood = getRandomInList(rnd ? WOOD_BETTER_END : WOOD_BETTER_NETHER);
			leaves = getRandomInList(rnd ? LEAVE_BETTER_END : LEAVE_BETTER_NETHER);
		}

		return IconRandomFabric.buildIcon(
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