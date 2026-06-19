package fr.samlegamer.mcwbiomesoplenty;

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
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;

@Mod(McwBOP.MODID)
public class McwBOPForge extends McwMod
{
    private static final DeferredRegister<Block> block = RegistrationForge.blocks(McwBOP.MODID);
    private static final DeferredRegister<Item> item = RegistrationForge.items(McwBOP.MODID);
    public static final DeferredRegister<CreativeModeTab> ct = RegistrationForge.creativeModeTab(McwBOP.MODID);

	public static final RegistryObject<CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(() -> McwBOP.getIcon(new ModListForge())).title(Component.translatable(McwBOP.MODID+".tab")).build());

    public McwBOPForge(FMLJavaModLoadingContext context)
    {
        super(context);

        McwBOP.startLog();
        RegistrationForge.init(context, block, item, ct);

		McwRegistry.setRegistriesWood(McwBOP.woodClassic(), block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesWood(McwBOP.mapWoodSoundCrimson(), block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesWood(McwBOP.mapWoodSoundCherry(), block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(McwBOP.leaveClassic(), block, item);
		McwRegistry.setRegistriesLeave(McwBOP.mapLeaveSoundCherry(), block, item);

        context.getModEventBus().addListener(this::clientSetup);
        context.getModEventBus().addListener(this::commonSetup);
        context.getModEventBus().addListener(this::dataSetup);
        context.getModEventBus().addListener(this::tabSetup);
		MinecraftForge.EVENT_BUS.register(MappingForge.class);
        McwBOP.finishLog();
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, McwBOP.MODID, McwBOP.LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(McwBOP.MODID, McwBOP.WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(McwBOP.MODID, McwBOP.LEAVES);
            McwCommon.addCompatibleBlocksToFurnitureStorage(event, McwBOP.MODID, McwBOP.WOOD);
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
            McwBlockTags mcwBlockTags = new McwBlockTags(packOutput, registries, McwBOP.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
					addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
					addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
                }
            };
            generator.addProvider(true, new RecipesForge.Runner(packOutput, registries));
            generator.addProvider(true, mcwBlockTags);
            generator.addProvider(true, new McwItemTags(packOutput, registries, mcwBlockTags.contentsGetter(), McwBOP.MODID, existingFileHelper) {
                @Override
                protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
					addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
					addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
                }
            });
        }
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, McwBOP.MODID, McwBOP.WOOD, MCWBOP_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, McwBOP.MODID, McwBOP.LEAVES, MCWBOP_TAB.get());
    }
}