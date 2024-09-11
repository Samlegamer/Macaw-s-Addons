package fr.samlegamer.mcwabnormals;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.client.event.sound.SoundSetupEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.bridges.Bridges;

@Mod(McwAbnormals.MODID)
public class McwAbnormals
{
	public static final String MODID = "mcwabnormals";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> ROCK_BB = Arrays.asList("honeycomb_brick", "honeycomb_tile");
    public static final List<String> WOOD_ATMO = Arrays.asList("aspen", "grimwood", "kousa", "morado", "rosewood", "yucca");
    public static final List<String> ROCK_ATMO = Arrays.asList("arid_sandstone", "red_arid_sandstone");
    public static final List<String> WOOD_AUTU = Arrays.asList("maple");
    public static final List<String> ROCK_AUTU = Arrays.asList("snail_shell_bricks", "snail_shell_tiles");
    public static final List<String> WOOD_ENVI = Arrays.asList("cherry", "wisteria", "willow");
    public static final List<String> WOOD_UAQUA = Arrays.asList("driftwood", "river");
    public static final List<String> WOOD_ENDER = Arrays.asList("poise");
    
    private static final DeferredRegister<Block> block = Registration.blocks(MODID);
    private static final DeferredRegister<Item> item = Registration.items(MODID);

	public static final RegistryObject<Item> LOGO = item.register("logo", () -> new Item(new Item.Properties()));
	
	public static final ItemGroup MCWABNORMALS_TAB = new ItemGroup(MODID + ".tab") {
	    @Override
	    public ItemStack makeIcon() {
	        return new ItemStack(LOGO.get());
	    }
	};
	
    public McwAbnormals()
    {
    	LOGGER.info("Macaw's Abnormals Mod Loading...");
    	Registration.init(block, item);
    	Bridges.setRegistrationRockModLoaded(ROCK_BB, block, item, MCWABNORMALS_TAB, "buzzier_bees");
    	Bridges.setRegistrationWoodModLoaded(WOOD_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric");
    	Bridges.setRegistrationRockModLoaded(ROCK_ATMO, block, item, MCWABNORMALS_TAB, "atmospheric");
    	Bridges.setRegistrationWoodModLoaded(WOOD_AUTU, block, item, MCWABNORMALS_TAB, "autumnity");
    	Bridges.setRegistrationRockModLoaded(ROCK_AUTU, block, item, MCWABNORMALS_TAB, "autumnity");
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENVI, block, item, MCWABNORMALS_TAB, "environmental");
    	Bridges.setRegistrationWoodModLoaded(WOOD_UAQUA, block, item, MCWABNORMALS_TAB, "upgrade_aquatic");
    	Bridges.setRegistrationWoodModLoaded(WOOD_ENDER, block, item, MCWABNORMALS_TAB, "endergetic");
    	LOGGER.info("Macaw's Abnormals Mod Finish !");
    }
    
    private void changeSound(SoundEvent event)
    {
    	Block b = Finder.findBlock(MODID, "honeycomb_brick_bridge");
    }
}