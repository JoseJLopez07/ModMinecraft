package net.mcreator.virgencraft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.virgencraft.network.VirgencraftModVariables;

public class OpenMenuOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(VirgencraftModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new VirgencraftModVariables.PlayerVariables())).power_system).equals("")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Conchesumare"), (true));
		}
	}
}
