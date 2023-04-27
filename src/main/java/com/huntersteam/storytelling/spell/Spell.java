package com.huntersteam.storytelling.spell;

import com.huntersteam.storytelling.story.Story;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

public class Spell {
    private String name;
    private int cost;
    private SpellTargetType targetType;
    private String wandName;

    public Spell(String name, int cost, SpellTargetType targetType, String wandName) {
        this.name = name;
        this.cost = cost;
        this.targetType = targetType;
        this.wandName = wandName;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public SpellTargetType getTargetType() {
        return targetType;
    }

    public String getWandName() {
        return wandName;
    }

    public boolean canCast(PlayerEntity caster) {
        return caster.getHeldItemMainhand().getItem().getName().equals(wandName);
    }

    public void cast(PlayerEntity caster, Entity target) {
        Story.sendMessage(caster, "[???]", "Думаешь ты слишком сильный? Никто не может использовать магию кроме меня!");
    }

    public void cast(ClientPlayerEntity player, int any) {
        Story.sendMessage(player, "[???]", "Думаешь ты слишком сильный? Никто не может использовать магию кроме меня!");
    }
}

