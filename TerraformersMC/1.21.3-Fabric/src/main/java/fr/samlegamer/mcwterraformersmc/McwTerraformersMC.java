package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.AddFurnituresStorage;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.Random;

public class McwTerraformersMC implements ModInitializer
{
    public static final String MODID = "mcwterraformersmc";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> WOODS_TRAVERSE = List.of("fir");
    public static final List<String> WOODS_CINDERSCAPES = List.of("scorched", "umbral");
    public static final List<String> WOODS_TERRESTRIA = List.of("redwood", "hemlock", "rubber", "cypress", "willow",
            "japanese_maple", "rainbow_eucalyptus", "sakura", "yucca_palm");

    public static final List<String> ROCKS_CINDERSCAPES = List.of("sulfur_quartz_bricks", "rose_quartz_bricks", "smoky_quartz_bricks");
    public static final List<String> ROCKS_TERRESTRIA = List.of("basalt_bricks", "mossy_basalt_bricks");

    public static final List<String> LEAVES_TRAVERSE = List.of("fir", "red_autumnal", "brown_autumnal", "orange_autumnal", "yellow_autumnal");
    public static final List<String> LEAVES_TERRESTRIA = List.of("redwood", "hemlock", "rubber", "cypress", "willow", "japanese_maple",
            "rainbow_eucalyptus", "sakura", "yucca_palm", "japanese_maple_shrub", "dark_japanese_maple", "jungle_palm");

    public static final ItemGroup MCWTERRAFORMERSMC_TAB = FabricItemGroup.builder().icon(McwTerraformersMC::icon)
            .displayName(Text.translatable("itemGroup.minecraft.mcwterraformersmc.tab")).build();
    private static final Identifier TAB_ID = Identifier.of(MODID + ".tab");

