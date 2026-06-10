/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vcsexample.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.vcsexample.VcsexampleMod;

@EventBusSubscriber
public class VcsexampleModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VcsexampleMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(VcsexampleModItems.TEST_STICK.get());
			}
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(VcsexampleModItems.TEST_STICK.get());
		}
	}
}