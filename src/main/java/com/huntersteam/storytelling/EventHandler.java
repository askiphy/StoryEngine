package com.huntersteam.storytelling;

import com.huntersteam.storytelling.story.Story;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandler {
    @SubscribeEvent
    public void onKeyPressed(InputEvent.KeyInputEvent event) {
        if (event.getKey() == 0) {
            Story.curScene += 1;
        }
    }
}
