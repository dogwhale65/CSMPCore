package csmp.core.csmpcore;

import csmp.core.csmpcore.ItemManagers.ItemManagerDoubleBoots;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BootsJumpStuff implements Listener {
    private CSMPCore plugin;
    public BootsJumpStuff(CSMPCore plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void onInventoryChange(InventoryInteractEvent event) {
        Player player = (Player) event.getInventory();
        if (player.getInventory().getBoots().equals(ItemManagerDoubleBoots.doubleBoots)) {

        } else {

        }
    }
}
