
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedforge.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ChangedforgeModTabs {
	public static CreativeModeTab TAB_FURRY;

	public static void load() {
		TAB_FURRY = new CreativeModeTab("tabfurry") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ChangedforgeModItems.FURR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
