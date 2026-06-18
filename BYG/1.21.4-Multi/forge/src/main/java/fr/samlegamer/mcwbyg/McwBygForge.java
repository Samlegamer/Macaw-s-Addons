package fr.samlegamer.mcwbyg;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationForge;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwCommon;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.util.ModListForge;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
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
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;

@Mod(McwByg.MODID)
public class McwBygForge extends McwMod
{
    private static final DeferredRegister<Block> block = RegistrationForge.blocks(McwByg.MODID);
    private static final DeferredRegister<Item> item = RegistrationForge.items(McwByg.MODID);
    public static final DeferredRegister<CreativeModeTab> ct = RegistrationForge.creativeModeTab(McwByg.MODID);

	public static final RegistryObject<CreativeModeTab> MCWBYG_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(() -> McwByg.getIcon(new ModListForge())).title(Component.translatable(McwByg.MODID+".tab")).build());

    public McwBygForge(final FMLJavaModLoadingContext context)
    {
        super(context);
        IEventBus bus = context.getModEventBus();

		McwByg.startLog();
		RegistrationForge.init(context, block, item, ct);

		McwRegistry.setRegistriesWood(McwByg.WOOD, block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(McwByg.leavesClassic(), block, item);
		McwRegistry.setRegistriesLeave(McwByg.mapLeaveSoundCherry(), block, item);
		McwRegistry.setRegistriesStone(McwByg.STONE, block, item, ModType.getAllModTypeStone());

		bus.addListener(this::tabSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::dataSetup);
		MinecraftForge.EVENT_BUS.register(MappingForge.class);
		McwByg.finishLog();
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, McwByg.MODID, McwByg.LEAVES);
        APIRenderTypes.initAllStone(event, McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(McwByg.MODID, McwByg.WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(McwByg.MODID, McwByg.LEAVES);
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllStone(McwByg.MODID, McwByg.STONE);
			McwCommon.addCompatibleBlocksToFurnitureStorage(event, McwByg.MODID, McwByg.WOOD);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(packOutput, registries, McwByg.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
					addAllMcwTagsWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
					addAllMcwTagsStone(McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());
					addAllMcwTagsLeave(McwByg.MODID, McwByg.LEAVES);
                }
            };
            generator.addProvider(true, new RecipesForge.Runner(packOutput, registries));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(packOutput, registries, mcwBlockTags.contentsGetter(), McwByg.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
					addAllMcwTagsWood(McwByg.MODID, McwByg.WOOD, ModType.getAllModTypeWood());
					addAllMcwTagsStone(McwByg.MODID, McwByg.STONE, ModType.getAllModTypeStone());
					addAllMcwTagsLeave(McwByg.MODID, McwByg.LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, McwByg.MODID, McwByg.WOOD, MCWBYG_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, McwByg.MODID, McwByg.LEAVES, MCWBYG_TAB.get());
        APICreativeTab.initAllStone(event, McwByg.MODID, McwByg.STONE, MCWBYG_TAB.get(), ModType.getAllModTypeStone());
    }
}