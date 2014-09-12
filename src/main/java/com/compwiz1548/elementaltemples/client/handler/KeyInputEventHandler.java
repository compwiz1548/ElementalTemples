package com.compwiz1548.elementaltemples.client.handler;

import com.compwiz1548.elementaltemples.client.settings.Keybindings;
import com.compwiz1548.elementaltemples.reference.Key;
import com.compwiz1548.elementaltemples.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
            return Key.CHARGE;
        else if (Keybindings.release.isPressed())
            return Key.RELEASE;
        else
            return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }
}
