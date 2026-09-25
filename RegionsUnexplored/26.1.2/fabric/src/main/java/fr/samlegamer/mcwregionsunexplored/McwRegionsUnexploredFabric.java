package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.ModListFabric;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.item.CreativeModeTab;

public class McwRegionsUnexploredFabric implements ModInitializer {

    public static final CreativeModeTab MCWREGIONUNEXPLORED_TAB = APICreativeTab.initGroup(McwRegionsUnexplored.MODID, () -> McwRegionsUnexplored.makeIcon(new ModListFabric()));

    @Override
    public void onInitialize() {
        McwRegionsUnexplored.startLog();
        McwRegistry.setRegistriesWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);

        APICreativeTab.registerGroup(McwRegionsUnexplored.MODID, MCWREGIONUNEXPLORED_TAB);
        APICreativeTab.initAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, MCWREGIONUNEXPLORED_TAB, ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES, MCWREGIONUNEXPLORED_TAB);

        APIFuels.initAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
        APIFuels.initAllLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);

        McwCommon.addCompatibleBlocksToFurnitureStorage(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD);
        McwRegionsUnexplored.finishLog();
    }
}