package itamio.iamnoattackcooldown.core;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import zone.rong.mixinbooter.IEarlyMixinLoader;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * FML core plugin that registers this mod's single mixin config with MixinBooter.
 *
 * <p>Forge 1.12.2 has no native Mixin support. MixinBooter discovers core plugins
 * implementing {@link IEarlyMixinLoader} through its own FML core plugin and queues
 * the configs returned by {@link #getMixinConfigs()}. This jar declares this class
 * as {@code FMLCorePlugin} in its manifest; Mixin itself is NOT shaded here.</p>
 */
@IFMLLoadingPlugin.Name("itamionoatk")
@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.SortingIndex(1001)
public class NoAttackCooldownCorePlugin implements IFMLLoadingPlugin, IEarlyMixinLoader {

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        // No setup required.
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

    @Override
    public List<String> getMixinConfigs() {
        return Collections.singletonList("itamionoatk.mixins.json");
    }
}
