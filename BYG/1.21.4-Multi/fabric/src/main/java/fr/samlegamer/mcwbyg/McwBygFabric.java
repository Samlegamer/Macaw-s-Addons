package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.ModListFabric;
import net.minecraft.world.item.CreativeModeTab;
import net.fabricmc.api.ModInitializer;
import fr.samlegamer.addonslib.util.McwCommon;

public class McwBygFabric implements ModInitializer
{
	public static final CreativeModeTab MCWBYG_TAB = APICreativeTab.initGroup(McwByg.MODID, () -> McwByg.getIcon(new ModListFabric()));
	
	@Override
	public void onInitialize()
	{
		McwByg.startLog();
		MappingFabric.configDataFixerFiles();

		McwRegistry.setRegistriesWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(McwByg.MODID, McwByg.leavesClassic());
		McwRegistry.setRegistriesLeave(McwByg.MODID, McwByg.mapLeaveSoundCherry());
		McwRegistry.setRegistriesStone(McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());

		APICreativeTab.registerGroup(McwByg.MODID, MCWBYG_TAB);
		APICreativeTab.initAllWood(McwByg.MODID, McwByg.WOOD, MCWBYG_TAB, ModType.getAllModTypeWood());
		APICreativeTab.initAllStone(McwByg.MODID, McwByg.STONE, MCWBYG_TAB, ModType.getAllModTypeStone());
		APICreativeTab.initAllLeave(McwByg.MODID, McwByg.LEAVES, MCWBYG_TAB);

		APIFuels.initAllWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
        APIFuels.initAllLeave(McwByg.MODID, McwByg.LEAVES);

    	McwCommon.addCompatibleBlocksToFurnitureStorage(McwByg.MODID, McwByg.WOOD);
		McwByg.finishLog();
	}
}