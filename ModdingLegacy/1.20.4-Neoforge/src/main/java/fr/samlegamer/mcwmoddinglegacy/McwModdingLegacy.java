package fr.samlegamer.mcwmoddinglegacy;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import java.util.List;
import java.util.Random;

@Mod(McwModdingLegacy.MODID)
public class McwModdingLegacy
{
	public static final String MODID = "mcwmoddinglegacy";
    private static final Logger LOGGER = LogManager.getLogger();

    private static final DeferredRegister.Blocks block = Registration.blocks(MODID);
    private static final DeferredRegister.Items item = DeferredRegister.createItems(MODID);
	public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(McwModdingLegacy.MODID);

    public static final List<String> wood_blue_skies = List.of("bsky_bluebright", "bsky_comet", "bsky_dusk", "bsky_frostbright", "bsky_lunar", "bsky_maple", "bsky_starlit");
    public static final List<String> wood_premium_wood = List.of("pwood_magic", "pwood_maple", "pwood_purple_heart", "pwood_silverbell", "pwood_tiger", "pwood_willow");
    public static final List<String> wood_crystallized = List.of("bsky_crystallized");

	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MCWMODDINGLEGACY_TAB = ct.register("tab", () -> CreativeModeTab.builder()
			.icon(() -> { return new ItemStack(getIcon()); }).title(Component.translatable(McwModdingLegacy.MODID+".tab")).build());

	private static final MappingMissing.Bridges bridges_Bsky = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_blue_skies);
	private static final MappingMissing.Bridges bridges_pWood = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_premium_wood);
	private static final MappingMissing.Bridges bridges_glass = new MappingMissing.Bridges("mcwbridgesmoddinglegacy", McwModdingLegacy.MODID, McwModdingLegacy.wood_crystallized);

	public McwModdingLegacy(IEventBus bus)
    {
    	LOGGER.info("Macaw's Modding Legacy Mod Loading...");
    	Registration.init(bus, block, item, ct);

    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES);
    	final BlockBehaviour.Properties glass = BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.GLASS);
    	
    	Bridges.setRegistrationWoodModLoaded(wood_blue_skies, block, item, null, "blue_skies", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, null, "blue_skies", wood);
    	Fences.setRegistrationWoodModLoaded(wood_blue_skies, block, item, null, "blue_skies", wood);
    	Furnitures.setRegistrationWoodModLoaded(wood_blue_skies, block, item, null, "blue_skies");
    	Stairs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, null, "blue_skies", wood);
    	Fences.setRegistrationHedgesModLoaded(wood_blue_skies, block, item, null, "blue_skies", leaves);
    	
    	Bridges.setRegistrationWoodModLoaded(wood_crystallized, block, item, null, "blue_skies", glass);
    	Roofs.setRegistrationWoodModLoaded(wood_crystallized, block, item, null, "blue_skies", glass);
    	Fences.setRegistrationHedgesModLoaded(wood_crystallized, block, item, null, "blue_skies", leaves);

    	Bridges.setRegistrationWoodModLoaded(wood_premium_wood, block, item, null, "premium_wood", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, null, "premium_wood", wood);
    	Fences.setRegistrationWoodModLoaded(wood_premium_wood, block, item, null, "premium_wood", wood);
    	Furnitures.setRegistrationWoodModLoaded(wood_premium_wood, block, item, null, "premium_wood");
    	Stairs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, null, "premium_wood", wood);
    	Fences.setRegistrationHedgesModLoaded(wood_premium_wood, block, item, null, "premium_wood", leaves);

		bridges_Bsky.missingnoWoodBlock(block);
		bridges_pWood.missingnoWoodBlock(block);
		bridges_glass.missingnoWoodBlock(block);
		bridges_Bsky.missingnoWoodItem(item);
		bridges_pWood.missingnoWoodItem(item);
		bridges_glass.missingnoWoodItem(item);

		bus.addListener(this::addTotab);
    	LOGGER.info("Macaw's Modding Legacy Mod Finish !");
    }

	private static Block getIcon()
	{
		NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(Finder.findBlock(MODID, randomNaming()+"_roof"), Finder.findBlock(MODID, randomNaming()+"_picket_fence"), Finder.findBlock(MODID, randomNaming()+"_wardrobe"),
				Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));

		prop.addType(BlockType.BRIDGES).addType(BlockType.FENCES).addType(BlockType.FURNITURES).addType(BlockType.ROOFS).addType(BlockType.STAIRS);
		return prop.buildIcon(BlockType.BRIDGES, BlockType.FENCES, BlockType.FURNITURES, BlockType.ROOFS, BlockType.STAIRS);
	}

	private void addTotab(BuildCreativeModeTabContentsEvent event)
	{
		if(ModList.get().isLoaded("blue_skies"))
		{
			Bridges.addToTab(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get());
			Roofs.addToTab(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get());
			Fences.addToTab(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get());
			Furnitures.addToTab(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get());
			Stairs.addToTab(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get());
			Fences.addToTabHedge(event, MODID, wood_blue_skies, MCWMODDINGLEGACY_TAB.get());

			Bridges.addToTab(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB.get());
			Roofs.addToTab(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB.get());
			Fences.addToTabHedge(event, MODID, wood_crystallized, MCWMODDINGLEGACY_TAB.get());
		}
		if(ModList.get().isLoaded("premium_wood"))
		{
			Bridges.addToTab(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB.get());
			Roofs.addToTab(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB.get());
			Fences.addToTab(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB.get());
			Furnitures.addToTab(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB.get());
			Stairs.addToTab(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB.get());
			Fences.addToTabHedge(event, MODID, wood_premium_wood, MCWMODDINGLEGACY_TAB.get());
		}
	}

	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("blue_skies") && ModList.get().isLoaded("premium_wood"))
		{
			int i = rand.nextInt(0, 1);

			switch(i)
			{
			case 0:
					return "pwood_purple_heart";
			case 1:
					return "bsky_bluebright";
			}
		}
		else
		{
			if(ModList.get().isLoaded("blue_skies"))
			{
				return "bsky_bluebright";
			}

			if(ModList.get().isLoaded("premium_wood"))
			{
				return "pwood_purple_heart";
			}
		}
		return "bsky_bluebright";
	}
}