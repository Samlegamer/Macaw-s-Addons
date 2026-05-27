package fr.samlegamer.mcwbiomesoplenty;

import com.mcwbridges.kikoz.init.BlockInit;
import com.mcwbridges.kikoz.util.FuelBlockItemWithInfo;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.RegistrationNeoForge;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.registry.RegistryUtils;
import fr.samlegamer.addonslib.tab.APICreativeTab;
import fr.samlegamer.addonslib.util.McwMod;
import fr.samlegamer.addonslib.util.ModListNeoForge;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.List;
import java.util.Map;
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

		List<String> woodClassic = List.of("dead", "fir", "mahogany", "palm", "redwood", "willow", "pine");
		List<String> leaveClassic = List.of("dead", "fir", "hellbark", "mahogany", "palm", "redwood", "umbran", "willow", "empyreal", "pine", "cypress", "flowering_oak", "rainbow_birch", "origin");

		Map<String, SoundType> mapWoodSoundCrimson = RegistryUtils.makeDefaultFromList(List.of("hellbark", "umbran", "empyreal"), SoundType.NETHER_WOOD);
		Map<String, SoundType> mapWoodSoundCherry = RegistryUtils.makeDefaultFromList(List.of("magic", "jacaranda", "maple"), SoundType.CHERRY_WOOD);
		Map<String, SoundType> mapLeaveSoundCherry = RegistryUtils.makeDefaultFromList(List.of("snowblossom", "orange_maple", "red_maple", "yellow_maple", "jacaranda", "magic"), SoundType.CHERRY_LEAVES);

		McwBOP.LOGGER.info("Macaw's Biomes O' Plenty Loading...");
		RegistrationNeoForge.init(bus, block, item, ct);

		McwRegistry.setRegistriesWood(woodClassic, block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesWood(mapWoodSoundCrimson, block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesWood(mapWoodSoundCherry, block, item, ModType.getAllModTypeWood());
		McwRegistry.setRegistriesLeave(leaveClassic, block, item);
		McwRegistry.setRegistriesLeave(mapLeaveSoundCherry, block, item);

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
		McwBOP.LOGGER.info("Macaw's Biomes O' Plenty Is Charged !");
    }

    @Override
    public void clientSetup(FMLClientSetupEvent event) {
        APIRenderTypes.initAllWood(event, McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
        APIRenderTypes.initAllLeave(event, McwBOP.MODID, McwBOP.LEAVES);
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            McwLootTables.LOOT_TABLE_UTILS.addBlockAllWood(McwBOP.MODID, McwBOP.WOOD);
            McwLootTables.LOOT_TABLE_UTILS.addBlockHedges(McwBOP.MODID, McwBOP.LEAVES);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        McwBlockTags mcwBlockTags = new McwBlockTags(output, registries, McwBOP.MODID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.@NotNull Provider provider) {
				addAllMcwTagsWood(McwBOP.MODID, McwBOP.WOOD, ModType.getAllModTypeWood());
				addAllMcwTagsLeave(McwBOP.MODID, McwBOP.LEAVES);
            }
        };

        generator.addProvider(true, new RecipesNeoForge(output, registries));
        generator.addProvider(true, mcwBlockTags);
        generator.addProvider(true, new McwItemTags(output, registries, mcwBlockTags.contentsGetter(), McwBOP.MODID, existingFileHelper) {
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