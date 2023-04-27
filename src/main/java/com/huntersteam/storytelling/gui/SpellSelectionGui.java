/*
package com.huntersteam.storytelling.gui;

import com.huntersteam.storytelling.spell.Spell;
import com.huntersteam.storytelling.spell.SpellRegistry;
import com.ibm.icu.impl.CollectionSet;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class SpellSelectionGui extends Screen {
    private PlayerEntity caster;
    private boolean hasSelectedSpell = false;
    private Spell selectedSpell;

    public SpellSelectionGui(PlayerEntity caster, List buttonList) {
        super((ITextComponent) caster);
        this.caster = caster;
    }

    public void initGui() {
        super.init();
        CollectionSet<Button> buttonList = null;
        buttonList.clear();
        int y = 0;
        for (Spell spell : SpellRegistry.getSpells()) {
            if (caster.experienceLevel >= spell.getCost()) {
                Button button = new Button(buttonList.size(), width / 2 - 50, height / 4 + y, spell.getName());
                buttonList.add(button);
                y += 20;
            }
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    protected void actionPerformed(Button button) {
        hasSelectedSpell = true;
        selectedSpell = SpellRegistry.getSpells().get(button.id);
        Minecraft.getInstance().displayGuiScreen(null);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    public boolean hasSelectedSpell() {
        return hasSelectedSpell;
    }

    public Spell getSelectedSpell() {
        return selectedSpell;
    }
}

 */