package com.wallop.superbreaker;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SUPERBREAKER = new ToolItem(
        new SuperMaterial(),
        new Item.Settings().maxDamage(500).arch$group(ItemGroups.TOOLS)
    );

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("superbreaker", "superbreaker"), SUPERBREAKER);
    }
}
