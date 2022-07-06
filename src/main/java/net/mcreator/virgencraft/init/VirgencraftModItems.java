
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.virgencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.virgencraft.item.YoruItem;
import net.mcreator.virgencraft.item.ToyakoBokutoItem;
import net.mcreator.virgencraft.item.SteelIngotItem;
import net.mcreator.virgencraft.item.SombreroDePajaItem;
import net.mcreator.virgencraft.item.ShurikenItem;
import net.mcreator.virgencraft.item.ShirkenItemItem;
import net.mcreator.virgencraft.item.RawSteelIngotItem;
import net.mcreator.virgencraft.item.MurakumogiriItem;
import net.mcreator.virgencraft.item.MemoriesItem;
import net.mcreator.virgencraft.item.MangoYoruItem;
import net.mcreator.virgencraft.item.MangoMurakumogiriItem;
import net.mcreator.virgencraft.item.MangoDragonSlayerItem;
import net.mcreator.virgencraft.item.MangoAceItem;
import net.mcreator.virgencraft.item.KairosekiItem;
import net.mcreator.virgencraft.item.HojaMurakumogiriItem;
import net.mcreator.virgencraft.item.DragonSlayerItem;
import net.mcreator.virgencraft.item.AceItem;
import net.mcreator.virgencraft.VirgencraftMod;

public class VirgencraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VirgencraftMod.MODID);
	public static final RegistryObject<Item> KAIROSEKI = REGISTRY.register("kairoseki", () -> new KairosekiItem());
	public static final RegistryObject<Item> MINERAL_DE_KIROSEKI = block(VirgencraftModBlocks.MINERAL_DE_KIROSEKI,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MEMORIES = REGISTRY.register("memories", () -> new MemoriesItem());
	public static final RegistryObject<Item> RAW_STEEL_INGOT = REGISTRY.register("raw_steel_ingot", () -> new RawSteelIngotItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> SHIRKEN_ITEM = REGISTRY.register("shirken_item", () -> new ShirkenItemItem());
	public static final RegistryObject<Item> SHURIKEN = REGISTRY.register("shuriken", () -> new ShurikenItem());
	public static final RegistryObject<Item> DRAGON_SLAYER = REGISTRY.register("dragon_slayer", () -> new DragonSlayerItem());
	public static final RegistryObject<Item> MANGO_DRAGON_SLAYER = REGISTRY.register("mango_dragon_slayer", () -> new MangoDragonSlayerItem());
	public static final RegistryObject<Item> ACE = REGISTRY.register("ace", () -> new AceItem());
	public static final RegistryObject<Item> MANGO_ACE = REGISTRY.register("mango_ace", () -> new MangoAceItem());
	public static final RegistryObject<Item> SOMBRERO_DE_PAJA = REGISTRY.register("sombrero_de_paja", () -> new SombreroDePajaItem());
	public static final RegistryObject<Item> YORU = REGISTRY.register("yoru", () -> new YoruItem());
	public static final RegistryObject<Item> MANGO_YORU = REGISTRY.register("mango_yoru", () -> new MangoYoruItem());
	public static final RegistryObject<Item> TOYAKO_BOKUTO = REGISTRY.register("toyako_bokuto", () -> new ToyakoBokutoItem());
	public static final RegistryObject<Item> MURAKUMOGIRI = REGISTRY.register("murakumogiri", () -> new MurakumogiriItem());
	public static final RegistryObject<Item> KAIDO = REGISTRY.register("kaido_spawn_egg",
			() -> new ForgeSpawnEggItem(VirgencraftModEntities.KAIDO, -16764007, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MANGO_MURAKUMOGIRI = REGISTRY.register("mango_murakumogiri", () -> new MangoMurakumogiriItem());
	public static final RegistryObject<Item> HOJA_MURAKUMOGIRI = REGISTRY.register("hoja_murakumogiri", () -> new HojaMurakumogiriItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
