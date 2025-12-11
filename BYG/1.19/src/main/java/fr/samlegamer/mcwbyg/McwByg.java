package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.McwBlocksIdBase;
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
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;

@Mod(McwByg.MODID)
public class McwByg extends McwMod
{
	public static final String MODID = "mcwbyg";
    private static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("aspen","baobab", "blue_enchanted","cherry","cika","cypress","ebony","ether","fir","green_enchanted","holly","jacaranda",
    	    "lament","mahogany","white_mangrove","maple","nightshade","palm","pine","rainbow_eucalyptus","redwood","skyris", "willow", "witch_hazel", "zelkova", "bulbis", "imparius", "sythian");
	public static final List<String> fences_rockable = List.of("soapstone", "travertine", "dacite", "red_rock", "scoria_stone");
	public static final List<String> bridges_rockable = List.of("cryptic_stone", "dacite_bricks", "polished_travertine", "purpur_stone", "red_rock_bricks", "scoria_stone_bricks", "soapstone_bricks");
	public static final List<String>  LEAVES = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
			"palm","pine","rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", 
			"orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
			"flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");

	public static final CreativeModeTab MCWBYG_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public @NotNull ItemStack makeIcon()
		{
				NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
						Finder.findBlock(MODID, "aspen_roof"),
						Finder.findBlock(MODID, "aspen_picket_fence"),
						Finder.findBlock(MODID, "aspen_wardrobe"),
						Finder.findBlock(MODID, "aspen_log_bridge_middle"),
						Finder.findBlock(MODID, "aspen_plank_window2"),
						Finder.findBlock(MODID, "aspen_paper_door"),
						Finder.findBlock(MODID, "aspen_blossom_trapdoor"),
						Finder.findBlock(MODID, "aspen_planks_path"),
						Finder.findBlock(MODID, "aspen_bulk_stairs"));

				prop
						.addType(ModType.ROOFS)
						.addType(ModType.FENCES)
						.addType(ModType.BRIDGES)
						.addType(ModType.FURNITURES)
						.addType(ModType.STAIRS)
						.addType(ModType.DOORS)
						.addType(ModType.TRAPDOORS)
						.addType(ModType.PATHS)
						.addType(ModType.WINDOWS);
				Block icon = prop.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.BRIDGES, ModType.FURNITURES, ModType.STAIRS,
						ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.WINDOWS);
				return new ItemStack(icon);
	    }
	};
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public McwByg()
    {
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
    	Registration.init(block, item);

		McwRegistry.setRegistriesWood(WOOD, block, item, MCWBYG_TAB, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(LEAVES, block, item, MCWBYG_TAB);
		McwRegistry.setRegistriesStone(bridges_rockable, block, item, MCWBYG_TAB, ModType.BRIDGES);
		McwRegistry.setRegistriesStone(fences_rockable, block, item, MCWBYG_TAB, ModType.FENCES, ModType.ROOFS);

		MinecraftForge.EVENT_BUS.register(Mapping.class);
        bus().addListener(this::clientSetup);
		bus().addListener(this::commonSetup);
		bus().addListener(this::dataSetup);
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, MODID, LEAVES);
        APIRenderTypes.initAllStone(event, MODID, bridges_rockable, ModType.BRIDGES);
        APIRenderTypes.initAllStone(event, MODID, fences_rockable, ModType.FENCES, ModType.ROOFS);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
            McwLootTables.addBlock(MODID, bridges_rockable, McwBlocksIdBase.BRIDGES_STONE_BLOCKS);
            McwLootTables.addBlock(MODID, fences_rockable, McwBlocksIdBase.ROOFS_STONE_BLOCKS);
            McwLootTables.addBlock(MODID, fences_rockable, McwBlocksIdBase.FENCES_STONE_BLOCKS);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent)
    {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
					addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, LEAVES);
					addAllMcwTagsStone(MODID, bridges_rockable, ModType.BRIDGES);
					addAllMcwTagsStone(MODID, fences_rockable, ModType.FENCES, ModType.ROOFS);
                }
            };

            generator.addProvider(true, new Recipes(generator));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
					addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
					addAllMcwTagsLeave(MODID, LEAVES);
					addAllMcwTagsStone(MODID, bridges_rockable, ModType.BRIDGES);
					addAllMcwTagsStone(MODID, fences_rockable, ModType.FENCES, ModType.ROOFS);
                }
            });
        }
    }
}