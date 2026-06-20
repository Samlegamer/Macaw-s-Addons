package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.ModListFabric;
import net.minecraft.world.item.CreativeModeTab;
import net.fabricmc.api.ModInitializer;

public class McwBOPFabric implements ModInitializer
{
    public static final CreativeModeTab MCWBOP_TAB = APICreativeTab.initGroup(McwBOP.MODID, () -> McwBOP.getIcon(new ModListFabric()));

	@Override
	public void onInitialize()
	{
		McwBOP.startLog();
		McwRegistry.setRegistriesWood(McwBOP.MODID, McwBOP.woodClassic(), ModType.getAllModTypeWood());
		McwRegistry.setRegistriesWood(McwBOP.MODID, McwBOP.mapWoodSoundCrimson(), ModType.getAllModTypeWood());
		McwRegistry.setRegistriesWood(McwBOP.MODID, McwBOP.mapWoodSoundCherry(), ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(McwBOP.MODID, McwBOP.leaveClassic());
		McwRegistry.setRegistriesLeave(McwBOP.MODID, McwBOP.mapLeaveSoundCherry());

		APICreativeTab.registerGroup(McwBOP.MODID, MCWBOP_TAB);
		APICreativeTab.initAllWood(McwBOP.MODID, McwBOP.WOOD, MCWBOP_TAB, ModType.getAllModTypeWood());
		APICreativeTab.initAllLeave(McwBOP.MODID, McwBOP.LEAVES, MCWBOP_TAB);

        APIFuels.initAllWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
        APIFuels.initAllLeave(McwBOP.MODID, McwBOP.LEAVES);

		MappingFabric.configDataFixerFiles();
		McwCommon.addCompatibleBlocksToFurnitureStorage(McwBOP.MODID, McwBOP.WOOD);
		McwBOP.finishLog();
	}
}