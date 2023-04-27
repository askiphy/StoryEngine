/*
package com.huntersteam.storytelling.story;

import com.google.common.base.Predicates;
import com.sun.javafx.geom.Vec3d;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;

import java.util.List;

public class EntityUtils {
    public static Entity getClosestEntityInSight(PlayerEntity player, double maxDistance) {
        Vector3d eyePosition = player.getEyePosition(1.0f);
        Vector3d lookVec = player.getLook(1.0f);
        Vector3d maxRange = eyePosition.add(lookVec.scale(maxDistance));

        AxisAlignedBB boundingBox = AxisAlignedBB.fromVector(player.getBoundingBox().getCenter());
        List<Entity> entities = player.world.getEntitiesInAABBexcluding(player, boundingBox, Predicates.and(EntityPredicates.NOT_SPECTATING, Entity::canBeCollidedWith));
        double closestDistance = maxDistance;
        Entity closestEntity = null;

        for (Entity entity : entities) {
            AxisAlignedBB result = entity.getBoundingBox();
            if (result != null) {
                double distance = eyePosition.distanceTo(result.getCenter());
                if (distance < closestDistance && entity instanceof MobEntity) {
                    closestDistance = distance;
                    closestEntity = entity;
                }
            }
        }

        return closestEntity;
    }
}
*/