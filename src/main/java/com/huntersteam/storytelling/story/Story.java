package com.huntersteam.storytelling.story;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;

public class Story {
    public static int curScene = 0;
    public static boolean manaShardUse = false;
    public static void sendMessage(PlayerEntity player, String author, String msg) {
       player.sendMessage(new StringTextComponent(author + " " + msg), player.getUniqueID());
    }

    public static void loadScene(PlayerEntity player, int sceneId) {
      if (sceneId == 1) {
          sendMessage(player, "§d[Неизвестный]§f", "На удивление ты ещё жив...");
          curScene++;
      } else {
          sendMessage(player, "§d[Сюжет]§f", "Произошла ошибка или сцены не существует!");
      }
    }
}
