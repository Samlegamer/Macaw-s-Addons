package fr.samlegamer.mcwbetters;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.IconRandomForge;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.block.Block;
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
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.RegistrationForge;
import javax.annotation.Nonnull;

@Mod(McwBetters.MODID)
public class McwBetters extends McwMod
{
	public static final String MODID = "mcwbetters";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> WOOD_BETTER_END = Arrays.asList("dragon_tree", "end_lotus", "helix_tree", "jellyshroom", "lacugrove", "lucernia",
    "mossy_glowshroom", "pythadendron", "tenanea", "umbrella_tree");
    public static final List<String> WOOD_BETTER_NETHER = Arrays.asList("anchor_tree", "mushroom_fir", "mushroom", "nether_sakura", "rubeus", "stalagnate",
    "wart", "willow");

    public static final List<String> LEAVE_BETTER_END = Arrays.asList("dragon_tree", "lacugrove", "lucernia", "pythadendron", "tenanea");
    public static final List<String> LEAVE_BETTER_NETHER = Arrays.asList("nether_sakura", "rubeus", "willow");

    private static final DeferredRegister<Block> block = RegistrationForge.blocks(MODID);
    private static final DeferredRegister<Item> item = RegistrationForge.items(MODID);

	public static final ItemGroup MCWBETTERS_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	        return McwBetters.icon();
	    }
	};
	
    public McwBetters()
    {
    	LOGGER.info("Macaw's Betters Mod Loading...");
        RegistrationForge.init(block, item);

        McwRegistry.setRegistriesWood(WOOD_BETTER_END, block, item, "betterendforge", MCWBETTERS_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVE_BETTER_END, block, item, "betterendforge", MCWBETTERS_TAB);

        McwRegistry.setRegistriesWood(WOOD_BETTER_NETHER, block, item, "betternether", MCWBETTERS_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVE_BETTER_NETHER, block, item, "betternether", MCWBETTERS_TAB);

		bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
    	LOGGER.info("Macaw's Betters Mod Finish !");
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, WOOD_BETTER_END);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(MODID, LEAVE_BETTER_END);

            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, WOOD_BETTER_NETHER);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(MODID, LEAVE_BETTER_NETHER);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent)
    {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD_BETTER_END, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVE_BETTER_END);

                    addAllMcwTagsWood(MODID, WOOD_BETTER_NETHER, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVE_BETTER_NETHER);
                }
            };
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD_BETTER_END, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVE_BETTER_END);

                    addAllMcwTagsWood(MODID, WOOD_BETTER_NETHER, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVE_BETTER_NETHER);
                }
            });
            generator.addProvider(new Recipes(generator));
        }
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e)
    {
		APIRenderTypes.initAllWood(e, MODID, WOOD_BETTER_END, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(e, MODID, LEAVE_BETTER_END);

        APIRenderTypes.initAllWood(e, MODID, WOOD_BETTER_NETHER, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(e, MODID, LEAVE_BETTER_NETHER);
    }

    public static ItemStack icon() {
        String wood, leaves;
        if(ModList.get().isLoaded("betterendforge") && !ModList.get().isLoaded("betternether"))
        {
            wood = getRandomInList(WOOD_BETTER_END);
            leaves = getRandomInList(LEAVE_BETTER_END);
        }
        else if(ModList.get().isLoaded("betternether") && !ModList.get().isLoaded("betterendforge"))
        {
            wood = getRandomInList(WOOD_BETTER_NETHER);
            leaves = getRandomInList(LEAVE_BETTER_NETHER);
        }
        else
        {
            Random rand = new Random();
            boolean rnd = rand.nextBoolean();
            wood = getRandomInList(rnd ? WOOD_BETTER_END : WOOD_BETTER_NETHER);
            leaves = getRandomInList(rnd ? LEAVE_BETTER_END : LEAVE_BETTER_NETHER);
        }

        return IconRandomForge.buildIcon(
                Finder.findBlock(MODID, wood+"_roof"),
                Finder.findBlock(MODID, leaves+"_hedge"),
                Finder.findBlock(MODID, wood+"_wardrobe"),
                Finder.findBlock(MODID, wood+"_log_bridge_middle"),
                Finder.findBlock(MODID, wood+"_window"),
                Finder.findBlock(MODID, wood+"_japanese_door"),
                Finder.findBlock(MODID, wood+"_glass_trapdoor"),
                Finder.findBlock(MODID, wood+"_planks_path"),
                Finder.findBlock(MODID, wood+"_loft_stairs"),
                ModType.getAllModTypeWood());
    }

    public static String getRandomInList(List<String> list)
    {
        Random rand = new Random();
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}