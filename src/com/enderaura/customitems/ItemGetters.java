package com.enderaura.customitems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Enderqura on 11/08/2017 at 17:09.
 */
public class ItemGetters {

    private ItemUtils iu = ItemUtils.getInstance();

    private final ItemStack butterflyKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lButterfly Knife", "", "");
    private final ItemStack zombieKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lZombie Knife", "", "");

    public ItemStack getButterflyKnife() {
        return butterflyKnife;
    }

    public ItemStack getZombieKnife() {
        return zombieKnife;
    }

}
