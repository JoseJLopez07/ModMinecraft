
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.virgencraft.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.virgencraft.network.OpenMenuMessage;
import net.mcreator.virgencraft.VirgencraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class VirgencraftModKeyMappings {
	public static final KeyMapping OPEN_MENU = new KeyMapping("key.virgencraft.open_menu", GLFW.GLFW_KEY_M, "key.categories.ui");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(OPEN_MENU);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == OPEN_MENU.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						VirgencraftMod.PACKET_HANDLER.sendToServer(new OpenMenuMessage(0, 0));
						OpenMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
