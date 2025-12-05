package fr.samlegamer.mcwabnormals;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Registration;
import javax.annotation.Nonnull;

@Mod(McwAbnormals.MODID)
public class McwAbnormals extends McwMod
{
	public static final String MODID = "mcwabnormals";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> ROCK_BB = Arrays.asList("honeycomb_brick", "honeycomb_tile");
    public static final List<String> WOOD_ATMO = Arrays.asList("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca");
    public static final List<String> ROCK_ATMO = Arrays.asList("arid_sandstone", "red_arid_sandstone");
    public static final List<String> WOOD_AUTU = Arrays.asList("maple");
    public static final List<String> ROCK_AUTU = Arrays.asList("snail_shell_bricks", "snail_shell_tiles");
    public static final List<String> WOOD_ENVI = Arrays.asList("cherry", "wisteria", "willow");
    public static final List<String> WOOD_UAQUA = Arrays.asList("driftwood", "river");
    public static final List<String> WOOD_ENDER = Arrays.asList("poise");
    
    public static final List<String> LEAVES_ATMO = Arrays.asList("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca");
    public static final List<String> LEAVES_AUTU = Arrays.asList("maple", "red_maple", "yellow_maple","orange_maple");
    public static final List<String> LEAVES_ENVI = Arrays.asList("cherry", "blue_wisteria", "pink_wisteria", "white_wisteria", "purple_wisteria", "willow");
    public static final List<String> LEAVES_UAQUA = Arrays.asList("river");
    
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

	public static final RegistryObject<Item> LOGO = item.register("logo", () -> new Item(new Item.Properties()));
	
	public static final ItemGroup MCWABNORMALS_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	        return new ItemStack(LOGO.get());
	    }
	};
	
    public McwAbnormals()
    {
    	LOGGER.info("Macaw's Abnormals Mod Loading...");
    	Registration.init(block, item);

        Map<String, SoundType> mapBuzzierBees = McwRegistry.makeDefaultFromList(ROCK_BB, SoundType.CORAL_BLOCK);

        McwRegistry.setRegistriesStone(mapBuzzierBees, block, item, "buzzier_bees", MCWABNORMALS_TAB, Registration.getAllModTypeStone());

        McwRegistry.setRegistriesWood(WOOD_ATMO, block, item, "atmospheric", MCWABNORMALS_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesStone(ROCK_ATMO, block, item, "atmospheric", MCWABNORMALS_TAB, Registration.getAllModTypeStone());
        McwRegistry.setRegistriesLeave(LEAVES_ATMO, block, item, "atmospheric", MCWABNORMALS_TAB);

        McwRegistry.setRegistriesWood(WOOD_AUTU, block, item, "autumnity", MCWABNORMALS_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesStone(ROCK_AUTU, block, item, "autumnity", MCWABNORMALS_TAB, Registration.getAllModTypeStone());
        McwRegistry.setRegistriesLeave(LEAVES_AUTU, block, item, "autumnity", MCWABNORMALS_TAB);

        McwRegistry.setRegistriesWood(WOOD_ENVI, block, item, "environmental", MCWABNORMALS_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES_ENVI, block, item, "environmental", MCWABNORMALS_TAB);

        McwRegistry.setRegistriesWood(WOOD_UAQUA, block, item, "upgrade_aquatic", MCWABNORMALS_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES_UAQUA, block, item, "upgrade_aquatic", MCWABNORMALS_TAB);

        McwRegistry.setRegistriesWood(WOOD_ENDER, block, item, "endergetic", MCWABNORMALS_TAB, Registration.getAllModTypeWood());

		bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
		MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD_ATMO);
            McwLootTables.addBlockAllWood(MODID, WOOD_AUTU);
            McwLootTables.addBlockAllWood(MODID, WOOD_ENVI);
            McwLootTables.addBlockAllWood(MODID, WOOD_UAQUA);
            McwLootTables.addBlockAllWood(MODID, WOOD_ENDER);
            McwLootTables.addBlockAllStone(MODID, ROCK_BB);
            McwLootTables.addBlockAllStone(MODID, ROCK_ATMO);
            McwLootTables.addBlockAllStone(MODID, ROCK_AUTU);
            McwLootTables.addBlockHedges(MODID, LEAVES_ATMO);
            McwLootTables.addBlockHedges(MODID, LEAVES_AUTU);
            McwLootTables.addBlockHedges(MODID, LEAVES_ENVI);
            McwLootTables.addBlockHedges(MODID, LEAVES_UAQUA);
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
                    addAllMcwTagsStone(MODID, ROCK_BB, Registration.getAllModTypeStone());

                    addAllMcwTagsWood(MODID, WOOD_ATMO, Registration.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_ATMO, Registration.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, LEAVES_ATMO);

                    addAllMcwTagsWood(MODID, WOOD_AUTU, Registration.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_AUTU, Registration.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, LEAVES_AUTU);

                    addAllMcwTagsWood(MODID, WOOD_ENVI, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_ENVI);

                    addAllMcwTagsWood(MODID, WOOD_UAQUA, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_UAQUA);

                    addAllMcwTagsWood(MODID, WOOD_ENDER, Registration.getAllModTypeWood());
                }
            };
            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsStone(MODID, ROCK_BB, Registration.getAllModTypeStone());

                    addAllMcwTagsWood(MODID, WOOD_ATMO, Registration.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_ATMO, Registration.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, LEAVES_ATMO);

                    addAllMcwTagsWood(MODID, WOOD_AUTU, Registration.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_AUTU, Registration.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, LEAVES_AUTU);

                    addAllMcwTagsWood(MODID, WOOD_ENVI, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_ENVI);

                    addAllMcwTagsWood(MODID, WOOD_UAQUA, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_UAQUA);

                    addAllMcwTagsWood(MODID, WOOD_ENDER, Registration.getAllModTypeWood());
                }
            });
            generator.addProvider(new Recipes(generator));
        }
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e)
    {
		APIRenderTypes.initAllWood(e, MODID, WOOD_ATMO, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_AUTU, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_ENVI, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_UAQUA, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(e, MODID, WOOD_ENDER, Registration.getAllModTypeWood());

		APIRenderTypes.initAllLeave(e, MODID, LEAVES_ATMO);
		APIRenderTypes.initAllLeave(e, MODID, LEAVES_AUTU);
		APIRenderTypes.initAllLeave(e, MODID, LEAVES_ENVI);
		APIRenderTypes.initAllLeave(e, MODID, LEAVES_UAQUA);

		APIRenderTypes.initAllStone(e, MODID, ROCK_BB, Registration.getAllModTypeStone());
		APIRenderTypes.initAllStone(e, MODID, ROCK_ATMO, Registration.getAllModTypeStone());
		APIRenderTypes.initAllStone(e, MODID, ROCK_AUTU, Registration.getAllModTypeStone());
    }
}