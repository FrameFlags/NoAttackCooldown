# Credits

## Upstream

- **No Attack Cooldown** by **makaseloli** — <https://github.com/makaseloli/No-Attack-Cooldown>
  - Licensed under the BSD 2-Clause License.
  - The attack-cooldown-removal mixin (`getAttackStrengthScale` returning `1.0F`) is adapted from this project.
  - The upstream's extra "always sweep attack" feature was deliberately **not** ported; this mod only removes the cooldown.

## This port

- Ported and packaged by **Sekai0NI0itamio** for Minecraft 1.12.2 Forge, 1.20.1 Fabric and 1.20.1 Forge.
- Package: `itamio.iamnoattackcooldown`; mod id: `itamionoatk`.

## Tooling / libraries

- [Mixin](https://github.com/SpongePowered/Mixin) (BSD 2-Clause) — used via Fabric Loader / MixinBooter / SpongePowered Gradle plugin; not redistributed as a standalone shaded library by this mod.
- [MixinBooter](https://github.com/Shadows-of-Fire/MixinBooter) by Shadows-of-Fire / Rongmario — used by the 1.12.2 Forge variant to load the mixin config.
