package fr.samlegamer.mcwmoddinglegacy;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
    
    public static final CreativeModeTab MCWMODDINGLEGACY_TAB = new CreativeModeTab(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(Finder.findBlock(MODID, randomNaming()+"_roof"), Finder.findBlock(MODID, randomNaming()+"_picket_fence"), Finder.findBlock(MODID, randomNaming()+"_wardrobe"), 
	    	Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));
	        
	    	prop.addType(BlockType.BRIDGES).addType(BlockType.FENCES).addType(BlockType.FURNITURES).addType(BlockType.ROOFS).addType(BlockType.STAIRS);
	    	Block icon = prop.buildIcon(BlockType.BRIDGES, BlockType.FENCES, BlockType.FURNITURES, BlockType.ROOFS, BlockType.STAIRS);
	    	return new ItemStack(icon);
	    }
	};

    public McwModdingLegacy()
    {
    	LOGGER.info("Macaw's Modding Legacy Mod Loading...");
    	Registration.init(block, item);

    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);
    	final BlockBehaviour.Properties glass = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.GLASS);
    	
    	Bridges.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Fences.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Furnitures.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies");
    	Stairs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Fences.setRegistrationHedgesModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", leaves);
    	
    	Bridges.setRegistrationWoodModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", glass);
    	Roofs.setRegistrationWoodModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", glass);
    	Fences.setRegistrationHedgesModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", leaves);

    	Bridges.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Fences.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Furnitures.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood");
    	Stairs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Fences.setRegistrationHedgesModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", leaves);

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Modding Legacy Mod Finish !");
    }
    
    private void client(final FMLClientSetupEvent event)
    {
    	Bridges.clientWood(event, MODID, wood_blue_skies);
    	Bridges.clientWood(event, MODID, wood_crystallized, RenderType.translucent());
    	Bridges.clientWood(event, MODID, wood_premium_wood);
    	Roofs.clientWood(event, MODID, wood_crystallized, RenderType.translucent());
    	Roofs.clientWood(event, MODID, wood_premium_wood);
    	Roofs.clientWood(event, MODID, wood_blue_skies);
    	Fences.clientWood(event, MODID, wood_crystallized);
    	Fences.clientWood(event, MODID, wood_premium_wood);
    	Fences.clientHedge(event, MODID, wood_blue_skies);
    	Fences.clientHedge(event, MODID, wood_crystallized, RenderType.translucent());
    	Fences.clientHedge(event, MODID, wood_premium_wood);
    	Furnitures.clientWood(event, MODID, wood_blue_skies);
    	Furnitures.clientWood(event, MODID, wood_premium_wood);
    	Stairs.clientWood(event, MODID, wood_blue_skies);
    	Stairs.clientWood(event, MODID, wood_premium_wood);
    }
    
    private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("blue_skies") && ModList.get().isLoaded("premium_wood"))
		{
			int i = rand.nextInt(1);

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