package fr.samlegamer.mcwmysticbiomes;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.util.McwMod;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;

@Mod(McwMysticBiomes.MODID)
public class McwMysticBiomes extends McwMod
{
    public static final String MODID = "mcwmysticbiomes";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> WOOD = Arrays.asList("cherry", "lavender", "strawberry");
    public static final List<String> LEAVES = Arrays.asList("lavender_blossom", "peony", "pink_cherry_blossom", "strawberry_blossom", "sweet_blossom", "white_cherry_blossom");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public static final ItemGroup MCWMYSTICBIOMES_TAB = new ItemGroup(MODID + ".tab") {
        @Override
        @MethodsReturnNonnullByDefault
        public ItemStack makeIcon() {
            NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(
                    Finder.findBlock(MODID, "cherry_roof"),
                    Finder.findBlock(MODID, "strawberry_blossom_hedge"),
                    Finder.findBlock(MODID, "strawberry_wardrobe"),
                    Finder.findBlock(MODID, "cherry_log_bridge_middle"),
                    Finder.findBlock(MODID, "lavender_window"),
                    Finder.findBlock(MODID, "strawberry_japanese_door"),
                    Finder.findBlock(MODID, "cherry_glass_trapdoor"),
                    Finder.findBlock(MODID, "lavender_planks_path"),
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
        McwRegistry.setRegistriesWood(WOOD, block, item, MCWMYSTICBIOMES_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES, block, item, MCWMYSTICBIOMES_TAB);
        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        LOGGER.info("Macaw's Mystic's Biomes Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent fmlClientSetupEvent) {
        APIRenderTypes.initAllWood(fmlClientSetupEvent, MODID, WOOD, Registration.getAllModTypeWood());
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
                    addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            };
            generator.addProvider(new Recipes(generator));
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }
}