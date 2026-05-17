package fr.samlegamer.mcwterraformersmc;

import fr.addonslib.api.client.ObjectColor;
import fr.addonslib.api.data.ModType;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import java.util.Arrays;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
    protected static final ColorRegistry colorRegistry = new ColorRegistry(Arrays.asList(
            new ObjectColor(McwTerraformersMC.MODID, "redwood"),
            new ObjectColor(McwTerraformersMC.MODID, "hemlock"),
            new ObjectColor(McwTerraformersMC.MODID, "rubber"),
            new ObjectColor(McwTerraformersMC.MODID, "cypress"),
            new ObjectColor(McwTerraformersMC.MODID, "willow"),
            new ObjectColor(McwTerraformersMC.MODID, "japanese_maple_shrub"),
            new ObjectColor(McwTerraformersMC.MODID, "rainbow_eucalyptus")));

    @Override
    public void onInitializeClient()
    {
        colorRegistry.registryBlockColors();
        colorRegistry.registryItemColors();

        APIRenderTypes.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, ModType.getAllModTypeWood());
        APIRenderTypes.initAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, ModType.getAllModTypeStone());
        APIRenderTypes.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, ModType.getAllModTypeWood());
        APIRenderTypes.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, ModType.getAllModTypeWood());
        APIRenderTypes.initAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, ModType.getAllModTypeStone());

        APIRenderTypes.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        APIRenderTypes.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
    }
}
