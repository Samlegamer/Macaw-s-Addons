package fr.samlegamer.mcwregionsunexplored;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.fuel.APIFuels;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class McwRegionsUnexplored implements ModInitializer {
    public static final String MODID = "mcwregionsunexplored";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> WOOD = List.of("baobab", "blackwood", "cherry", "cypress", "dead", "eucalyptus", "joshua",
            "larch", "maple", "mauve", "palm", "pine", "redwood", "sculkwood", "willow");
    public static final List<String> LEAVES = List.of("baobab", "blackwood", "cherry", "cypress", "dead", "eucalyptus",
            "larch", "maple", "mauve", "palm", "pine", "redwood", "sculkwood", "willow", "alpha_oak", "pink_cherry", "red_cherry", "white_cherry",
            "red_maple", "orange_maple", "golden_larch", "dead_pine", "silver_birch");

    public static final ItemGroup MCWREGIONUNEXPLORED_TAB = FabricItemGroup.builder(new Identifier(MODID, "tab")).displayName(Text.translatable(MODID+".tab")).icon(McwRegionsUnexplored::makeIcon).build();

    @Override
    public void onInitialize() {
        LOGGER.info("Macaw's Regions Unexplored Loading...");
        McwRegistry.setRegistriesWood(MODID, WOOD, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(MODID, LEAVES);

        APICreativeTab.initAllWood(MODID, WOOD, MCWREGIONUNEXPLORED_TAB, ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(MODID, LEAVES, MCWREGIONUNEXPLORED_TAB);

        APIFuels.initAllWood(MODID, WOOD, ModType.getAllModTypeWood());
        APIFuels.initAllLeave(MODID, LEAVES);
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