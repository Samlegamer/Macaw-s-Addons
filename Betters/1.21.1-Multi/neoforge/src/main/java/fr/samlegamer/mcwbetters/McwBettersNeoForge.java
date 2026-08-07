package fr.samlegamer.mcwbetters;

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
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.concurrent.CompletableFuture;

import static fr.samlegamer.mcwbetters.McwBetters.*;

@Mod(McwBetters.MODID)
public class McwBettersNeoForge extends McwMod
{
    private static final DeferredRegister.Blocks block = RegistrationNeoForge.blocks(MODID);
    private static final DeferredRegister.Items item = RegistrationNeoForge.items(MODID);
    private static final DeferredRegister<CreativeModeTab> tab = RegistrationNeoForge.creativeModeTab(MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWBETTERS_TAB = tab.register("tab", () -> CreativeModeTab.builder()
        .icon(() -> McwBetters.icon(new ModListNeoForge())).title(Component.translatable(McwBetters.MODID+".tab")).build());

    public McwBettersNeoForge(IEventBus bus)
    {
        super(bus);
        McwBetters.startLog();
        RegistrationNeoForge.init(bus, block, item, tab);

        McwRegistry.setRegistriesWood(WOOD_BETTER_END, block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVE_BETTER_END, block, item);

        McwRegistry.setRegistriesWood(WOOD_BETTER_NETHER, block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(LEAVE_BETTER_NETHER, block, item);

        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
        bus.addListener(this::addToFurnitureStorage);
        McwBetters.finishLog();
    }

    private void addToFurnitureStorage(BlockEntityTypeAddBlocksEvent event) {
        McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD_BETTER_END);
        McwCommon.addCompatibleBlocksToFurnitureStorage(event, MODID, WOOD_BETTER_NETHER.keySet().stream().toList());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, WOOD_BETTER_END);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(MODID, LEAVE_BETTER_END);

            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(MODID, WOOD_BETTER_NETHER.keySet().stream().toList());
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(MODID, LEAVE_BETTER_NETHER);
        });
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, MODID, WOOD_BETTER_END, MCWBETTERS_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVE_BETTER_END, MCWBETTERS_TAB.get());
        APICreativeTab.initAllWood(event, MODID, WOOD_BETTER_NETHER.keySet().stream().toList(), MCWBETTERS_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, MODID, LEAVE_BETTER_NETHER, MCWBETTERS_TAB.get());

    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent)
    {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(packOutput, registries, MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.Provider provider) {
                    addAllMcwTagsWood(MODID, WOOD_BETTER_END, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVE_BETTER_END);

                    addAllMcwTagsWood(MODID, WOOD_BETTER_NETHER.keySet().stream().toList(), ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVE_BETTER_NETHER);
                }
            };
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(packOutput, registries, mcwBlockTags.contentsGetter(), MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.Provider provider) {
                    addAllMcwTagsWood(MODID, WOOD_BETTER_END, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVE_BETTER_END);

                    addAllMcwTagsWood(MODID, WOOD_BETTER_NETHER.keySet().stream().toList(), ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, LEAVE_BETTER_NETHER);
                }
            });
            generator.addProvider(true, new RecipesNeoForge(packOutput, registries));
        }
    }

    @Override
    public void clientSetup(FMLClientSetupEvent e)
    {
		APIRenderTypes.initAllWood(e, MODID, WOOD_BETTER_END, ModType.getAllModTypeWood());
		APIRenderTypes.initAllLeave(e, MODID, LEAVE_BETTER_END);

        APIRenderTypes.initAllWood(e, MODID, WOOD_BETTER_NETHER.keySet().stream().toList(), ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(e, MODID, LEAVE_BETTER_NETHER);
    }
}