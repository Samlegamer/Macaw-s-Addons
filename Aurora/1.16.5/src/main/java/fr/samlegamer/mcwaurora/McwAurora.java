package fr.samlegamer.mcwaurora;

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
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;

@Mod(McwAurora.MODID)
public class McwAurora
{
	public static final String MODID = "mcwaurora";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final List<String> WOOD_BAYOU = Arrays.asList("cypress"); // bayou_blues
    public static final List<String> WOOD_ENHANCED_MUSH = Arrays.asList("brown_mushroom", "red_mushroom"); // enhanced_mushrooms
    public static final List<String> WOOD_ABUNDANCE = Arrays.asList("jacaranda", "redbud"); // abundance
    
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);
    
    public static final ItemGroup MCWABNORMALS_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(Blocks.ACACIA_BUTTON);
	    }
	};
    
    public McwAurora()
    {
    	LOGGER.info("Macaw's Aurora Mod Loading...");
    	final AbstractBlock.Properties wood = AbstractBlock.Properties.of(Material.WOOD).harvestTool(ToolType.AXE).strength(0.5F, 2.5F).sound(SoundType.WOOD);
    	final AbstractBlock.Properties leaves = AbstractBlock.Properties.copy(Blocks.OAK_LEAVES);

    	Bridges.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, MCWABNORMALS_TAB, "bayou_blues", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWABNORMALS_TAB, "enhanced_mushrooms", wood);
    	Bridges.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, MCWABNORMALS_TAB, "abundance", wood);

    	Roofs.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, MCWABNORMALS_TAB, "bayou_blues", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWABNORMALS_TAB, "enhanced_mushrooms", wood);
    	Roofs.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, MCWABNORMALS_TAB, "abundance", wood);

    	Furnitures.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, MCWABNORMALS_TAB, "bayou_blues");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWABNORMALS_TAB, "enhanced_mushrooms");
    	Furnitures.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, MCWABNORMALS_TAB, "abundance");

    	Fences.setRegistrationWoodModLoaded(WOOD_BAYOU, block, item, MCWABNORMALS_TAB, "bayou_blues", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ENHANCED_MUSH, block, item, MCWABNORMALS_TAB, "enhanced_mushrooms", wood);
    	Fences.setRegistrationWoodModLoaded(WOOD_ABUNDANCE, block, item, MCWABNORMALS_TAB, "abundance", wood);

    	Fences.setRegistrationHedgesModLoaded(WOOD_BAYOU, block, item, MCWABNORMALS_TAB, "bayou_blues", leaves);
    	Fences.setRegistrationHedgesModLoaded(WOOD_ABUNDANCE, block, item, MCWABNORMALS_TAB, "abundance", leaves);

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Bridges::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Roofs::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Fences::setupClient);
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(Furnitures::setupClient);
        MinecraftForge.EVENT_BUS.register(MappingsFix.class);
    	LOGGER.info("Macaw's Aurora Mod Finish !");
    }
}
