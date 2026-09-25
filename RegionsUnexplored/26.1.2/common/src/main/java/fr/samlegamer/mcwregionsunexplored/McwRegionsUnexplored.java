package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.util.IModList;
import net.minecraft.world.item.ItemStack;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.IconRandom;

public class McwRegionsUnexplored
{
    public static final String MODID = "mcwregionsunexplored";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> WOOD = List.of("baobab", "blackwood", "blue_bioshroom", "brimwood",
    "cobalt", "cypress", "dead", "eucalyptus", "green_bioshroom", "joshua", "kapok", "larch", "magnolia",
    "maple", "palm", "pine", "pink_bioshroom", "redwood", "socotra", "willow", "wisteria", "yellow_bioshroom");
    public static final List<String> LEAVES = List.of("alpha_oak", "ashen", "baobab", "bamboo", "blackwood",
    "blue_magnolia", "brimwood", "cypress", "dead", "dead_pine", "eucalyptus", "golden_larch", "kapok", "larch",
    "lavender_wisteria", "magnolia", "maple", "orange_maple", "palm", "pine", "pink_magnolia", "red_maple",
    "redwood", "salmon_wisteria", "silver_birch", "sky_wisteria", "socotra", "white_magnolia", "willow");

    public static void startLog()
    {
        LOGGER.info("Macaw's Regions Unexplored Loading...");
    }

    public static void finishLog()
    {
        LOGGER.info("Macaw's Regions Unexplored Is Charged !");
    }

    public static ItemStack makeIcon(IModList modList) {
        return IconRandom.buildIcon(
                modList,
                Finder.findBlock(MODID, "palm_roof"),
                Finder.findBlock(MODID, "willow_picket_fence"),
                Finder.findBlock(MODID, "redwood_wardrobe"),
                Finder.findBlock(MODID, "magnolia_log_bridge_middle"),
                Finder.findBlock(MODID, "eucalyptus_window"),
                Finder.findBlock(MODID, "larch_japanese_door"),
                Finder.findBlock(MODID, "maple_glass_trapdoor"),
                Finder.findBlock(MODID, "baobab_planks_path"),
                Finder.findBlock(MODID, "pine_loft_stairs"),
                ModType.getAllModTypeWood());
    }
}