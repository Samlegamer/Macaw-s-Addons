package fr.samlegamer.mcwterraformersmc;

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
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Mod(McwTerraformersMC.MODID)
public class McwTerraformersMC
{
    public static final String MODID = "mcwterraformersmc";
    private static final Logger LOGGER = LogManager.getLogger();

    protected static final List<String> WOODS_TRAVERSE = Arrays.asList("fir");
    protected static final List<String> WOODS_CINDERSCAPES = Arrays.asList("scorched", "umbral");
    protected static final List<String> WOODS_TERRESTRIA = Arrays.asList("redwood", "hemlock", "rubber", "cypress", "willow",
            "japanese_maple", "rainbow_eucalyptus", "sakura", "yucca_palm");

    protected static final List<String> ROCKS_CINDERSCAPES = Arrays.asList("sulfur_quartz_bricks", "rose_quartz_bricks", "smoky_quartz_bricks");
    protected static final List<String> ROCKS_TERRESTRIA = Arrays.asList("basalt_bricks", "mossy_basalt_bricks");

    protected static final List<String> LEAVES_TRAVERSE = Arrays.asList("fir", "red_autumnal", "brown_autumnal", "orange_autumnal", "yellow_autumnal");
    protected static final List<String> LEAVES_TERRESTRIA = Arrays.asList("redwood", "hemlock", "rubber", "cypress", "willow", "japanese_maple",
            "rainbow_eucalyptus", "sakura", "yucca_palm", "japanese_maple_shrub", "dark_japanese_maple", "jungle_palm");

    private static final DeferredRegister<Block> BLOCKS = Registration.blocks(MODID);
    private static final DeferredRegister<Item> ITEMS = Registration.items(MODID);

    public static final ItemGroup MCWTERRAFORMERSMC_TAB = new ItemGroup(MODID + ".tab") {
        @Override
        @Nonnull
        public ItemStack makeIcon() {
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
            Block icon = propIcon.buildIcon(NewIconRandom.BlockType.BRIDGES, NewIconRandom.BlockType.ROOFS, NewIconRandom.BlockType.FENCES,
                    NewIconRandom.BlockType.FURNITURES, NewIconRandom.BlockType.STAIRS, NewIconRandom.BlockType.PATHS, NewIconRandom.BlockType.DOORS,
                    NewIconRandom.BlockType.WINDOWS, NewIconRandom.BlockType.TRAPDOORS);
            return new ItemStack(icon);
        }
    };

    public McwTerraformersMC()
    {
        LOGGER.info("Macaw's TerraformersMC Loading...");
        Registration.init(BLOCKS, ITEMS);
        final AbstractBlock.Properties wood = AbstractBlock.Properties.copy(Blocks.OAK_PLANKS);
        final AbstractBlock.Properties stone = AbstractBlock.Properties.copy(Blocks.COBBLESTONE);
        final AbstractBlock.Properties leave = AbstractBlock.Properties.copy(Blocks.OAK_LEAVES);

        Bridges.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Bridges.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Bridges.setRegistrationRockModLoaded(ROCKS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Bridges.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Bridges.setRegistrationRockModLoaded(ROCKS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Roofs.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Roofs.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Roofs.setRegistrationRockModLoaded(ROCKS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Roofs.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Roofs.setRegistrationRockModLoaded(ROCKS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Fences.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Fences.setRegistrationHedgesModLoaded(LEAVES_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", leave);
        Fences.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Fences.setRegistrationRockModLoaded(ROCKS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", stone);
        Fences.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", wood);
        Fences.setRegistrationHedgesModLoaded(LEAVES_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", leave);
        Fences.setRegistrationRockModLoaded(ROCKS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", stone);

        Furnitures.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Furnitures.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Furnitures.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        Stairs.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse", wood);
        Stairs.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes", wood);
        Stairs.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria", wood);

        Paths.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Paths.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Paths.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        Doors.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Doors.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Doors.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        Trapdoors.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Trapdoors.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Trapdoors.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        Windows.setRegistrationWoodModLoaded(WOODS_TRAVERSE, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "traverse");
        Windows.setRegistrationWoodModLoaded(WOODS_CINDERSCAPES, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "cinderscapes");
        Windows.setRegistrationWoodModLoaded(WOODS_TERRESTRIA, BLOCKS, ITEMS, MCWTERRAFORMERSMC_TAB, "terrestria");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        LOGGER.info("Macaw's TerraformersMC Is Charged !");
    }

    private static String randomNaming()
    {
        Random rand = new Random();

        if(ModList.get().isLoaded("traverse") && ModList.get().isLoaded("cinderscapes") && ModList.get().isLoaded("terrestria"))
        {
            int i = rand.nextInt(3);

            switch(i)
            {
                case 0:
                    return "umbral";
                case 1:
                    return "fir";
                case 2:
                    return "japanese_maple";
                default:
                    return "redwood";
            }
        }
        else
        {
            if(ModList.get().isLoaded("cinderscapes"))
            {
                return "umbral";
            }

            if(ModList.get().isLoaded("traverse"))
            {
                return "fir";
            }

            if(ModList.get().isLoaded("terrestria"))
            {
                return "japanese_maple";
            }
        }
        return "fir";
    }


    private void client(FMLClientSetupEvent event)
    {
        Bridges.clientWood(event, MODID, WOODS_TRAVERSE);
        Bridges.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Bridges.clientStone(event, MODID, ROCKS_CINDERSCAPES);
        Bridges.clientWood(event, MODID, WOODS_TERRESTRIA);
        Bridges.clientStone(event, MODID, ROCKS_TERRESTRIA);

        Roofs.clientWood(event, MODID, WOODS_TRAVERSE);
        Roofs.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Roofs.clientStone(event, MODID, ROCKS_CINDERSCAPES);
        Roofs.clientWood(event, MODID, WOODS_TERRESTRIA);
        Roofs.clientStone(event, MODID, ROCKS_TERRESTRIA);

        Fences.clientWood(event, MODID, WOODS_TRAVERSE);
        Fences.clientHedge(event, MODID, LEAVES_TRAVERSE);
        Fences.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Fences.clientStone(event, MODID, ROCKS_CINDERSCAPES);
        Fences.clientWood(event, MODID, WOODS_TERRESTRIA);
        Fences.clientHedge(event, MODID, LEAVES_TERRESTRIA);
        Fences.clientStone(event, MODID, ROCKS_TERRESTRIA);

        Furnitures.clientWood(event, MODID, WOODS_TRAVERSE);
        Furnitures.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Furnitures.clientWood(event, MODID, WOODS_TERRESTRIA);

        Stairs.clientWood(event, MODID, WOODS_TRAVERSE);
        Stairs.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Stairs.clientWood(event, MODID, WOODS_TERRESTRIA);

        Paths.clientWood(event, MODID, WOODS_TRAVERSE);
        Paths.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Paths.clientWood(event, MODID, WOODS_TERRESTRIA);

        Doors.clientWood(event, MODID, WOODS_TRAVERSE);
        Doors.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Doors.clientWood(event, MODID, WOODS_TERRESTRIA);

        Trapdoors.clientWood(event, MODID, WOODS_TRAVERSE);
        Trapdoors.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Trapdoors.clientWood(event, MODID, WOODS_TERRESTRIA);

        Windows.clientWood(event, MODID, WOODS_TRAVERSE);
        Windows.clientWood(event, MODID, WOODS_CINDERSCAPES);
        Windows.clientWood(event, MODID, WOODS_TERRESTRIA);
    }
}