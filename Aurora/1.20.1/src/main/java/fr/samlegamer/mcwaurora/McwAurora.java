package fr.samlegamer.mcwaurora;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;
import java.util.Random;
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

@Mod(McwAurora.MODID)
public class McwAurora
{
	public static final String MODID = "mcwaurora";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final List<String> WOOD_BAYOU = List.of("cypress"); // bayou_blues
    public static final List<String> WOOD_ENHANCED_MUSH = List.of("mushroom"); // enhanced_mushrooms
    public static final List<String> WOOD_ABUNDANCE = List.of("jacaranda", "redbud"); // abundance
    
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    public static final DeferredRegister<CreativeModeTab> ct = Registration.creativeModeTab(MODID);

	public static final RegistryObject<CreativeModeTab> MCWAURORA_TAB = ct.register("tab", () -> CreativeModeTab.builder()
	        .icon(() -> { return getIcon(); }).title(Component.translatable(MODID+".tab")).build());
    
    public McwAurora()
    {
    	LOGGER.info("Macaw's Aurora Mod Loading...");
    	Registration.init(block, item, ct);

    	final BlockBehaviour.Properties wood = BlockBehaviour.Properties.of().strength(0.5F, 2.5F).sound(SoundType.WOOD);
    	final BlockBehaviour.Properties leaves = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);

    	Bridges.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, null, "bayou_blues", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, null, "enhanced_mushrooms", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, null, "abundance", wood);

    	Roofs.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, null, "bayou_blues", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, null, "enhanced_mushrooms", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, null, "abundance", wood);

    	Fences.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, null, "bayou_blues", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, null, "enhanced_mushrooms", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, null, "abundance", wood);

    	Fences.setRegistrationHedgesModLoaded(WOOD_BAYOU, block, item, null, "bayou_blues", leaves);
    	Fences.setRegistrationHedgesModLoaded(WOOD_ABUNDANCE, block, item, null, "abundance", leaves);

    	Furnitures.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, null, "bayou_blues");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, null, "enhanced_mushrooms");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, null, "abundance");

    	Stairs.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, null, "bayou_blues", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, null, "enhanced_mushrooms", wood);
    	Stairs.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, null, "abundance", wood);

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addTotab);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }
    
    private void addTotab(BuildCreativeModeTabContentsEvent event)
    {
    	if(MCWAURORA_TAB != null)
    	{
			if(ModList.get().isLoaded("bayou_blues"))
			{
	        	Bridges.addToTab(event, MODID, WOOD_BAYOU, MCWAURORA_TAB.get());
	        	Roofs.addToTab(event, MODID, WOOD_BAYOU, MCWAURORA_TAB.get());
	        	Fences.addToTab(event, MODID, WOOD_BAYOU, MCWAURORA_TAB.get());
	        	Fences.addToTabHedge(event, MODID, WOOD_BAYOU, MCWAURORA_TAB.get());
	        	Furnitures.addToTab(event, MODID, WOOD_BAYOU, MCWAURORA_TAB.get());
	        	Stairs.addToTab(event, MODID, WOOD_BAYOU, MCWAURORA_TAB.get());
			}

			if(ModList.get().isLoaded("enhanced_mushrooms"))
			{
	        	Bridges.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
	        	Roofs.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
	        	Fences.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
	        	Furnitures.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
	        	Stairs.addToTab(event, MODID, WOOD_ENHANCED_MUSH, MCWAURORA_TAB.get());
			}
			
			if(ModList.get().isLoaded("abundance"))
			{
	        	Bridges.addToTab(event, MODID, WOOD_ABUNDANCE, MCWAURORA_TAB.get());
	        	Roofs.addToTab(event, MODID, WOOD_ABUNDANCE, MCWAURORA_TAB.get());
	        	Fences.addToTab(event, MODID, WOOD_ABUNDANCE, MCWAURORA_TAB.get());
	        	Fences.addToTabHedge(event, MODID, WOOD_ABUNDANCE, MCWAURORA_TAB.get());
	        	Furnitures.addToTab(event, MODID, WOOD_ABUNDANCE, MCWAURORA_TAB.get());
	        	Stairs.addToTab(event, MODID, WOOD_ABUNDANCE, MCWAURORA_TAB.get());
			}
    	}
    }
    
    private static ItemStack getIcon()
    {
    	NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(Finder.findBlock(MODID, randomNaming()+"_roof"), Finder.findBlock(MODID, randomNaming()+"_picket_fence"), Finder.findBlock(MODID, randomNaming()+"_wardrobe"), 
    	Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));
    	        
    	prop.addType(BlockType.BRIDGES).addType(BlockType.ROOFS).addType(BlockType.FENCES).addType(BlockType.FURNITURES).addType(BlockType.STAIRS);
    	Block icon = prop.buildIcon(BlockType.BRIDGES, BlockType.ROOFS, BlockType.FENCES, BlockType.FURNITURES, BlockType.STAIRS);
    	return new ItemStack(icon);
    }
    
	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("bayou_blues") && ModList.get().isLoaded("enhanced_mushrooms") && ModList.get().isLoaded("abundance"))
		{
			int i = rand.nextInt(2);

			switch(i)
			{
			case 0:
					return "cypress";
			case 1:
					return "mushroom";
			case 2:
					return "jacaranda";
			}
		}
		else
		{
			if(ModList.get().isLoaded("bayou_blues"))
			{
				return "cypress";
			}

			if(ModList.get().isLoaded("enhanced_mushrooms"))
			{
				return "mushroom";
			}
			
			if(ModList.get().isLoaded("abundance"))
			{
				return "jacaranda";
			}
		}
		return "mushroom";
	}
}