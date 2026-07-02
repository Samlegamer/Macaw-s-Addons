package fr.samlegamer.mcwmysticbiomes;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.ModListFabric;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.item.CreativeModeTab;

public class McwMysticBiomesFabric implements ModInitializer
{
    public static final CreativeModeTab MCWMYSTICBIOMES_TAB = APICreativeTab.initGroup(McwMysticBiomes.MODID, () -> McwMysticBiomes.icon(new ModListFabric()));

    @Override
    public void onInitialize()
    {
        McwMysticBiomes.startLog();

        McwRegistry.setRegistriesWood(McwMysticBiomes.MODID, McwMysticBiomes.getWoodSpecialSound(), ModType.getAllModTypeWood());
        McwRegistry.setRegistriesWood(McwMysticBiomes.MODID, McwMysticBiomes.getWoodVanillaSound(), ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(McwMysticBiomes.MODID, McwMysticBiomes.getLeavesSpecialSound());
        McwRegistry.setRegistriesLeave(McwMysticBiomes.MODID, McwMysticBiomes.getLeavesVanillaSound());

        APICreativeTab.registerGroup(McwMysticBiomes.MODID, MCWMYSTICBIOMES_TAB);
        APICreativeTab.initAllWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD, MCWMYSTICBIOMES_TAB, ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES, MCWMYSTICBIOMES_TAB);

        APIFuels.initAllWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD, ModType.getAllModTypeWood());
        APIFuels.initAllLeave(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);

        McwMysticBiomes.chargedLog();
    }
}