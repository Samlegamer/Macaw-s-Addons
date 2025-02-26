package fr.samlegamer.mcwterraformersmc;

import fr.samlegamer.addonslib.bridges.Bridges;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.addonslib.door.Doors;
import fr.samlegamer.addonslib.fences.Fences;
import fr.samlegamer.addonslib.furnitures.Furnitures;
import fr.samlegamer.addonslib.path.Paths;
import fr.samlegamer.addonslib.roofs.Roofs;
import fr.samlegamer.addonslib.stairs.Stairs;
import fr.samlegamer.addonslib.trapdoor.Trapdoors;
import fr.samlegamer.addonslib.windows.Windows;
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

        Bridges.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Bridges.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Bridges.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES);
        Bridges.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        Bridges.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA);

        Roofs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Roofs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Roofs.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES);
        Roofs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        Roofs.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA);

        Fences.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Fences.clientHedge(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TRAVERSE);
        Fences.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Fences.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_CINDERSCAPES);
        Fences.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
        Fences.clientHedge(McwTerraformersMC.MODID, McwTerraformersMC.LEAVES_TERRESTRIA);
        Fences.clientStone(McwTerraformersMC.MODID, McwTerraformersMC.ROCKS_TERRESTRIA);

        Furnitures.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Furnitures.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Furnitures.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Stairs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Stairs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Stairs.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Paths.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Paths.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Paths.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Doors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Doors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Doors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Trapdoors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Trapdoors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Trapdoors.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);

        Windows.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TRAVERSE);
        Windows.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_CINDERSCAPES);
        Windows.clientWood(McwTerraformersMC.MODID, McwTerraformersMC.WOODS_TERRESTRIA);
    }
}
