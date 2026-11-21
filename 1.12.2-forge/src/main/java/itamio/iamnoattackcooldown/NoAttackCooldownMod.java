package itamio.iamnoattackcooldown;

import net.minecraftforge.fml.common.Mod;

/**
 * Entry point for the Forge 1.12.2 variant. Behaviour is provided entirely by
 * the single {@code EntityPlayerMixin} registered through MixinBooter.
 */
@Mod(modid = NoAttackCooldownMod.MOD_ID, name = NoAttackCooldownMod.MOD_NAME, version = NoAttackCooldownMod.VERSION)
public class NoAttackCooldownMod {

    public static final String MOD_ID = "itamionoatk";
    public static final String MOD_NAME = "No Attack Cooldown — Itamio Port";
    public static final String VERSION = "1.0.0";
}
