
package net.mcreator.virgencraft.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.virgencraft.init.VirgencraftModTabs;

public class ToyakoBokutoItem extends SwordItem {
	public ToyakoBokutoItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_PLANKS), new ItemStack(Blocks.SPRUCE_PLANKS), new ItemStack(Blocks.BIRCH_PLANKS),
						new ItemStack(Blocks.DARK_OAK_PLANKS), new ItemStack(Blocks.ACACIA_PLANKS), new ItemStack(Blocks.JUNGLE_PLANKS));
			}
		}, 3, -2.4f, new Item.Properties().tab(VirgencraftModTabs.TAB_VIRGO));
	}
}
