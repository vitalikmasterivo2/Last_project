package com.company.armour;

public class Breastplate {
    final String name = "Breastplate";
    final int protect = 10;
    private int level;

    public String getName() {
        return name;
    }

    public int getProtect() {
        return protect;
    }

    public int getLevel() {
        return level;
    }public void setLevel(int level) {
        this.level = level;
    }


    public String ID_Breastplate(){
        return getName();
    }
    public int Pr_Breastplate(){
        return getProtect();
    }



    public Breastplate() {}
}
