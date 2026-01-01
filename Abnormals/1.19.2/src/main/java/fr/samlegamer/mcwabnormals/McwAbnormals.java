package fr.samlegamer.mcwabnormals;

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
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Registration;
import org.jetbrains.annotations.NotNull;

@Mod(McwAbnormals.MODID)
public class McwAbnormals extends McwMod
{
	public static final String MODID = "mcwabnormals";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> ROCK_BB = List.of("honeycomb_brick", "honeycomb_tile");
    public static final List<String> WOOD_ATMO = List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca");
    public static final List<String> ROCK_ATMO = List.of("arid_sandstone", "red_arid_sandstone");
    public static final List<String> WOOD_AUTU = List.of("maple");
    public static final List<String> ROCK_AUTU = List.of("snail_shell_bricks", "snail_shell_tiles");
    public static final List<String> WOOD_ENVI = List.of("cherry", "wisteria", "willow");
    public static final List<String> WOOD_UAQUA = List.of("driftwood", "river");
    public static final List<String> WOOD_ENDER = List.of("poise");
	public static final List<String> WOOD_CAVERNSCHASMS = List.of("azalea");
    public static final List<String> ROCK_CAVERNSCHASMS = List.of("cut_amethyst_bricks", "spinel_bricks", "lapis_bricks", "cobblestone_bricks",
            "polished_calcite", "mossy_cobblestone_bricks", "flooded_dripstone_shingles");

	public static final List<String> LEAVES_ATMO = List.of("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca");
    public static final List<String> LEAVES_AUTU = List.of("maple", "red_maple", "yellow_maple","orange_maple");
    public static final List<String> LEAVES_ENVI = List.of("cherry", "blue_wisteria", "pink_wisteria", "white_wisteria", "purple_wisteria", "willow");
    public static final List<String> LEAVES_UAQUA = List.of("river");
    
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

	public static final RegistryObject<Item> LOGO = item.register("logo", () -> new Item(new Item.Properties()));
	
