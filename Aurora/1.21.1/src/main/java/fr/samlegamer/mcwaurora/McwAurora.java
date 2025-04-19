package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.furnitures.AddFurnituresStorage;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import java.util.List;
import java.util.Random;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;

@Mod(McwAurora.MODID)
public class McwAurora
{
	public static final String MODID = "mcwaurora";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final List<String> WOOD_ENHANCED_MUSH = List.of("mushroom"); // enhanced_mushrooms
	public static final List<String> WOOD_NOMANSLAND = List.of("maple", "pine", "walnut", "willow"); // nomansland
	public static final List<String> LEAVE_NOMANSLAND = List.of("maple", "pine", "walnut", "willow", "autumnal_oak", "frosted", "pale_cherry", "yellow_birch", "red_maple"); // nomansland

    private static final DeferredRegister.Blocks block = Registration.blocks(MODID);
    private static final DeferredRegister.Items item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWAURORA_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwAurora::getIcon).title(Component.translatable(MODID+".tab")).build());
    
    public McwAurora(IEventBus modBus)
    {
    	LOGGER.info("Macaw's Aurora Mod Loading...");
    	Registration.init(modBus, block, item, ct);

    	Bridges.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
    	Roofs.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
    	Fences.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Furnitures.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
    	Stairs.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Paths.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Trapdoors.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Doors.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Windows.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);

		Bridges.setRegistrationWood(WOOD_NOMANSLAND, block, item);
		Roofs.setRegistrationWood(WOOD_NOMANSLAND, block, item);
		Fences.setRegistrationWood(WOOD_NOMANSLAND, block, item);

		final List<String> leaveClassic = List.of("maple", "pine", "walnut", "willow", "autumnal_oak", "frosted", "yellow_birch", "red_maple"); // nomansland
		final List<String> leaveCherry = List.of("pale_cherry"); // nomansland

		Fences.setRegistrationHedges(leaveClassic, block, item);
		Fences.setRegistrationHedgesModLoaded(leaveCherry, block, item, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES));

		Furnitures.setRegistrationWood(WOOD_NOMANSLAND, block, item);
		Stairs.setRegistrationWood(WOOD_NOMANSLAND, block, item);
		Paths.setRegistrationWood(WOOD_NOMANSLAND, block, item);
		Trapdoors.setRegistrationWood(WOOD_NOMANSLAND, block, item);
		Doors.setRegistrationWood(WOOD_NOMANSLAND, block, item);
		Windows.setRegistrationWood(WOOD_NOMANSLAND, block, item);

		modBus.addListener(this::addToFurnitureStorage);
		modBus.addListener(this::addToTab);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }

	public void addToFurnitureStorage(BlockEntityTypeAddBlocksEvent event)
	{
		AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD_ENHANCED_MUSH);
		AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD_NOMANSLAND);
	}
    
    private void addToTab(BuildCreativeModeTabContentsEvent event) {
		if (ModList.get().isLoaded("enhanced_mushrooms")) {
			Bridges.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			Roofs.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			Fences.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			Furnitures.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			Stairs.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			Paths.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			Trapdoors.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			Doors.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			Windows.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
		}

		if (ModList.get().isLoaded("nomansland")) {
			Bridges.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
			Roofs.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
			Fences.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
			Fences.addToTabHedge(event, MODID, LEAVE_NOMANSLAND, MCWAURORA_TAB.get());
			Furnitures.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
			Stairs.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
			Paths.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
			Trapdoors.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
			Doors.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
			Windows.addToTab(event, MODID, WOOD_NOMANSLAND, MCWAURORA_TAB.get());
		}
	}
    
    private static ItemStack getIcon()
    {
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, randomNaming()+"_roof"),
				Finder.findBlock(MODID, randomNaming()+"_picket_fence"),
				Finder.findBlock(MODID, randomNaming()+"_wardrobe"),
				Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
				Finder.findBlock(MODID, randomNaming()+"_pane_window"),
				Finder.findBlock(MODID, randomNaming()+"_modern_door"),
				Finder.findBlock(MODID, randomNaming()+"_mystic_trapdoor"),
				Finder.findBlock(MODID, randomNaming()+"_planks_path"),
				Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));

		prop.addType(BlockType.BRIDGES)
				.addType(BlockType.ROOFS)
				.addType(BlockType.FENCES)
				.addType(BlockType.FURNITURES)
				.addType(BlockType.STAIRS)
				.addType(BlockType.PATHS)
				.addType(BlockType.WINDOWS)
				.addType(BlockType.DOORS)
				.addType(BlockType.TRAPDOORS);
		Block icon = prop.buildIcon(BlockType.BRIDGES, BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.STAIRS,
				BlockType.PATHS, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS);
    	return new ItemStack(icon);
    }

	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("nomansland") && ModList.get().isLoaded("enhanced_mushrooms"))
		{
			int i = rand.nextInt(2);

			switch(i)
			{
				case 0:
					return "walnut";
				case 1:
					return "mushroom";
				default:
					return "mushroom";
			}
		}
		else
		{
			if(ModList.get().isLoaded("enhanced_mushrooms"))
			{
				return "mushroom";
			}

			if(ModList.get().isLoaded("nomansland"))
			{
				return "walnut";
			}
		}
		return "mushroom";
	}
}