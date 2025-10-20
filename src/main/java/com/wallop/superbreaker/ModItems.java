package com.wallop.superbreaker;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SUPER_PICKAXE = new PickaxeItem(
        ToolMaterials.DIAMOND, // You can define your own material later
        1, -2.8F,
        new Item.Settings().maxDamage(500).group(ItemGroup.TOOLS)
    );

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("superbreaker", "super_pickaxe"), SUPER_PICKAXE);
    }
}
