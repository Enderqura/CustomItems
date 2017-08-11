package com.enderaura.customitems;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enderqura on 11/08/2017 at 17:12.
 */
public class ItemUtils {

    private static ItemUtils instance = new ItemUtils();

    private ItemUtils(){}

    public static ItemUtils getInstance() {
        return instance;
    }

    public ItemStack nameItem(ItemStack item, String name){

        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(name);

        item.setItemMeta(meta);

        return item;
    }

    public ItemStack createItem(Material mat, int amount, short data, String displayName) {
        ItemStack item = new ItemStack(mat, amount, data);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', displayName));
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack createItem(Material mat, int amount, String name, String... lore){
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        List<String> loreList = new ArrayList<>();
        for(String str : lore) {
            loreList.add(ChatColor.translateAlternateColorCodes('&', str));
        }
        meta.setLore(loreList);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack createItem(Material mat, int amount, short data, String displayName, String... lore) {
        ItemStack item = new ItemStack(mat, amount, data);
        ItemMeta meta = item.getItemMeta();
        List<String> loreList = new ArrayList<>();
        for(String str : lore) {
            loreList.add(ChatColor.translateAlternateColorCodes('&', str));
        }
        meta.setLore(loreList);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', displayName));
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack createItem(Material mat, int amount, short data, String displayName, List<String> lore) {
        ItemStack item = new ItemStack(mat, amount, data);
        ItemMeta meta = item.getItemMeta();
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', displayName));
        item.setItemMeta(meta);
        return item;
    }

    public void addLoreToItem(ItemStack item, String... lore) {
        List<String> lorelist = null;
        lorelist = (item.hasItemMeta() && item.getItemMeta().hasLore()) ? item.getItemMeta().getLore() : new ArrayList<>();
        for(String str : lore) {
            lorelist.add(ChatColor.translateAlternateColorCodes('&', str));
        }
        ItemMeta meta = item.getItemMeta();
        meta.setLore(lorelist);
        item.setItemMeta(meta);
    }

    public String getLoreLine(ItemStack item, int index) {
        if(item == null || !item.hasItemMeta() || !item.getItemMeta().hasLore()) {
            return null;
        }
        List<String> lore = item.getItemMeta().getLore();
        return lore.get(index);
    }

    public int getLoreAmount(ItemStack item) {
        if(item == null || !item.hasItemMeta() || !item.getItemMeta().hasLore()) {
            return 0;
        }
        return item.getItemMeta().getLore().size();
    }

    public boolean isHelmet(Material type) {
        return type.name().endsWith("HELMET");

    }

    public boolean isChestplate(Material type) {
        return type.name().endsWith("CHESTPLATE");

    }

    public boolean isLeggings(Material type) {
        return type.name().endsWith("LEGGINGS");

    }

    public boolean isBoots(Material type) {
        return type.name().endsWith("BOOTS");

    }

    public boolean isArmor(Material type) {
        return isHelmet(type)
                || isChestplate(type)
                || isLeggings(type)
                || isBoots(type);
    }

    public boolean isSword(Material type) {
        return type.name().endsWith("SWORD");

    }

    public boolean isAxe(Material type) {
        return type.name().endsWith("AXE");
    }

    public boolean isBow(Material type) {
        return type.name().endsWith("BOW");
    }

    public boolean isWeapon(Material type) {
        return isSword(type)
                || isAxe(type);
    }

    public boolean isPickaxe(Material type) {
        return type.name().endsWith("PICKAXE");

    }

    public boolean isShovel(Material type) {
        return type.name().endsWith("SHOVEL");

    }

    public boolean isHoe(Material type) {
        return type.name().endsWith("HOE");

    }

    public boolean isTool(Material type) {
        return isPickaxe(type)
                || isShovel(type)
                || isHoe(type)
                || isAxe(type);
    }

    public boolean isGear(Material type) {
        return isHelmet(type)
                || isChestplate(type)
                || isLeggings(type)
                || isBoots(type)
                || isSword(type)
                || isAxe(type)
                || isBow(type)
                || isPickaxe(type)
                || isShovel(type)
                || isHoe(type);

    }


}
