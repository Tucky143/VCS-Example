/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vcsexample.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.vcsexample.item.TestStickItem;
import net.mcreator.vcsexample.VcsexampleMod;

public class VcsexampleModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(VcsexampleMod.MODID);
	public static final DeferredItem<Item> TEST_STICK;
	static {
		TEST_STICK = REGISTRY.register("test_stick", TestStickItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}