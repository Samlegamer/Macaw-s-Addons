package fr.samlegamer.mcwbyg;

import java.util.List;
import java.util.function.Supplier;

import fr.samlegamer.addonslib.AddonsLib;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Roofs
{
	private static AbstractBlock.Settings wood = AbstractBlock.Settings.copy(Blocks.OAK_PLANKS);
	private static AbstractBlock.Settings stone = AbstractBlock.Settings.copy(Blocks.COBBLESTONE);
	public static final String modid = "mcwroofs";
	
	private static Block registryEntry(String MODID, String name, Block b, ItemGroup tab, String modLoaded)
	{
    	Registry.register(Registry.BLOCK, new Identifier(MODID, name), b);
    	if(AddonsLib.isLoaded(modid) && AddonsLib.isLoaded(modLoaded))
    	{
    		Registry.register(Registry.ITEM, new Identifier(MODID, name), new BlockItem(b, new Item.Settings().group(tab)));
    	}
    	else {
    		Registry.register(Registry.ITEM, new Identifier(MODID, name), new BlockItem(b, new Item.Settings()));
        }
    	
    	return b;
	}

	/**
	 * Init all Wood Variants of Macaw's Roofs
	 */
	public static void setRegistrationWood(String MODID, List<String> set, ItemGroup tab)
	{
		setRegistrationWoodModLoaded(MODID, set, tab, "minecraft", wood);
	}
	
	/**
	 * Init all Stone Variants of Macaw's Roofs
	 */
	public static void setRegistrationRock(String MODID, List<String> rock, ItemGroup tab)
	{
		setRegistrationRockModLoaded(MODID, rock, tab, "minecraft", stone);
	}

	/**
	 * Init all Wood Variants of Macaw's Roofs
	 */
	public static void setRegistrationWoodModLoaded(String MODID, List<String> set, ItemGroup tab, String modLoaded, AbstractBlock.Settings prop)
	{
			final AbstractBlock.Settings WOOD = prop;
		    Block cherry_roof,
			cherry_attic_roof,
			cherry_top_roof,
			cherry_lower_roof,
			cherry_steep_roof,
			cherry_upper_lower_roof,
			cherry_upper_steep_roof,
			cherry_planks_roof,
			cherry_planks_attic_roof,
			cherry_planks_top_roof,
			cherry_planks_lower_roof,
			cherry_planks_steep_roof,
			cherry_planks_upper_lower_roof,
			cherry_planks_upper_steep_roof;

			for(String i : set)
			{
				try {
				    if (AddonsLib.isLoaded(modid))
				    {
				    	cherry_roof = registryEntry(MODID, i+"_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.BaseRoof", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            cherry_attic_roof = registryEntry(MODID, i + "_attic_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.RoofGlass", WOOD), tab, modLoaded);
			            cherry_top_roof = registryEntry(MODID, i + "_top_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.RoofTopNew", WOOD), tab, modLoaded);
					    cherry_lower_roof = registryEntry(MODID, i+"_lower_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.BaseRoof", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
					    cherry_steep_roof = registryEntry(MODID, i+"_steep_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.SteepRoof", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            cherry_upper_lower_roof = registryEntry(MODID, i + "_upper_lower_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.Lower", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            cherry_upper_steep_roof = registryEntry(MODID, i + "_upper_steep_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.Steep", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
					    
			            cherry_planks_roof = registryEntry(MODID, i+"_planks_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.BaseRoof", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            cherry_planks_attic_roof = registryEntry(MODID, i + "_planks_attic_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.RoofGlass", WOOD), tab, modLoaded);
			            cherry_planks_top_roof = registryEntry(MODID, i + "_planks_top_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.RoofTopNew", WOOD), tab, modLoaded);
					    cherry_planks_lower_roof = registryEntry(MODID, i+"_planks_lower_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.BaseRoof", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
					    cherry_planks_steep_roof = registryEntry(MODID, i+"_planks_steep_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.SteepRoof", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            cherry_planks_upper_lower_roof = registryEntry(MODID, i + "_planks_upper_lower_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.Lower", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            cherry_planks_upper_steep_roof = registryEntry(MODID, i + "_planks_upper_steep_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.Steep", WOOD, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
				    }
				    else
				    {
				    	cherry_roof = registryEntry(MODID, i+"_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), WOOD), tab, modLoaded);
					    cherry_attic_roof = registryEntry(MODID, i+"_attic_roof", new Block(WOOD), tab, modLoaded);
					    cherry_top_roof = registryEntry(MODID, i+"_top_roof", new Block(WOOD), tab, modLoaded);
					    cherry_lower_roof = registryEntry(MODID, i+"_lower_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), WOOD), tab, modLoaded);
					    cherry_steep_roof = registryEntry(MODID, i+"_steep_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), WOOD), tab, modLoaded);
					    cherry_upper_lower_roof = registryEntry(MODID, i+"_upper_lower_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), WOOD), tab, modLoaded);
					    cherry_upper_steep_roof = registryEntry(MODID, i+"_upper_steep_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), WOOD), tab, modLoaded);

					    cherry_planks_roof = registryEntry(MODID, i+"_planks_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), WOOD), tab, modLoaded);
					    cherry_planks_attic_roof = registryEntry(MODID, i+"_planks_attic_roof", new Block(WOOD), tab, modLoaded);
					    cherry_planks_top_roof = registryEntry(MODID, i+"_planks_top_roof", new Block(WOOD), tab, modLoaded);
					    cherry_planks_lower_roof = registryEntry(MODID, i+"_planks_lower_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), WOOD), tab, modLoaded);
					    cherry_planks_steep_roof = registryEntry(MODID, i+"_planks_steep_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), WOOD), tab, modLoaded);
					    cherry_planks_upper_lower_roof = registryEntry(MODID, i+"_planks_upper_lower_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState() ,WOOD), tab, modLoaded);
					    cherry_planks_upper_steep_roof = registryEntry(MODID, i+"_planks_upper_steep_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState() ,WOOD), tab, modLoaded);
				    }
				} catch (Exception e) {
				    // Gérer toute autre exception non prévue
				    e.printStackTrace();
				}
			}
	}
	
	/**
	 * Init all Stone Variants of Macaw's Roofs
	 */
	public static void setRegistrationRockModLoaded(String MODID, List<String> rock, ItemGroup tab, String modLoaded, AbstractBlock.Settings prop)
	{
			final AbstractBlock.Settings STONE = prop;
			Block ROOF,
			ATTIC_ROOF,
			TOP_ROOF,
			LOWER_ROOF,
			STEEP_ROOF,
			UPPER_LOWER_ROOF,
			UPPER_STEEP_ROOF;

			for(String i : rock)
			{
				try {
				    if (AddonsLib.isLoaded(modid))
				    {
				    	ROOF = registryEntry(MODID, i+"_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.BaseRoof", STONE, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            ATTIC_ROOF = registryEntry(MODID, i + "_attic_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.RoofGlass", STONE), tab, modLoaded);
			            TOP_ROOF = registryEntry(MODID, i + "_top_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.RoofTopNew", STONE), tab, modLoaded);
			            LOWER_ROOF = registryEntry(MODID, i+"_lower_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.BaseRoof", STONE, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            STEEP_ROOF = registryEntry(MODID, i+"_steep_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.SteepRoof", STONE, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            UPPER_LOWER_ROOF = registryEntry(MODID, i + "_upper_lower_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.Lower", STONE, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
			            UPPER_STEEP_ROOF = registryEntry(MODID, i + "_upper_steep_roof", Registration.getBlocksField("net.kikoz.mcwroofs.objects.roofs.Steep", STONE, Blocks.OAK_PLANKS.getDefaultState()), tab, modLoaded);
				    }
				    else
				    {
				    	ROOF = registryEntry(MODID, i+"_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), STONE), tab, modLoaded);
				    	ATTIC_ROOF = registryEntry(MODID, i+"_attic_roof", new Block(STONE), tab, modLoaded);
					    TOP_ROOF = registryEntry(MODID, i+"_top_roof", new Block(STONE), tab, modLoaded);
					    LOWER_ROOF = registryEntry(MODID, i+"_lower_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), STONE), tab, modLoaded);
					    STEEP_ROOF = registryEntry(MODID, i+"_steep_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), STONE), tab, modLoaded);
					    UPPER_LOWER_ROOF = registryEntry(MODID, i+"_upper_lower_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), STONE), tab, modLoaded);
					    UPPER_STEEP_ROOF = registryEntry(MODID, i+"_upper_steep_roof", new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(), STONE), tab, modLoaded);
				    }
				} catch (Exception e)
				{
				    e.printStackTrace();
				}
			}
	}

	public static void clientWood(String MODID, List<String> WOOD)
	{
		clientWood(MODID, WOOD, RenderLayer.getCutout());
	}
	
	public static void clientWood(String MODID, List<String> WOOD, RenderLayer renderSet)
	{
	    Block cherry_roof,
		cherry_attic_roof,
		cherry_top_roof,
		cherry_lower_roof,
		cherry_steep_roof,
		cherry_upper_lower_roof,
		cherry_upper_steep_roof,
		cherry_planks_roof,
		cherry_planks_attic_roof,
		cherry_planks_top_roof,
		cherry_planks_lower_roof,
		cherry_planks_steep_roof,
		cherry_planks_upper_lower_roof,
		cherry_planks_upper_steep_roof;

		for (String i : WOOD)
		{
			cherry_roof = Finder.findBlock(MODID, i+"_roof");
			cherry_attic_roof = Finder.findBlock(MODID, i + "_attic_roof");
			cherry_top_roof = Finder.findBlock(MODID, i + "_top_roof");
			cherry_lower_roof = Finder.findBlock(MODID, i+"_lower_roof");
			cherry_steep_roof = Finder.findBlock(MODID, i+"_steep_roof");
			cherry_upper_lower_roof = Finder.findBlock(MODID, i + "_upper_lower_roof");
			cherry_upper_steep_roof = Finder.findBlock(MODID, i + "_upper_steep_roof");

        	cherry_planks_roof = Finder.findBlock(MODID, i+"_planks_roof");
			cherry_planks_attic_roof = Finder.findBlock(MODID, i + "_planks_attic_roof");
			cherry_planks_top_roof = Finder.findBlock(MODID, i + "_planks_top_roof");
			cherry_planks_lower_roof = Finder.findBlock(MODID, i+"_planks_lower_roof");
			cherry_planks_steep_roof = Finder.findBlock(MODID, i+"_planks_steep_roof");
			cherry_planks_upper_lower_roof = Finder.findBlock(MODID, i + "_planks_upper_lower_roof");
			cherry_planks_upper_steep_roof = Finder.findBlock(MODID, i + "_planks_upper_steep_roof");

			BlockRenderLayerMap.INSTANCE.putBlocks(renderSet
        	,cherry_roof
        	,cherry_attic_roof
        	,cherry_top_roof
        	,cherry_lower_roof
        	,cherry_steep_roof
        	,cherry_upper_lower_roof
        	,cherry_upper_steep_roof
        	,cherry_planks_roof
        	,cherry_planks_attic_roof
        	,cherry_planks_top_roof
        	,cherry_planks_lower_roof
        	,cherry_planks_steep_roof
        	,cherry_planks_upper_lower_roof
        	,cherry_planks_upper_steep_roof);
        }
	}
	
	public static void clientStone(String MODID, List<String> STONE)
	{
		clientStone(MODID, STONE, RenderLayer.getCutout());
	}
	
	public static void clientStone(String MODID, List<String> STONE, RenderLayer renderSet)
	{
		Block ROOF,
		ATTIC_ROOF,
		TOP_ROOF,
		LOWER_ROOF,
		STEEP_ROOF,
		UPPER_LOWER_ROOF,
		UPPER_STEEP_ROOF;

		for (String i : STONE)
		{
			ROOF = Finder.findBlock(MODID, i + "_roof");
			ATTIC_ROOF = Finder.findBlock(MODID, i + "_attic_roof");
			TOP_ROOF = Finder.findBlock(MODID, i + "_top_roof");
			LOWER_ROOF = Finder.findBlock(MODID, i + "_lower_roof");
			STEEP_ROOF = Finder.findBlock(MODID, i + "_steep_roof");
			UPPER_LOWER_ROOF = Finder.findBlock(MODID, i + "_upper_lower_roof");
			UPPER_STEEP_ROOF = Finder.findBlock(MODID, i + "_upper_steep_roof");

			BlockRenderLayerMap.INSTANCE.putBlocks(renderSet, ROOF, ATTIC_ROOF, TOP_ROOF, LOWER_ROOF, STEEP_ROOF, UPPER_LOWER_ROOF, UPPER_STEEP_ROOF);
        }
	}
	
	public static void FuelWood(String MODID, List<String> WOOD)
	{
	    Block cherry_roof,
		cherry_attic_roof,
		cherry_top_roof,
		cherry_lower_roof,
		cherry_steep_roof,
		cherry_upper_lower_roof,
		cherry_upper_steep_roof,
		cherry_planks_roof,
		cherry_planks_attic_roof,
		cherry_planks_top_roof,
		cherry_planks_lower_roof,
		cherry_planks_steep_roof,
		cherry_planks_upper_lower_roof,
		cherry_planks_upper_steep_roof;

		for (String i : WOOD)
		{
			cherry_roof = Finder.findBlock(MODID, i+"_roof");
			cherry_attic_roof = Finder.findBlock(MODID, i + "_attic_roof");
			cherry_top_roof = Finder.findBlock(MODID, i + "_top_roof");
			cherry_lower_roof = Finder.findBlock(MODID, i+"_lower_roof");
			cherry_steep_roof = Finder.findBlock(MODID, i+"_steep_roof");
			cherry_upper_lower_roof = Finder.findBlock(MODID, i + "_upper_lower_roof");
			cherry_upper_steep_roof = Finder.findBlock(MODID, i + "_upper_steep_roof");

        	cherry_planks_roof = Finder.findBlock(MODID, i+"_planks_roof");
			cherry_planks_attic_roof = Finder.findBlock(MODID, i + "_planks_attic_roof");
			cherry_planks_top_roof = Finder.findBlock(MODID, i + "_planks_top_roof");
			cherry_planks_lower_roof = Finder.findBlock(MODID, i+"_planks_lower_roof");
			cherry_planks_steep_roof = Finder.findBlock(MODID, i+"_planks_steep_roof");
			cherry_planks_upper_lower_roof = Finder.findBlock(MODID, i + "_planks_upper_lower_roof");
			cherry_planks_upper_steep_roof = Finder.findBlock(MODID, i + "_planks_upper_steep_roof");

        	FuelRegistry.INSTANCE.add(cherry_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_attic_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_top_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_lower_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_steep_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_upper_lower_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_upper_steep_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_planks_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_planks_attic_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_planks_top_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_planks_lower_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_planks_steep_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_planks_upper_lower_roof, 300);
        	FuelRegistry.INSTANCE.add(cherry_planks_upper_steep_roof, 300);
        }
	}
}