package csmp.core.csmpcore.Commands;

import csmp.core.csmpcore.ItemManagers.ItemManagerStarlightScimitar;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;


public class Cosmetics implements CommandExecutor, Listener {
    public String invName = "Select your cosmetic or weapon!";
    int rows = 3;


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory inv = Bukkit.createInventory(player, 9 * rows, invName);
            inv.setItem(10, ItemManagerStarlightScimitar.starScim);
            player.openInventory(inv);


        } else {
            sender.sendMessage("You must be a player to run this command!");
        }

        return true;
    }

}
