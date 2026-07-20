/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vcsexample.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.vcsexample.VcsexampleMod;

public class VcsexampleModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(VcsexampleMod.MODID);
	public static final DeferredBlock<Block> T_BLOCK;
	static {
		T_BLOCK = REGISTRY.register("t_block", TBlockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}