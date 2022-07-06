
package net.mcreator.virgencraft.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.virgencraft.procedures.RageEffectStartedappliedProcedure;

public class RageMobEffect extends MobEffect {
	public RageMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750208);
	}

	@Override
	public String getDescriptionId() {
		return "effect.virgencraft.rage";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RageEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
