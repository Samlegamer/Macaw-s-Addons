package fr.samlegamer.mcwbiomesoplenty;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Bus.FORGE)
public class MappingForge
{
	@SubscribeEvent
	public static void missingnoWoodBlock(MissingMappingsEvent event)
	{
		Mapping.fences.leavesAdding(McwBOP.LEAVES);
		Mapping.bridges.missingnoWoodBlock(event);
		Mapping.furnitures.missingnoWoodBlock(event);
		Mapping.fences.missingnoWoodBlock(event);
		Mapping.roofs.missingnoWoodBlock(event);
	}

	@SubscribeEvent
	public static void missingnoWoodItem(MissingMappingsEvent event)
	{
		Mapping.fences.leavesAdding(McwBOP.LEAVES);
		Mapping.bridges.missingnoWoodItem(event);
		Mapping.furnitures.missingnoWoodItem(event);
		Mapping.fences.missingnoWoodItem(event);
		Mapping.roofs.missingnoWoodItem(event);
	}
}
