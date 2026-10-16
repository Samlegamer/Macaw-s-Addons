package fr.samlegamer.mcwbiomesoplenty;

import fr.samlegamer.addonslib.generation.recipes.McwRecipes;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.crafting.Recipe;
import org.jspecify.annotations.NonNull;

import java.util.Set;

public class RecipesNeoForge extends McwRecipes {
    protected RecipesNeoForge(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
    }

    @Override
    protected void buildRecipes() {
        recipesUtils.registerAllMcwWood(output, McwBOP.MODID, Recipes.MODID, McwBOP.WOOD, Recipes.getWoodMats());
        recipesUtils.registerMcwHedge(output, McwBOP.MODID, Recipes.MODID, McwBOP.LEAVES, Recipes.getLeaveMats());
    }

    public static MultiRegistryBootstrap create()
    {
        return new MultiRegistryBootstrap()
        {
            @Override
            public @NonNull Set<ResourceKey<? extends Registry<?>>> requestedRegistries()
            {
                return Set.of(Registries.RECIPE, Registries.ADVANCEMENT);
            }

            @Override
            public void run(MultiRegistryBootstrap.BootstrapGetter registries)
            {
                new RecipesNeoForge(registries.get(Registries.RECIPE), registries.get(Registries.ADVANCEMENT)).buildRecipes();
            }
        };
    }
}