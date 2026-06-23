package fr.samlegamer.mcwaurora;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationForge;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
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
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.tab.IconRandomForge;
import javax.annotation.Nonnull;

@Mod(McwAurora.MODID)
public class McwAurora extends McwMod
{
	public static final String MODID = "mcwaurora";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final List<String> WOOD_ENHANCED_MUSH = Arrays.asList("brown_mushroom", "red_mushroom"); // enhanced_mushrooms
    public static final List<String> WOOD_BAYOU = Arrays.asList("cypress"); // bayou_blues
    public static final List<String> WOOD_ABUNDANCE = Arrays.asList("jacaranda", "redbud"); // abundance
    
    private static final DeferredRegister<Block> block = RegistrationForge.blocks(MODID);
    private static final DeferredRegister<Item> item = RegistrationForge.items(MODID);
    
    public static final ItemGroup MCWAURORA_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	    	return IconRandomForge.buildIcon(
					Finder.findBlock(MODID, randomNaming()+"_roof"),
					Finder.findBlock(MODID, randomNaming()+"_picket_fence"),
					Finder.findBlock(MODID, randomNaming()+"_wardrobe"),
					Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
					Finder.findBlock(MODID, randomNaming()+"_pane_window"),
					Finder.findBlock(MODID, randomNaming()+"_modern_door"),
					Finder.findBlock(MODID, randomNaming()+"_mystic_trapdoor"),
					Finder.findBlock(MODID, randomNaming()+"_planks_path"),
					Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"),
					ModType.getAllModTypeWood());
	    }
	};
    
    public McwAurora()
    {
    	LOGGER.info("Macaw's Aurora Mod Loading...");
		RegistrationForge.init(block, item);

        McwRegistry.setRegistriesWood(WOOD_BAYOU, block, item, "bayou_blues", MCWAURORA_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesWood(WOOD_ENHANCED_MUSH, block, item, "enhanced_mushrooms", MCWAURORA_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesWood(WOOD_ABUNDANCE, block, item, "abundance", MCWAURORA_TAB, ModType.getAllModTypeWood());

        McwRegistry.setRegistriesLeave(WOOD_BAYOU, block, item, "bayou_blues", MCWAURORA_TAB);
        McwRegistry.setRegistriesLeave(WOOD_ABUNDANCE, block, item, "abundance", MCWAURORA_TAB);

		bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, WOOD_ENHANCED_MUSH);
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, WOOD_BAYOU);
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, WOOD_ABUNDANCE);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(MODID, WOOD_BAYOU);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(MODID, WOOD_ABUNDANCE);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();
        if(gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD_ENHANCED_MUSH, ModType.getAllModTypeWood());

                    addAllMcwTagsWood(MODID, WOOD_BAYOU, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, WOOD_BAYOU);

                    addAllMcwTagsWood(MODID, WOOD_ABUNDANCE, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, WOOD_ABUNDANCE);
                }
            };
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD_ENHANCED_MUSH, ModType.getAllModTypeWood());

                    addAllMcwTagsWood(MODID, WOOD_BAYOU, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, WOOD_BAYOU);

                    addAllMcwTagsWood(MODID, WOOD_ABUNDANCE, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, WOOD_ABUNDANCE);
                }
            });
            generator.addProvider(new Recipes(generator));
        }
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e)
    {
		APIRenderTypes.initAllWood(e, MODID, WOOD_BAYOU, ModType.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_ENHANCED_MUSH, ModType.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_ABUNDANCE, ModType.getAllModTypeWood());

		APIRenderTypes.initAllLeave(e, MODID, WOOD_BAYOU);
		APIRenderTypes.initAllLeave(e, MODID, WOOD_ABUNDANCE);
    }
    
	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("bayou_blues") && ModList.get().isLoaded("enhanced_mushrooms") && ModList.get().isLoaded("abundance"))
		{
			int i = rand.nextInt(3);

			switch(i)
			{
					case 0:
						return "cypress";
					case 1:
						return "brown_mushroom";
					case 2:
						return "jacaranda";
					default:
						return "red_mushroom";
			}
		}
		else
		{
			if(ModList.get().isLoaded("bayou_blues"))
			{
				return "cypress";
			}

			if(ModList.get().isLoaded("enhanced_mushrooms"))
			{
				return "brown_mushroom";
			}
			
			if(ModList.get().isLoaded("abundance"))
			{
				return "jacaranda";
			}
		}
		return "brown_mushroom";
	}
}