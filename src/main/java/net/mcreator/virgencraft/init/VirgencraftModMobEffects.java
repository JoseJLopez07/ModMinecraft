
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.virgencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.virgencraft.potion.RageMobEffect;
import net.mcreator.virgencraft.VirgencraftMod;

public class VirgencraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, VirgencraftMod.MODID);
	public static final RegistryObject<MobEffect> RAGE = REGISTRY.register("rage", () -> new RageMobEffect());
}
