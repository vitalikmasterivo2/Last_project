package com.company.mps;

public class Elf {
    private String name;
    final String rasa = "Elf";
    private int level = 0;
    private int damage = 3;
    private int energy = 100;
    private int health = 100;
    private boolean state;
    private int progress_check = 0;


    //Getter and Setter персонажа
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getEnergy() {
        return energy;
    }public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }public void setHealth(int health) {
        this.health = health;
    }

    public boolean isState() {
        return state;
    }public void setState(boolean state) {
        this.state = state;
    }

    public int getProgress_check() {
        return progress_check;
    }public void setProgress_check(int progress_check) {
        this.progress_check = progress_check;
    }

    public void False (){
        setState(false);
    }public void True (){
        setState(true);
    }


    //Метод нанесення шкоди ворогу (CenOrk)
    public int ElfAttackOrk (int healthOrk){
        Show_Level();
        int a = healthOrk - getDamage();
        setEnergy(getEnergy() - 5);
        return a;
    }

    public void Show_Level(){
        switch (getLevel()){
            case 1:
                setDamage(getDamage() + 3);
                break;
            case 2:
                setDamage(getDamage() + 6);
                break;
            case 3:
                setDamage(getDamage() + 9);
            default:
                setDamage(getDamage());
        }
    }


    @Override
    public String toString() {
        return "Elf{" +
                "name='" + name + '\'' +
                ", rasa='" + rasa + '\'' +
                ", level=" + level +
                ", damage=" + damage +
                ", energy=" + energy +
                ", health=" + health +
                ", state=" + state +
                ", progress_check=" + progress_check +
                '}';
    }

    //Конструктор
    public Elf (String name, int level) {
        setName(name);
        this.level = level;
//        this.damage = damage;
//        this.energy = energy;
//        this.health = health;
    }
}

