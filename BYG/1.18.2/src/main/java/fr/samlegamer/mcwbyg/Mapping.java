package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwByg.MODID, bus = Bus.MOD)
public class Mapping
{
	private static final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbyg", McwByg.MODID, McwByg.WOOD, McwByg.bridges_rockable);
	private static final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbyg", McwByg.MODID, McwByg.WOOD);
	private static final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbyg", McwByg.MODID, McwByg.WOOD, McwByg.fences_rockable);
	private static final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbyg", McwByg.MODID, McwByg.WOOD);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(RegistryEvent.MissingMappings<Block> event)
	{
		fences.leavesAdding(McwByg.LEAVES);
		bridges.missingnoWoodBlock(event);
		bridges.missingnoStoneBlock(event, true);
		furnitures.missingnoWoodBlock(event);
		fences.missingnoWoodBlock(event);
		fences.missingnoStoneBlock(event);
		roofs.missingnoWoodBlock(event);
	}

	@SubscribeEvent
	public static void missingnoWoodItem(RegistryEvent.MissingMappings<Item> event)
	{
		fences.leavesAdding(McwByg.LEAVES);
		bridges.missingnoWoodItem(event);
		bridges.missingnoStoneItem(event, true);
		furnitures.missingnoWoodItem(event);
		fences.missingnoWoodItem(event);
		fences.missingnoStoneItem(event);
		roofs.missingnoWoodItem(event);
	}
}
