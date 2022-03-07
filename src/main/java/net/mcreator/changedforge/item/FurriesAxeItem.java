
package net.mcreator.changedforge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.changedforge.init.ChangedforgeModItems;

public class FurriesAxeItem extends AxeItem {
	public FurriesAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ChangedforgeModItems.FURR));
			}
		}, 1, -3.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("furries_axe");
	}
}
