package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = McwBOP.MODID, bus = Bus.FORGE)
public class Mapping
{
	private static final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbop", McwBOP.MODID, McwBOP.WOOD);
	private static final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbop", McwBOP.MODID, McwBOP.WOOD);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(MissingMappingsEvent event)
	{
		fences.leavesAdding(McwBOP.LEAVE);
		bridges.missingnoWoodBlock(event);
		furnitures.missingnoWoodBlock(event);
		fences.missingnoWoodBlock(event);
		roofs.missingnoWoodBlock(event);
	}

	@SubscribeEvent
	public static void missingnoWoodItem(MissingMappingsEvent event)
	{
		fences.leavesAdding(McwBOP.LEAVE);
		bridges.missingnoWoodItem(event);
		furnitures.missingnoWoodItem(event);
		fences.missingnoWoodItem(event);
		roofs.missingnoWoodItem(event);
	}
}
