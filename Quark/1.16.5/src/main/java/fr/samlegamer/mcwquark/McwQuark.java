package fr.samlegamer.mcwquark;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;

@Mod(McwQuark.MODID)
public class McwQuark
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup MCWQUARK_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(Bridges.getBridgeBlocks().get(0).get());
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
			    "sandstone_bricks", "slate_bricks", "soul_sandstone_bricks"
			);
		Bridges.setRegistrationRock(stone, block, item, MCWQUARK_TAB);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(Bridges::setupClient);
    	LOGGER.info("McwQuark Is Charged !");
    }
} 