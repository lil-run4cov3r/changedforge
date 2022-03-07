
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedforge.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.changedforge.block.FurrOreBlock;
import net.mcreator.changedforge.block.FurrBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChangedforgeModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block FURR_ORE = register(new FurrOreBlock());
	public static final Block FURR_BLOCK = register(new FurrBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
