package fr.samlegamer.mcwabnormals;

import java.util.ArrayList;
import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McwAbnormals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MappingsFix
{
	private static final MappingMissing.Bridges bridges_rock_bb = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, new ArrayList<String>(),McwAbnormals.ROCK_BB);
	private static final MappingMissing.Bridges bridges_atmo = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_ATMO, McwAbnormals.ROCK_ATMO);
	private static final MappingMissing.Bridges bridges_autu = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_AUTU, McwAbnormals.ROCK_AUTU);
	private static final MappingMissing.Bridges bridges_envi = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_ENVI);
	private static final MappingMissing.Bridges bridges_uaqua = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_UAQUA);
	private static final MappingMissing.Bridges bridges_ender = new MappingMissing.Bridges("mcwbridgesabnormals", McwAbnormals.MODID, McwAbnormals.WOOD_ENDER);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(RegistryEvent.MissingMappings<Block> event)
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
	public static void missingnoWoodItem(RegistryEvent.MissingMappings<Item> event)
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