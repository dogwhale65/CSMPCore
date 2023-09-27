package csmp.core.csmpcore.ItemManagers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManagerWFeather {
    public static ItemStack wFeather;

    public ItemManagerWFeather() {
    }

    public static void init() {
        createwFeather();
    }

    private static void createwFeather() {
        wFeather = new ItemStack(Material.FEATHER, 1);
        ItemMeta meta = wFeather.getItemMeta();
        meta.setDisplayName("§dWeightless Feather"); //display name
        List<String> lore = new ArrayList<>();
        lore.add("§8Lighter than silk."); //lore
        for (int i = 0; i < lore.size(); i++) {
            String line = lore.get(i);
            line = line.replace("§o", "");
            lore.set(i, line);
        }
        meta.setLore(lore);
        wFeather.setItemMeta(meta);
        ShapedRecipe wfRecipe = new ShapedRecipe(NamespacedKey.minecraft("wfeather"), wFeather);
        wfRecipe.shape(new String[]{"FFF", "FFF", "FFF"});
        wfRecipe.setIngredient('F', Material.FEATHER);
        Bukkit.addRecipe(wfRecipe);
    }
}
