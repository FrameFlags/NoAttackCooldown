package itamio.iamnoattackcooldown.mixin;

import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Removes the vanilla attack cooldown by always reporting full cooled attack
 * strength from {@code EntityPlayer#getCooledAttackStrength(float)} (MCP stable_39).
 *
 * <p>Adapted from makaseloli's No Attack Cooldown (BSD-2-Clause). The upstream's
 * extra "always sweep attack" feature is intentionally NOT part of this port.</p>
 */
@Mixin(EntityPlayer.class)
public abstract class EntityPlayerMixin {

    @Inject(method = "getCooledAttackStrength", at = @At("HEAD"), cancellable = true)
    private void iamnoatk$getCooledAttackStrength(float adjustTicks, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(1.0F);
    }
}
