package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;
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

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final RegistryObject<CreativeModeTab> MCWAURORA_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwAurora::getIcon).title(Component.translatable(MODID+".tab")).build());
    
    public McwAurora()
    {
    	LOGGER.info("Macaw's Aurora Mod Loading...");
    	Registration.init(block, item, ct);

    	Bridges.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
    	Roofs.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
    	Fences.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Furnitures.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
    	Stairs.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Paths.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Trapdoors.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Doors.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);
		Windows.setRegistrationWood(WOOD_ENHANCED_MUSH, block, item);

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }

	private void clientSetup(FMLClientSetupEvent event)
	{
		APIRenderTypes.initAllWood(event, MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());
	}
    
    private void addTotab(BuildCreativeModeTabContentsEvent event)
    {
    	if(MCWAURORA_TAB != null)
    	{
			APICreativeTab.initAllWood(event, MODID, WOOD_ENHANCED_MUSH, "enhanced_mushrooms", MCWAURORA_TAB.get(), Registration.getAllModTypeWood());
    	}
    }
    
    private static ItemStack getIcon()
    {
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, "mushroom_roof"),
				Finder.findBlock(MODID, "mushroom_picket_fence"),
				Finder.findBlock(MODID, "mushroom_wardrobe"),
				Finder.findBlock(MODID, "mushroom_log_bridge_middle"),
				Finder.findBlock(MODID, "mushroom_pane_window"),
				Finder.findBlock(MODID, "mushroom_modern_door"),
				Finder.findBlock(MODID, "mushroom_mystic_trapdoor"),
				Finder.findBlock(MODID, "mushroom_planks_path"),
				Finder.findBlock(MODID, "mushroom_skyline_stairs"));

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
}