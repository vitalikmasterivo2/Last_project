package com.company.weapon;

public class Sword {

    private final String name = "Sword";
    private final int damage = 10;
    private final int ID = 2;
    private int level;





    public int getLevel() {
        return level;
    }public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getID() {
        return ID;
    }

    public Sword() {

    }
}
