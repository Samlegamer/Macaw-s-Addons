package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationForge;
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
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.IconRandomForge;
import org.jetbrains.annotations.NotNull;

@Mod(McwBOP.MODID)
public class McwBOP extends McwMod
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow");
	public static final List<String> LEAVES = List.of("pink_cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "maple", 
	"orange_autumn", "yellow_autumn", "white_cherry", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = RegistrationForge.blocks(MODID);
    private static final DeferredRegister<Item> item = RegistrationForge.items(MODID);
	public static CreativeModeTab MCWBOP_TAB;
	
    public McwBOP()
    {
        LOGGER.info("Macaw's Biomes O' Plenty Loading...");
    	RegistrationForge.init(block, item);

        McwRegistry.setRegistriesWood(WOOD, block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES, block, item);
        
        bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        bus().addListener(this::tabRegistry);
        bus().addListener(this::tabSetup);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(MODID, LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = gatherDataEvent.getLookupProvider();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, lookupProvider, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTagsWood(MODID, WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            };

            generator.addProvider(true, new Recipes(output));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, lookupProvider, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTagsWood(MODID, WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }

    @Override
    public void tabRegistry(CreativeModeTabEvent.Register event) {
        final ItemStack icon = IconRandomForge.buildIcon(
                Finder.findBlock(MODID, "cherry_roof"),
                Finder.findBlock(MODID, "cherry_picket_fence"),
                Finder.findBlock(MODID, "cherry_wardrobe"),
                Finder.findBlock(MODID, "cherry_log_bridge_middle"),
                Finder.findBlock(MODID, "cherry_window"),
                Finder.findBlock(MODID, "cherry_japanese_door"),
                Finder.findBlock(MODID, "cherry_glass_trapdoor"),
                Finder.findBlock(MODID, "cherry_planks_path"),
                Finder.findBlock(MODID, "cherry_loft_stairs"),
                ModType.getAllModTypeWood());
        MCWBOP_TAB = RegistrationForge.tabs(event, MODID, "tab", icon.getItem());
    }

    @Override
    public void tabSetup(CreativeModeTabEvent.BuildContents event) {
        APICreativeTab.initAllWood(event, MODID, WOOD, MCWBOP_TAB, ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVES, MCWBOP_TAB);
    }
}