package com.takoy3466.modid.core;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

@Deprecated
@FunctionalInterface
public interface ICompatContainerFactory<T extends AbstractContainerMenu> extends CompatMenuSupplier<T> {
    T create(int id, Inventory inv, FriendlyByteBuf buf);

    default T create(int id, Inventory inv) {
        return this.create(id, inv, null);
    }
}
