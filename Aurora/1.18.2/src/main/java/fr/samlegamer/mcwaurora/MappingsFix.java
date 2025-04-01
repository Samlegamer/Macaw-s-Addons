package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McwAurora.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MappingsFix
{
	private static final MappingMissing.Bridges bridges_mush = new MappingMissing.Bridges("mcwbridgesaurora", McwAurora.MODID, McwAurora.WOOD_ENHANCED_MUSH);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(RegistryEvent.MissingMappings<Block> event)
	{
		bridges_mush.missingnoWoodBlock(event);
	}
	
	@SubscribeEvent
	public static void missingnoWoodItem(RegistryEvent.MissingMappings<Item> event)
	{
		bridges_mush.missingnoWoodItem(event);
	}
}