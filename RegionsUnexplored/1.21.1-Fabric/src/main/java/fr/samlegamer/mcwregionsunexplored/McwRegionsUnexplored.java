package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.util.McwCommon;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class McwRegionsUnexplored implements ModInitializer {
    public static final String MODID = "mcwregionsunexplored";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> WOOD = List.of("baobab", "blackwood", "cypress", "dead", "eucalyptus", "joshua",
            "larch", "maple", "mauve", "palm", "pine", "redwood", "willow", "brimwood", "cobalt", "kapok", "magnolia", "socotra",
            "blue_bioshroom", "green_bioshroom", "pink_bioshroom", "yellow_bioshroom");
    public static final List<String> LEAVES = List.of("baobab", "blackwood", "cypress", "dead", "eucalyptus",
            "larch", "maple", "mauve", "palm", "pine", "redwood", "willow", "alpha_oak", "red_maple", "orange_maple", "golden_larch",
            "dead_pine", "silver_birch", "bamboo", "socotra", "kapok", "enchanted_birch", "blue_magnolia", "magnolia", "pink_magnolia",
            "white_magnolia", "brimwood");

    public static final ItemGroup MCWREGIONUNEXPLORED_TAB = APICreativeTab.initGroup(MODID, McwRegionsUnexplored::makeIcon);

    @Override
    public void onInitialize() {
        LOGGER.info("Macaw's Regions Unexplored Loading...");
        McwRegistry.setRegistriesWood(MODID, WOOD, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(MODID, LEAVES);

        APICreativeTab.registerGroup(MODID, MCWREGIONUNEXPLORED_TAB);
        APICreativeTab.initAllWood(MODID, WOOD, MCWREGIONUNEXPLORED_TAB, Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(MODID, LEAVES, MCWREGIONUNEXPLORED_TAB);

        APIFuels.initAllWood(MODID, WOOD, Registration.getAllModTypeWood());
        APIFuels.initAllLeave(MODID, LEAVES);

        McwCommon.addCompatibleBlocksToFurnitureStorage(MODID, WOOD);
        LOGGER.info("Macaw's Regions Unexplored Is Charged !");
    }

    public static ItemStack makeIcon() {
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
                .addType(ModType.ROOFS)
                .addType(ModType.FENCES)
                .addType(ModType.FURNITURES)
                .addType(ModType.BRIDGES)
                .addType(ModType.WINDOWS)
                .addType(ModType.DOORS)
                .addType(ModType.TRAPDOORS)
                .addType(ModType.PATHS)
                .addType(ModType.STAIRS);
        Block icon = woodProperties.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.BRIDGES, ModType.WINDOWS,
                ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.STAIRS);
        return new ItemStack(icon);
    }
}