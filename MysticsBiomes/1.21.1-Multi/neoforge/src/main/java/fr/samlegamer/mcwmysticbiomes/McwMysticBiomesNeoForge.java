package fr.samlegamer.mcwmysticbiomes;

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
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.checkerframework.checker.nullness.qual.NonNull;

@Mod(McwMysticBiomes.MODID)
public class McwMysticBiomesNeoForge extends McwMod
{
    private static final DeferredRegister.Blocks block = RegistrationNeoForge.blocks(McwMysticBiomes.MODID);
    private static final DeferredRegister.Items item = RegistrationNeoForge.items(McwMysticBiomes.MODID);
    public static final DeferredRegister<CreativeModeTab> ct = RegistrationNeoForge.creativeModeTab(McwMysticBiomes.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWMYSTICBIOMES_TAB = ct.register("tab", () -> CreativeModeTab.builder()
            .icon(() -> McwMysticBiomes.icon(new ModListNeoForge())).title(Component.translatable(McwMysticBiomes.MODID+".tab")).build());

    public McwMysticBiomesNeoForge(IEventBus bus)
    {
        super(bus);
        McwMysticBiomes.startLog();
        RegistrationNeoForge.init(bus, block, item, ct);
        McwRegistry.setRegistriesWood(McwMysticBiomes.getWoodSpecialSound(), block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesWood(McwMysticBiomes.getWoodVanillaSound(), block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(McwMysticBiomes.getLeavesSpecialSound(), block, item);
        McwRegistry.setRegistriesLeave(McwMysticBiomes.getLeavesVanillaSound(), block, item);
        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
        bus.addListener(this::furnitureStorageSetup);
        McwMysticBiomes.chargedLog();
    }

    private void furnitureStorageSetup(BlockEntityTypeAddBlocksEvent event)
    {
        McwCommon.addCompatibleBlocksToFurnitureStorage(event, McwMysticBiomes.MODID, McwMysticBiomes.WOOD);
    }

    @Override
    public void clientSetup(FMLClientSetupEvent fmlClientSetupEvent) {
        APIRenderTypes.initAllWood(fmlClientSetupEvent, McwMysticBiomes.MODID, McwMysticBiomes.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(fmlClientSetupEvent, McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        McwBlockTags mcwBlockTags = new McwBlockTags(packOutput, registries, McwMysticBiomes.MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NonNull Provider provider) {
                addAllMcwTagsWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD, ModType.getAllModTypeWood());
                addAllMcwTagsLeave(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
            }
        };
        generator.addProvider(true, new RecipesNeoForge(packOutput, registries));
        generator.addProvider(true, mcwBlockTags);
        generator.addProvider(true, new McwItemTags(packOutput, registries, mcwBlockTags.contentsGetter(), McwMysticBiomes.MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NonNull Provider provider) {
                addAllMcwTagsWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD, ModType.getAllModTypeWood());
                addAllMcwTagsLeave(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
            }
        });
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, McwMysticBiomes.MODID, McwMysticBiomes.WOOD, MCWMYSTICBIOMES_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, McwMysticBiomes.MODID, McwMysticBiomes.LEAVES, MCWMYSTICBIOMES_TAB.get());
    }
}