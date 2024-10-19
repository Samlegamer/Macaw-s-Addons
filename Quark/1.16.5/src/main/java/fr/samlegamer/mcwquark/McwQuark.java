package fr.samlegamer.mcwquark;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.tab.NewIconRandom;

@Mod(McwQuark.MODID)
@Mod.EventBusSubscriber(modid = McwQuark.MODID, bus = Bus.MOD)
public class McwQuark
{
	public static final String MODID = "mcwquark";
    private static final Logger LOGGER = LogManager.getLogger();
    
    private static final List<String> stone = Arrays.asList(
		    "andesite_bricks", "basalt_bricks", "biotite_bricks", 
		    "diorite_bricks", "elder_prismarine_bricks", "granite_bricks", 
		    "jasper_bricks", "limestone_bricks", "magma_bricks", 
		    "marble_bricks", "permafrost_bricks", "red_sandstone_bricks", 
		    "sandstone_bricks", "slate_bricks", "soul_sandstone_bricks");
    private static final List<String> leaves = Arrays.asList("blue_blossom", "lavender_blossom", "orange_blossom", "pink_blossom", "red_blossom", "yellow_blossom");

	public static final ItemGroup MCWQUARK_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(new NewIconRandom.Properties(Finder.findBlock(MODID, "limestone_bricks_roof"), Finder.findBlock(MODID, "orange_blossom_hedge"), Finder.findBlock(MODID, "marble_bricks_bridge")).bridges().fences().roofs().buildStone());
	    }
	};
	
    public McwQuark()
    {
    	LOGGER.info("Macaw's Quark Loading...");
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
    	LOGGER.info("Macaw's Quark Is Charged !");
    }
    
    private void client(final FMLClientSetupEvent event)
    {
    	Bridges.clientStone(event, MODID, stone);
    	Fences.clientStone(event, MODID, stone);
    	Fences.clientHedge(event, MODID, leaves);
    	Roofs.clientStone(event, MODID, stone);
    }
    
    @SubscribeEvent
    public static void registry(final RegistryEvent.Register<Block> e)
    {
    	Bridges.registryStone(e, stone, MCWQUARK_TAB);
    	Fences.registryStone(e, stone, MCWQUARK_TAB);
    	Fences.registryHedges(e, leaves, MCWQUARK_TAB);
    	Roofs.registryStone(e, stone, MCWQUARK_TAB);
    }
}