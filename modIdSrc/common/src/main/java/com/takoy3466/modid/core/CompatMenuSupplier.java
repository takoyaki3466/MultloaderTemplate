package com.takoy3466.modid.core;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

@FunctionalInterface
public interface CompatMenuSupplier<T extends AbstractContainerMenu> {
    T create(int id, Inventory inventory);
}