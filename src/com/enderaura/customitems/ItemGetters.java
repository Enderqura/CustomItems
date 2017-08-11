package com.enderaura.customitems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Enderqura on 11/08/2017 at 17:09.
 */
public class ItemGetters {

    // Handy variable for the Item Utils class.
    private ItemUtils iu = ItemUtils.getInstance();

    // TODO: Add lores

    /**
     * Knives based off of real knives
     * Can be found at http://www.knifeup.com/all-the-types-of-knives-ever-made/
     */
    private final ItemStack butterflyKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lButterfly Knife", "", "");
    private final ItemStack zombieKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lZombie Knife", "", "");
    private final ItemStack machete = iu.createItem(Material.IRON_SWORD, 1, "&c&lMachete", "", "");
    private final ItemStack kukri = iu.createItem(Material.IRON_SWORD, 1, "&c&lKukri", "", "");
    private final ItemStack xactoKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lX-Acto Knife", "", "");
    private final ItemStack trenchKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lTrench Knife", "", "");
    private final ItemStack tacticalKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lTactical Knife", "", "");
    private final ItemStack boningKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lBoning Knife", "", "");
    private final ItemStack carvingKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lCarving Knife", "", "");
    private final ItemStack throwingKnife = iu.createItem(Material.IRON_SWORD, 1, "&c&lThrowing Knife", "", "");

    /**
     * Axes based off of real axes
     * TODO: Insert link here, and add more
     */
    private final ItemStack throwingAxe = iu.createItem(Material.IRON_SWORD, 1, "&c&lZombie Knife", "", "");
    private final ItemStack Axe = iu.createItem(Material.IRON_SWORD, 1, "&c&lZombie Knife", "", "");


    /*
      Getters for knives
     */

    /**
     * Getter for butterfly knife
     * @return butterfly knife
     */
    public ItemStack getButterflyKnife() {
        return butterflyKnife;
    }

    /**
     * Getter for zombie knife
     * @return zombie knife
     */
    public ItemStack getZombieKnife() {
        return zombieKnife;
    }

    /**
     * Getter for machete
     * @return machete
     */
    public ItemStack getMachete() {
        return machete;
    }

    /**
     * Getter for kukri
     * @return kukri
     */
    public ItemStack getKukri() {
        return kukri;
    }

    /**
     * Getter for X-Acto knife
     * @return X-Acto knife
     */
    public ItemStack getXactoKnife() {
        return xactoKnife;
    }

    /**
     * Getter for trench knife
     * @return trench knife
     */
    public ItemStack getTrenchKnife() {
        return trenchKnife;
    }

    /**
     * Getter for tactical knife
     * @return tactical knife
     */
    public ItemStack getTacticalKnife() {
        return tacticalKnife;
    }

    /**
     * Getter for boning knife
     * @return boning knife
     */
    public ItemStack getBoningKnife() {
        return boningKnife;
    }

    /**
     * Getter for carving knife
     * @return carving knife
     */
    public ItemStack getCarvingKnife() {
        return carvingKnife;
    }

    /**
     * Getter for throwing knife
     * @return throwing knife
     */
    public ItemStack getThrowingKnife() {
        return throwingKnife;
    }
}
