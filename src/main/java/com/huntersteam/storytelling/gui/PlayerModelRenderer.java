package com.huntersteam.storytelling.gui;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class PlayerModelRenderer extends LivingRenderer<PlayerEntity, PlayerModel<PlayerEntity>> {

    public PlayerModelRenderer(EntityRendererManager manager, PlayerModel<PlayerEntity> model, float shadowSize) {
        super(manager, model, shadowSize);
    }

    @Override
    public ResourceLocation getEntityTexture(PlayerEntity entity) {
        // Возвращает путь к текстуре модели персонажа.
        // Для модели по умолчанию можно использовать Textures.PLAYER_LOCATION.
        return Textures.PLAYER_LOCATION;
    }
}
