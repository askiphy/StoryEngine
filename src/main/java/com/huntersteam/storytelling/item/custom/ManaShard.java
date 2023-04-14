package com.huntersteam.storytelling.item.custom;

import com.huntersteam.storytelling.gui.ChoiceGui;
import com.huntersteam.storytelling.gui.DialogueGui;
import com.huntersteam.storytelling.story.Story;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Timer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManaShard extends Item {
    public ManaShard(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        Minecraft minecraft = Minecraft.getInstance();
        List<String> dialogOptions = new ArrayList<>();
        dialogOptions.add("Опция 1");
        dialogOptions.add("Отдать осколки");
        minecraft.displayGuiScreen(new ChoiceGui(dialogOptions));
        return super.onItemUseFirst(stack, context);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.storytelling.mana_shard"));
    }
}
