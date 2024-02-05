package com.nalithsaphri.shadowenternal.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SHADOWENTERNALTAB = new CreativeModeTab("shadowenternaltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST_ITEM.get());
        }
    };
}
