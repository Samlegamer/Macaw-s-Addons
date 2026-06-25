package fr.samlegamer.mcwmysticbiomes;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationForge;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwMod;
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
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.concurrent.CompletableFuture;
import net.minecraftforge.registries.RegistryObject;

@Mod(McwMysticBiomes.MODID)
public class McwMysticBiomesForge extends McwMod
{
    private static final DeferredRegister<Block> block = RegistrationForge.blocks(McwMysticBiomes.MODID);
    private static final DeferredRegister<Item> item = RegistrationForge.items(McwMysticBiomes.MODID);
    public static final DeferredRegister<CreativeModeTab> ct = RegistrationForge.creativeModeTab(McwMysticBiomes.MODID);

    public static final RegistryObject<CreativeModeTab> MCWMYSTICBIOMES_TAB = ct.register("tab", () -> CreativeModeTab.builder()
            .icon(McwMysticBiomes::icon).title(Component.translatable(McwMysticBiomes.MODID+".tab")).build());

    public McwMysticBiomesForge()
    {
        super(FMLJavaModLoadingContext.get());
        McwMysticBiomes.startLog();
        RegistrationForge.init(block, item, ct);
        McwRegistry.setRegistriesWood(McwMysticBiomes.WOOD, block, item, ModType.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(McwMysticBiomes.getLeavesSpecialSound(), block, item);
        McwRegistry.setRegistriesLeave(McwMysticBiomes.getLeavesVanillaSound(), block, item);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::dataSetup);
        McwMysticBiomes.chargedLog();
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

        if (gatherDataEvent.includeServer()) {
            McwBlockTags mcwBlockTags = new McwBlockTags(packOutput, registries, McwMysticBiomes.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.Provider provider) {
                    addAllMcwTagsWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
                }
            };
            generator.addProvider(true, new RecipesForge(packOutput));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(packOutput, registries, mcwBlockTags.contentsGetter(), McwMysticBiomes.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.Provider provider) {
                    addAllMcwTagsWood(McwMysticBiomes.MODID, McwMysticBiomes.WOOD, ModType.getAllModTypeWood());
                    addAllMcwTagsLeave(McwMysticBiomes.MODID, McwMysticBiomes.LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, McwMysticBiomes.MODID, McwMysticBiomes.WOOD, MCWMYSTICBIOMES_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, McwMysticBiomes.MODID, McwMysticBiomes.LEAVES, MCWMYSTICBIOMES_TAB.get());
    }
}