package org.zach.mainplugin;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ItemManager {
    public static ItemStack beginner_sword;
    public static ItemStack emerald_sword;
    public static  ItemStack enchanted_Emerald_block;
    public static ItemStack Nether_Trident;
    public static  ItemStack Weighted_Boots;
    public static ItemStack Mega_Crossbow;
    public static ItemStack Hydrophobic_Paint;
    public static ItemStack Healthy_Helmet;
    public static ItemStack Healthy_ChestPlate;
    public static ItemStack Healthy_Leggings;
    public static ItemStack Healthy_Boots;
    public static ItemStack Feather_Dagger;
    public static ItemStack Healthy_Sword;
    public static  ItemStack Fire_Wand;
    public static  ItemStack RainPiercer;

    public static void init(){
        createBeginner_sword();
        CreateEmerald_sword();
        CreateEnchanted_Block();
        CreateNether_Trident();
        CreateWeighted_Boots();
        CreateMega_Crossbow();
        CreateHydrophobic_paint();
        CreateHealthy_Helmet();
        CreateHealthy_ChestPlate();
        CreateHealthy_Leggings();
        CreateHealthy_Boots();
        CreateFire_Wand();
        CreateRain_Piercer();


    }

    private  static  void CreateRain_Piercer(){
        ItemStack item = new ItemStack(Material.TRIDENT);

        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.RIPTIDE, 30, true);
        meta.setDisplayName(ChatColor.BLUE + "Rain piercer");
        List<String> lores = new ArrayList<>();
        lores.add("old rusty trident");
        lores.add("splashed with hydrophobic paint");
        lores.add("this trident sends you flying");
        meta.setLore(lores);


        item.setItemMeta(meta);
        RainPiercer = item;

    }
    private static void CreateFire_Wand(){
        ItemStack item = new ItemStack(Material.BLAZE_ROD);

        ItemMeta meta = item.getItemMeta();
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "Jump Boost", 0.2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addEnchant(Enchantment.AQUA_AFFINITY,1 , true);
        meta.setDisplayName(ChatColor.DARK_RED + "Fire Wand");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> lores = new ArrayList<>();
        lores.add("A wand that shoots flames from the nether");
        meta.setLore(lores);
        meta.setCustomModelData(1);
        meta.addAttributeModifier(Attribute.GENERIC_JUMP_STRENGTH, modifier);


        item.setItemMeta(meta);
        Fire_Wand = item;
    }
    private static void CreateHealthy_Helmet(){
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);

        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.PROTECTION, 7, true);

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "Growth", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
    }
    private static void CreateHealthy_ChestPlate(){

    }
    private static void CreateHealthy_Leggings(){

    }
    private static void CreateHealthy_Boots(){

    }
    private static void CreateHydrophobic_paint(){
        ItemStack item = new ItemStack(Material.POTION);

        PotionMeta meta = (PotionMeta) item.getItemMeta();

        meta.setDisplayName(ChatColor.DARK_AQUA + "hydrophobic paint");
        meta.setColor(Color.AQUA);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.WITHER, 10000, 20), true);
        List<String> lores = new ArrayList<>();
        lores.add("some paint that can make things hydrophobic");
        meta.setLore(lores);
        item.setItemMeta(meta);
        Hydrophobic_Paint = item;

    }
    private static void CreateMega_Crossbow(){
        ItemStack item = new ItemStack(Material.CROSSBOW);

        ItemMeta meta = item.getItemMeta();
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "jump boost", 0.1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addEnchant(Enchantment.PIERCING, 10, true);
        meta.addEnchant(Enchantment.QUICK_CHARGE, 1, true);
        meta.addEnchant(Enchantment.MULTISHOT, 10, true);
        meta.setUnbreakable(true);
        meta.setDisplayName("Mega Crossbow");
        List<String> lores = new ArrayList<>();
        lores.add("Less sophisticated sniper");
        meta.setLore(lores);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addAttributeModifier(Attribute.GENERIC_JUMP_STRENGTH, modifier);

        item.setItemMeta(meta);
        Mega_Crossbow = item;


    }
    private static void CreateWeighted_Boots(){
        ItemStack item = new ItemStack(Material.IRON_BOOTS);

        ItemMeta meta = item.getItemMeta();

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "heaviness", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier modifier1 = new AttributeModifier(UUID.randomUUID(), "fall height", -1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier modifier2 = new AttributeModifier(UUID.randomUUID(), "extra fall damage", 100, AttributeModifier.Operation.MULTIPLY_SCALAR_1, EquipmentSlot.FEET);
        AttributeModifier modifier3 = new AttributeModifier(UUID.randomUUID(), "attack", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        AttributeModifier modifier4 = new AttributeModifier(UUID.randomUUID(), "speed", 0.2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addEnchant(Enchantment.PROTECTION, 10, true);
        meta.setUnbreakable(true);
        meta.setDisplayName(ChatColor.GRAY + "weighted boots");
        List<String> lores = new ArrayList<>();
        lores.add("help im afraid of heights");
        meta.setLore(lores);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addAttributeModifier(Attribute.GENERIC_GRAVITY, modifier);
        meta.addAttributeModifier(Attribute.GENERIC_SAFE_FALL_DISTANCE, modifier1);
        meta.addAttributeModifier(Attribute.GENERIC_FALL_DAMAGE_MULTIPLIER, modifier2);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, modifier3);
        meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, modifier4);

        item.setItemMeta(meta);
        Weighted_Boots = item;
    }
    private static void CreateNether_Trident(){
        ItemStack item = new ItemStack(Material.TRIDENT);

        ItemMeta meta = item.getItemMeta();

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "health", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier modifier1 = new AttributeModifier(UUID.randomUUID(), "attack", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier modifier2 = new AttributeModifier(UUID.randomUUID(), "speed", 0.1, AttributeModifier.Operation.ADD_NUMBER,EquipmentSlot.HAND);
        meta.addEnchant(Enchantment.LOYALTY, 10, true);
        meta.addEnchant(Enchantment.SHARPNESS, 10, true);
        meta.setUnbreakable(true);
        meta.setFireResistant(true);
        meta.addEnchant(Enchantment.FIRE_ASPECT , 2, true);
        meta.setDisplayName(ChatColor.RED + "Nether Trident");
        List<String> lores = new ArrayList<>();
        lores.add("A trident fueled with the power from the nether");
        lores.add("its very hot and burns all");
        meta.setLore(lores);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, modifier1);
        meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, modifier2);

        item.setItemMeta(meta);
        Nether_Trident = item;
    }

    private static void CreateEnchanted_Block(){
        ItemStack item = new ItemStack(Material.EMERALD_BLOCK);

        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.AQUA_AFFINITY, 1, true);
        meta.setDisplayName(ChatColor.GREEN + "Enchanted Emerald Block");
        List<String> lores = new ArrayList<>();
        lores.add("shiny block");
        meta.setLore(lores);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        item.setItemMeta(meta);
        enchanted_Emerald_block = item;

    }
    private static void CreateEmerald_sword(){

        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "speed 1", 0.1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        AttributeModifier modifier1 = new AttributeModifier(UUID.randomUUID(), "attack", 5, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);

        ItemStack item = new ItemStack(Material.EMERALD);

        ItemMeta meta = item.getItemMeta();

        meta.addEnchant(Enchantment.SHARPNESS, 10, true);
        meta.setUnbreakable(true);
        meta.setDisplayName(ChatColor.WHITE + "Emerald Blade");
        List<String> lores = new ArrayList<>();
        lores.add("ooh shiny");
        meta.setLore(lores);
        meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, modifier);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, modifier1);
        meta.setCustomModelData(1);

        item.setItemMeta(meta);
        emerald_sword = item;
    }
    private static void createBeginner_sword(){
        ItemStack item = new ItemStack(Material.WOODEN_SWORD);


        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.SHARPNESS, 2, true);
        meta.setUnbreakable(true);
        meta.setDisplayName(ChatColor.WHITE + "Beginner Sword");
        List<String> lores = new ArrayList<>();
        lores.add("A sword to start you off");
        meta.setLore(lores);

        item.setItemMeta(meta);
        beginner_sword = item;
    }
}
