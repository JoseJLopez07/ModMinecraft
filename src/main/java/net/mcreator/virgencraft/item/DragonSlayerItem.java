
package net.mcreator.virgencraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.virgencraft.procedures.DragonSlayerEntitySwingsItemProcedure;
import net.mcreator.virgencraft.init.VirgencraftModTabs;

public class DragonSlayerItem extends SwordItem {
	public DragonSlayerItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(VirgencraftModTabs.TAB_VIRGO).fireResistant());
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		DragonSlayerEntitySwingsItemProcedure.execute(entity);
		return retval;
	}
}
