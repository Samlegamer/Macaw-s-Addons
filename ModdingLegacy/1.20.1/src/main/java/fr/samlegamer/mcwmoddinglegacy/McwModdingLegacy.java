package fr.samlegamer.mcwmoddinglegacy;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.data.McwBlocksIdBase;
import fr.samlegamer.addonslib.data.ModType;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

@Mod(McwModdingLegacy.MODID)
public class McwModdingLegacy extends McwMod
{
	public static final String MODID = "mcwmoddinglegacy";
    private static final Logger LOGGER = LogManager.getLogger();

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
	public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwModdingLegacy.MODID);

    public static final List<String> wood_blue_skies = List.of("bsky_bluebright", "bsky_comet", "bsky_dusk", "bsky_frostbright", "bsky_lunar", "bsky_maple", "bsky_starlit");
    public static final List<String> wood_premium_wood = List.of("pwood_magic", "pwood_maple", "pwood_purple_heart", "pwood_silverbell", "pwood_tiger", "pwood_willow");
    public static final List<String> wood_crystallized = List.of("bsky_crystallized");

	public static final RegistryObject<CreativeModeTab> MCWMODDINGLEGACY_TAB = ct.register("tab", () -> CreativeModeTab.builder()
			.icon(McwModdingLegacy::getIcon).title(Component.translatable(McwModdingLegacy.MODID+".tab")).build());

    public McwModdingLegacy(FMLJavaModLoadingContext modLoadingContext)
    {
        super(modLoadingContext);
        LOGGER.info("Macaw's Modding Legacy Mod Loading...");
    	Registration.init(modLoadingContext, block, item, ct);

    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
		final BlockBehaviour.Properties woodDoor = BlockBehaviour.Properties.copy(Blocks.OAK_DOOR);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);
    	final BlockBehaviour.Properties glass = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.GLASS);
    	
    	Bridges.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
    	Roofs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
    	Fences.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
		Fences.setRegistrationHedgesModLoaded(wood_blue_skies, block, item, leaves);
    	Furnitures.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
    	Stairs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
		Paths.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
		Doors.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood, woodDoor);
		Trapdoors.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);
		Windows.setRegistrationWoodModLoaded(wood_blue_skies, block, item, wood);

		Bridges.setRegistrationWoodModLoaded(wood_crystallized, block, item, glass);
    	Roofs.setRegistrationWoodModLoaded(wood_crystallized, block, item, glass);
    	Fences.setRegistrationHedgesModLoaded(wood_crystallized, block, item, leaves);

    	Bridges.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
    	Roofs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
    	Fences.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
		Fences.setRegistrationHedgesModLoaded(wood_premium_wood, block, item, leaves);
    	Furnitures.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
    	Stairs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
		Paths.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
		Doors.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood, woodDoor);
		Trapdoors.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);
		Windows.setRegistrationWoodModLoaded(wood_premium_wood, block, item, wood);

        modLoadingContext.getModEventBus().addListener(this::clientSetup);
        modLoadingContext.getModEventBus().addListener(this::commonSetup);
        modLoadingContext.getModEventBus().addListener(this::dataSetup);
        modLoadingContext.getModEventBus().addListener(this::tabSetup);
		MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Modding Legacy Mod Finish !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, wood_blue_skies, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(event, MODID, wood_blue_skies, RenderType.translucent(), ModType.ROOFS, ModType.BRIDGES);
        APIRenderTypes.initAllWood(event, MODID, wood_premium_wood, Registration.getAllModTypeWood());

        APIRenderTypes.initAllLeave(event, MODID, wood_blue_skies);
        APIRenderTypes.initAllLeave(event, MODID, wood_crystallized, RenderType.translucent());
        APIRenderTypes.initAllLeave(event, MODID, wood_blue_skies);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, wood_blue_skies);
            McwLootTables.addBlockAllWood(MODID, wood_premium_wood);

            McwLootTables.addBlock(MODID, wood_crystallized, McwBlocksIdBase.BRIDGES_WOOD_BLOCKS);
            McwLootTables.addBlock(MODID, wood_crystallized, McwBlocksIdBase.ROOFS_WOOD_BLOCKS);

            McwLootTables.addBlockHedges(MODID, wood_blue_skies);
            McwLootTables.addBlockHedges(MODID, wood_crystallized);
            McwLootTables.addBlockHedges(MODID, wood_premium_wood);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        McwBlockTags mcwBlockTags = new McwBlockTags(output, registries, MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
                addAllMcwTags(MODID, wood_blue_skies, wood_blue_skies);
                addAllMcwTags(MODID, wood_premium_wood, wood_premium_wood);

                mcwRoofsTags(MODID, wood_crystallized, List.of());
                mcwBridgesTagsWood(MODID, wood_crystallized);
                mcwFencesTags(MODID, List.of(), wood_crystallized, List.of());
            }
        };
        generator.addProvider(true, new Recipes(output));
        generator.addProvider(true, mcwBlockTags);
        generator.addProvider(true, new McwItemTags(output, registries, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
                addAllMcwTags(MODID, wood_blue_skies, wood_blue_skies);
                addAllMcwTags(MODID, wood_premium_wood, wood_premium_wood);

                mcwFencesTags(MODID, List.of(), wood_crystallized, List.of());
            }
        });
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        ModList modList = ModList.get();

        if(modList.isLoaded("blue_skies"))
        {
            APICreativeTab.initAllWood(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get(), Registration.getAllModTypeWood());
            APICreativeTab.initAllLeave(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get());
            APICreativeTab.initAllWood(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB.get(), ModType.ROOFS, ModType.BRIDGES);
            APICreativeTab.initAllLeave(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB.get());
        }

        if(modList.isLoaded("premium_wood"))
        {
            APICreativeTab.initAllWood(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB.get(), Registration.getAllModTypeWood());
            APICreativeTab.initAllLeave(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB.get());
        }
    }

	private static ItemStack getIcon()
	{
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
				Finder.findBlock(MODID, randomNaming()+"_roof"),
				Finder.findBlock(MODID, randomNaming()+"_picket_fence"),
				Finder.findBlock(MODID, randomNaming()+"_wardrobe"),
				Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
				Finder.findBlock(MODID, randomNaming()+"_blinds"),
				Finder.findBlock(MODID, randomNaming()+"_mystic_door"),
				Finder.findBlock(MODID, randomNaming()+"_barrel_trapdoor"),
				Finder.findBlock(MODID, randomNaming()+"_planks_path"),
				Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));

		prop.addType(BlockType.BRIDGES)
				.addType(BlockType.FENCES)
				.addType(BlockType.FURNITURES)
				.addType(BlockType.ROOFS)
				.addType(BlockType.STAIRS)
				.addType(BlockType.WINDOWS)
				.addType(BlockType.DOORS)
				.addType(BlockType.TRAPDOORS)
				.addType(BlockType.PATHS);
		return new ItemStack(prop.buildIcon(BlockType.BRIDGES, BlockType.FENCES, BlockType.FURNITURES, BlockType.ROOFS, BlockType.STAIRS
				, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS));
	}

	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("blue_skies") && ModList.get().isLoaded("premium_wood"))
		{
			int i = rand.nextInt(0, 1);

			switch(i)
			{
			case 0:
					return "pwood_purple_heart";
			case 1:
					return "bsky_bluebright";
			}
		}
		else
		{
			if(ModList.get().isLoaded("blue_skies"))
			{
				return "bsky_bluebright";
			}

			if(ModList.get().isLoaded("premium_wood"))
			{
				return "pwood_purple_heart";
			}
		}
		return "bsky_bluebright";
	}
}