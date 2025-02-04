package fr.samlegamer.mcwmoddinglegacy;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;

@Mod.EventBusSubscriber(modid = McwModdingLegacy.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MappingsFix
{
	private static final MappingMissing.Bridges bridges_Bsky = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_blue_skies);
	private static final MappingMissing.Bridges bridges_pWood = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_premium_wood);
	private static final MappingMissing.Bridges bridges_glass = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_crystallized);

	/* Specific convert cherry to comet wood */
	@SubscribeEvent
	public static void missingnoWoodBlock(MissingMappingsEvent event)
	{
		addMissingBlock(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_log_bridge_middle", "bsky_comet_log_bridge_middle");
		addMissingBlock(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "rope_bsky_cherry_bridge", "rope_bsky_comet_bridge");
		addMissingBlock(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_bridge_pier", "bsky_comet_bridge_pier");
		addMissingBlock(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_log_bridge_stair", "bsky_comet_log_bridge_stair");
		addMissingBlock(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_rope_bridge_stair", "bsky_comet_rope_bridge_stair");
		addMissingBlock(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_rail_bridge", "bsky_comet_rail_bridge");
		bridges_Bsky.missingnoWoodBlock(event);
		bridges_pWood.missingnoWoodBlock(event);
		bridges_glass.missingnoWoodBlock(event);
	}
	
	@SubscribeEvent
	public static void missingnoWoodItem(MissingMappingsEvent event)
	{
		addMissingItem(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_log_bridge_middle", "bsky_comet_log_bridge_middle");
		addMissingItem(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "rope_bsky_cherry_bridge", "rope_bsky_comet_bridge");
		addMissingItem(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_bridge_pier", "bsky_comet_bridge_pier");
		addMissingItem(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_log_bridge_stair", "bsky_comet_log_bridge_stair");
		addMissingItem(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_rope_bridge_stair", "bsky_comet_rope_bridge_stair");
		addMissingItem(event, "mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, "bsky_cherry_rail_bridge", "bsky_comet_rail_bridge");
		bridges_Bsky.missingnoWoodItem(event);
		bridges_pWood.missingnoWoodItem(event);
		bridges_glass.missingnoWoodItem(event);
	}

	protected static void addMissingBlock(MissingMappingsEvent event, String oldModid, String newModid, String nameMissing, String nameNew) {
		Block remapped = (Block) ForgeRegistries.BLOCKS.getValue(new ResourceLocation(newModid, nameNew));
		if (remapped != null) {
			for (MissingMappingsEvent.Mapping<Block> entry : event.getAllMappings(Registries.BLOCK)) {
				if (entry.getKey().toString().equals(oldModid + ":" + nameMissing)) {
					entry.remap(remapped);
				}
			}
		}
	}

	protected static void addMissingItem(MissingMappingsEvent event, String oldModid, String newModid, String nameMissing, String nameNew) {
		Item remapped = (Item)ForgeRegistries.ITEMS.getValue(new ResourceLocation(newModid, nameNew));
		if (remapped != null) {
			for(MissingMappingsEvent.Mapping<Item> entry : event.getAllMappings(Registries.ITEM)) {
				if (entry.getKey().toString().equals(oldModid + ":" + nameMissing)) {
					entry.remap(remapped);
				}
			}
		}
	}
}