	public static final CreativeModeTab MCWABNORMALS_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public @NotNull ItemStack makeIcon() {
	        return new ItemStack(LOGO.get());
	    }
	};
	
    public McwAbnormals()
    {
    	LOGGER.info("Macaw's Abnormals Mod Loading...");
    	Registration.init(block, item);

        Map<String, SoundType> mapBuzzierBees = McwRegistry.makeDefaultFromList(ROCK_BB, SoundType.CORAL_BLOCK);
        Map<String, SoundType> mapCavernsChasms = new HashMap<>();

        for(String key : ROCK_CAVERNSCHASMS)
        {
            if(key.contains("amethyst")) {
                mapCavernsChasms.put(key, SoundType.AMETHYST);
            }
            else if(key.contains("calcite")) {
                mapCavernsChasms.put(key, SoundType.CALCITE);
            }
            else if(key.contains("dripstone")) {
                mapCavernsChasms.put(key, SoundType.DRIPSTONE_BLOCK);
            }
            else {
                mapCavernsChasms.put(key, SoundType.STONE);
            }
        }

        McwRegistry.setRegistriesStone(mapBuzzierBees, block, item, "buzzier_bees", MCWABNORMALS_TAB, ModType.getAllModTypeStone());

        McwRegistry.setRegistriesWood(WOOD_ATMO, block, item, "atmospheric", MCWABNORMALS_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesStone(ROCK_ATMO, block, item, "atmospheric", MCWABNORMALS_TAB, ModType.getAllModTypeStone());
        McwRegistry.setRegistriesLeave(LEAVES_ATMO, block, item, "atmospheric", MCWABNORMALS_TAB);

        McwRegistry.setRegistriesWood(WOOD_AUTU, block, item, "autumnity", MCWABNORMALS_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesStone(ROCK_AUTU, block, item, "autumnity", MCWABNORMALS_TAB, ModType.getAllModTypeStone());
        McwRegistry.setRegistriesLeave(LEAVES_AUTU, block, item, "autumnity", MCWABNORMALS_TAB);

        McwRegistry.setRegistriesWood(WOOD_ENVI, block, item, "environmental", MCWABNORMALS_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES_ENVI, block, item, "environmental", MCWABNORMALS_TAB);

        McwRegistry.setRegistriesWood(WOOD_UAQUA, block, item, "upgrade_aquatic", MCWABNORMALS_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVES_UAQUA, block, item, "upgrade_aquatic", MCWABNORMALS_TAB);

        McwRegistry.setRegistriesWood(WOOD_ENDER, block, item, "endergetic", MCWABNORMALS_TAB, ModType.getAllModTypeWood());

        McwRegistry.setRegistriesWood(WOOD_CAVERNSCHASMS, block, item, "caverns_and_chasms", MCWABNORMALS_TAB, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesStone(mapCavernsChasms, block, item, "caverns_and_chasms", MCWABNORMALS_TAB, ModType.getAllModTypeStone());

		bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
		MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e) {
        APIRenderTypes.initAllWood(e, MODID, WOOD_ATMO, ModType.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_AUTU, ModType.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_ENVI, ModType.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_UAQUA, ModType.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_ENDER, ModType.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_CAVERNSCHASMS, ModType.getAllModTypeWood());

        APIRenderTypes.initAllLeave(e, MODID, LEAVES_ATMO);
        APIRenderTypes.initAllLeave(e, MODID, LEAVES_AUTU);
        APIRenderTypes.initAllLeave(e, MODID, LEAVES_ENVI);
        APIRenderTypes.initAllLeave(e, MODID, LEAVES_UAQUA);

        APIRenderTypes.initAllStone(e, MODID, ROCK_BB, ModType.getAllModTypeStone());
        APIRenderTypes.initAllStone(e, MODID, ROCK_ATMO, ModType.getAllModTypeStone());
        APIRenderTypes.initAllStone(e, MODID, ROCK_AUTU, ModType.getAllModTypeStone());
        APIRenderTypes.initAllStone(e, MODID, ROCK_CAVERNSCHASMS, ModType.getAllModTypeStone());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, WOOD_ATMO);
            McwLootTables.addBlockAllWood(MODID, WOOD_AUTU);
            McwLootTables.addBlockAllWood(MODID, WOOD_ENVI);
            McwLootTables.addBlockAllWood(MODID, WOOD_UAQUA);
            McwLootTables.addBlockAllWood(MODID, WOOD_ENDER);
            McwLootTables.addBlockAllWood(MODID, WOOD_CAVERNSCHASMS);

            McwLootTables.addBlockHedges(MODID, LEAVES_ATMO);
            McwLootTables.addBlockHedges(MODID, LEAVES_AUTU);
            McwLootTables.addBlockHedges(MODID, LEAVES_ENVI);
            McwLootTables.addBlockHedges(MODID, LEAVES_UAQUA);

            McwLootTables.addBlockAllStone(MODID, ROCK_BB);
            McwLootTables.addBlockAllStone(MODID, ROCK_ATMO);
            McwLootTables.addBlockAllStone(MODID, ROCK_AUTU);
            McwLootTables.addBlockAllStone(MODID, ROCK_CAVERNSCHASMS);
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
                    addAllMcwTagsStone(MODID, ROCK_BB, ModType.getAllModTypeStone());

                    addAllMcwTagsWood(MODID, WOOD_ATMO, ModType.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_ATMO, ModType.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, LEAVES_ATMO);

                    addAllMcwTagsWood(MODID, WOOD_AUTU, ModType.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_AUTU, ModType.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, LEAVES_AUTU);

                    addAllMcwTagsWood(MODID, WOOD_ENVI, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_ENVI);

                    addAllMcwTagsWood(MODID, WOOD_UAQUA, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_UAQUA);

                    addAllMcwTagsWood(MODID, WOOD_ENDER, ModType.getAllModTypeWood());

                    addAllMcwTagsWood(MODID, WOOD_CAVERNSCHASMS, ModType.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_CAVERNSCHASMS, ModType.getAllModTypeStone());
                }
            };
            generator.addProvider(true, new Recipes(generator));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsStone(MODID, ROCK_BB, ModType.getAllModTypeStone());

                    addAllMcwTagsWood(MODID, WOOD_ATMO, ModType.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_ATMO, ModType.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, LEAVES_ATMO);

                    addAllMcwTagsWood(MODID, WOOD_AUTU, ModType.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_AUTU, ModType.getAllModTypeStone());
                    addAllMcwTagsLeave(MODID, LEAVES_AUTU);

                    addAllMcwTagsWood(MODID, WOOD_ENVI, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_ENVI);

                    addAllMcwTagsWood(MODID, WOOD_UAQUA, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVES_UAQUA);

                    addAllMcwTagsWood(MODID, WOOD_ENDER, ModType.getAllModTypeWood());

                    addAllMcwTagsWood(MODID, WOOD_CAVERNSCHASMS, ModType.getAllModTypeWood());
                    addAllMcwTagsStone(MODID, ROCK_CAVERNSCHASMS, ModType.getAllModTypeStone());
                }
            });
        }
    }
}