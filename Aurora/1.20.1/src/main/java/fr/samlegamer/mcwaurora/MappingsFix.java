package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = McwAurora.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MappingsFix
{
	private static final MappingMissing.Bridges bridges_bayou = new MappingMissing.Bridges("mcwbridgesaurora", McwAurora.MODID, McwAurora.WOOD_BAYOU);
	private static final MappingMissing.Bridges bridges_mush = new MappingMissing.Bridges("mcwbridgesaurora", McwAurora.MODID, McwAurora.WOOD_ENHANCED_MUSH);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(MissingMappingsEvent event)
	{
		bridges_bayou.missingnoWoodBlock(event);
		bridges_mush.missingnoWoodBlock(event);
	}
	
	@SubscribeEvent
	public static void missingnoWoodItem(MissingMappingsEvent event)
	{
		bridges_bayou.missingnoWoodItem(event);
		bridges_mush.missingnoWoodItem(event);
	}
}