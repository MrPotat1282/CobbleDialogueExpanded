package org.senessax.cobbledialogueexpanded.forge;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.senessax.cobbledialogueexpanded.CobbleDialogueExpanded;

@Mod(CobbleDialogueExpanded.MOD_ID)
public class CobbleDialogueExpandedForge {
    public CobbleDialogueExpandedForge() {
        CobbleDialogueExpanded.init();
    }

}