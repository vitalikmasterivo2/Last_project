package com.company.mps;

public class Elf {
    private String name;
    final String rasa = "Elf";
    private int level = 0;
    private int damage = 3;
    private int health = 100;
    private boolean state;
    private int progress_check = 0;


    //Метод нанесення шкоди ворогу (CenOrk)
    public int AttackObject (int healthObject){
        Show_Level();
        int a = healthObject - getDamage();
        return a;
    }
    public void Show_Level(){
        switch (getLevel()){
            case 1:
                setDamage(getDamage() + 4);
                break;
            case 2:
                setDamage(getDamage() + 8);
                break;
            case 3:
                setDamage(getDamage() + 12);
            default:
                setDamage(getDamage());
        }
    }
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

    @Override
    public String toString() {
        return "Elf{" +
                "name='" + name + '\'' +
                ", rasa='" + rasa + '\'' +
                ", level=" + level +
                ", damage=" + damage +
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

