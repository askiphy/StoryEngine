package com.huntersteam.storytelling.gui;

import com.huntersteam.storytelling.story.DialogueTree;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;

public class DialogueGui extends Screen {
    private int dialogueIndex = 0;
    private final DialogueTree dialogueTree = new DialogueTree();

    public DialogueGui() {
        super(new StringTextComponent("Dialogue"));
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        drawCenteredString(matrixStack, this.font, dialogueTree.getDialogues().get(dialogueIndex).getSpeaker(), this.width / 2, 40, 0xFFFFFF);
        drawCenteredString(matrixStack, this.font, dialogueTree.getDialogues().get(dialogueIndex).getMessage(), this.width / 2, 60, 0xFFFFFF);
        PlayerModel<PlayerEntity> model = new PlayerModel<>(0, false);
        PlayerModelRenderer renderer = new PlayerModelRenderer(Minecraft.getInstance().getRenderManager(), model, 0.5f);
        Minecraft.getInstance().getRenderManager().register(EntityType.PLAYER, renderer);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0) {
            if (dialogueIndex < dialogueTree.getDialogues().size() - 1) {
                dialogueIndex++;
                return true;
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }
}
