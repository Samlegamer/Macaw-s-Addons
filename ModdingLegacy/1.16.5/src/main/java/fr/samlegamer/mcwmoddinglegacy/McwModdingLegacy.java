package fr.samlegamer.mcwmoddinglegacy;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
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
import fr.samlegamer.addonslib.tab.NewIconRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Mod(McwModdingLegacy.MODID)
@Mod.EventBusSubscriber(modid = McwModdingLegacy.MODID, bus = Bus.MOD)
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
	    public ItemStack makeIcon() {
	        return new ItemStack(new NewIconRandom.Properties(Finder.findBlock(MODID, randomNaming()+"_roof"), Finder.findBlock(MODID, randomNaming()+"_picket_fence"), Finder.findBlock(MODID, randomNaming()+"_wardrobe"), 
	        	    Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE).bridges().fences().furnitures().roofs().buildWood());
	    }
	};

    public McwModdingLegacy()
    {
    	LOGGER.info("Macaw's Modding Legacy Mod Loading...");
    	Registration.init(block, item);

    	final AbstractBlock.Properties wood = AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).strength(0.5F, 2.5F).sound(SoundType.WOOD);
    	final AbstractBlock.Properties leaves = AbstractBlock.Properties.copy(Blocks.OAK_LEAVES);
    	final AbstractBlock.Properties glass = AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).strength(0.5F, 2.5F).sound(SoundType.GLASS);
    	
    	//Bridges.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Fences.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", wood);
    	Furnitures.setRegistrationWoodModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies");
    	Fences.setRegistrationHedgesModLoaded(wood_blue_skies, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", leaves);
    	
    	//Bridges.setRegistrationWoodModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", glass);
    	Roofs.setRegistrationWoodModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", glass);
    	Fences.setRegistrationHedgesModLoaded(wood_crystallized, block, item, MCWMODDINGLEGACY_TAB, "blue_skies", leaves);

    	//Bridges.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Fences.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", wood);
    	Furnitures.setRegistrationWoodModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood");
    	Fences.setRegistrationHedgesModLoaded(wood_premium_wood, block, item, MCWMODDINGLEGACY_TAB, "premium_wood", leaves);

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Roofs::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Fences::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Furnitures::setupClient);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Modding Legacy Mod Finish !");
    }
    
    private void client(final FMLClientSetupEvent event)
    {
    	Bridges.clientWood(event, MODID, wood_blue_skies);
    	Bridges.clientWood(event, MODID, wood_crystallized, RenderType.translucent());
    	Bridges.clientWood(event, MODID, wood_premium_wood);
    }

    @SubscribeEvent
    public static void registry(final RegistryEvent.Register<Block> event)
    {
    	Bridges.registryWood(event, wood_blue_skies, MCWMODDINGLEGACY_TAB);
    	Bridges.registryWood(event, wood_crystallized, MCWMODDINGLEGACY_TAB);
    	Bridges.registryWood(event, wood_premium_wood, MCWMODDINGLEGACY_TAB);
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
		return "purple_hard_mushroom";
	}
}