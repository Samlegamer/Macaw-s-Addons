package fr.samlegamer.mcwabnormals;

import java.util.ArrayList;
import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = McwAbnormals.MODID, bus = Bus.FORGE)
public class MappingsFix
{
	private static final MappingMissing.Bridges bridges_rock_bb = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, new ArrayList<String>(),McwAbnormals.ROCK_BB);
	private static final MappingMissing.Bridges bridges_atmo = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_ATMO, McwAbnormals.ROCK_ATMO);
	private static final MappingMissing.Bridges bridges_autu = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_AUTU, McwAbnormals.ROCK_AUTU);
	private static final MappingMissing.Bridges bridges_envi = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_ENVI);
	private static final MappingMissing.Bridges bridges_uaqua = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_UAQUA);
	private static final MappingMissing.Bridges bridges_ender = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_ENDER);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(MissingMappingsEvent event)
	{
		bridges_rock_bb.missingnoStoneBlock(event, false);
		bridges_atmo.missingnoStoneBlock(event, false);
		bridges_atmo.missingnoWoodBlock(event);
		bridges_autu.missingnoStoneBlock(event, false);
		bridges_autu.missingnoWoodBlock(event);
		bridges_envi.missingnoWoodBlock(event);
		bridges_uaqua.missingnoWoodBlock(event);
		bridges_ender.missingnoWoodBlock(event);
	}
	
	@SubscribeEvent
	public static void missingnoWoodItem(MissingMappingsEvent event)
	{
		bridges_rock_bb.missingnoStoneItem(event, false);
		bridges_atmo.missingnoStoneItem(event, false);
		bridges_atmo.missingnoWoodItem(event);
		bridges_autu.missingnoStoneItem(event, false);
		bridges_autu.missingnoWoodItem(event);
		bridges_envi.missingnoWoodItem(event);
		bridges_uaqua.missingnoWoodItem(event);
		bridges_ender.missingnoWoodItem(event);
	}
}