package com.huntersteam.storytelling.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.AbstractButton;
import net.minecraft.util.text.StringTextComponent;

public class OptionList extends AbstractButton {
    private final ChoiceGui screen;
    private final String[] options;
    private int selectedIndex;

    public OptionList(ChoiceGui screen, int x, int y, int width, int height, String[] options) {
        super(x, y, width, height, new StringTextComponent(options[0]));
        this.screen = screen;
        this.options = options;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        Minecraft.getInstance().getTextureManager().bindTexture(WIDGETS_LOCATION);
        RenderSystem.disableDepthTest();
        int i = this.getYImage(this.isHovered());
        blit(matrixStack, this.x, this.y, 0, 46 + i * 20, this.width / 2, this.height);
        blit(matrixStack, this.x + this.width / 2, this.y, 200 - this.width / 2, 46 + i * 20, this.width / 2, this.height);
        this.renderBg(matrixStack, Minecraft.getInstance(), mouseX, mouseY);
        int j = this.getFGColor();
        drawString(matrixStack, Minecraft.getInstance().fontRenderer, this.options[selectedIndex], this.x + 4, this.y + (this.height - 8) / 2, j);
    }

    protected int getHoverState(boolean isHovered) {
        return 0;
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0 && this.isMouseOver(mouseX, mouseY)) {
            selectedIndex = (selectedIndex + 1) % options.length;
            setMessage(new StringTextComponent(options[selectedIndex]));
            screen.onOptionSelected(selectedIndex);
            return true;
        }
        return false;
    }

    public double mouseClicked(double mouseX, double mouseY) {
        return mouseX;
    }

    @Override
    public void onPress() {

    }
}
