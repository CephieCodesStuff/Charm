package svenhjol.charm;

import net.fabricmc.api.ModInitializer;
import svenhjol.charm.init.*;
import svenhjol.charm.loader.CharmModule;
import svenhjol.charm.loader.CommonLoader;

@SuppressWarnings("unused")
public class Charm implements ModInitializer {
    public static final String MOD_ID = "charm";
    public static CommonLoader<CharmModule> LOADER = new CommonLoader<>(MOD_ID, "svenhjol.charm.module");

    private static boolean hasStartedCharm = false;

    @Override
    public void onInitialize() {
        init();
    }

    public static void init() {
        if (hasStartedCharm) return;

        // TODO: Particles, Structures and Decoration init has permanently moved to Strange

        CharmLog.init();
        CharmLoot.init();
        CharmSounds.init();
        CharmBiomes.init();
        CharmAdvancements.init();

        LOADER.init();

        hasStartedCharm = true;
    }
}