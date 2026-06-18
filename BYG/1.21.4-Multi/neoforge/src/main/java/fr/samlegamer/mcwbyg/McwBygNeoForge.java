package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationNeoForge;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.util.ModListNeoForge;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import java.util.concurrent.CompletableFuture;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

@Mod(McwByg.MODID)
public class McwBygNeoForge extends McwMod
{
    private static final DeferredRegister.Blocks block = RegistrationNeoForge.blocks(McwByg.MODID);
    private static final DeferredRegister.Items item = RegistrationNeoForge.items(McwByg.MODID);
    public static final DeferredRegister<CreativeModeTab> ct = RegistrationNeoForge.creativeModeTab(McwByg.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWBYG_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(() -> McwByg.getIcon(new ModListNeoForge())).title(Component.translatable(McwByg.MODID+".tab")).build());

	public McwBygNeoForge(IEventBus bus)
    {
        super(bus);

		McwByg.startLog();
		RegistrationNeoForge.init(bus, block, item, ct);

		McwRegistry.setRegistriesWood(McwByg.WOOD, block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(McwByg.leavesClassic(), block, item);
		McwRegistry.setRegistriesLeave(McwByg.mapLeaveSoundCherry(), block, item);
		McwRegistry.setRegistriesStone(McwByg.STONE, block, item, ModType.getAllModTypeStone());

		McwByg.LOGGER.info("Converting Loading...");
		Mapping.fences.leavesAdding(McwByg.LEAVES);
		Mapping.bridges.missingnoWoodBlock(block);
		Mapping.bridges.missingnoStoneBlock(block, true);
		Mapping.furnitures.missingnoWoodBlock(block);
		Mapping.fences.missingnoWoodBlock(block);
		Mapping.fences.missingnoStoneBlock(block);
		Mapping.roofs.missingnoWoodBlock(block);

		Mapping.fences.leavesAdding(McwByg.LEAVES);
		Mapping.bridges.missingnoWoodItem(item);
		Mapping.bridges.missingnoStoneItem(item, true);
		Mapping.furnitures.missingnoWoodItem(item);
		Mapping.fences.missingnoWoodItem(item);
		Mapping.fences.missingnoStoneItem(item);
		Mapping.roofs.missingnoWoodItem(item);
		McwByg.LOGGER.info("Converting Finish !");

		bus.addListener(this::addFurnitures);
		bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
		McwByg.finishLog();
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, McwByg.MODID, McwByg.LEAVES);
        APIRenderTypes.initAllStone(event, McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(McwByg.MODID, McwByg.WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(McwByg.MODID, McwByg.LEAVES);
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllStone(McwByg.MODID, McwByg.STONE);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent.Client gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();

        McwBlockTags mcwBlockTags = new McwBlockTags(output, registries, McwByg.MODID) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
                addAllMcwTagsWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
                addAllMcwTagsStone(McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());
                addAllMcwTagsLeave(McwByg.MODID, McwByg.LEAVES);
            }
        };

        generator.addProvider(true, new RecipesNeoForge.Runner(output, registries));
        generator.addProvider(true, mcwBlockTags);
        generator.addProvider(true, new McwItemTags(output, registries, mcwBlockTags.contentsGetter(), McwByg.MODID) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
                addAllMcwTagsWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
                addAllMcwTagsStone(McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());
                addAllMcwTagsLeave(McwByg.MODID, McwByg.LEAVES);
            }
        });
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, McwByg.MODID, McwByg.WOOD, MCWBYG_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, McwByg.MODID, McwByg.LEAVES, MCWBYG_TAB.get());
        APICreativeTab.initAllStone(event, McwByg.MODID, McwByg.STONE, MCWBYG_TAB.get(), ModType.getAllModTypeStone());
    }

    private void addFurnitures(BlockEntityTypeAddBlocksEvent event)
    {
		McwCommon.addCompatibleBlocksToFurnitureStorage(event, McwByg.MODID, McwByg.WOOD);
    }
}