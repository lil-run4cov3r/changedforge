package net.mcreator.changedforge.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.changedforge.init.ChangedforgeModItems;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class ArmorProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == ChangedforgeModItems.FURRSUIT_ARMOR_BOOTS && entity instanceof Player) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("changedforge:boots_with_the_furr"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == ChangedforgeModItems.FURRSUIT_ARMOR_LEGGINGS && entity instanceof Player) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("changedforge:we_wont_be_needing_those"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
				.getItem() == ChangedforgeModItems.FURRSUIT_ARMOR_CHESTPLATE && entity instanceof Player) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("changedforge:flufff"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ChangedforgeModItems.FURRSUIT_ARMOR_HELMET && entity instanceof Player) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("changedforge:funny_f_urry"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
