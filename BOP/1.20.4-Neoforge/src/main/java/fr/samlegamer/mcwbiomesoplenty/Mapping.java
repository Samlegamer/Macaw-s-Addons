package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.common.Mod.EventBusSubscriber.Bus;
import net.neoforged.neoforge.registries.IdMappingEvent;

@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Bus.FORGE)
public class Mapping
{
	private static final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbop", McwBOP.MODID, McwBOP.WOOD);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(IdMappingEvent event)
	{
		fences.leavesAdding(McwBOP.LEAVES);
		bridges.missingnoWoodBlock(event);
		furnitures.missingnoWoodBlock(event);
		fences.missingnoWoodBlock(event);
		roofs.missingnoWoodBlock(event);
	}

	@SubscribeEvent
	public static void missingnoWoodItem(IdMappingEvent event)
	{
		fences.leavesAdding(McwBOP.LEAVES);
		bridges.missingnoWoodItem(event);
		furnitures.missingnoWoodItem(event);
		fences.missingnoWoodItem(event);
		roofs.missingnoWoodItem(event);
	}
}
