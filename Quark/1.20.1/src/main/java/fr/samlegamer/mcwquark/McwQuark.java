package fr.samlegamer.mcwquark;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;
import javax.annotation.Nonnull;

@Mod(McwQuark.MODID)
public class McwQuark extends McwMod
{
	public static final String MODID = "mcwquark";
	private static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> stone = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks",
			"red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks", "mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks",
			"andesite_bricks", "calcite_bricks", "dripstone_bricks", "tuff_bricks", "raw_iron_bricks", "raw_gold_bricks", "raw_copper_bricks");
    public static final List<String> leaves = List.of("blue_blossom", "lavender_blossom", "orange_blossom", "red_blossom", "yellow_blossom", "ancient");
    public static final List<String> wood = List.of("blossom", "azalea", "ancient");

	private static final DeferredRegister<Block> BLOCKS = Registration.blocks(MODID);
	private static final DeferredRegister<Item> ITEMS = Registration.items(MODID);
	private static final DeferredRegister<CreativeModeTab> CT = Registration.creativeModeTab(MODID);

	public static final RegistryObject<CreativeModeTab> MCWQUARK_TAB = CT.register("tab", () -> CreativeModeTab.builder()
	.icon(McwQuark::getIcon).title(Component.translatable(MODID + ".tab")).build());

	public McwQuark(FMLJavaModLoadingContext javaModLoadingContext)
    {
        super(javaModLoadingContext);
        List<String> rockClassic = List.of("soul_sandstone_bricks", "limestone_bricks", "jasper_bricks", "shale_bricks", "permafrost_bricks",
				"red_sandstone_bricks", "sandstone_bricks", "cobblestone_bricks", "mossy_cobblestone_bricks", "blackstone_bricks", "diorite_bricks", "granite_bricks",
				"andesite_bricks", "raw_iron_bricks", "raw_gold_bricks", "raw_copper_bricks");

		Map<String, SoundType> rockSounds = new LinkedHashMap<>();
		rockSounds.put("calcite_bricks", SoundType.CALCITE);
		rockSounds.put("dripstone_bricks", SoundType.DRIPSTONE_BLOCK);
		rockSounds.put("tuff_bricks", SoundType.TUFF);
		
		LOGGER.info("Macaw's Quark Loading...");
		Registration.init(javaModLoadingContext, BLOCKS, ITEMS, CT);

		McwRegistry.setRegistriesWood(wood, BLOCKS, ITEMS, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(leaves, BLOCKS, ITEMS);
		McwRegistry.setRegistriesStone(rockClassic, BLOCKS, ITEMS, Registration.getAllModTypeStone());
		McwRegistry.setRegistriesStone(rockSounds, BLOCKS, ITEMS, Registration.getAllModTypeStone());
		
        javaModLoadingContext.getModEventBus().addListener(this::clientSetup);
        javaModLoadingContext.getModEventBus().addListener(this::commonSetup);
        javaModLoadingContext.getModEventBus().addListener(this::dataSetup);
        javaModLoadingContext.getModEventBus().addListener(this::tabSetup);
		LOGGER.info("Macaw's Quark Is Charged !");
	}

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, wood, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, leaves);
        APIRenderTypes.initAllWood(event, MODID, stone, Registration.getAllModTypeStone());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, wood);
            McwLootTables.addBlockHedges(MODID, leaves);
            McwLootTables.addBlockAllStone(MODID, stone);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();

        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, lookupProvider, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
					addAllMcwTagsWood(MODID, wood, Registration.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, leaves);
					addAllMcwTagsStone(MODID, stone, Registration.getAllModTypeStone());
                }
            };

            generator.addProvider(true, new Recipes(output));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, lookupProvider, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
					addAllMcwTagsWood(MODID, wood, Registration.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, leaves);
					addAllMcwTagsStone(MODID, stone, Registration.getAllModTypeStone());
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, wood, MCWQUARK_TAB.get(), Registration.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, leaves, MCWQUARK_TAB.get());
        APICreativeTab.initAllStone(event, MODID, stone, MCWQUARK_TAB.get(), Registration.getAllModTypeStone());
    }

	@Nonnull
	private static ItemStack getIcon()
	{
		NewIconRandom.NewProperties propIcon = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, "limestone_bricks_roof"),
				Finder.findBlock(MODID, "orange_blossom_hedge"),
				Finder.findBlock(MODID, "blossom_bookshelf"),
				Finder.findBlock(MODID, "marble_bricks_bridge"),
				Finder.findBlock(MODID, "azalea_shutter"),
				Finder.findBlock(MODID, "blossom_beach_door"),
				Finder.findBlock(MODID, "azalea_paper_trapdoor"),
				Finder.findBlock(MODID, "blossom_planks_path"),
				Finder.findBlock(MODID, "ancient_balcony"));

		propIcon
				.addType(ModType.BRIDGES)
				.addType(ModType.ROOFS)
				.addType(ModType.FENCES)
				.addType(ModType.FURNITURES)
				.addType(ModType.STAIRS)
				.addType(ModType.WINDOWS)
				.addType(ModType.DOORS)
				.addType(ModType.TRAPDOORS)
				.addType(ModType.PATHS);
		Block icon = propIcon.buildIcon(ModType.BRIDGES, ModType.ROOFS, ModType.FENCES, ModType.FURNITURES,
				ModType.STAIRS, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS);
		return new ItemStack(icon);
	}
}