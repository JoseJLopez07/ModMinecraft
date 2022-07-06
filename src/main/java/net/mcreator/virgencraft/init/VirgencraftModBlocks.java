
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.virgencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.virgencraft.block.MineralDeKirosekiBlock;
import net.mcreator.virgencraft.VirgencraftMod;

public class VirgencraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VirgencraftMod.MODID);
	public static final RegistryObject<Block> MINERAL_DE_KIROSEKI = REGISTRY.register("mineral_de_kiroseki", () -> new MineralDeKirosekiBlock());
}
