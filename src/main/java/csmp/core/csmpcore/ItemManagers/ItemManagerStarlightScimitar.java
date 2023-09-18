package csmp.core.csmpcore.ItemManagers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManagerStarlightScimitar {
    public static ItemStack starScim;

    public ItemManagerStarlightScimitar() {
    }

    public static void init() {
        createStarScim();
    }

    private static void createStarScim() {
        starScim = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = starScim.getItemMeta();
        meta.setUnbreakable(true);
        meta.setDisplayName("§dStarlight Scimitar"); //display name
        List<String> lore = new ArrayList<>();
        lore.add("among us test blade");
        for (int i = 0; i < lore.size(); i++) {
            String line = lore.get(i);
            line = line.replace("§o", "");
            lore.set(i, line);
        }
        meta.setLore(lore);
        starScim.setItemMeta(meta);
        ShapedRecipe ssRecipe = new ShapedRecipe(NamespacedKey.minecraft("starscim"), starScim);
        ssRecipe.shape(new String[]{" D ", " P ", " S "});
        ssRecipe.setIngredient('D', Material.DIAMOND);
        ssRecipe.setIngredient('S', Material.STICK);
        ssRecipe.setIngredient('P', new RecipeChoice.ExactChoice(ItemManagerPlasmaCore.plasmaCore));
        Bukkit.addRecipe(ssRecipe);
    }
}
