package fr.samlegamer.mcwaurora;

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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
import java.util.Random;
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
    
    public static final List<String> WOOD_ENHANCED_MUSH = List.of("brown_mushroom", "red_mushroom"); // enhanced_mushrooms

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    
    public static final CreativeModeTab MCWAURORA_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public @NotNull ItemStack makeIcon() {
			NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
					Finder.findBlock(MODID, randomNaming()+"_roof"),
					Finder.findBlock(MODID, randomNaming()+"_picket_fence"),
					Finder.findBlock(MODID, randomNaming()+"_wardrobe"),
					Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
					Finder.findBlock(MODID, randomNaming()+"_pane_window"),
					Finder.findBlock(MODID, randomNaming()+"_modern_door"),
					Finder.findBlock(MODID, randomNaming()+"_mystic_trapdoor"),
					Finder.findBlock(MODID, randomNaming()+"_planks_path"),
					Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));

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
	};
    
    public McwAurora()
    {
    	LOGGER.info("Macaw's Aurora Mod Loading...");
    	Registration.init(block, item);

		McwRegistry.setRegistriesWood(WOOD_ENHANCED_MUSH, block, item, "enhanced_mushrooms", MCWAURORA_TAB, Registration.getAllModTypeWood());

    	bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e) {
        APIRenderTypes.initAllWood(e, MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());
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

        if(gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
					addAllMcwTagsWood(MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());
                }
            };
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
					addAllMcwTagsWood(MODID, WOOD_ENHANCED_MUSH, Registration.getAllModTypeWood());
                }
            });
            generator.addProvider(new Recipes(generator));
        }
    }
    
	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("enhanced_mushrooms"))
		{
			int i = rand.nextInt(2);
			return i == 0 ? "brown_mushroom" : "red_mushroom";
		}
		return "brown_mushroom";
	}
}