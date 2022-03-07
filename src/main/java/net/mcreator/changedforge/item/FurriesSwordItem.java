
package net.mcreator.changedforge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.changedforge.init.ChangedforgeModTabs;
import net.mcreator.changedforge.init.ChangedforgeModItems;

public class FurriesSwordItem extends SwordItem {
	public FurriesSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
		}, 3, 95f, new Item.Properties().tab(ChangedforgeModTabs.TAB_FURRY));
		setRegistryName("furries_sword");
	}
}
