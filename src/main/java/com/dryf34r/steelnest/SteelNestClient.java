package com.dryf34r.steelnest;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = SteelNest.MODID, dist = Dist.CLIENT)
public class SteelNestClient {
    public SteelNestClient(ModContainer container) {
        // Lets NeoForge build a config screen from our ModConfigSpec
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
