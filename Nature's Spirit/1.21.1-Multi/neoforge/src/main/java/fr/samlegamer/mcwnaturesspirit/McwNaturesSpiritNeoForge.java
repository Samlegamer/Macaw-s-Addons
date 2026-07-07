package fr.samlegamer.mcwnaturesspirit;

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
import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.concurrent.CompletableFuture;

@Mod(McwNaturesSpirit.MODID)
public class McwNaturesSpiritNeoForge extends McwMod {

    public static final DeferredRegister.Blocks block = RegistrationNeoForge.blocks(McwNaturesSpirit.MODID);
    public static final DeferredRegister.Items item = RegistrationNeoForge.items(McwNaturesSpirit.MODID);
    public static final DeferredRegister<CreativeModeTab> ct = RegistrationNeoForge.creativeModeTab(McwNaturesSpirit.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWNATURESSPIRIT_TAB = ct.register("tab", () -> CreativeModeTab.builder()
            .icon(() -> McwNaturesSpirit.icon(new ModListNeoForge())).title(Component.translatable(McwNaturesSpirit.MODID+".tab")).build());

    public McwNaturesSpiritNeoForge(IEventBus bus)
    {
        super(bus);
        McwNaturesSpirit.startLog();
        RegistrationNeoForge.init(bus, block, item, ct);
        McwRegistry.setRegistriesWood(McwNaturesSpirit.WOOD, block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(McwNaturesSpirit.LEAVES, block, item);
        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
        bus.addListener(this::addFurnitureStorage);
        McwNaturesSpirit.chargedLog();
    }

    private void addFurnitureStorage(BlockEntityTypeAddBlocksEvent event)
    {
        McwCommon.addCompatibleBlocksToFurnitureStorage(event, McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD);
    }

    @Override
    public void clientSetup(FMLClientSetupEvent fmlClientSetupEvent) {
        APIRenderTypes.initAllWood(fmlClientSetupEvent, McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(fmlClientSetupEvent, McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if (gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(packOutput, registries, McwNaturesSpirit.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NonNull Provider provider) {
                    addAllMcwTagsWood(McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES);
                }
            };
            generator.addProvider(true, new RecipesNeoForge(packOutput, registries));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(packOutput, registries, mcwBlockTags.contentsGetter(), McwNaturesSpirit.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NonNull Provider provider) {
                    addAllMcwTagsWood(McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, McwNaturesSpirit.MODID, McwNaturesSpirit.WOOD, MCWNATURESSPIRIT_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, McwNaturesSpirit.MODID, McwNaturesSpirit.LEAVES, MCWNATURESSPIRIT_TAB.get());
    }
}