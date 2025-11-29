package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Mod(McwTerraformersMC.MODID)
public class McwTerraformersMC extends McwMod
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

        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        LOGGER.info("Macaw's TerraformersMC Is Charged !");
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOODS_TRAVERSE);
            McwLootTables.addBlockHedges(MODID, LEAVES_TRAVERSE);
            McwLootTables.addBlockAllWood(MODID, WOODS_CINDERSCAPES);
            McwLootTables.addBlockAllStone(MODID, ROCKS_CINDERSCAPES);
            McwLootTables.addBlockAllWood(MODID, WOODS_TERRESTRIA);
            McwLootTables.addBlockHedges(MODID, LEAVES_TERRESTRIA);
            McwLootTables.addBlockAllStone(MODID, ROCKS_TERRESTRIA);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTags(MODID, WOODS_TRAVERSE, LEAVES_TRAVERSE);
                    addAllMcwTags(MODID, WOODS_CINDERSCAPES, ROCKS_CINDERSCAPES, new ArrayList<>());
                    addAllMcwTags(MODID, WOODS_TERRESTRIA, ROCKS_TERRESTRIA, LEAVES_TERRESTRIA);
                }
            };
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTags(MODID, WOODS_TRAVERSE, LEAVES_TRAVERSE);
                    addAllMcwTags(MODID, WOODS_CINDERSCAPES, ROCKS_CINDERSCAPES, new ArrayList<>());
                    addAllMcwTags(MODID, WOODS_TERRESTRIA, ROCKS_TERRESTRIA, LEAVES_TERRESTRIA);
                }
            });
            //generator.addProvider(new Recipes(generator));
        }
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


    @Override
    public void clientSetup(FMLClientSetupEvent event)
    {
        APIRenderTypes.initAllWood(event, MODID, WOODS_TRAVERSE, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES_TRAVERSE);

        APIRenderTypes.initAllWood(event, MODID, WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
        APIRenderTypes.initAllStone(event, MODID, ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());

        APIRenderTypes.initAllWood(event, MODID, WOODS_TERRESTRIA, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES_TERRESTRIA);
        APIRenderTypes.initAllStone(event, MODID, ROCKS_TERRESTRIA, Registration.getAllModTypeStone());
    }
}