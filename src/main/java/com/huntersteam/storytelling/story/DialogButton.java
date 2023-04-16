package com.huntersteam.storytelling.story;

import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;

public class DialogButton extends Button {
    private final Runnable onClickHandler;

    public DialogButton(ITextComponent displayString, Runnable onClickHandler) {
        super(0, 0, 200, 20, displayString, button -> onClickHandler.run());
        this.onClickHandler = onClickHandler;
    }

    public void onClick() {
        onClickHandler.run();
    }
}