package fr.samlegamer.mcwsajevius;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McwSajevius.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MappingsFix
{
	private static final MappingMissing.Bridges bridges_betterlands = new MappingMissing.Bridges("mcwbridgessajevius", McwSajevius.MODID, McwSajevius.wood_betterlands, McwSajevius.stone_betterlands);
	private static final MappingMissing.Bridges bridges_shroomed = new MappingMissing.Bridges("mcwbridgessajevius", McwSajevius.MODID, McwSajevius.wood_shroomed);
	
	@SubscribeEvent
	public static void missingnoWoodBlock(RegistryEvent.MissingMappings<Block> event)
	{
		bridges_betterlands.missingnoWoodBlock(event);
		bridges_betterlands.missingnoStoneBlock(event, false);
		bridges_shroomed.missingnoWoodBlock(event);
	}
	
	@SubscribeEvent
	public static void missingnoWoodItem(RegistryEvent.MissingMappings<Item> event)
	{
		bridges_betterlands.missingnoWoodItem(event);
		bridges_betterlands.missingnoStoneItem(event, false);
		bridges_shroomed.missingnoWoodItem(event);
	}
}