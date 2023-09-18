package csmp.core.csmpcore.Commands;

import csmp.core.csmpcore.ItemManagers.ItemManagerStarlightScimitar;
import org.bukkit.BanEntry;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Cosmetics implements CommandExecutor {
    private String invName = "Select your cosmetic or weapon!";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory inv = Bukkit.createInventory(player, 9 * 6, invName);
            inv.setItem(11, ItemManagerStarlightScimitar.StarScim);
            player.openInventory(inv);

        } else {
            sender.sendMessage("You must be a player to run this command!");
        }
        return true;
    }
}
