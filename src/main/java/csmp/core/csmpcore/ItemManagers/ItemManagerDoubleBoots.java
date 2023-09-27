package csmp.core.csmpcore.ItemManagers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManagerDoubleBoots {
    public static ItemStack doubleBoots;

    public ItemManagerDoubleBoots() {
    }

    public static void init() {
        createdoubleBoots();
    }

    private static void createdoubleBoots() {
        doubleBoots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = doubleBoots.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName("§dDouble-Jump Boots"); //display name
        List<String> lore = new ArrayList<>();
        lore.add("§8Forged from the Wings of the Dragon.");
        for (int i = 0; i < lore.size(); i++) {
            String line = lore.get(i);
            line = line.replace("§o", "");
            lore.set(i, line);
        }
        meta.setLore(lore);
        doubleBoots.setItemMeta(meta);
        ShapedRecipe dbRecipe = new ShapedRecipe(NamespacedKey.minecraft("doubleboots"), doubleBoots);
        dbRecipe.shape(new String[]{"F F", "D D", "D D"});
        dbRecipe.setIngredient('D', Material.DIAMOND);
        dbRecipe.setIngredient('F', new RecipeChoice.ExactChoice(ItemManagerWFeather.wFeather));
        Bukkit.addRecipe(dbRecipe);
    }
}
