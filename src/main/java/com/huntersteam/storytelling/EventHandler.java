package com.huntersteam.storytelling;

import com.huntersteam.storytelling.item.ModItems;
import com.huntersteam.storytelling.spell.Spell;
import com.huntersteam.storytelling.spell.SpellTargetType;
import com.huntersteam.storytelling.story.Story;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.swing.text.html.parser.Entity;

@Mod.EventBusSubscriber(modid = "storytelling", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class EventHandler {
    Spell spell = new Spell("Aero", 100, SpellTargetType.MOB_IN_SIGHT, "Волшебная палочка");
    @SubscribeEvent
    public void onKeyPressed(InputEvent.KeyInputEvent event) {
        if (event.getKey() == 0) {
            Story.curScene += 1;
        }
    }

    public void onChatMessage(ClientChatReceivedEvent event) {
        boolean aero = event.getMessage().equals("Aero") && Minecraft.getInstance().player.getHeldItemMainhand().getItem().equals(ModItems.MAGIC_WAND);
        if (aero) {
            spell.cast(Minecraft.getInstance().player, Entity.ANY);
        }
    }
}
