package fr.samlegamer.mcwbyg.client;

import java.util.List;
import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwbyg.McwByg;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final List<String> LEAVES_NO_COLORED = List.of("maple", "flowering_yucca", "mahogany");
	private static final ColorRegistry COLOR = new ColorRegistry(McwByg.MODID, LEAVES_NO_COLORED);

	@Override
	public void onInitializeClient()
	{
		COLOR.colorsBlock();
		COLOR.colorsItem();

        APIRenderTypes.initAllWood(McwByg.MODID, McwByg.WOOD, Registration.getAllModTypeWood());
        APIRenderTypes.initAllStone(McwByg.MODID, McwByg.STONE, Registration.getAllModTypeStone());
        APIRenderTypes.initAllLeave(McwByg.MODID, McwByg.LEAVES);
	}
}