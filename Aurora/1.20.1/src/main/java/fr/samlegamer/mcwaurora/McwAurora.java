package fr.samlegamer.mcwaurora;

import fr.addonslib.api.data.ModType;
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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;

@Mod(McwAurora.MODID)
public class McwAurora extends McwMod
{
	public static final String MODID = "mcwaurora";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final List<String> WOOD_ENHANCED_MUSH = List.of("mushroom"); // enhanced_mushrooms

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final RegistryObject<CreativeModeTab> MCWAURORA_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(McwAurora::getIcon).title(Component.translatable(MODID+".tab")).build());
    
    public McwAurora(FMLJavaModLoadingContext javaModLoadingContext)
    {
        super(javaModLoadingContext);
        LOGGER.info("Macaw's Aurora Mod Loading...");
    	Registration.init(javaModLoadingContext, block, item, ct);

        McwRegistry.setRegistriesWood(WOOD_ENHANCED_MUSH, block, item, Registration.getAllModTypeWood());

        javaModLoadingContext.getModEventBus().addListener(this::clientSetup);
        javaModLoadingContext.getModEventBus().addListener(this::commonSetup);
        javaModLoadingContext.getModEventBus().addListener(this::dataSetup);
        javaModLoadingContext.getModEventBus().addListener(this::tabSetup);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event)
	{
		APIRenderTypes.initAllWood(event, MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());
	}

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD_ENHANCED_MUSH);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = gatherDataEvent.getLookupProvider();
        if(gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, lookupProvider, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
                    addAllMcwTagsWood(MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());
                }
            };
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, lookupProvider, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider provider) {
                    addAllMcwTagsWood(MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());
                }
            });
            generator.addProvider(true, new Recipes(output));
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, WOOD_ENHANCED_MUSH, "enhanced_mushrooms", MCWAURORA_TAB.get(), Registration.getAllModTypeWood());
    }
    
    private static ItemStack getIcon()
    {
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, "mushroom_roof"),
				Finder.findBlock(MODID, "mushroom_picket_fence"),
				Finder.findBlock(MODID, "mushroom_wardrobe"),
				Finder.findBlock(MODID, "mushroom_log_bridge_middle"),
				Finder.findBlock(MODID, "mushroom_pane_window"),
				Finder.findBlock(MODID, "mushroom_modern_door"),
				Finder.findBlock(MODID, "mushroom_mystic_trapdoor"),
				Finder.findBlock(MODID, "mushroom_planks_path"),
				Finder.findBlock(MODID, "mushroom_skyline_stairs"));

		prop.addType(ModType.BRIDGES)
				.addType(ModType.ROOFS)
				.addType(ModType.FENCES)
				.addType(ModType.FURNITURES)
				.addType(ModType.STAIRS)
				.addType(ModType.PATHS)
				.addType(ModType.WINDOWS)
				.addType(ModType.DOORS)
				.addType(ModType.TRAPDOORS);
		Block icon = prop.buildIcon(ModType.BRIDGES, ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.STAIRS,
				ModType.PATHS, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS);
    	return new ItemStack(icon);
    }
}