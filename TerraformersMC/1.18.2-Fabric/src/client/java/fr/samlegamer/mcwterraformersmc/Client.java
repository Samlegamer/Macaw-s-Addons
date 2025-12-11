package fr.samlegamer.mcwterraformersmc;

import fr.addonslib.api.client.McwColors;
import fr.samlegamer.addonslib.Finder;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import java.util.Arrays;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
    protected static final ColorRegistry colorRegistry = new ColorRegistry(new McwColors(Arrays.asList(
            Finder.makeIdHedge(McwTerraformersMC.MODID, "redwood"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "hemlock"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "rubber"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "cypress"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "willow"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "japanese_maple_shrub"),
            Finder.makeIdHedge(McwTerraformersMC.MODID, "rainbow_eucalyptus"))));

    @Override
    public void onInitializeClient()
    {
        colorRegistry.registryBlockColorsAverage();
        colorRegistry.registryItemColors();

        APIRenderTypes.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE, Registration.getAllModTypeWood());
        APIRenderTypes.initAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES, Registration.getAllModTypeStone());
        APIRenderTypes.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES, Registration.getAllModTypeWood());
        APIRenderTypes.initAllWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA, Registration.getAllModTypeWood());
        APIRenderTypes.initAllStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA, Registration.getAllModTypeStone());

        APIRenderTypes.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        APIRenderTypes.initAllLeave(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
    }
}
