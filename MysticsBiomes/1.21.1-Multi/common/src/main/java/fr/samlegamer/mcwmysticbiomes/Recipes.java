package fr.samlegamer.mcwmysticbiomes;

import com.mysticsbiomes.MysticsBiomes;
import fr.addonslib.api.recipes.material.McwWoodMat;
import fr.samlegamer.addonslib.Finder;
import net.minecraft.world.level.block.Block;
import java.util.ArrayList;
import java.util.List;

public class Recipes
{
    public static final String modIdExt = MysticsBiomes.modId;

    public static List<Block> getLeavesMat()
    {
        List<Block> mats = new ArrayList<>();
        for(String leave : McwMysticBiomes.LEAVES)
        {
            mats.add(getLeavesMat(leave));
        }
        return mats;
    }

    public static List<McwWoodMat<Block>> getWoodMat()
    {
        List<McwWoodMat<Block>> mats = new ArrayList<>();
        for(String wood : McwMysticBiomes.WOOD)
        {
            mats.add(getWoodMat(wood));
        }
        return mats;
    }

    private static Block getLeavesMat(String id)
    {
        if(!id.contains("blossoms"))
        {
            return Finder.findBlock(modIdExt, id+"_leaves");
        }
        return Finder.findBlock(modIdExt, id);
    }

    private static McwWoodMat<Block> getWoodMat(String id)
    {
        Block log = Finder.findBlock(modIdExt, id+"_log");
        Block planks = Finder.findBlock(modIdExt, id+"_planks");
        Block stripped_log = Finder.findBlock(modIdExt, "stripped_"+id+"_log");
        Block slab = Finder.findBlock(modIdExt, id+"_slab");
        Block fence = Finder.findBlock(modIdExt, id+"_fence");
        Block trapdoor = Finder.findBlock(modIdExt, id+"_trapdoor");

        return new McwWoodMat<>(log, planks, stripped_log, slab, fence, trapdoor);
    }
}
