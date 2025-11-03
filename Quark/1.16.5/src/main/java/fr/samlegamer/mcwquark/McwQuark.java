package fr.samlegamer.mcwquark;

import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import javax.annotation.Nonnull;

@Mod(McwQuark.MODID)
@Mod.EventBusSubscriber(modid = McwQuark.MODID, bus = Bus.MOD)
public class McwQuark extends McwMod
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final List<String> stone = Arrays.asList(
		    "andesite_bricks", "basalt_bricks", "biotite_bricks", 
		    "diorite_bricks", "elder_prismarine_bricks", "granite_bricks", 
		    "jasper_bricks", "limestone_bricks", "magma_bricks", 
		    "marble_bricks", "permafrost_bricks", "red_sandstone_bricks", 
		    "sandstone_bricks", "slate_bricks", "soul_sandstone_bricks");
    public static final List<String> leaves = Arrays.asList("blue_blossom", "lavender_blossom", "orange_blossom", "pink_blossom", "red_blossom", "yellow_blossom");

	public static final ItemGroup MCWQUARK_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties propIcon = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "limestone_bricks_roof"), Finder.findBlock(MODID, "orange_blossom_hedge"), Blocks.CRAFTING_TABLE,
	    	Finder.findBlock(MODID, "marble_bricks_bridge"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE);
	    	
	    	propIcon.addType(BlockType.BRIDGES).addType(BlockType.ROOFS).addType(BlockType.FENCES);
	    	Block icon = propIcon.buildIcon(BlockType.BRIDGES, BlockType.ROOFS, BlockType.FENCES);
	        return new ItemStack(icon);
	    }
	};
	
    public McwQuark()
    {
    	LOGGER.info("Macaw's Quark Loading...");
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::dataSetup);
    	LOGGER.info("Macaw's Quark Is Charged !");
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllStone(MODID, stone);
            McwLootTables.addBlockHedges(MODID, leaves);
        });
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
                    addAllMcwTags(MODID, new ArrayList<>(), stone, leaves);
                }
            };
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTags(MODID, new ArrayList<>(), stone, leaves);
                }
            });
            generator.addProvider(new Recipes(generator));
        }
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event)
    {
		APIRenderTypes.initAllLeave(event, MODID, leaves);
		APIRenderTypes.initAllStone(event, MODID, stone, Registration.getAllModTypeStone());
    }
    
    @SubscribeEvent
    public static void registry(final RegistryEvent.Register<Block> e)
    {
    	Bridges.registryStone(e, MODID, stone, MCWQUARK_TAB);
    	Fences.registryStone(e, MODID, stone, MCWQUARK_TAB);
    	Fences.registryHedges(e, MODID, leaves, MCWQUARK_TAB);
    	Roofs.registryStone(e, MODID, stone, MCWQUARK_TAB);
    }
}