package fr.samlegamer.mcwabnormals;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
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
    	
    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
    	final BlockBehaviour.Properties stone = BlockBehaviour.Properties.copy(Blocks.COBBLESTONE);
    	final BlockBehaviour.Properties honey = BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);

    	Bridges.setRegistrationRockModLoaded(ROCK_BB, block, item, MCWABNORMALS_TAB, "buzzier_bees", honey);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", wood);
    	Bridges.setRegistrationRockModLoaded(ROCK_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", stone);
    	Bridges.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", wood);
    	Bridges.setRegistrationRockModLoaded(ROCK_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", stone);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic", wood);
		Bridges.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms", wood);
        Bridges.setRegistrationRockModLoaded(ROCK_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms", stone);

		Roofs.setRegistrationRockModLoaded(ROCK_BB, block, item, MCWABNORMALS_TAB, "buzzier_bees", honey);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", wood);
    	Roofs.setRegistrationRockModLoaded(ROCK_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", stone);
    	Roofs.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", wood);
    	Roofs.setRegistrationRockModLoaded(ROCK_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", stone);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic", wood);
		Roofs.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms", wood);
        Roofs.setRegistrationRockModLoaded(ROCK_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms", stone);
    	
    	Fences.setRegistrationRockModLoaded(ROCK_BB, block, item, MCWABNORMALS_TAB, "buzzier_bees", honey);
    	Fences.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", wood);
    	Fences.setRegistrationRockModLoaded(ROCK_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", stone);
    	Fences.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", wood);
    	Fences.setRegistrationRockModLoaded(ROCK_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", stone);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic", wood);
		Fences.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms", wood);
        Fences.setRegistrationRockModLoaded(ROCK_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms", stone);

    	Fences.setRegistrationHedgesModLoaded(LEAVES_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_ENVI, block, item, MCWABNORMALS_TAB, "environmental", leaves);
    	Fences.setRegistrationHedgesModLoaded(LEAVES_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", leaves);
    	
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic");
		Furnitures.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms");

    	Stairs.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic", wood);
		Stairs.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms", wood);

		Paths.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric");
		Paths.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity");
		Paths.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental");
		Paths.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic");
		Paths.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic");
		Paths.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms");

		Doors.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric");
		Doors.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity");
		Doors.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental");
		Doors.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic");
		Doors.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic");
		Doors.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms");

		Trapdoors.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric");
		Trapdoors.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity");
		Trapdoors.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental");
		Trapdoors.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic");
		Trapdoors.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic");
		Trapdoors.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms");

		Windows.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric");
		Windows.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity");
		Windows.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental");
		Windows.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic");
		Windows.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic");
		Windows.setRegistrationWoodModLoaded(WOOD_CAVERNSCHASMS, block, item, MCWABNORMALS_TAB, "caverns_and_chasms");

		bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
		MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e) {
        APIRenderTypes.initAllWood(e, MODID, WOOD_ATMO, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_AUTU, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_ENVI, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_UAQUA, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_ENDER, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(e, MODID, WOOD_CAVERNSCHASMS, Registration.getAllModTypeWood());

        APIRenderTypes.initAllLeave(e, MODID, LEAVES_ATMO);
        APIRenderTypes.initAllLeave(e, MODID, LEAVES_AUTU);
        APIRenderTypes.initAllLeave(e, MODID, LEAVES_ENVI);
        APIRenderTypes.initAllLeave(e, MODID, LEAVES_UAQUA);

        APIRenderTypes.initAllStone(e, MODID, ROCK_BB, Registration.getAllModTypeStone());
        APIRenderTypes.initAllStone(e, MODID, ROCK_ATMO, Registration.getAllModTypeStone());
        APIRenderTypes.initAllStone(e, MODID, ROCK_AUTU, Registration.getAllModTypeStone());
        APIRenderTypes.initAllStone(e, MODID, ROCK_CAVERNSCHASMS, Registration.getAllModTypeStone());
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
                    addAllMcwTags(MODID, List.of(), ROCK_BB, List.of());
                    addAllMcwTags(MODID, WOOD_ATMO, ROCK_ATMO, LEAVES_ATMO);
                    addAllMcwTags(MODID, WOOD_AUTU, ROCK_AUTU, LEAVES_AUTU);
                    addAllMcwTags(MODID, WOOD_ENVI, LEAVES_ENVI);
                    addAllMcwTags(MODID, WOOD_CAVERNSCHASMS, ROCK_CAVERNSCHASMS, List.of());
                    addAllMcwTags(MODID, WOOD_ENDER);
                    addAllMcwTags(MODID, WOOD_UAQUA, LEAVES_UAQUA);
                }
            };
            generator.addProvider(true, new Recipes(generator));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTags(MODID, List.of(), ROCK_BB, List.of());
                    addAllMcwTags(MODID, WOOD_ATMO, ROCK_ATMO, LEAVES_ATMO);
                    addAllMcwTags(MODID, WOOD_AUTU, ROCK_AUTU, LEAVES_AUTU);
                    addAllMcwTags(MODID, WOOD_ENVI, LEAVES_ENVI);
                    addAllMcwTags(MODID, WOOD_CAVERNSCHASMS, ROCK_CAVERNSCHASMS, List.of());
                    addAllMcwTags(MODID, WOOD_ENDER);
                    addAllMcwTags(MODID, WOOD_UAQUA, LEAVES_UAQUA);
                }
            });
        }
    }
}