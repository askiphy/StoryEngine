package com.huntersteam.storytelling.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup STORYTELLING_GROUP = new ItemGroup("storytellingTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.ZENHUNT_HEAD.get());
        }
    };
}
