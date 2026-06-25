package fr.samlegamer.mcwmysticbiomes;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;

@Mod(McwMysticBiomes.MODID)
public class McwMysticBiomes extends McwMod
{
    public static final String MODID = "mcwmysticbiomes";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> WOOD = List.of("cherry", "jacaranda", "strawberry", "peach", "maple", "sea_foam", "tropical");
    public static final List<String> LEAVES = List.of("jacaranda_blossoms", "jacaranda", "pink_cherry_blossoms", "white_cherry_blossoms",
            "strawberry_blossoms", "budding_peony", "peony", "peach", "maple", "orange_maple", "yellow_maple", "sea_shrub", "tropical", "hydrangea");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public static final CreativeModeTab MCWMYSTICBIOMES_TAB = new CreativeModeTab(MODID + ".tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(
                    Finder.findBlock(MODID, "peach_roof"),
                    Finder.findBlock(MODID, "strawberry_blossom_hedge"),
                    Finder.findBlock(MODID, "sea_foam_wardrobe"),
                    Finder.findBlock(MODID, "cherry_log_bridge_middle"),
                    Finder.findBlock(MODID, "lavender_window"),
                    Finder.findBlock(MODID, "maple_japanese_door"),
                    Finder.findBlock(MODID, "cherry_glass_trapdoor"),
                    Finder.findBlock(MODID, "tropical_planks_path"),
                    Finder.findBlock(MODID, "strawberry_loft_stairs")
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
    };

    public McwMysticBiomes()
    {
        LOGGER.info("Macaw's Mystic's Biomes Loading...");
        Registration.init(block, item);
        McwRegistry.setRegistriesWood(WOOD, block, item, MCWMYSTICBIOMES_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(getLeaves(), block, item, MCWMYSTICBIOMES_TAB);
        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        LOGGER.info("Macaw's Mystic's Biomes Is Charged !");
    }

    private static Map<String, SoundType> getLeaves()
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

    @Override
    public void clientSetup(FMLClientSetupEvent fmlClientSetupEvent) {
        APIRenderTypes.initAllWood(fmlClientSetupEvent, MODID, WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(fmlClientSetupEvent, MODID, LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if (gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            };
            generator.addProvider(true, new Recipes(generator));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }
}