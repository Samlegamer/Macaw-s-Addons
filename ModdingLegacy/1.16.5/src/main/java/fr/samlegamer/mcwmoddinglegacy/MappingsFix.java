package fr.samlegamer.mcwmoddinglegacy;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = McwModdingLegacy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MappingsFix
{
	private static final MappingMissing.Bridges bridges_Bsky = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_blue_skies);
	private static final MappingMissing.Bridges bridges_pWood = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_premium_wood);
	private static final MappingMissing.Bridges bridges_glass = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_crystallized);

	@SubscribeEvent
	public static void missingnoWoodBlock(RegistryEvent.MissingMappings<Block> event)
	{
		bridges_Bsky.missingnoWoodBlock(event);
		bridges_pWood.missingnoWoodBlock(event);
		bridges_glass.missingnoWoodBlock(event);
	}
	
	@SubscribeEvent
	public static void missingnoWoodItem(RegistryEvent.MissingMappings<Item> event)
	{
		bridges_Bsky.missingnoWoodItem(event);
		bridges_pWood.missingnoWoodItem(event);
		bridges_glass.missingnoWoodItem(event);
	}
}