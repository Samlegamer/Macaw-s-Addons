package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.client.telemetry.events.WorldLoadEvent;
import net.minecraft.core.Registry;
import net.minecraft.core.WritableRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.ModMismatchEvent;
import net.neoforged.neoforge.registries.*;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;

import javax.annotation.Nullable;

@Mod(McwBOP.MODID)
public class McwBOP
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "maple", "pine");
	public static final List<String> LEAVES = List.of("dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", 
	"empyreal",
	"pine",
	"orange_maple", "red_maple", "yellow_maple", "cypress", "snowblossom", "flowering_oak", "rainbow_birch", "origin");
    protected static final DeferredRegister.Blocks block = Registration.blocks(MODID);
	protected static final DeferredRegister.Items item = DeferredRegister.createItems(MODID); //CHANGE THIS IN THE NEXT ADDONSLIB UPDATE
	protected static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwBOP.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
			.title(Component.translatable(McwBOP.MODID + "." + "tab")).icon(() -> { return new ItemStack(getIcon()); }).build());

	public McwBOP(IEventBus bus)
    {
		//bus.addListener(MissingnoAlias::fix);

		LOGGER.info("Macaw's Biomes O' Plenty Loading...");
		Registration.init(bus, block, item, ct);

		bus.register(MissingnoAlias.class);
		//McwBOP.block.addAlias(new ResourceLocation("macawsroofsbop", "dead_roof"), new ResourceLocation(McwBOP.MODID, "dead_roof"));
		//McwBOP.item.addAlias(new ResourceLocation("macawsroofsbop", "dead_roof"), new ResourceLocation(McwBOP.MODID, "dead_roof"));

		Bridges.setRegistrationWood(WOOD, block, item, null);
    	Fences.setRegistrationWood(WOOD, block, item, null);
    	Fences.setRegistrationHedges(LEAVES, block, item, null);
    	Furnitures.setRegistrationWood(WOOD, block, item, null);
    	Roofs.setRegistrationWood(WOOD, block, item, null);
    	Trapdoors.setRegistrationWood(WOOD, block, item, null);
    	Paths.setRegistrationWood(WOOD, block, item, null);
    	Doors.setRegistrationWood(WOOD, block, item, null);
    	Windows.setRegistrationWood(WOOD, block, item, null);
    	Stairs.setRegistrationWood(WOOD, block, item, null);
		block.addAlias(new ResourceLocation("macawsroofsbop", "dead_roof"), new ResourceLocation(MODID, "dead_roof"));
		//bus.addListener(MissingnoAlias::fixAlias);
		//NeoForge.EVENT_BUS.register(MissingnoAlias.class);
		//bus.addListener(this::registerEvent);
		bus.addListener(this::addTotab);
		bus.addListener(this::catchModVersionMismatch);
		//IdMappingEvent
		//MissingnoAlias.fixAlias();
		LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

	/*private void registerEvent(RegisterEvent event) {
		event.getRegistry().addAlias(new ResourceLocation("macawsroofsbop", "dead_roof"), new ResourceLocation(MODID, "dead_roof"));
	}*/



	public void catchModVersionMismatch(ModMismatchEvent event) {
		event.markResolved(MODID);
	}


	private static Block getIcon()
    {
    	NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "redwood_roof"), Finder.findBlock(MODID, "redwood_picket_fence"), Finder.findBlock(MODID, "redwood_wardrobe"), 
    	        Finder.findBlock(MODID, "redwood_log_bridge_middle"), Finder.findBlock(MODID, "redwood_window"), Finder.findBlock(MODID, "redwood_japanese_door"), Finder.findBlock(MODID, "redwood_glass_trapdoor"), 
    	        Finder.findBlock(MODID, "redwood_planks_path"), Finder.findBlock(MODID, "redwood_loft_stairs"));
    	    	woodProperties
    	    	.addType(BlockType.ROOFS)
    	    	.addType(BlockType.FENCES)
    	    	.addType(BlockType.FURNITURES)
    	    	.addType(BlockType.BRIDGES)
    	    	.addType(BlockType.WINDOWS)
    	    	.addType(BlockType.DOORS)
    	    	.addType(BlockType.TRAPDOORS)
    	    	.addType(BlockType.PATHS)
    	    	.addType(BlockType.STAIRS);
    	return woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS);
    }

    private void addTotab(BuildCreativeModeTabContentsEvent event)
    {
    	if(MCWBOP_TAB != null)
    	{
        	Bridges.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Roofs.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Fences.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Fences.addToTabHedge(event, MODID, LEAVES, MCWBOP_TAB.get());
        	Furnitures.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Trapdoors.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Paths.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Doors.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Windows.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
        	Stairs.addToTab(event, MODID, WOOD, MCWBOP_TAB.get());
    	}
    }
}