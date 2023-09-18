package csmp.core.csmpcore.ItemManagers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManagerPlasmaCore {
    public static ItemStack plasmaCore;

    public ItemManagerPlasmaCore() {
    }

    public static void init() {
        createPlasmaCore();
    }

    private static void createPlasmaCore() {
        plasmaCore = new ItemStack(Material.MAGMA_BLOCK, 1);
        ItemMeta meta = plasmaCore.getItemMeta();
        meta.setDisplayName("plasmacoretest"); //display name
        List<String> lore = new ArrayList<>();
        lore.add("plasmacoretest"); //lore
        for (int i = 0; i < lore.size(); i++) {
            String line = lore.get(i);
            line = line.replace("§o", "");
            lore.set(i, line);
        }
        meta.setLore(lore);
        plasmaCore.setItemMeta(meta);
        ShapedRecipe pcRecipe = new ShapedRecipe(NamespacedKey.minecraft("plasmacore"), plasmaCore);
        pcRecipe.shape(new String[]{"ODO", "CLC", "OCO"});
        pcRecipe.setIngredient('O', Material.OBSIDIAN);
        pcRecipe.setIngredient('C', Material.CRYING_OBSIDIAN);
        pcRecipe.setIngredient('L', Material.LAVA_BUCKET);
        pcRecipe.setIngredient('D', Material.DIAMOND);
        Bukkit.addRecipe(pcRecipe);
    }
}
