package fr.samlegamer.mcwbyg;

import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = McwByg.MODID, bus = Bus.FORGE)
public class MappingForge
{
	@SubscribeEvent
	public static void missingnoWoodBlock(MissingMappingsEvent event)
	{
		Mapping.fences.leavesAdding(McwByg.LEAVES);
		Mapping.bridges.missingnoWoodBlock(event);
		Mapping.bridges.missingnoStoneBlock(event, true);
		Mapping.furnitures.missingnoWoodBlock(event);
		Mapping.fences.missingnoWoodBlock(event);
		Mapping.fences.missingnoStoneBlock(event);
		Mapping.roofs.missingnoWoodBlock(event);
	}

	@SubscribeEvent
	public static void missingnoWoodItem(MissingMappingsEvent event)
	{
		Mapping.fences.leavesAdding(McwByg.LEAVES);
		Mapping.bridges.missingnoWoodItem(event);
		Mapping.bridges.missingnoStoneItem(event, true);
		Mapping.furnitures.missingnoWoodItem(event);
		Mapping.fences.missingnoWoodItem(event);
		Mapping.fences.missingnoStoneItem(event);
		Mapping.roofs.missingnoWoodItem(event);
	}
}
