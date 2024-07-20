package org.senessax.cobbledialogueexpanded.fabric;

import net.fabricmc.api.ModInitializer;
import org.senessax.cobbledialogueexpanded.CobbleDialogueExpanded;

public class CobbleDialogueExpandedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CobbleDialogueExpanded.init();
    }
}