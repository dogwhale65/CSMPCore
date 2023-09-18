package csmp.core.csmpcore;

import csmp.core.csmpcore.Commands.Cosmetics;
import csmp.core.csmpcore.ItemManagers.ItemManagerPlasmaCore;
import csmp.core.csmpcore.ItemManagers.ItemManagerStarlightScimitar;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CSMPCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Enabling CSMPCore");
        ItemManagerPlasmaCore.init();
        ItemManagerStarlightScimitar.init();
        Bukkit.getPluginCommand("cosmetics").setExecutor(new Cosmetics());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
