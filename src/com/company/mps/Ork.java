package com.company.mps;

public class Ork {
    //Параметри другорядного персонажа
    private String name;
    final String rasa = "Ork";
    private int level = 0;
    private int experience = 0;
    private int damage = 3;
    private int energy = 100;
    private int health = 100;


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
    public int getExperience() {
        return experience;
    }public void setExperience(int experience) {
        this.experience = experience;
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


    //Метод нанесення шкоди ворогу (CenHuman)
    public int OrkAttackHuman (int healthHuman){
        int a = healthHuman - getDamage();
        setExperience(getExperience() + 5);
        setEnergy(getEnergy() - 5);
        if (getLevel() == 0 & getExperience() >= 5) {
            setLevel(getLevel() + 1);
            setDamage(getDamage() + 3);
        } else if (getLevel() == 1 & getExperience() >= 10) {
            setLevel(getLevel() + 1);
            setDamage(getDamage() + 3);
        }else if (getLevel() == 2 & getExperience() >= 15) {
            setLevel(getLevel() + 1);
            setDamage(getDamage() + 3);
        }
        return a;
    }



    @Override
    public String toString() {
        return "Ork{" +
                "name='" + name + '\'' +
                ", rasa=" + rasa +
                ", level=" + level +
                ", experience=" + experience +
                ", damage=" + damage +
                ", energy=" + energy +
                ", health=" + health +
                '}';
    }

    //Конструктор
    public Ork(String name) {
        setName(name);
//        setRasa(rasa);
//        setLevel(level);
//        setExperience(experience);
//        setDamage(damage);
//        setEnergy(energy);
//        setHealth(health);
    }
}
