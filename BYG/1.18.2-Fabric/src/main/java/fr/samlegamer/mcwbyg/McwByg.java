package fr.samlegamer.mcwbyg;

import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.tab.NewIconRandom;
import fr.samlegamer.addonslib.tab.NewIconRandom.BlockType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class McwByg implements ModInitializer
{
	public static final String MODID = "mcwbyg";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final List<String> fences_rockable = Arrays.asList("soapstone", "travertine", "dacite", "red_rock", "scoria_stone");
    public static final List<String> bridges_rockable = Arrays.asList("cryptic_stone", "dacite_bricks", "polished_travertine", "purpur_stone", "red_rock_bricks", "scoria_stone_bricks", "soapstone_bricks");
    public static final List<String>  LEAVES = Arrays.asList("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
    "palm","pine","rainbow_eucalyptus","redwood","skyris","mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", 
    "orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
    "flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");
    public static final List<String> WOOD = Arrays.asList("aspen","baobab", "blue_enchanted","cherry","cika","cypress","ebony","ether","fir","green_enchanted","holly","jacaranda",
    "lament","mahogany","mangrove","maple","nightshade","palm","pine","rainbow_eucalyptus","redwood","skyris", "willow", "witch_hazel", "zelkova", "bulbis", "imparius", "sythian");

    private static NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "aspen_roof"), Finder.findBlock(MODID, "aspen_picket_fence"), Finder.findBlock(MODID, "aspen_wardrobe"), 
	        Finder.findBlock(MODID, "aspen_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, "aspen_bulk_stairs"));
    static {
    	prop.addType(BlockType.ROOFS).addType(BlockType.FENCES).addType(BlockType.BRIDGES).addType(BlockType.FURNITURES).addType(BlockType.STAIRS);
    }
    private static Block icon = prop.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.BRIDGES, BlockType.FURNITURES, BlockType.STAIRS);
	public static final ItemGroup MCWBYG_TAB = FabricItemGroupBuilder.build(new Identifier(MODID + ".tab"), () -> new ItemStack(icon));
	
	@Override
	public void onInitialize()
	{
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Loading...");
    	Bridges.setRegistrationWood(MODID, WOOD, MCWBYG_TAB);
    	Bridges.setRegistrationRock(MODID, bridges_rockable, MCWBYG_TAB);
    	Roofs.setRegistrationWood(MODID, WOOD, MCWBYG_TAB);
    	Roofs.setRegistrationRock(MODID, fences_rockable, MCWBYG_TAB);
    	Fences.setRegistrationWood(MODID, WOOD, MCWBYG_TAB);
    	Fences.setRegistrationHedges(MODID, LEAVES, MCWBYG_TAB);
    	Fences.setRegistrationRock(MODID, fences_rockable, MCWBYG_TAB);
    	Furnitures.setRegistrationWood(MODID, WOOD, MCWBYG_TAB);
    	Stairs.setRegistrationWood(MODID, WOOD, MCWBYG_TAB);
		Mapping.missingnoWoodBlock();
		Mapping.missingnoWoodItem();
    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
	}
}