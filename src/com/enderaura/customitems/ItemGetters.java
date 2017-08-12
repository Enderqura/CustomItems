package com.enderaura.customitems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enderqura on 11/08/2017 at 17:09.
 */
public class ItemGetters {

    // Singleton stuff.
    private ItemGetters(){}
    private static final ItemGetters instance = new ItemGetters();

    public static ItemGetters getInstance() {
        return instance;
    }

    // Handy variable for the Item Utils class.
    private ItemUtils iu = ItemUtils.getInstance();

    // TODO: Add lores, Add more items, Add more categories

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
     * Can be found at https://en.wikipedia.org/wiki/Category:Axes
     */
    private final ItemStack throwingAxe = iu.createItem(Material.IRON_AXE, 1, "&c&lThrowing Axe", "", "");
    private final ItemStack alpenstock = iu.createItem(Material.IRON_AXE, 1, "&c&lAlpenstock", "", "");
    private final ItemStack axeOfPerun = iu.createItem(Material.IRON_AXE, 1, "&c&lBattle Axe", "", "");
    private final ItemStack battleAxe = iu.createItem(Material.IRON_AXE, 1, "&c&lAxe of Perun", "", "");
    private final ItemStack beardedAxe = iu.createItem(Material.IRON_AXE, 1, "&c&lBearded Axe", "", "");
    private final ItemStack broadaxe = iu.createItem(Material.IRON_AXE, 1, "&c&lBroadaxe", "", "");
    private final ItemStack hackingAxe = iu.createItem(Material.IRON_AXE, 1, "&c&lHacking Axe", "", "");


    private final ItemStack hawkeye = iu.createItem(Material.BOW, 1, "&c&lHawkeye", "", "");
    private final ItemStack bullseye = iu.createItem(Material.BOW, 1, "&c&lBullseye", "", "");
    private final ItemStack katniss = iu.createItem(Material.BOW, 1, "&c&lKatiniss", "", "");
    private final ItemStack comet = iu.createItem(Material.BOW, 1, "&c&lComet", "", "");
    private final ItemStack ebonLongbow = iu.createItem(Material.BOW, 1, "&c&lEbon Longbow", "", "");
    private final ItemStack hornetsSting = iu.createItem(Material.BOW, 1, "&c&lHornet's Sting", "", "");


    private final ItemStack badStuff = iu.createItem(Material.ROTTEN_FLESH, 1, "&c&lHornet's Sting", "", "");


    private List<ItemStack> items = new ArrayList<>();

    /**
     * Initiates anything needed to
     */
    public void init(){

        items.add(butterflyKnife);
        items.add(zombieKnife);
        items.add(machete);
        items.add(kukri);
        items.add(xactoKnife);
        items.add(trenchKnife);
        items.add(tacticalKnife);
        items.add(boningKnife);
        items.add(carvingKnife);
        items.add(throwingKnife);
        items.add(throwingAxe);
        items.add(alpenstock);
        items.add(axeOfPerun);
        items.add(battleAxe);
        items.add(broadaxe);
        items.add(hackingAxe);
        items.add(hawkeye);
        items.add(bullseye);
        items.add(katniss);
        items.add(ebonLongbow);
        items.add(comet);
        items.add(hornetsSting);
        items.add(badStuff);

    }

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

    public List<ItemStack> getItems() {
        return items;
    }

    public ItemStack getThrowingAxe() {
        return throwingAxe;
    }

    public ItemStack getAlpenstock() {
        return alpenstock;
    }

    public ItemStack getAxeOfPerun() {
        return axeOfPerun;
    }

    public ItemStack getBattleAxe() {
        return battleAxe;
    }

    public ItemStack getBeardedAxe() {
        return beardedAxe;
    }

    public ItemStack getBroadaxe() {
        return broadaxe;
    }

    public ItemStack getHackingAxe() {
        return hackingAxe;
    }

    public ItemStack getKatniss() {
        return katniss;
    }

    public ItemStack getBullseye() {
        return bullseye;
    }

    public ItemStack getHawkeye() {
        return hawkeye;
    }

    public ItemStack getComet() {
        return comet;
    }

    public ItemStack getEbonLongbow() {
        return ebonLongbow;
    }

    public ItemStack getHornetsSting() {
        return hornetsSting;
    }
}
