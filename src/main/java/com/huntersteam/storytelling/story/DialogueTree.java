package com.huntersteam.storytelling.story;

import com.huntersteam.storytelling.gui.ChoiceGui;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class DialogueTree {
    private List<Dialogue> dialogues;

    public DialogueTree() {
        List<String> dialogOptions = new ArrayList<>();
        dialogOptions.add("Простить");
        dialogOptions.add("Послать");
        dialogues = new ArrayList<Dialogue>();
        dialogues.add(new Dialogue("Негр", "Привет. Ты меня любишь?"));
        dialogues.add(new Dialogue("ZenHunT", "Нет, ты §0негр"));
        dialogues.add(new Dialogue("Негр", "Ах ты пидор!"));
        dialogues.add(new Dialogue("Негр", "Щас как дам!"));
        dialogues.add(new Dialogue("ZenHunT", "Пошла нафиг чурка чёрная!"));
        dialogues.add(new Dialogue("Сюжет", "После этого §0Негр§r заплакал и ушёл!"));
        dialogues.add(new Dialogue("BananusYT_", "Ты зачем его обижаешь?"));
        dialogues.add(new Dialogue("ZenHunT", "Иди нафиг негр!"));
        dialogues.add(new Dialogue("BananusYT_", "Я тебе сюжет делать не буду)"));
        dialogues.add(new Dialogue("ZenHunT", "Ладно прости!!!!!"));
        dialogues.add(new Dialogue("Сюжет", "ZenHunT стал в слезах умолять Банануса продолжить создание сюжета"));
        dialogues.add(new Dialogue("Сюжет", "Выберите: послать или простить?"));
        new DialogButton(new StringTextComponent("Послать"), () -> {
            Story.sendMessage(Minecraft.getInstance().player, "[ZenHunT]", "Спасибо!");
        });
        new DialogButton(new StringTextComponent("Послать"), () -> {
            Story.sendMessage(Minecraft.getInstance().player, "[ZenHunT]", "Спасибо!");
        });
    }

    public List<Dialogue> getDialogues() {
        return dialogues;
    }
}
