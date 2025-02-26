package fr.samlegamer.mcwterraformersmc.client;

import fr.samlegamer.addonslib.client.APIRenderer;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwterraformersmc.McwTerraformersMC;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import java.util.List;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
    protected static final ColorRegistry colorRegistry = new ColorRegistry(McwTerraformersMC.MODID, List.of("redwood", "hemlock", "rubber", "cypress",
            "willow", "japanese_maple_shrub", "rainbow_eucalyptus"));

    @Override
    public void onInitializeClient()
    {
        colorRegistry.colorsBlock();
        colorRegistry.colorsItem();

        APIRenderer.Bridges.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Bridges.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Bridges.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES);
        APIRenderer.Bridges.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        APIRenderer.Bridges.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA);

        APIRenderer.Roofs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Roofs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Roofs.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES);
        APIRenderer.Roofs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        APIRenderer.Roofs.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA);

        APIRenderer.Fences.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Fences.clientHedge(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        APIRenderer.Fences.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Fences.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES);
        APIRenderer.Fences.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        APIRenderer.Fences.clientHedge(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
        APIRenderer.Fences.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA);

        APIRenderer.Furnitures.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Furnitures.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Furnitures.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        APIRenderer.Stairs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Stairs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Stairs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        APIRenderer.Paths.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Paths.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Paths.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        APIRenderer.Doors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Doors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Doors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        APIRenderer.Trapdoors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Trapdoors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Trapdoors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        APIRenderer.Windows.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        APIRenderer.Windows.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        APIRenderer.Windows.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
    }
}
