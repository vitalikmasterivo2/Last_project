package com.company.weapon;

public class Sword {

    final String name = "Sword";
    final int damage = 10;
    private int level;



    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getLevel() {
        return level;
    }public void setLevel(int level) {
        this.level = level;
    }

    public String ID_Sword(){
        return getName();
    }
    public int Dam_Sword(){
        return getDamage();
    }

    public Sword() {}
}
