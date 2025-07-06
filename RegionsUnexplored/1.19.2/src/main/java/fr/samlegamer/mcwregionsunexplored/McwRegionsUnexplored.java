package fr.samlegamer.mcwregionsunexplored;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
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
import org.jetbrains.annotations.NotNull;

@Mod(McwRegionsUnexplored.MODID)
public class McwRegionsUnexplored
{
    public static final String MODID = "mcwregionsunexplored";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> WOOD = List.of("baobab", "blackwood", "cherry", "cypress", "dead", "eucalyptus", "joshua",
    "larch", "maple", "mauve", "palm", "pine", "redwood", "sculkwood", "willow");
    public static final List<String> LEAVES = List.of("baobab", "blackwood", "cherry", "cypress", "dead", "eucalyptus",
    "larch", "maple", "mauve", "palm", "pine", "redwood", "sculkwood", "willow", "alpha_oak", "pink_cherry", "red_cherry", "white_cherry",
    "red_maple", "orange_maple", "golden_larch", "dead_pine", "silver_birch");

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public static final CreativeModeTab MCWREGIONUNEXPLORED_TAB = new CreativeModeTab(MODID + ".tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(
                    Finder.findBlock(MODID, "palm_roof"),
                    Finder.findBlock(MODID, "willow_picket_fence"),
                    Finder.findBlock(MODID, "redwood_wardrobe"),
                    Finder.findBlock(MODID, "cherry_log_bridge_middle"),
                    Finder.findBlock(MODID, "eucalyptus_window"),
                    Finder.findBlock(MODID, "larch_japanese_door"),
                    Finder.findBlock(MODID, "maple_glass_trapdoor"),
                    Finder.findBlock(MODID, "baobab_planks_path"),
                    Finder.findBlock(MODID, "pine_loft_stairs")
            );
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
            Block icon = woodProperties.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.BRIDGES, BlockType.WINDOWS,
                    BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS, BlockType.STAIRS);
            return new ItemStack(icon);
        }
    };

    public McwRegionsUnexplored()
    {
        LOGGER.info("Macaw's Regions Unexplored Loading...");
        Registration.init(block, item);
        Bridges.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        Fences.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        Fences.setRegistrationHedges(LEAVES, block, item, MCWREGIONUNEXPLORED_TAB);
        Furnitures.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        Roofs.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        Trapdoors.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        Paths.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        Doors.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        Windows.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        Stairs.setRegistrationWood(WOOD, block, item, MCWREGIONUNEXPLORED_TAB);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        LOGGER.info("Macaw's Regions Unexplored Is Charged !");
    }

    private void client(FMLClientSetupEvent e)
    {
        APIRenderTypes.initAllWood(e, MODID, WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(e, MODID, LEAVES);
    }
}