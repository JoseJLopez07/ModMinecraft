package net.mcreator.virgencraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.virgencraft.init.VirgencraftModMobEffects;

public class DragonSlayerEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(VirgencraftModMobEffects.RAGE.get(), 200, 0, (false), (true)));
	}
}
