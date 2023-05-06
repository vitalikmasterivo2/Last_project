package com.company.armour;

public class Breastplate {
    private final String name = "Breastplate";
    private final int protect = 10;
    private final int ID = 1;
    private int level;



    public int getLevel() {
        return level;
    }public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getProtect() {
        return protect;
    }

    public int getID() {
        return ID;
    }

    public Breastplate() {}
}
