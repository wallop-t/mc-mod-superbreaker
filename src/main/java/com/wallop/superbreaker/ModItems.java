package com.wallop.superbreaker;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SUPERBREAKER = new Item(
        new Item.Settings().maxDamage(500)
    );

    public static void registerItems() {
        Registry.register(Registries.ITEM, Identifier.of("superbreaker", "superbreaker"), SUPERBREAKER);
    }
}
