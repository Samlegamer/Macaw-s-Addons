package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.client.telemetry.events.WorldLoadEvent;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.DeferredWorkQueue;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.level.LevelEvent;
import net.neoforged.neoforge.registries.NewRegistryEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

//@EventBusSubscriber(modid = McwBOP.MODID, bus = EventBusSubscriber.Bus.MOD)
public class MissingnoAlias
{
    @SubscribeEvent
    public static void fix(NewRegistryEvent event)
    {
        McwBOP.block.addAlias(new ResourceLocation("macawsroofsbop", "dead_roof"), new ResourceLocation(McwBOP.MODID, "dead_roof"));
        McwBOP.item.addAlias(new ResourceLocation("macawsroofsbop", "dead_roof"), new ResourceLocation(McwBOP.MODID, "dead_roof"));

        /*final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbop", McwBOP.MODID, McwBOP.WOOD);
        final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbop", McwBOP.MODID, McwBOP.WOOD);
        final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbop", McwBOP.MODID, McwBOP.WOOD);
        final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbop", McwBOP.MODID, McwBOP.WOOD);

        McwBOP.LOGGER.info("Start convert blocks");
        fences.leavesAdding(McwBOP.LEAVES);
        bridges.missingnoWoodBlock(McwBOP.block);
        furnitures.missingnoWoodBlock(McwBOP.block);
        fences.missingnoWoodBlock(McwBOP.block);
        roofs.missingnoWoodBlock(McwBOP.block);
        McwBOP.LOGGER.info("Finish convert blocks");
        McwBOP.LOGGER.info("Start convert items");
        fences.leavesAdding(McwBOP.LEAVES);
        bridges.missingnoWoodItem(McwBOP.item);
        furnitures.missingnoWoodItem(McwBOP.item);
        fences.missingnoWoodItem(McwBOP.item);
        roofs.missingnoWoodItem(McwBOP.item);
        McwBOP.LOGGER.info("Finish convert items");*/
    }
}