package fr.samlegamer.mcwmysticbiomes;

import fr.addonslib.api.data.ModType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.IconRandomForge;

public class McwMysticBiomes
{
    public static final String MODID = "mcwmysticbiomes";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> WOOD = List.of("cherry", "jacaranda", "strawberry", "peach", "maple", "sea_foam", "tropical");
    public static final List<String> LEAVES = List.of("jacaranda_blossoms", "jacaranda", "pink_cherry_blossoms", "white_cherry_blossoms",
            "strawberry_blossoms", "budding_peony", "peony", "peach", "maple", "orange_maple", "yellow_maple", "sea_shrub", "tropical", "hydrangea");

    public static void startLog()
    {
        LOGGER.info("Macaw's Mystic's Biomes Loading...");
    }

    public static void chargedLog()
    {
        LOGGER.info("Macaw's Mystic's Biomes Is Charged !");
    }

    public static Map<String, SoundType> getLeavesSpecialSound()
    {
        Map<String, SoundType> map = new HashMap<>();
        map.put("jacaranda_blossoms", SoundType.AZALEA_LEAVES);
        map.put("jacaranda", SoundType.AZALEA_LEAVES);
        map.put("pink_cherry_blossoms", SoundType.AZALEA_LEAVES);
        map.put("white_cherry_blossoms", SoundType.AZALEA_LEAVES);
        map.put("strawberry_blossoms", SoundType.AZALEA);
        map.put("budding_peony", SoundType.AZALEA_LEAVES);
        map.put("peony", SoundType.AZALEA_LEAVES);
        return map;
    }

    public static List<String> getLeavesVanillaSound()
    {
        List<String> list = new ArrayList<>();
        list.add("peach");
        list.add("maple");
        list.add("orange_maple");
        list.add("yellow_maple");
        list.add("sea_shrub");
        list.add("tropical");
        list.add("hydrangea");
        return list;
    }

    public static ItemStack icon() {
        return IconRandomForge.buildIcon(
                Finder.findBlock(MODID, "peach_roof"),
                Finder.findBlock(MODID, "strawberry_blossom_hedge"),
                Finder.findBlock(MODID, "sea_foam_wardrobe"),
                Finder.findBlock(MODID, "cherry_log_bridge_middle"),
                Finder.findBlock(MODID, "lavender_window"),
                Finder.findBlock(MODID, "maple_japanese_door"),
                Finder.findBlock(MODID, "cherry_glass_trapdoor"),
                Finder.findBlock(MODID, "tropical_planks_path"),
                Finder.findBlock(MODID, "strawberry_loft_stairs"),
                ModType.getAllModTypeWood());
    }
}