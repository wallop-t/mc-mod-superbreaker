package com.wallop.superbreaker;

import net.fabricmc.api.ModInitializer;

public class SuperbreakerMod implements ModInitializer {
    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
