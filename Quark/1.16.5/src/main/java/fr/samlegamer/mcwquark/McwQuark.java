package fr.samlegamer.mcwquark;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
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
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.tab.IconRandom;

@Mod(McwQuark.MODID)
public class McwQuark
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();
	private static final DeferredRegister<Block> block = Registration.blocks(MODID);
	private static final DeferredRegister<Item> item = Registration.items(MODID);

	protected static final RegistryObject<Item> LOGO_BRIDGES = item.register("logob", ()->new Item(new Item.Properties()));
	protected static final RegistryObject<Item> LOGO_FENCES = item.register("logof", ()->new Item(new Item.Properties()));
	protected static final RegistryObject<Item> LOGO_ROOFS = item.register("logor", ()->new Item(new Item.Properties()));
	public static final ItemGroup MCWQUARK_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(new IconRandom.Properties(LOGO_ROOFS, LOGO_FENCES, LOGO_BRIDGES).bridges().fences().roofs().buildStone());
	    }
	};
	
    public McwQuark()
    {
    	LOGGER.info("McwQuark Loading...");
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
}