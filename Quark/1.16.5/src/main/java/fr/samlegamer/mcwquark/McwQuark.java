package fr.samlegamer.mcwquark;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.roofs.Roofs;

@Mod(McwQuark.MODID)
public class McwQuark
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup MCWQUARK_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(randomIcon());
	    }
	};
	
    public McwQuark()
    {
    	LOGGER.info("McwQuark Loading...");
    	final DeferredRegister<Block> block = Registration.blocks(MODID);
    	final DeferredRegister<Item> item = Registration.items(MODID);
		Registration.init(block, item);
		List<String> stone = Arrays.asList(
			    "andesite_bricks", "basalt_bricks", "biotite_bricks", 
			    "diorite_bricks", "elder_prismarine_bricks", "granite_bricks", 
			    "jasper_bricks", "limestone_bricks", "magma_bricks", 
			    "marble_bricks", "permafrost_bricks", "red_sandstone_bricks", 
			    "sandstone_bricks", "slate_bricks", "soul_sandstone_bricks");
		List<String> leaves = Arrays.asList("blue_blossom", "lavender_blossom", "orange_blossom", "pink_blossom", "red_blossom", "yellow_blossom");
		Bridges.setRegistrationRock(stone, block, item, MCWQUARK_TAB);
		Fences.setRegistrationRock(stone, block, item, MCWQUARK_TAB);
		Fences.setRegistrationHedges(leaves, block, item, MCWQUARK_TAB);
		Roofs.setRegistrationRock(stone, block, item, MCWQUARK_TAB);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(Bridges::setupClient);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(Fences::setupClient);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(Roofs::setupClient);
    	LOGGER.info("McwQuark Is Charged !");
    }
    
    public static Block randomIcon()
    {
    	if(loadedAll())
    	{
    		Random rand = new Random();
    		int i = rand.nextInt(2);
    		
    		switch (i) {
			case 1:
	    		return Bridges.getBridgeBlocks().get(0).get();
			case 2:
	    		return Fences.getFenceBlocks().get(0).get();
			case 0:
	    		return Roofs.getRoofBlocks().get(0).get();
			default:
				break;
			}
    	}
    	else
    	{
    		if(loaded("mcwbridges"))
        	{
        		return Bridges.getBridgeBlocks().get(0).get();
        	}
        	else if(loaded("mcwfences"))
        	{
        		return Fences.getFenceBlocks().get(0).get();
        	}
        	else if(loaded("mcwroofs"))
        	{
        		return Roofs.getRoofBlocks().get(0).get();
        	}
    	}
    	return Blocks.OAK_LEAVES;
    }
    
    private static boolean loaded(String modid)
    {
    	return ModList.get().isLoaded(modid);
    }
    
    private static boolean loadedAll()
    {
    	return loaded("mcwbridges") && loaded("mcwfences") && loaded("mcwroofs");
    }
}