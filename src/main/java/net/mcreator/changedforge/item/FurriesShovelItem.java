
package net.mcreator.changedforge.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.changedforge.init.ChangedforgeModTabs;
import net.mcreator.changedforge.init.ChangedforgeModItems;

public class FurriesShovelItem extends ShovelItem {
	public FurriesShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
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
		}, 1, -3f, new Item.Properties().tab(ChangedforgeModTabs.TAB_FURRY));
		setRegistryName("furries_shovel");
	}
}
