package fr.samlegamer.mcwaurora;

import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
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
import org.jetbrains.annotations.NotNull;

@Mod(McwAurora.MODID)
public class McwAurora
{
	public static final String MODID = "mcwaurora";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final List<String> WOOD_ENHANCED_MUSH = Arrays.asList("brown_mushroom", "red_mushroom"); // enhanced_mushrooms

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    
    public static final CreativeModeTab MCWAURORA_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public @NotNull ItemStack makeIcon() {
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
	};
    
    public McwAurora()
    {
    	LOGGER.info("Macaw's Aurora Mod Loading...");
    	Registration.init(block, item);
    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.5F).sound(SoundType.WOOD);

    	Bridges.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms", wood);
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms");
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms", wood);
		Paths.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms");
		Trapdoors.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms");
		Doors.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms");
		Windows.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWAURORA_TAB, "enhanced_mushrooms");

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }
    
    private void client(FMLClientSetupEvent e)
    {
    	Bridges.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
    	Roofs.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
    	Fences.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
    	Furnitures.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
    	Stairs.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
		Paths.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
		Trapdoors.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
		Doors.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
		Windows.clientWood(e, MODID, WOOD_ENHANCED_MUSH);
    }
    
	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("enhanced_mushrooms"))
		{
			int i = rand.nextInt(2);
			return i == 0 ? "brown_mushroom" : "red_mushroom";
		}
		return "brown_mushroom";
	}
}