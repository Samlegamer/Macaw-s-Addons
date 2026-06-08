package mcwregionsunexplored;

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
import fr.samlegamer.mcwregionsunexplored.McwRegionsUnexplored;
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
import org.jetbrains.annotations.NotNull;
import java.util.concurrent.CompletableFuture;

@Mod(McwRegionsUnexplored.MODID)
public class McwRegionsUnexploredNeoForge extends McwMod
{
    private static final DeferredRegister.Blocks block = RegistrationNeoForge.blocks(McwRegionsUnexplored.MODID);
    private static final DeferredRegister.Items item = RegistrationNeoForge.items(McwRegionsUnexplored.MODID);
    private static final DeferredRegister<CreativeModeTab> tabs = RegistrationNeoForge.creativeModeTab(McwRegionsUnexplored.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWREGIONUNEXPLORED_TAB = tabs.register("tab", () -> CreativeModeTab.builder()
            .icon(() -> McwRegionsUnexplored.makeIcon(new ModListNeoForge())).title(Component.translatable(McwRegionsUnexplored.MODID+".tab")).build());

    public McwRegionsUnexploredNeoForge(IEventBus bus)
    {
        super(bus);
        McwRegionsUnexplored.startLog();
        RegistrationNeoForge.init(bus, block, item, tabs);
        McwRegistry.setRegistriesWood(McwRegionsUnexplored.WOOD, block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(McwRegionsUnexplored.LEAVES, block, item);
        bus.addListener(this::clientSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
        bus.addListener(this::blockEntity);
        bus.addListener(this::commonSetup);

        McwRegionsUnexplored.finishLog();
    }

    @Override
    public void clientSetup(FMLClientSetupEvent fmlClientSetupEvent) {
        APIRenderTypes.initAllWood(fmlClientSetupEvent, McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(fmlClientSetupEvent, McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
    }

    private void blockEntity(BlockEntityTypeAddBlocksEvent event)
    {
        McwCommon.addCompatibleBlocksToFurnitureStorage(event, McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = gatherDataEvent.getLookupProvider();

        if (gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(output, lookupProvider, McwRegionsUnexplored.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTagsWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
                }
            };
            generator.addProvider(true, new RecipesNeoForge(output, lookupProvider));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(output, lookupProvider, mcwBlockTags.contentsGetter(), McwRegionsUnexplored.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
                    addAllMcwTagsWood(McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, McwRegionsUnexplored.MODID, McwRegionsUnexplored.WOOD, MCWREGIONUNEXPLORED_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, McwRegionsUnexplored.MODID, McwRegionsUnexplored.LEAVES, MCWREGIONUNEXPLORED_TAB.get());
    }
}