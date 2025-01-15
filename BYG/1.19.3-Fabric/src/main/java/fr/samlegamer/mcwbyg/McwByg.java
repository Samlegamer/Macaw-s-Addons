package fr.samlegamer.mcwbyg;

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
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class McwByg implements ModInitializer
{
	public static final String MODID = "mcwbyg";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup MCWBYG_TAB = FabricItemGroup.builder(new Identifier(MODID + ".tab")).icon(() -> new ItemStack(icon())).build();
    
	public static final List<String> WOOD = List.of("aspen","baobab", "blue_enchanted","cherry","cika","cypress","ebony","ether","fir","green_enchanted","holly","jacaranda",
    	    "lament","mahogany","white_mangrove","maple","nightshade","palm","pine","rainbow_eucalyptus","redwood","skyris", "willow", "witch_hazel", "zelkova", "bulbis", "imparius", "sythian");
	public static final List<String> fences_rockable = List.of("soapstone", "travertine", "dacite", "red_rock", "scoria_stone");
	public static final List<String> bridges_rockable = List.of("cryptic_stone", "dacite_bricks", "polished_travertine", "purpur_stone", "red_rock_bricks", "scoria_stone_bricks", "soapstone_bricks");
	public static final List<String>  LEAVES = List.of("aspen","baobab","blue_enchanted","cika","cypress","ebony", "ether", "fir","green_enchanted","holly", "jacaranda", "lament","mahogany","maple",
			"palm","pine","rainbow_eucalyptus","redwood","skyris","white_mangrove","willow","witch_hazel","zelkova", "blue_spruce", "orange_spruce", "red_spruce", "yellow_spruce", "brown_birch", 
			"orange_birch", "red_birch", "yellow_birch", "brown_oak", "orange_oak", "red_oak", "white_cherry", "pink_cherry", "araucaria", "blooming_witch_hazel", "flowering_indigo_jacaranda", 
			"flowering_jacaranda", "flowering_orchard", "flowering_palo_verde", "palo_verde");

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

    	Bridges.addToTabWood(MODID, WOOD, MCWBYG_TAB);
    	Bridges.addToTabStone(MODID, bridges_rockable, MCWBYG_TAB);
    	Roofs.addToTabWood(MODID, WOOD, MCWBYG_TAB);
    	Roofs.addToTabStone(MODID, fences_rockable, MCWBYG_TAB);
    	Fences.addToTabWood(MODID, WOOD, MCWBYG_TAB);
    	Fences.addToTabLeave(MODID, LEAVES, MCWBYG_TAB);
    	Fences.addToTabStone(MODID, fences_rockable, MCWBYG_TAB);
    	Furnitures.addToTabWood(MODID, WOOD, MCWBYG_TAB);
    	Stairs.addToTabWood(MODID, WOOD, MCWBYG_TAB);
    	
		Mapping.missingnoWoodBlock();
		
    	Bridges.fuelWood(MODID, WOOD);
		Roofs.fuelWood(MODID, WOOD);
    	Fences.fuelWood(MODID, WOOD);
    	Fences.fuelHedge(MODID, LEAVES);
    	Furnitures.fuelWood(MODID, WOOD);
    	Stairs.fuelWood(MODID, WOOD);

    	LOGGER.info("Macaw's Oh the Biomes You'll Go Is Charged !");
	}
	
	private static Block icon()
	{
		final NewIconRandom.NewProperties prop = new NewIconRandom.NewProperties(Finder.findBlock(MODID, "aspen_roof"), Finder.findBlock(MODID, "aspen_picket_fence"), Finder.findBlock(MODID, "aspen_wardrobe"), 
		        Finder.findBlock(MODID, "aspen_log_bridge_middle"), Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Blocks.CRAFTING_TABLE, Finder.findBlock(MODID, "aspen_bulk_stairs"));
    	prop.addType(BlockType.ROOFS).addType(BlockType.FENCES).addType(BlockType.BRIDGES).addType(BlockType.FURNITURES).addType(BlockType.STAIRS);
        return prop.buildIcon(BlockType.ROOFS, BlockType.FENCES, BlockType.BRIDGES, BlockType.FURNITURES, BlockType.STAIRS);
	}
}