package itamio.iamnoattackcooldown.mixin;

import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Removes the vanilla attack cooldown by always reporting full attack strength
 * from {@code Player#getAttackStrengthScale(float)}.
 *
 * <p>Adapted from makaseloli's No Attack Cooldown (BSD-2-Clause). The upstream's
 * extra "always sweep attack" feature is intentionally NOT part of this port.</p>
 */
@Mixin(Player.class)
abstract class PlayerMixin {

    @Inject(method = "getAttackStrengthScale", at = @At("HEAD"), cancellable = true)
    private void iamnoatk$getAttackStrengthScale(float adjustTicks, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(1.0F);
    }
}
