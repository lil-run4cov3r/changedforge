
package net.mcreator.changedforge.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.changedforge.init.ChangedforgeModTabs;

public class FurrItem extends Item {
	public FurrItem() {
		super(new Item.Properties().tab(ChangedforgeModTabs.TAB_FURRY).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("furr");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
