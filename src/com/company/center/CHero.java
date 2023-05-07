package com.company.center;

import com.company.armour.Breastplate;
import com.company.weapon.Sword;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public  class CHero  {
    //Параметри головного персонажа
    private String name;
    private String rasa;
    private int protection = 0;
    private int level = 0;
    private int experience = 0;
    private int damage = 3;
    private int energy = 100;
    private int health = 100;
    private int magic_power = 100;

    ArrayList<String> inventory = new ArrayList<>();

    public void Show_Rasa (String rasa){
        switch (rasa) {
            case "Human" -> {
                setRasa(rasa);
                setDamage(3);
            }
            case "human", "12" -> {
                setRasa("Human");
                setDamage(3);
            }
            case "Ork" -> {
                setRasa(rasa);
                setDamage(5);
            }
            case "ork" -> {
                setRasa("Elf");
                setDamage(5);
            }case "Elf" -> {
                setRasa(rasa);
                setDamage(4);
            }
            case "elf" -> {
                setRasa("Elf");
                setDamage(4);
            }
            default -> {
                System.err.println("ERROR!");
                setRasa("ERROR!");
                setDamage(0);
                System.exit(204);
            }
        }
    }
    public void Show_Level(){
        if (getLevel() == 0 & getExperience() == 5) {
            setLevel(getLevel() + 1);
            setDamage(getDamage() + 3);
            setExperience(getExperience() - 5);
        } else if (getLevel() == 1 & getExperience() == 10) {
            setLevel(getLevel() + 1);
            setDamage(getDamage() + 3);
            setExperience(getExperience() - 10);
        } else if (getLevel() == 2 & getExperience() == 15) {
            setLevel(getLevel() + 1);
            setDamage(getDamage() + 3);
            setExperience(getExperience() - 15);
        }
    }
    public void ShowAll(){
        Show_Level();
        Show_Energy();
        Show_Health();
        Show_Rasa(getRasa());
    }
    //Метод нанесення шкоди ворогу
    public int AttackObject(int healthObject) {
        int a = healthObject - getDamage();
        setExperience(getExperience() + 5);
        setEnergy(getEnergy() - 5);
        Show_Level();
        Show_Energy();
        Show_Health();
        return a;
    }
    public int Fireball (int healthObject) {
        if (getRasa().equals("Elf")) {
            int a = healthObject - getDamage();
            setMagic_power(getMagic_power() - 15);
            Show_Level();
            return a;
        }
        return healthObject;
    }

    public void Regenerate (){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (getHealth() >= 100){
                    setHealth(100);
                    timer.cancel();
                }else{
                    setHealth(getHealth() + 5);
                    System.out.println("health is: " + getHealth());
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
        System.out.println("regeneration is complete");
    }

//    public void regenerate1() {
//        if (getHealth() == 100){
//            System.out.println("finished");
//        }else {
//            setHealth(getHealth() + 5);
//            System.out.println("health is: " + getHealth());
//            regenerate1();
//        }
//    }

    public void Use_Apple (){
        setHealth(getHealth() + 5);
        setEnergy(getEnergy() + 10);
        Show_Energy();
        Show_Health();
    }
    public void Run (int point){
        int point_size = point * 5;
        setEnergy(getEnergy() - point_size);
        Show_Energy();
        Show_Health();
    }
    public void Show_Energy (){
        if (getEnergy() > 100){
            setEnergy(100);
        }
    }
    public void Show_Health (){
        if (getHealth() > 100){
            setHealth(100);
        }
    }

    public void Save_Inventory(int ID, int level) {
        switch (ID) {
            case 1:
                Breastplate breastplate = new Breastplate(level);

                if(breastplate.getLevel() == 1){
                    setProtection(getProtection() + 5);
                } else if (breastplate.getLevel() == 2) {
                    setProtection(getProtection() + 10);
                }else if (breastplate.getLevel() == 3) {
                    setProtection(getProtection() + 15);
                }else

                setProtection(getProtection() + breastplate.getProtect());
                inventory.add(breastplate.getName());
                break;
            case 2:
                Sword sword = new Sword(level);

                if(sword.getLevel() == 1 ){
                    setProtection(getProtection() + 5);
                } else if (sword.getLevel() == 2 ) {
                    setProtection(getProtection() + 10);
                }else if (sword.getLevel() == 3 ) {
                    setProtection(getProtection() + 15);
                }

                setDamage(getDamage() + sword.getDamage());
                inventory.add(sword.getName());
                break;
            default:
                System.err.println("Невірно введено індентифікатор обʼєкту");


        }
    }
    public void Show_Inventory(){System.out.println(getName() + " have: " + inventory.toString());}

    //Getter and Setter персонажа
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public String getRasa() {
        return rasa;
    }public void setRasa(String rasa) {
        this.rasa = rasa;
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
    public int getProtection() {
        return protection;
    }public void setProtection(int protection) {
        this.protection = protection;
    }
    public int getDamage() {
        return damage;
    }public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getMagic_power() {
        return magic_power;
    }
    public void setMagic_power(int magic_power) {
        this.magic_power = magic_power;
    }

    public void tString() {
        switch (getRasa()) {
            case "Elf" -> {
                System.out.println("CHero{" +
                        "name='" + name + '\'' +
                        ", rasa='" + rasa + '\'' +
                        ", level=" + level +
                        ", protection=" + protection +
                        ", experience=" + experience +
                        ", damage=" + damage +
                        ", energy=" + energy +
                        ", health=" + health +
                        ", magic_power=" + magic_power +
                        '}');
            }
            default -> {
                System.out.println("CHero{" +
                        "name='" + name + '\'' +
                        ", rasa='" + rasa + '\'' +
                        ", level=" + level +
                        ", protection=" + protection +
                        ", experience=" + experience +
                        ", damage=" + damage +
                        ", energy=" + energy +
                        ", health=" + health +
                        '}');
            }
        }
    }

    //Конструктор
    public CHero(String name, String rasa) {
        setName(name);
        setRasa(rasa);
    }
}
