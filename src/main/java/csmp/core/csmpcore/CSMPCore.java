package csmp.core.csmpcore;

import csmp.core.csmpcore.Commands.Cosmetics;
import csmp.core.csmpcore.ItemManagers.ItemManagerDoubleBoots;
import csmp.core.csmpcore.ItemManagers.ItemManagerPlasmaCore;
import csmp.core.csmpcore.ItemManagers.ItemManagerStarlightScimitar;
import csmp.core.csmpcore.ItemManagers.ItemManagerWFeather;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CSMPCore extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Enabling CSMPCore");
        ItemManagerPlasmaCore.init();
        ItemManagerStarlightScimitar.init();
        ItemManagerWFeather.init();
        ItemManagerDoubleBoots.init();
        Bukkit.getPluginCommand("cosmetics").setExecutor(new Cosmetics());
        Bukkit.getPluginManager().registerEvents(new BootsJumpStuff(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
