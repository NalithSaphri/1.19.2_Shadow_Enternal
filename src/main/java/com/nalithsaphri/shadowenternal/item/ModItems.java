package com.nalithsaphri.shadowenternal.item;

import com.nalithsaphri.shadowenternal.ShadowEnternal;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShadowEnternal.MODID);


    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.SHADOWENTERNAL)));
    public static final RegistryObject<Item> TEST_COOK_ITEM = ITEMS.register("test_cook_item",
            () -> new Item(new Item.Properties().stacksTo(16).tab(ModCreativeModeTab.SHADOWENTERNAL)));

    public static void Register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
