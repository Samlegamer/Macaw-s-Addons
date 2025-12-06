package fr.samlegamer.mcwsajevius;

import fr.addonslib.api.data.McwBlocksIdBase;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.util.McwMod;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;

@Mod(McwSajevius.MODID)
public class McwSajevius extends McwMod
{    
	public static final String MODID = "mcwsajevius";
	private static final Logger LOGGER = LogManager.getLogger();
    public static final ModType[] WOOD_MOD_TYPES = {ModType.BRIDGES, ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.STAIRS};

	public static final List<String> wood_shroomed = Arrays.asList("blue_hard_mushroom", "hard_mushroom", "orange_hard_mushroom", "purple_hard_mushroom");
	public static final List<String> wood_betterlands = Arrays.asList("juniper");
	public static final List<String> stone_betterlands = Arrays.asList("black_terracotta_bricks",
	"blue_terracotta_bricks",
	"brown_terracotta_bricks",
	"claystone_bricks",
	"cyan_terracotta_bricks",
	"gray_terracotta_bricks",
	"green_terracotta_bricks",
	"light_blue_terracotta_bricks",
	"light_gray_terracotta_bricks",
	"lime_terracotta_bricks",
	"magenta_terracotta_bricks",
	"orange_terracotta_bricks",
	"red_terracotta_bricks",
	"terracotta_bricks",
	"white_terracotta_bricks",
	"yellow_terracotta_bricks");
	
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public static final ItemGroup MCWSAJEVIUS_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
        @MethodsReturnNonnullByDefault
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(Finder.findBlock(MODID, randomNaming()+"_roof"), Finder.findBlock(MODID, randomNaming()+"_picket_fence"), Finder.findBlock(MODID, randomNaming()+"_wardrobe"), 
	        Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));
	        
	    	prop.addType(ModType.ROOFS).addType(ModType.BRIDGES).addType(ModType.FENCES).addType(ModType.FURNITURES).addType(ModType.STAIRS);
	    	Block icon = prop.buildIcon(ModType.ROOFS, ModType.BRIDGES, ModType.FENCES, ModType.FURNITURES, ModType.STAIRS);
	    	return new ItemStack(icon);
	    }
	};

    public McwSajevius()
    {
    	LOGGER.info("Macaw's Sajevius Mod Loading...");
    	Registration.init(block, item);

        McwRegistry.setRegistriesWood(wood_shroomed, block, item, "shroomed", MCWSAJEVIUS_TAB, WOOD_MOD_TYPES);
        McwRegistry.setRegistriesWood(wood_betterlands, block, item, "betterlands", MCWSAJEVIUS_TAB, WOOD_MOD_TYPES);
        McwRegistry.setRegistriesLeave(wood_betterlands, block, item, "betterlands", MCWSAJEVIUS_TAB);
        McwRegistry.setRegistriesStone(stone_betterlands, block, item, "betterlands", MCWSAJEVIUS_TAB, Registration.getAllModTypeStone());

    	bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Sajevius Mod Finish !");
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllStone(MODID, stone_betterlands);
            McwLootTables.addBlockHedges(MODID, wood_betterlands);
            mkDrop(wood_betterlands);
            mkDrop(wood_shroomed);
        });
    }

    private void mkDrop(List<String> list) {
        McwLootTables.addBlock(MODID, list, McwBlocksIdBase.BRIDGES_WOOD_BLOCKS);
        McwLootTables.addBlock(MODID, list, McwBlocksIdBase.ROOFS_WOOD_BLOCKS);
        McwLootTables.addBlock(MODID, list, McwBlocksIdBase.FENCES_WOOD_BLOCKS);
        McwLootTables.addBlock(MODID, list, McwBlocksIdBase.FURNITURES_WOOD_BLOCKS);
        McwLootTables.addBlock(MODID, list, McwBlocksIdBase.STAIRS_WOOD_BLOCKS);
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
                    addAllMcwTagsWood(MODID, wood_betterlands, WOOD_MOD_TYPES);
                    addAllMcwTagsWood(MODID, wood_shroomed, WOOD_MOD_TYPES);
                    addAllMcwTagsStone(MODID, stone_betterlands, Registration.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, wood_betterlands);
                }
            };
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, wood_betterlands, WOOD_MOD_TYPES);
                    addAllMcwTagsWood(MODID, wood_shroomed, WOOD_MOD_TYPES);
                    addAllMcwTagsStone(MODID, stone_betterlands, Registration.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, wood_betterlands);
                }
            });
            generator.addProvider(new Recipes(generator));
        }
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e)
    {
		APIRenderTypes.initAllWood(e, MODID, wood_betterlands, ModType.BRIDGES, ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.STAIRS);
		APIRenderTypes.initAllLeave(e, MODID, wood_betterlands);
		APIRenderTypes.initAllStone(e, MODID, stone_betterlands, Registration.getAllModTypeStone());
    }
    
	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("shroomed") && ModList.get().isLoaded("betterlands"))
		{
			int i = rand.nextInt(1);

			switch(i)
			{
			case 0:
					return "juniper";
			case 1:
					return "purple_hard_mushroom";
			}
		}
		else
		{
			if(ModList.get().isLoaded("shroomed"))
			{
				return "purple_hard_mushroom";
			}

			if(ModList.get().isLoaded("betterlands"))
			{
				return "juniper";
			}
		}
		return "purple_hard_mushroom";
	}
}