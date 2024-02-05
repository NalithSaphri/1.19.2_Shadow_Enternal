package com.nalithsaphri.shadowenternal.block;

import com.mojang.blaze3d.platform.Lighting;
import com.nalithsaphri.shadowenternal.ShadowEnternal;
import com.nalithsaphri.shadowenternal.item.ModCreativeModeTab;
import com.nalithsaphri.shadowenternal.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ShadowEnternal.MODID);

    public static final RegistryObject<Block> SHADOWALTER = registerBlock("shadowalter", () ->
            new Block(BlockBehaviour.Properties.of(Material.AIR).explosionResistance(-1).strength(3)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.SHADOWENTERNALTAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                    CreativeModeTab creativeModeTab){
     RegistryObject<T> toReturn = BLOCKS.register(name, block);
     registerBlockItem(name, toReturn, creativeModeTab);
     return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void Register(IEventBus eventbus){
        BLOCKS.register(eventbus);
    }
}