    public void onInitialize()
    {
        LOGGER.info("Macaw's TerraformersMC Loading...");
        final AbstractBlock.Settings wood = AbstractBlock.Settings.copy(Blocks.OAK_PLANKS);
        final AbstractBlock.Settings woodCrimson = AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS);
        final AbstractBlock.Settings stone = AbstractBlock.Settings.copy(Blocks.COBBLESTONE);
        final AbstractBlock.Settings leave = AbstractBlock.Settings.copy(Blocks.OAK_LEAVES);

        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, wood);
        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, woodCrimson);
        Bridges.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, stone);
        Bridges.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, wood);
        Bridges.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, stone);

        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, wood);
        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, woodCrimson);
        Roofs.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, stone);
        Roofs.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, wood);
        Roofs.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, stone);

        Fences.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, wood);
        Fences.setRegistrationHedgesModLoaded(MODID, LEAVES_TRAVERSE, leave);
        Fences.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, woodCrimson);
        Fences.setRegistrationRockModLoaded(MODID, ROCKS_CINDERSCAPES, stone);
        Fences.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, wood);
        Fences.setRegistrationHedgesModLoaded(MODID, LEAVES_TERRESTRIA, leave);
        Fences.setRegistrationRockModLoaded(MODID, ROCKS_TERRESTRIA, stone);

        Furnitures.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, wood);
        Furnitures.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, woodCrimson);
        Furnitures.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, wood);

        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, wood);
        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, woodCrimson);
        Stairs.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, wood);

        Paths.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, wood);
        Paths.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, woodCrimson);
        Paths.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, wood);

        Doors.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR), AbstractBlock.Settings.copy(Blocks.OAK_DOOR));
        Doors.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR), AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR));
        Doors.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, AbstractBlock.Settings.copy(Blocks.OAK_DOOR), AbstractBlock.Settings.copy(Blocks.OAK_DOOR));

        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR));
        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, AbstractBlock.Settings.copy(Blocks.CRIMSON_TRAPDOOR));
        Trapdoors.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR));

        Windows.setRegistrationWoodModLoaded(MODID, WOODS_TRAVERSE, wood);
        Windows.setRegistrationWoodModLoaded(MODID, WOODS_CINDERSCAPES, woodCrimson);
        Windows.setRegistrationWoodModLoaded(MODID, WOODS_TERRESTRIA, wood);

        AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(MODID, WOODS_TRAVERSE);
        AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(MODID, WOODS_CINDERSCAPES);
        AddFurnituresStorage.addCompatibleBlocksToFurnitureStorage(MODID, WOODS_TERRESTRIA);

        Registry.register(Registries.ITEM_GROUP, TAB_ID, MCWTERRAFORMERSMC_TAB);
        RegistryKey<ItemGroup> group_key = RegistryKey.of(RegistryKeys.ITEM_GROUP, TAB_ID);

        Bridges.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Bridges.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Bridges.addToTabStoneModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, group_key, "cinderscapes");
        Bridges.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");
        Bridges.addToTabStoneModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, group_key, "terrestria");

        Roofs.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Roofs.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Roofs.addToTabStoneModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, group_key, "cinderscapes");
        Roofs.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");
        Roofs.addToTabStoneModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, group_key, "terrestria");

        Fences.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Fences.addToTabLeaveModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE, group_key, "traverse");
        Fences.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Fences.addToTabStoneModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, group_key, "cinderscapes");
        Fences.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");
        Fences.addToTabLeaveModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA, group_key, "terrestria");
        Fences.addToTabStoneModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, group_key, "terrestria");

        Furnitures.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Furnitures.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Furnitures.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");

        Stairs.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Stairs.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Stairs.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");

        Paths.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Paths.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Paths.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");

        Doors.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Doors.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Doors.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");

        Trapdoors.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Trapdoors.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Trapdoors.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");

        Windows.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, group_key, "traverse");
        Windows.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, group_key, "cinderscapes");
        Windows.addToTabWoodModLoaded(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, group_key, "terrestria");



        Bridges.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Bridges.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Bridges.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Roofs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Roofs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Roofs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Fences.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Fences.fuelHedge(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        Fences.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Fences.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        Fences.fuelHedge(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);

        Furnitures.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Furnitures.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Furnitures.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Stairs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Stairs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Stairs.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Paths.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Paths.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Paths.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Doors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Doors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Doors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Trapdoors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Trapdoors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Trapdoors.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Windows.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Windows.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Windows.fuelWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        LOGGER.info("Macaw's TerraformersMC Is Charged !");
    }

    private static ItemStack icon()
    {
        NewIconRandom.NewProperties propIcon = new NewIconRandom.NewProperties(
                Finder.findBlock(MODID, randomNaming()+"_planks_roof"),
                Finder.findBlock(MODID, randomNaming()+"_pyramid_gate"),
                Finder.findBlock(MODID, randomNaming()+"_bookshelf_drawer"),
                Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
                Finder.findBlock(MODID, randomNaming()+"_four_window"),
                Finder.findBlock(MODID, randomNaming()+"_barn_glass_door"),
                Finder.findBlock(MODID, randomNaming()+"_blossom_trapdoor"),
                Finder.findBlock(MODID, randomNaming()+"_planks_path"),
                Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));

        propIcon.addType(NewIconRandom.BlockType.BRIDGES)
                .addType(NewIconRandom.BlockType.ROOFS)
                .addType(NewIconRandom.BlockType.FENCES)
                .addType(NewIconRandom.BlockType.FURNITURES)
                .addType(NewIconRandom.BlockType.STAIRS)
                .addType(NewIconRandom.BlockType.PATHS)
                .addType(NewIconRandom.BlockType.DOORS)
                .addType(NewIconRandom.BlockType.WINDOWS)
                .addType(NewIconRandom.BlockType.TRAPDOORS);
        return new ItemStack(propIcon.buildIcon(NewIconRandom.BlockType.BRIDGES, NewIconRandom.BlockType.ROOFS, NewIconRandom.BlockType.FENCES,
                NewIconRandom.BlockType.FURNITURES, NewIconRandom.BlockType.STAIRS, NewIconRandom.BlockType.PATHS, NewIconRandom.BlockType.DOORS,
                NewIconRandom.BlockType.WINDOWS, NewIconRandom.BlockType.TRAPDOORS));
    }

    private static String randomNaming()
    {
        Random rand = new Random();

        if(FabricLoader.getInstance().isModLoaded("traverse") && FabricLoader.getInstance().isModLoaded("cinderscapes") && FabricLoader.getInstance().isModLoaded("terrestria"))
        {
            int i = rand.nextInt(3);

            return switch (i) {
                case 0 -> "umbral";
                case 1 -> "fir";
                case 2 -> "japanese_maple";
                default -> "redwood";
            };
        }
        else
        {
            if(FabricLoader.getInstance().isModLoaded("cinderscapes"))
            {
                return "umbral";
            }

            if(FabricLoader.getInstance().isModLoaded("traverse"))
            {
                return "fir";
            }

            if(FabricLoader.getInstance().isModLoaded("terrestria"))
            {
                return "japanese_maple";
            }
        }
        return "fir";
    }
}