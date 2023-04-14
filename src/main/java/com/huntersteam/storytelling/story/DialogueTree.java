package com.huntersteam.storytelling.story;

import java.util.ArrayList;
import java.util.List;

public class DialogueTree {
    private List<Dialogue> dialogues;

    public DialogueTree() {
        dialogues = new ArrayList<Dialogue>();
        dialogues.add(new Dialogue("Негр", "Привет. Ты меня любишь?"));
        dialogues.add(new Dialogue("ZenHunT", "Нет, ты негр"));
    }

    public List<Dialogue> getDialogues() {
        return dialogues;
    }
}
