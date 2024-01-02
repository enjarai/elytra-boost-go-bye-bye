package dev.enjarai.elytraboostcya.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FireworkRocketItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FireworkRocketItem.class)
public abstract class FireworkRocketItemMixin {
    // Intentionally using redirect as this will never return the original value.
    @Redirect(
            method = "use",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/player/PlayerEntity;isFallFlying()Z"
            )
    )
    private boolean yeet(PlayerEntity instance) {
        return false;
    }
}
