package com.company.center;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public  class CHero {
    //Параметри головного персонажа
    private String name;
    private String rasa;
    private int protection = 0;
    private int level = 0;
    private int experience = 0;
    private int damage = 3;
    private int energy = 100;
    private int health = 100;



    ArrayList<String> inventory = new ArrayList<>();

    public void Save_Inventory(String subject, int damage) {
        if (subject.equals("Breastplate")){
            setProtection(getProtection() + damage);
        }else if (subject.equals("Sword")){
            setDamage(getDamage() + damage);
        }
        inventory.add(subject);
    }

    public void Show_Inventory(){
        System.out.println(getName() + " have: " + inventory.toString());
    }





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
    }public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }public void setHealth(int health) {
        this.health = health;
    }




    //Метод нанесення шкоди ворогу (Ork)
    public int AttackOrk(int healthOrk) {
        int a = healthOrk - getDamage();
        setExperience(getExperience() + 5);
        setEnergy(getEnergy() - 5);
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
        }else {
            setDamage(getDamage());
            setExperience(getExperience());
            setLevel(getLevel());
        }
        showEnergy();
        showHealth();
        return a;
    }

    //Метод нанесення шкоди ворогу (Human)
    public int AttackHuman(int healthHuman) {
        int a = healthHuman - getDamage();
        setExperience(getExperience() + 5);
        setEnergy(getEnergy() - 5);

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
        showEnergy();
        showHealth();
        return a;
    }

    public void ShowAll(){
        showEnergy();
        showHealth();
        ShowRasa(getRasa());
    }

    //Метод перевірки введених користувачем даних
    public void ShowRasa (String rasa){
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
                setRasa("Ork");
                setDamage(5);
            }
            default -> {
                System.err.println("ERROR!");
                setRasa("ERROR!");
                setDamage(0);
                System.exit(204);
            }
        }
    }

    public void regenerate (){
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
        showEnergy();
        showHealth();
    }

    public void Run (int point){
        int point_size = point * 5;
        setEnergy(getEnergy() - point_size);
        showEnergy();
        showHealth();
    }

    public void showEnergy (){
        if (getEnergy() > 100){
            setEnergy(100);
        }
    }
    public void showHealth (){
        if (getHealth() > 100){
            setHealth(100);
        }
    }


    public void tString() {
        System.out.println( "CHero{" +
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

    //Конструктор
    public CHero(String name, String rasa) {
        setName(name);
        setRasa(rasa);
    }
}
