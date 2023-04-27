package com.huntersteam.storytelling.spell;

import java.util.ArrayList;
import java.util.List;

public class SpellRegistry {
    private static List<Spell> spells = new ArrayList<>();

    public static void register(Spell spell) {
        spells.add(spell);
    }

    public static List<Spell> getSpells() {
        return spells;
    }
}
