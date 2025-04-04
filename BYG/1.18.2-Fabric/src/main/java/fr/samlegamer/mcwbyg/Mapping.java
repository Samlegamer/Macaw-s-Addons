package fr.samlegamer.mcwbyg;

import fr.samlegamer.addonslib.mapping.MappingMissing;
import net.fabricmc.loader.api.FabricLoader;

public class Mapping
{
	private static final MappingMissing.Bridges bridges = new MappingMissing.Bridges("macawsbridgesbyg", McwByg.MODID, McwByg.WOOD, McwByg.bridges_rockable);
	private static final MappingMissing.Furnitures furnitures = new MappingMissing.Furnitures("mcwfurnituresbyg", McwByg.MODID, McwByg.WOOD);
	private static final MappingMissing.Fences fences = new MappingMissing.Fences("mcwfencesbyg", McwByg.MODID, McwByg.WOOD, McwByg.fences_rockable);
	private static final MappingMissing.Roofs roofs = new MappingMissing.Roofs("macawsroofsbyg", McwByg.MODID, McwByg.WOOD);
	
	public static void missingnoWoodBlock()
	{
		if(FabricLoader.getInstance().isModLoaded("updatefixerupper")) {
			fences.leavesAdding(McwByg.LEAVES);
			bridges.missingnoWoodBlock();
			bridges.missingnoStoneBlock(true);
			furnitures.missingnoWoodBlock();
			fences.missingnoWoodBlock();
			fences.missingnoStoneBlock();
			roofs.missingnoWoodBlock();
		}
	}
}