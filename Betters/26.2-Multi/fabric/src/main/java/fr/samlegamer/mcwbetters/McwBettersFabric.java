package fr.samlegamer.mcwbetters;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.ModListFabric;
import net.minecraft.world.item.CreativeModeTab;
import net.fabricmc.api.ModInitializer;

import static fr.samlegamer.mcwbetters.McwBetters.*;

public class McwBettersFabric implements ModInitializer
{
    public static final CreativeModeTab MCWBETTERS_TAB = APICreativeTab.initGroup(MODID, () -> icon(new ModListFabric()));

	@Override
	public void onInitialize()
	{
		McwBetters.startLog();

		McwRegistry.setRegistriesWood(MODID, WOOD_BETTER_END, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(MODID, LEAVE_BETTER_END);
		McwRegistry.setRegistriesWood(MODID, WOOD_BETTER_NETHER, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(MODID, LEAVE_BETTER_NETHER);

		APIFuels.initAllWood(MODID, WOOD_BETTER_END, ModType.getAllModTypeWood());
		APIFuels.initAllLeave(MODID, LEAVE_BETTER_END);
		APIFuels.initAllWood(MODID, WOOD_BETTER_NETHER.keySet().stream().toList(), ModType.getAllModTypeWood());
		APIFuels.initAllLeave(MODID, LEAVE_BETTER_NETHER);

		APICreativeTab.registerGroup(MODID, MCWBETTERS_TAB);
		APICreativeTab.initAllWood(MODID, WOOD_BETTER_END, MCWBETTERS_TAB, "betterend", ModType.getAllModTypeWood());
		APICreativeTab.initAllLeave(MODID, LEAVE_BETTER_END, MCWBETTERS_TAB, "betterend");
		APICreativeTab.initAllWood(MODID, WOOD_BETTER_NETHER.keySet().stream().toList(), MCWBETTERS_TAB, "betternether", ModType.getAllModTypeWood());
		APICreativeTab.initAllLeave(MODID, LEAVE_BETTER_NETHER, MCWBETTERS_TAB, "betternether");

		McwCommon.addCompatibleBlocksToFurnitureStorage(MODID, WOOD_BETTER_END);
		McwCommon.addCompatibleBlocksToFurnitureStorage(MODID, WOOD_BETTER_NETHER.keySet().stream().toList());

		McwBetters.finishLog();
	}
}