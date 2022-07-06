
package net.mcreator.virgencraft.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.virgencraft.init.VirgencraftModTabs;

public class SombreroDePajaItem extends Item {
	public SombreroDePajaItem() {
		super(new Item.Properties().tab(VirgencraftModTabs.TAB_VIRGO).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
