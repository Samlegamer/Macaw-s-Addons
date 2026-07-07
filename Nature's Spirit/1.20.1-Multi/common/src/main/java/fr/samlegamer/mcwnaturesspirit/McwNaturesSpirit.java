package fr.samlegamer.mcwnaturesspirit;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.IconRandom;
import fr.samlegamer.addonslib.util.IModList;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Random;

public class McwNaturesSpirit {
    public static final String MODID = "mcwnaturesspirit";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> WOOD = List.of("aspen", "cedar", "coconut", "cypress", "fir", "ghaf", "joshua", "larch", "mahogany",
            "maple", "olive", "palo_verde", "redwood", "saxaul", "sugi", "willow", "wisteria");

    public static final List<String> LEAVES = List.of("aspen", "cedar", "coconut", "cypress", "fir", "ghaf", "joshua", "larch", "mahogany",
            "olive", "palo_verde", "redwood", "saxaul", "sugi", "willow", "wisteria", "blue_wisteria", "frosty_fir", "orange_maple", "pink_wisteria",
            "purple_wisteria", "red_maple", "white_wisteria", "yellow_maple");

    public static void startLog()
    {
        LOGGER.info("Macaw's Nature's Spirit Loading...");
    }

    public static void chargedLog()
    {
        LOGGER.info("Macaw's Nature's Spirit Is Charged !");
    }

    public static ItemStack icon(IModList iModList) {
        String wood = getRandomInList(WOOD);
        String leaves = getRandomInList(LEAVES);

        return IconRandom.buildIcon(
                iModList,
                Finder.findBlock(MODID, wood+"_roof"),
                Finder.findBlock(MODID, leaves+"_hedge"),
                Finder.findBlock(MODID, wood+"_wardrobe"),
                Finder.findBlock(MODID, wood+"_log_bridge_middle"),
                Finder.findBlock(MODID, wood+"_window"),
                Finder.findBlock(MODID, wood+"_japanese_door"),
                Finder.findBlock(MODID, wood+"_glass_trapdoor"),
                Finder.findBlock(MODID, wood+"_planks_path"),
                Finder.findBlock(MODID, wood+"_loft_stairs"),
                ModType.getAllModTypeWood());
    }

    public static String getRandomInList(List<String> list)
    {
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}