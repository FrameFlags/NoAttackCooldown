package itamio.iamnoattackcooldown;

import net.minecraftforge.fml.common.Mod;

/**
 * Entry point for the Forge 1.20.1 variant. All behaviour lives in the single
 * {@code PlayerMixin} declared in {@code itamionoatk.mixins.json} and registered
 * through {@code [[mixins]]} in {@code META-INF/mods.toml}.
 */
@Mod(NoAttackCooldownMod.MOD_ID)
public final class NoAttackCooldownMod {

    public static final String MOD_ID = "itamionoatk";

    public NoAttackCooldownMod() {
        // No registration needed: the mixin config is loaded by Forge/ModLauncher.
    }
}
