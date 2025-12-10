package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import org.jetbrains.annotations.NotNull;

@Mod(McwBOP.MODID)
public class McwBOP extends McwMod
{
	public static final String MODID = "mcwbiomesoplenty";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final List<String> WOOD = List.of("cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow");
	public static final List<String> LEAVES = List.of("pink_cherry", "dead", "fir", "hellbark", "jacaranda", "magic", "mahogany", "palm", "redwood", "umbran", "willow", "maple", 
	"orange_autumn", "yellow_autumn", "white_cherry", "flowering_oak", "rainbow_birch", "origin");
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

	public static final CreativeModeTab MCWBOP_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public @NotNull ItemStack makeIcon() {
	    	NewIconRandom.NewProperties woodProperties = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "cherry_roof"), Finder.findBlock(MODID, "cherry_picket_fence"), Finder.findBlock(MODID, "cherry_wardrobe"), 
	        Finder.findBlock(MODID, "cherry_log_bridge_middle"), Finder.findBlock(MODID, "cherry_window"), Finder.findBlock(MODID, "cherry_japanese_door"), Finder.findBlock(MODID, "cherry_glass_trapdoor"), 
	        Finder.findBlock(MODID, "cherry_planks_path"), Finder.findBlock(MODID, "cherry_loft_stairs"));
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
	        Block icon = woodProperties.buildIcon(ModType.ROOFS, ModType.FENCES, ModType.FURNITURES, ModType.BRIDGES, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS, ModType.STAIRS);
	        return new ItemStack(icon);
	    }
	};
	
    public McwBOP()
    {
    	LOGGER.info("Macaw's Biomes O' Plenty Loading...");
    	Registration.init(block, item);

        McwRegistry.setRegistriesWood(WOOD, block, item, MCWBOP_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES, block, item, MCWBOP_TAB);

    	bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
		MinecraftForge.EVENT_BUS.register(Mapping.class);
    	LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e)
    {
        APIRenderTypes.initAllWood(e, MODID, WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllLeave(e, MODID, LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent e) {
        e.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD);
            McwLootTables.addBlockHedges(MODID, LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent e) {
        if(e.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(e.getGenerator(), MODID, e.getExistingFileHelper()) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            };
            e.getGenerator().addProvider(new Recipes(e.getGenerator()));
            e.getGenerator().addProvider(mcwBlockTags);
            e.getGenerator().addProvider(new McwItemTags(e.getGenerator(), mcwBlockTags, MODID, e.getExistingFileHelper()) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, WOOD, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES);
                }
            });
        }
    }
}