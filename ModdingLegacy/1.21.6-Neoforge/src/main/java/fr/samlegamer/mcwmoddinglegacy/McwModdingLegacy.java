package fr.samlegamer.mcwmoddinglegacy;

import fr.addonslib.api.data.McwBlocksIdBase;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.mapping.MappingMissing;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

@Mod(McwModdingLegacy.MODID)
public class McwModdingLegacy extends McwMod
{
	public static final String MODID = "mcwmoddinglegacy";
    private static final Logger LOGGER = LogManager.getLogger();

    private static final DeferredRegister.Blocks block = Registration.blocks(MODID);
    private static final DeferredRegister.Items item = Registration.items(MODID);
	public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwModdingLegacy.MODID);

    public static final List<String> wood_blue_skies = List.of("bsky_bluebright", "bsky_comet", "bsky_dusk", "bsky_frostbright", "bsky_lunar", "bsky_maple", "bsky_starlit");
    public static final List<String> wood_premium_wood = List.of("pwood_magic", "pwood_maple", "pwood_purple_heart", "pwood_silverbell", "pwood_tiger", "pwood_willow");
    public static final List<String> wood_crystallized = List.of("bsky_crystallized");

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWMODDINGLEGACY_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	.icon(McwModdingLegacy::getIcon).title(Component.translatable(McwModdingLegacy.MODID+".tab")).build());

	private static final MappingMissing.Bridges bridges_Bsky = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_blue_skies);
	private static final MappingMissing.Bridges bridges_pWood = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_premium_wood);
	private static final MappingMissing.Bridges bridges_glass = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_crystallized);

	public McwModdingLegacy(IEventBus bus)
    {
        super(bus);
        LOGGER.info("Macaw's Modding Legacy Mod Loading...");
		Registration.init(bus, block, item, ct);

		Map<String, SoundType> mapCrystallized = McwRegistry.makeDefaultFromList(wood_crystallized, SoundType.GLASS);
		McwRegistry.setRegistriesWood(wood_blue_skies, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(wood_blue_skies, block, item);
		McwRegistry.setRegistriesWood(mapCrystallized, block, item, ModType.BRIDGES, ModType.ROOFS);
		McwRegistry.setRegistriesLeave(mapCrystallized, block, item);
		McwRegistry.setRegistriesWood(wood_premium_wood, block, item, Registration.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(wood_premium_wood, block, item);

		bridges_Bsky.missingnoWoodBlock(block);
		bridges_pWood.missingnoWoodBlock(block);
		bridges_glass.missingnoWoodBlock(block);
		bridges_Bsky.missingnoWoodItem(item);
		bridges_pWood.missingnoWoodItem(item);
		bridges_glass.missingnoWoodItem(item);

		bus.addListener(this::clientSetup);
		bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
		bus.addListener(this::tabSetup);
        bus.addListener(this::addBlockEntityTypeAddBlocks);
    	LOGGER.info("Macaw's Modding Legacy Mod Finish !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, MODID, wood_blue_skies, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(event, MODID, wood_blue_skies, ChunkSectionLayer.TRANSLUCENT, ModType.ROOFS, ModType.BRIDGES);
        APIRenderTypes.initAllWood(event, MODID, wood_premium_wood, Registration.getAllModTypeWood());

        APIRenderTypes.initAllLeave(event, MODID, wood_blue_skies);
        APIRenderTypes.initAllLeave(event, MODID, wood_crystallized, ChunkSectionLayer.TRANSLUCENT);
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

    private void addBlockEntityTypeAddBlocks(BlockEntityTypeAddBlocksEvent event)
    {
        McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, wood_blue_skies);
		McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, wood_premium_wood);
    }

    @Override
    public void dataSetup(GatherDataEvent.Client client) {
        DataGenerator generator = client.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = client.getLookupProvider();

        generator.addProvider(true, new Recipes.Runner(output, registries));
        generator.addProvider(true, new McwBlockTags(output, registries, MODID) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
				addAllMcwTagsWood(MODID, wood_blue_skies, Registration.getAllModTypeWood());
				addAllMcwTagsLeave(MODID, wood_blue_skies);

				addAllMcwTagsWood(MODID, wood_premium_wood, Registration.getAllModTypeWood());
				addAllMcwTagsLeave(MODID, wood_premium_wood);

				addAllMcwTagsWood(MODID, wood_crystallized, ModType.BRIDGES, ModType.ROOFS);
				addAllMcwTagsLeave(MODID, wood_crystallized);
            }
        });
        generator.addProvider(true, new McwItemTags(output, registries, MODID) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
				addAllMcwTagsWood(MODID, wood_blue_skies, Registration.getAllModTypeWood());
				addAllMcwTagsLeave(MODID, wood_blue_skies);

				addAllMcwTagsWood(MODID, wood_premium_wood, Registration.getAllModTypeWood());
				addAllMcwTagsLeave(MODID, wood_premium_wood);

				addAllMcwTagsWood(MODID, wood_crystallized, ModType.BRIDGES, ModType.ROOFS);
				addAllMcwTagsLeave(MODID, wood_crystallized);
            }
        });
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        if(ModList.get().isLoaded("blue_skies"))
        {
            APICreativeTab.initAllWood(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get(), Registration.getAllModTypeWood());
            APICreativeTab.initAllLeave(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get());
            APICreativeTab.initAllWood(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB.get(), ModType.ROOFS, ModType.BRIDGES);
            APICreativeTab.initAllLeave(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB.get());
        }
        if(ModList.get().isLoaded("premium_wood"))
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

		prop.addType(ModType.BRIDGES)
				.addType(ModType.FENCES)
				.addType(ModType.FURNITURES)
				.addType(ModType.ROOFS)
				.addType(ModType.STAIRS)
				.addType(ModType.WINDOWS)
				.addType(ModType.DOORS)
				.addType(ModType.TRAPDOORS)
				.addType(ModType.PATHS);
		return new ItemStack(prop.buildIcon(ModType.BRIDGES, ModType.FENCES, ModType.FURNITURES, ModType.ROOFS, ModType.STAIRS
				, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS));
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