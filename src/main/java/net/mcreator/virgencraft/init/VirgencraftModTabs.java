
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.virgencraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class VirgencraftModTabs {
	public static CreativeModeTab TAB_VIRGO;

	public static void load() {
		TAB_VIRGO = new CreativeModeTab("tabvirgo") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(VirgencraftModItems.KAIROSEKI.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
