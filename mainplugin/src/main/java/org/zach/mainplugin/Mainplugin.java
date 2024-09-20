package org.zach.mainplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;


import static org.zach.mainplugin.ItemManager.*;

public final class Mainplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("hello from main plugin");
        getServer().getPluginManager().registerEvents(new PlayerUse(), this);
        init();

        ShapedRecipe recipe7 = new ShapedRecipe(new NamespacedKey(this, "rainPiercer"), RainPiercer);
        recipe7.shape("dsd", "nnn", "hnc");
        recipe7.setIngredient('d', Material.DIAMOND_BLOCK);
        recipe7.setIngredient('s', Material.NETHER_STAR);
        recipe7.setIngredient('n', Material.NETHERITE_INGOT);
        recipe7.setIngredient('h', new RecipeChoice.ExactChoice(Hydrophobic_Paint));
        recipe7.setIngredient('c', Material.COPPER_BLOCK);
        ShapedRecipe recipe6 = new ShapedRecipe(new NamespacedKey(this, "fireWand"), Fire_Wand);
        recipe6.shape(" m ", " b ", " b ");
        recipe6.setIngredient('m', Material.MAGMA_CREAM);
        recipe6.setIngredient('b', Material.BLAZE_ROD);

        ShapedRecipe recipe5 = new ShapedRecipe(new NamespacedKey(this, "HydrophobicPaint"), Hydrophobic_Paint);
        recipe5.shape("abc","def","ghi");
        recipe5.setIngredient('a', Material.WATER_BUCKET);
        recipe5.setIngredient('b', Material.HONEY_BOTTLE);
        recipe5.setIngredient('c', Material.IRON_BLOCK);
        recipe5.setIngredient('d', Material.IRON_SWORD);
        recipe5.setIngredient('e', Material.MILK_BUCKET);
        recipe5.setIngredient('f', Material.QUARTZ);
        recipe5.setIngredient('g', Material.PUFFERFISH);
        recipe5.setIngredient('h', Material.CYAN_DYE);
        recipe5.setIngredient('i', Material.GLASS_BOTTLE);
        ShapedRecipe recipe4 = new ShapedRecipe(new NamespacedKey(this, "Mega_Crossbow"), Mega_Crossbow);
        recipe4.shape("bbb", "ici", "ici");
        recipe4.setIngredient('c', Material.CROSSBOW);
        recipe4.setIngredient('b', Material.BOW);
        recipe4.setIngredient('i', Material.IRON_INGOT);
        ShapedRecipe recipe3 = new ShapedRecipe(new NamespacedKey(this, "weighted_boots"), Weighted_Boots);
        recipe3.shape("eie", "dld", "eie");
        recipe3.setIngredient('e', Material.LEATHER);
        recipe3.setIngredient('l', Material.LEATHER_BOOTS);
        recipe3.setIngredient('i', Material.IRON_INGOT);
        recipe3.setIngredient('d', Material.DIAMOND);
        ShapedRecipe recipe2 = new ShapedRecipe(new NamespacedKey(this, "nether_trident"), Nether_Trident);
        recipe2.shape("iii", " s ", " s ");
        recipe2.setIngredient('i', Material.IRON_SWORD);
        recipe2.setIngredient('s', Material.NETHERITE_INGOT);

        ShapedRecipe recipe1 = new ShapedRecipe(new NamespacedKey(this, "enchanted_emerald_block"), enchanted_Emerald_block);
        recipe1.shape("bbb", "bbb", "bbb");
        recipe1.setIngredient('b',Material.EMERALD_BLOCK);


        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this, "emerald_sword"), emerald_sword);
        recipe.shape("a", "e", "s");
        recipe.setIngredient('s', Material.STICK);
        recipe.setIngredient('e', Material.EMERALD);
        recipe.setIngredient('a', new RecipeChoice.ExactChoice(enchanted_Emerald_block));

        Bukkit.addRecipe(recipe);
        Bukkit.addRecipe(recipe1);
        Bukkit.addRecipe(recipe2);
        Bukkit.addRecipe(recipe3);
        Bukkit.addRecipe(recipe4);
        Bukkit.addRecipe(recipe5);
        Bukkit.addRecipe(recipe6);
        Bukkit.addRecipe(recipe7);
    }

    @Override
    public void onDisable() {
        System.out.println("bye from main plugin");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("begin")){

        if (sender instanceof Player){
            Player p = (Player) sender;
            p.getInventory().addItem(beginner_sword);
        }

        }
        return true;
    }
}
