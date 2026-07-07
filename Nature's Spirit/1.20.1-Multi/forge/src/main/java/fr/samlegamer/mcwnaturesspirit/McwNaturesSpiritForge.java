package fr.samlegamer.mcwnaturesspirit;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationForge;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.util.ModListForge;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.concurrent.CompletableFuture;

@Mod(McwNaturesSpirit.MODID)
public class McwNaturesSpiritForge extends McwMod {

    public static final DeferredRegister<Block> block = RegistrationForge.blocks(McwNaturesSpirit.MODID);
    public static final DeferredRegister<Item> item = RegistrationForge.items(McwNaturesSpirit.MODID);
    public static final DeferredRegister<CreativeModeTab> ct = RegistrationForge.creativeModeTab(McwNaturesSpirit.MODID);

    public static final RegistryObject<CreativeModeTab> MCWNATURESSPIRIT_TAB = ct.register("tab", () -> CreativeModeTab.builder()
            .icon(() -> McwNaturesSpirit.icon(new ModListForge())).title(Component.translatable(McwNaturesSpirit.MODID+".tab")).build());

    public McwNaturesSpiritForge(FMLJavaModLoadingContext javaModLoadingContext)
    {
        super(javaModLoadingContext);
        McwNaturesSpirit.startLog();
        RegistrationForge.init(block, item, ct);
        McwRegistry.setRegistriesWood(McwNaturesSpirit.WOOD, block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(McwNaturesSpirit.LEAVES, block, item);
        IEventBus bus = javaModLoadingContext.getModEventBus();
        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
        McwNaturesSpirit.chargedLog();
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
            generator.addProvider(true, new RecipesForge(packOutput));
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