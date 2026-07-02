package fr.samlegamer.mcwmysticbiomes;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.util.IModList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.IconRandom;

public class McwMysticBiomes
{
    public static final String MODID = "mcwmysticbiomes";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> WOOD = List.of("black_cherry", "lavender", "maple", "peach", "sea_foam", "strawberry", "tropical", "vanilla");

    public static final List<String> LEAVES = List.of("strawberry_blossoms", "pink_cherry_blossoms", "white_cherry_blossoms", "lavender_blossoms",
            "peach", "maple", "orange_maple", "yellow_maple", "sea_shrub", "tropical", "vanilla", "peony", "hydrangea");

    public static void startLog()
    {
        LOGGER.info("Macaw's Mystic's Biomes Loading...");
    }

    public static void chargedLog()
    {
        LOGGER.info("Macaw's Mystic's Biomes Is Charged !");
    }

    public static Map<String, SoundType> getWoodSpecialSound()
    {
        Map<String, SoundType> map = new HashMap<>();
        map.put("black_cherry", SoundType.CHERRY_WOOD);
        return map;
    }

    public static List<String> getWoodVanillaSound()
    {
        return List.of("lavender", "maple", "peach", "sea_foam", "strawberry", "tropical", "vanilla");
    }

    public static Map<String, SoundType> getLeavesSpecialSound()
    {
        Map<String, SoundType> map = new HashMap<>();
        map.put("strawberry_blossoms", SoundType.AZALEA_LEAVES);
        map.put("pink_cherry_blossoms", SoundType.AZALEA_LEAVES);
        map.put("white_cherry_blossoms", SoundType.AZALEA_LEAVES);
        map.put("lavender_blossoms", SoundType.AZALEA_LEAVES);
        map.put("peach", SoundType.AZALEA_LEAVES);
        map.put("maple", SoundType.AZALEA_LEAVES);
        map.put("orange_maple", SoundType.AZALEA_LEAVES);
        map.put("yellow_maple", SoundType.AZALEA_LEAVES);
        map.put("peony", SoundType.AZALEA_LEAVES);
        map.put("hydrangea", SoundType.AZALEA_LEAVES);
        return map;
    }

    public static List<String> getLeavesVanillaSound()
    {
        return List.of("sea_shrub", "tropical", "vanilla");
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