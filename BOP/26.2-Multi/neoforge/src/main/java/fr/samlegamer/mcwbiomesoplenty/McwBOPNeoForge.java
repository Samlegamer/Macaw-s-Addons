package fr.samlegamer.mcwbiomesoplenty;

import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationNeoForge;
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
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;

@Mod(McwBOP.MODID)
public class McwBOPNeoForge extends McwMod
{
    protected static final DeferredRegister.Blocks block = RegistrationNeoForge.blocks(McwBOP.MODID);
	protected static final DeferredRegister.Items item = RegistrationNeoForge.items(McwBOP.MODID);
	protected static final DeferredRegister<CreativeModeTab> ct = RegistrationNeoForge.creativeModeTab(McwBOP.MODID);

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWBOP_TAB = ct.register("tab", () -> CreativeModeTab.builder()
			.title(Component.translatable(McwBOP.MODID + "." + "tab")).icon(() -> McwBOP.getIcon(new ModListNeoForge())).build());

	public McwBOPNeoForge(IEventBus bus)
    {
        super(bus);
		McwBOP.startLog();
		RegistrationNeoForge.init(bus, block, item, ct);

		McwRegistry.setRegistriesWood(McwBOP.woodClassic(), block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesWood(McwBOP.mapWoodSoundCrimson(), block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesWood(McwBOP.mapWoodSoundCherry(), block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(McwBOP.leaveClassic(), block, item);
		McwRegistry.setRegistriesLeave(McwBOP.mapLeaveSoundCherry(), block, item);

		McwBOP.LOGGER.info("Start convert blocks");
		Mapping.fences.leavesAdding(McwBOP.LEAVES);
		Mapping.bridges.missingnoWoodBlock(block);
		Mapping.furnitures.missingnoWoodBlock(block);
		Mapping.fences.missingnoWoodBlock(block);
		Mapping.roofs.missingnoWoodBlock(block);
		McwBOP.LOGGER.info("Finish convert blocks");
		McwBOP.LOGGER.info("Start convert items");
		Mapping.fences.leavesAdding(McwBOP.LEAVES);
		Mapping.bridges.missingnoWoodItem(item);
		Mapping.furnitures.missingnoWoodItem(item);
		Mapping.fences.missingnoWoodItem(item);
		Mapping.roofs.missingnoWoodItem(item);
		McwBOP.LOGGER.info("Finish convert items");

        bus.addListener(this::clientSetup);
        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
        bus.addListener(this::tabSetup);
        bus.addListener(this::addFurnitures);
		McwBOP.finishLog();
    }

    private void addFurnitures(BlockEntityTypeAddBlocksEvent event)
    {
        McwCommon.addCompatibleBlocksToFurnitureStorage(event, McwBOP.MODID, McwBOP.WOOD);
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(McwBOP.MODID, McwBOP.WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(McwBOP.MODID, McwBOP.LEAVES);
        });
    }

    public void dataSetup(GatherDataEvent.Client gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();

        McwBlockTags mcwBlockTags = new McwBlockTags(output, registries, McwBOP.MODID) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
				addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
				addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
            }
        };

        generator.addProvider(true, new RecipesNeoForge.Runner(output, registries));
        generator.addProvider(true, mcwBlockTags);
        generator.addProvider(true, new McwItemTags(output, registries, McwBOP.MODID) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
				addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
				addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
            }
        });
    }

    @Override
    public void tabSetup(BuildCreativeModeTabContentsEvent event) {
        APICreativeTab.initAllWood(event, McwBOP.MODID, McwBOP.WOOD, MCWBOP_TAB.get(), ModType.getAllModTypeWood());
        APICreativeTab.initAllLeave(event, McwBOP.MODID, McwBOP.LEAVES, MCWBOP_TAB.get());
    }
}