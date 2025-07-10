package fr.samlegamer.mcwbyg;

import java.util.List;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.addonslib.data.ModType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final List<String> LEAVES_NO_COLORED = List.of("mahogany", "maple");
	private static final ColorRegistry COLOR = new ColorRegistry(McwByg.MODID, LEAVES_NO_COLORED);

	@Override
	public void onInitializeClient()
	{
		COLOR.colorsBlock();
		COLOR.colorsItem();

		APIRenderTypes.initAllWood(McwByg.MODID, McwByg.WOOD, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwByg.MODID, McwByg.LEAVES);
		APIRenderTypes.initAllStone(McwByg.MODID, McwByg.bridges_rockable, ModType.BRIDGES);
		APIRenderTypes.initAllStone(McwByg.MODID, McwByg.fences_rockable, ModType.ROOFS, ModType.FENCES);
	}
}