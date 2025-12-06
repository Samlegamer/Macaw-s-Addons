package fr.samlegamer.mcwmoddinglegacy;

import fr.addonslib.api.data.McwBlocksIdBase;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.generation.loot_tables.McwLootTables;
import fr.samlegamer.addonslib.generation.tags.McwBlockTags;
import fr.samlegamer.addonslib.generation.tags.McwItemTags;
import fr.samlegamer.addonslib.registry.McwRegistry;
import fr.samlegamer.addonslib.util.McwMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import javax.annotation.Nonnull;
import java.util.*;

@Mod(McwModdingLegacy.MODID)
public class McwModdingLegacy extends McwMod
{
	public static final String MODID = "mcwmoddinglegacy";
    private static final Logger LOGGER = LogManager.getLogger();

    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public static final List<String> wood_blue_skies = Arrays.asList("bsky_bluebright", "bsky_cherry", "bsky_dusk", "bsky_frostbright", "bsky_lunar", "bsky_maple", "bsky_starlit");
    public static final List<String> wood_premium_wood = Arrays.asList("pwood_magic", "pwood_maple", "pwood_purple_heart", "pwood_silverbell", "pwood_tiger", "pwood_willow");
    public static final List<String> wood_crystallized = Arrays.asList("bsky_crystallized");
    
    public static final ItemGroup MCWMODDINGLEGACY_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
		@Nonnull
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(
					Finder.findBlock(MODID, randomNaming()+"_roof"),
					Finder.findBlock(MODID, randomNaming()+"_picket_fence"),
					Finder.findBlock(MODID, randomNaming()+"_wardrobe"),
					Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"),
					Finder.findBlock(MODID, randomNaming()+"_blinds"),
					Finder.findBlock(MODID, randomNaming()+"_mystic_door"),
					Finder.findBlock(MODID, randomNaming()+"_barrel_trapdoor"),
					Finder.findBlock(MODID, randomNaming()+"_planks_path"),
					Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));
	        
			prop.addType(ModType.BRIDGES)
					.addType(ModType.FENCES)
					.addType(ModType.FURNITURES)
					.addType(ModType.ROOFS)
					.addType(ModType.STAIRS)
					.addType(ModType.WINDOWS)
					.addType(ModType.DOORS)
					.addType(ModType.TRAPDOORS)
					.addType(ModType.PATHS);
	    	Block icon = prop.buildIcon(ModType.BRIDGES, ModType.FENCES, ModType.FURNITURES, ModType.ROOFS, ModType.STAIRS
			, ModType.WINDOWS, ModType.DOORS, ModType.TRAPDOORS, ModType.PATHS);
	    	return new ItemStack(icon);
	    }
	};

    public McwModdingLegacy()
    {
    	LOGGER.info("Macaw's Modding Legacy Mod Loading...");
    	Registration.init(block, item);
        Map<String, SoundType> mapCrystallized = McwRegistry.makeDefaultFromList(wood_crystallized, SoundType.GLASS);
        McwRegistry.setRegistriesWood(wood_blue_skies, block, item, "blue_skies", MCWMODDINGLEGACY_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(wood_blue_skies, block, item, "blue_skies", MCWMODDINGLEGACY_TAB);
        McwRegistry.setRegistriesWood(mapCrystallized, block, item, "blue_skies", MCWMODDINGLEGACY_TAB, ModType.BRIDGES, ModType.ROOFS);
        McwRegistry.setRegistriesLeave(mapCrystallized, block, item, "blue_skies", MCWMODDINGLEGACY_TAB);
        McwRegistry.setRegistriesWood(wood_premium_wood, block, item, "premium_wood", MCWMODDINGLEGACY_TAB, Registration.getAllModTypeWood());
        McwRegistry.setRegistriesLeave(wood_premium_wood, block, item, "premium_wood", MCWMODDINGLEGACY_TAB);
    	bus().addListener(this::clientSetup);
        bus().addListener(this::commonSetup);
        bus().addListener(this::dataSetup);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Modding Legacy Mod Finish !");
    }

    @Override
    public void commonSetup(FMLCommonSetupEvent fmlCommonSetupEvent) {
        fmlCommonSetupEvent.enqueueWork(() -> {
            McwLootTables.addBlockAllWood(MODID, wood_blue_skies);
            McwLootTables.addBlockAllWood(MODID, wood_premium_wood);
            McwLootTables.addBlockHedges(MODID, wood_blue_skies);
            McwLootTables.addBlockHedges(MODID, wood_premium_wood);
            McwLootTables.addBlock(MODID, wood_crystallized, McwBlocksIdBase.BRIDGES_WOOD_BLOCKS);
            McwLootTables.addBlock(MODID, wood_crystallized, McwBlocksIdBase.ROOFS_WOOD_BLOCKS);
            McwLootTables.addBlock(MODID, wood_crystallized, McwBlocksIdBase.FENCES_LEAVE_BLOCKS);
        });
    }

    @Override
    public void dataSetup(GatherDataEvent gatherDataEvent) {
        DataGenerator generator = gatherDataEvent.getGenerator();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();

        if(gatherDataEvent.includeServer())
        {
            McwBlockTags mcwBlockTags = new McwBlockTags(generator, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, wood_blue_skies, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, wood_blue_skies);

                    addAllMcwTagsWood(MODID, wood_premium_wood, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, wood_premium_wood);

                    addAllMcwTagsWood(MODID, wood_crystallized, ModType.BRIDGES, ModType.ROOFS);
                    addAllMcwTagsLeave(MODID, wood_crystallized);
                }
            };

            generator.addProvider(mcwBlockTags);
            generator.addProvider(new McwItemTags(generator, mcwBlockTags, MODID, existingFileHelper) {
                @Override
                protected void addTags() {
                    addAllMcwTagsWood(MODID, wood_blue_skies, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, wood_blue_skies);

                    addAllMcwTagsWood(MODID, wood_premium_wood, Registration.getAllModTypeWood());
                    addAllMcwTagsLeave(MODID, wood_premium_wood);

                    addAllMcwTagsWood(MODID, wood_crystallized, ModType.BRIDGES, ModType.ROOFS);
                    addAllMcwTagsLeave(MODID, wood_crystallized);
                }
            });
            generator.addProvider(new Recipes(generator));
        }
    }

    @Override
    public void clientSetup(final FMLClientSetupEvent event)
    {
		APIRenderTypes.initAllWood(event, MODID, wood_blue_skies, Registration.getAllModTypeWood());
		APIRenderTypes.initAllWood(event, MODID, wood_crystallized, RenderType.translucent(), ModType.BRIDGES, ModType.ROOFS);
		APIRenderTypes.initAllWood(event, MODID, wood_premium_wood, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(event, MODID, wood_blue_skies);
		APIRenderTypes.initAllLeave(event, MODID, wood_crystallized, RenderType.translucent());
		APIRenderTypes.initAllLeave(event, MODID, wood_premium_wood);
    }
    
    private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("blue_skies") && ModList.get().isLoaded("premium_wood"))
		{
			int i = rand.nextInt(2);

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