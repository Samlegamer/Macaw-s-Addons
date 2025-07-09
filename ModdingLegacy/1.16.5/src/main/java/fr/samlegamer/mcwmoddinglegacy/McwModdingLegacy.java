package fr.samlegamer.mcwmoddinglegacy;

import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.data.ModType;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
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

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Mod(McwModdingLegacy.MODID)
public class McwModdingLegacy
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
	        
			prop.addType(BlockType.BRIDGES)
					.addType(BlockType.FENCES)
					.addType(BlockType.FURNITURES)
					.addType(BlockType.ROOFS)
					.addType(BlockType.STAIRS)
					.addType(BlockType.WINDOWS)
					.addType(BlockType.DOORS)
					.addType(BlockType.TRAPDOORS)
					.addType(BlockType.PATHS);
	    	Block icon = prop.buildIcon(BlockType.BRIDGES, BlockType.FENCES, BlockType.FURNITURES, BlockType.ROOFS, BlockType.STAIRS
			, BlockType.WINDOWS, BlockType.DOORS, BlockType.TRAPDOORS, BlockType.PATHS);
	    	return new ItemStack(icon);
	    }
	};

    public McwModdingLegacy()
    {
    	LOGGER.info("Macaw's Modding Legacy Mod Loading...");
    	Registration.init(block, item);

    	final AbstractBlock.Properties wood = AbstractBlock.Properties.copy(Blocks.OAK_PLANKS);
    	final AbstractBlock.Properties leaves = AbstractBlock.Properties.copy(Blocks.OAK_LEAVES);
    	final AbstractBlock.Properties glass = AbstractBlock.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.GLASS);
    	
    	Bridges.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Fences.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
		Fences.setRegistrationHedgesModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", leaves);
    	Furnitures.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies");
    	Stairs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
		Paths.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies");
		Doors.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies");
		Trapdoors.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies");
		Windows.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies");
    	
    	Bridges.setRegistrationWoodModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", glass);
    	Roofs.setRegistrationWoodModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", glass);
    	Fences.setRegistrationHedgesModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", leaves);

    	Bridges.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Fences.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
		Fences.setRegistrationHedgesModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", leaves);
    	Furnitures.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood");
    	Stairs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
		Paths.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood");
		Doors.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood");
		Trapdoors.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood");
		Windows.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood");

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Modding Legacy Mod Finish !");
    }
    
    private void client(final FMLClientSetupEvent event)
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