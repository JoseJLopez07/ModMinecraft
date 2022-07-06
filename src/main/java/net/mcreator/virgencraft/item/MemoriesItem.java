
package net.mcreator.virgencraft.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.virgencraft.init.VirgencraftModSounds;

public class MemoriesItem extends RecordItem {
	public MemoriesItem() {
		super(0, VirgencraftModSounds.REGISTRY.get(new ResourceLocation("virgencraft:memories")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
