package com.blockypenguin.mods.mod_template;

import net.fabricmc.api.ModInitializer;

public class ModTemplate implements ModInitializer {

    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
