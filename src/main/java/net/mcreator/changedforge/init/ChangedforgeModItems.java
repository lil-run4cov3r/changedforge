
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.changedforge.item.SaaaItem;
import net.mcreator.changedforge.item.FurrsuitArmorItem;
import net.mcreator.changedforge.item.FurriesSwordItem;
import net.mcreator.changedforge.item.FurriesShovelItem;
import net.mcreator.changedforge.item.FurriesPickaxeItem;
import net.mcreator.changedforge.item.FurriesHoeItem;
import net.mcreator.changedforge.item.FurriesAxeItem;
import net.mcreator.changedforge.item.FurrItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChangedforgeModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item FURR = register(new FurrItem());
	public static final Item FURR_ORE = register(ChangedforgeModBlocks.FURR_ORE, ChangedforgeModTabs.TAB_FURRY);
	public static final Item FURR_BLOCK = register(ChangedforgeModBlocks.FURR_BLOCK, ChangedforgeModTabs.TAB_FURRY);
	public static final Item FURRSUIT_ARMOR_HELMET = register(new FurrsuitArmorItem.Helmet());
	public static final Item FURRSUIT_ARMOR_CHESTPLATE = register(new FurrsuitArmorItem.Chestplate());
	public static final Item FURRSUIT_ARMOR_LEGGINGS = register(new FurrsuitArmorItem.Leggings());
	public static final Item FURRSUIT_ARMOR_BOOTS = register(new FurrsuitArmorItem.Boots());
	public static final Item SAAA = register(new SaaaItem());
	public static final Item FURRIES_PICKAXE = register(new FurriesPickaxeItem());
	public static final Item FURRIES_AXE = register(new FurriesAxeItem());
	public static final Item FURRIES_SWORD = register(new FurriesSwordItem());
	public static final Item FURRIES_SHOVEL = register(new FurriesShovelItem());
	public static final Item FURRIES_HOE = register(new FurriesHoeItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
