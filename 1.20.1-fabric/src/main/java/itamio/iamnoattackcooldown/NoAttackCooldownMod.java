package itamio.iamnoattackcooldown;

import net.fabricmc.api.ModInitializer;

/**
 * Entry point for the Fabric variant. All behaviour lives in the single
 * {@code PlayerMixin} declared in {@code itamionoatk.mixins.json}.
 */
public final class NoAttackCooldownMod implements ModInitializer {

    @Override
    public void onInitialize() {
        // Nothing to register: the mixin config is loaded by Fabric Loader.
    }
}
