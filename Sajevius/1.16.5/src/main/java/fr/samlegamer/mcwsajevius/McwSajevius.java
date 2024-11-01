package fr.samlegamer.mcwsajevius;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
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

@Mod(McwSajevius.MODID)
public class McwSajevius
{    
	public static final String MODID = "mcwsajevius";
	private static final Logger LOGGER = LogManager.getLogger();

	public static final List<String> wood_shroomed = Arrays.asList("blue_hard_mushroom", "hard_mushroom", "orange_hard_mushroom", "purple_hard_mushroom");
	public static final List<String> wood_betterlands = Arrays.asList("juniper");
	public static final List<String> stone_betterlands = Arrays.asList("black_terracotta_bricks",
	"blue_terracotta_bricks",
	"brown_terracotta_bricks",
	"claystone_bricks",
	"cyan_terracotta_bricks",
	"gray_terracotta_bricks",
	"green_terracotta_bricks",
	"light_blue_terracotta_bricks",
	"light_gray_terracotta_bricks",
	"lime_terracotta_bricks",
	"magenta_terracotta_bricks",
	"orange_terracotta_bricks",
	"red_terracotta_bricks",
	"terracotta_bricks",
	"white_terracotta_bricks",
	"yellow_terracotta_bricks");
	
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

    public static final ItemGroup MCWSAJEVIUS_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	    	NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(Finder.findBlock(MODID, randomNaming()+"_roof"), Finder.findBlock(MODID, randomNaming()+"_picket_fence"), Finder.findBlock(MODID, randomNaming()+"_wardrobe"), 
	        Finder.findBlock(MODID, randomNaming()+"_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, randomNaming()+"_skyline_stairs"));
	        
	    	prop.addType(BlockType.ROOFS).addType(BlockType.BRIDGES).addType(BlockType.FENCES).addType(BlockType.FURNITURES).addType(BlockType.STAIRS);
	    	Block icon = prop.buildIcon(BlockType.ROOFS, BlockType.BRIDGES, BlockType.FENCES, BlockType.FURNITURES, BlockType.STAIRS);
	    	return new ItemStack(icon);
	    }
	};

    public McwSajevius()
    {
    	LOGGER.info("Macaw's Sajevius Mod Loading...");
    	Registration.init(block, item);

    	final AbstractBlock.Properties wood = AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).strength(0.5F, 2.5F).sound(SoundType.WOOD);
    	final AbstractBlock.Properties leaves = AbstractBlock.Properties.copy(Blocks.OAK_LEAVES);
    	final AbstractBlock.Properties stone = AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(3.0F, 5.0F).sound(SoundType.STONE);

    	Bridges.setRegistrationWoodModLoaded(wood_shroomed, block, item, MCWSAJEVIUS_TAB, "shroomed", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_shroomed, block, item, MCWSAJEVIUS_TAB, "shroomed", wood);
    	Fences.setRegistrationWoodModLoaded(wood_shroomed, block, item, MCWSAJEVIUS_TAB, "shroomed", wood);
    	Furnitures.setRegistrationWoodModLoaded(wood_shroomed, block, item, MCWSAJEVIUS_TAB, "shroomed");
    	Stairs.setRegistrationWoodModLoaded(wood_shroomed, block, item, MCWSAJEVIUS_TAB, "shroomed", wood);

    	Bridges.setRegistrationWoodModLoaded(wood_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands", wood);
    	Roofs.setRegistrationWoodModLoaded(wood_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands", wood);
    	Fences.setRegistrationWoodModLoaded(wood_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands", wood);
    	Furnitures.setRegistrationWoodModLoaded(wood_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands");
    	Fences.setRegistrationHedgesModLoaded(wood_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands", leaves);
    	Stairs.setRegistrationWoodModLoaded(wood_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands", wood);

    	Bridges.setRegistrationRockModLoaded(stone_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands", stone);
    	Roofs.setRegistrationRockModLoaded(stone_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands", stone);
    	Fences.setRegistrationRockModLoaded(stone_betterlands, block, item, MCWSAJEVIUS_TAB, "betterlands", stone);
    	
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Sajevius Mod Finish !");
    }
    
    private void client(FMLClientSetupEvent e)
    {
    	Bridges.clientWood(e, MODID, wood_shroomed);
    	Bridges.clientWood(e, MODID, wood_betterlands);
    	Bridges.clientStone(e, MODID, stone_betterlands);
    	
    	Roofs.clientWood(e, MODID, wood_shroomed);
    	Roofs.clientWood(e, MODID, wood_betterlands);
    	Roofs.clientStone(e, MODID, stone_betterlands);

    	Fences.clientWood(e, MODID, wood_shroomed);
    	Fences.clientWood(e, MODID, wood_betterlands);
    	Fences.clientStone(e, MODID, stone_betterlands);
    	Fences.clientHedge(e, MODID, wood_betterlands);
    	
    	Furnitures.clientWood(e, MODID, wood_shroomed);
    	Furnitures.clientWood(e, MODID, wood_betterlands);

    	Stairs.clientWood(e, MODID, wood_shroomed);
    	Stairs.clientWood(e, MODID, wood_betterlands);
    }
    
	private static String randomNaming()
	{
		Random rand = new Random();

		if(ModList.get().isLoaded("shroomed") && ModList.get().isLoaded("betterlands"))
		{
			int i = rand.nextInt(1);

			switch(i)
			{
			case 0:
					return "juniper";
			case 1:
					return "purple_hard_mushroom";
			}
		}
		else
		{
			if(ModList.get().isLoaded("shroomed"))
			{
				return "purple_hard_mushroom";
			}

			if(ModList.get().isLoaded("betterlands"))
			{
				return "juniper";
			}
		}
		return "purple_hard_mushroom";
	}
}