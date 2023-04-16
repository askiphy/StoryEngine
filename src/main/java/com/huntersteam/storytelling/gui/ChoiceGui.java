package com.huntersteam.storytelling.gui;

import com.huntersteam.storytelling.item.ModItems;
import com.huntersteam.storytelling.story.Story;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.ImageButton;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

import java.util.List;

public class ChoiceGui extends Screen {
    private final List<String> dialogOptions;
    private String selectedOption = null;
    private boolean hasRequiredItem;

    public ChoiceGui(List<String> dialogOptions) {
        super(new StringTextComponent("Выберите опцию:"));
        this.dialogOptions = dialogOptions;
    }

    @Override
    protected void init() {
        super.init();
        PlayerInventory inventory = Minecraft.getInstance().player.inventory;
        ResourceLocation imageLocation = new ResourceLocation("storytelling", "textures/gui/inactive_choice_button.png");

        for (int i = 0; i < dialogOptions.size(); i++) {
            String option = dialogOptions.get(i);
            int finalI = i;
            Button button = new Button(this.width / 2 - 50, 60 + i * 30, 100, 20, new StringTextComponent(option), (btn) -> {
                selectedOption = option;
                Minecraft.getInstance().displayGuiScreen(null);

                // здесь ты можешь проверить, какая кнопка была нажата
                if (option.equals("Простить")) {
                    // если нажата первая кнопка, отправляем сообщение в чат
                    Story.sendMessage(minecraft.player, "[ZenHunT]", "Спасибо большое! Я люблю тебя!");
                    Story.sendMessage(minecraft.player, "[BananusYT_]", "Иди нафиг чурка!");
                }
                if (option.equals("Послать") && hasRequiredItem) {
                    Story.sendMessage(minecraft.player, "[ZenHunT]", "Ну я прошу прости меня!");
                    Story.sendMessage(minecraft.player, "[BananusYT_]", "Ладно! Прощаю!");
                }

            });

            this.addButton(button);
        }
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    public int onOptionSelected(int selectedIndex) {
        return selectedIndex;
    }
}