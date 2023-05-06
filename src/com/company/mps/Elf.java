package com.company.mps;

public class Elf  {
    private String name;
    private final String rasa = "Elf";
    private int level = 0;
    private int damage = 4;
    private int energy = 100;
    private int health = 100;
    private boolean state;
    private int progress_check = 0;
    private int magic_power = 100;


    //Метод нанесення шкоди ворогу
    public int AttackObject (int healthObject){
        Show_Level();
        int a = healthObject - getDamage();
        return a;
    }
    public int fireball (int healthObject){
        Show_Level();
        int a = healthObject - getDamage();
        setMagic_power(getMagic_power() - 15);
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
                break;
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
    public String getRasa() {
        return rasa;
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
    public int getMagic_power() {
        return magic_power;
    }
    public void setMagic_power(int magic_power) {
        this.magic_power = magic_power;
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
    public Elf (String name) {
        setName(name);
//        this.level = level;
//        this.damage = damage;
//        this.energy = energy;
//        this.health = health;
    }
}

