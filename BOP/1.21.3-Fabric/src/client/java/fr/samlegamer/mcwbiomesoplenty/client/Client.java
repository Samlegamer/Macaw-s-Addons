package fr.samlegamer.mcwbiomesoplenty.client;

import java.util.Arrays;
import java.util.List;

import fr.samlegamer.addonslib.Registration;
import fr.samlegamer.addonslib.client.APIRenderTypes;
import fr.samlegamer.addonslib.client.ColorRegistry;
import fr.samlegamer.mcwbiomesoplenty.McwBOP;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer
{
	private static final List<String> LEAVES_NO_COLORED = Arrays.asList("pine", "mahogany", "willow", "palm", "flowering_oak");
	private static final ColorRegistry COLOR = new ColorRegistry(McwBOP.MODID, LEAVES_NO_COLORED);

	@Override
	public void onInitializeClient()
	{
		COLOR.colorsBlock();
		COLOR.colorsItem();
		APIRenderTypes.initAllWood(McwBOP.MODID, McwBOP.WOOD, Registration.getAllModTypeWood());
		APIRenderTypes.initAllLeave(McwBOP.MODID, McwBOP.LEAVES);
	}
}