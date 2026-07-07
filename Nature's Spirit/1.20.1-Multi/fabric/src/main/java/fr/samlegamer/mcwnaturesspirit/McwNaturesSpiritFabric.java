package fr.samlegamer.mcwnaturesspirit;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.ModListFabric;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.item.CreativeModeTab;

public class McwNaturesSpiritFabric implements ModInitializer
{
    public static final CreativeModeTab MCWNATURESSPIRIT_TAB = APICreativeTab.initGroup(McwNaturesSpirit.MODID, () -> McwNaturesSpirit.icon(new ModListFabric()));

    @Override
    public void onInitialize() {
        McwNaturesSpirit.startLog();

        McwRegistry.setRegistriesWood(McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES);

        APICreativeTab.registerGroup(McwNaturesSpirit.MODID, MCWNATURESSPIRIT_TAB);
        APICreativeTab.initAllWood(McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD, MCWNATURESSPIRIT_TAB, ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES, MCWNATURESSPIRIT_TAB);

        APIFuels.initAllWood(McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD, ModType.getAllModTypeWood());
        APIFuels.initAllLeave(McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES);

        McwNaturesSpirit.chargedLog();
    }
}