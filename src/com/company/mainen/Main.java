package com.company.mainen;

import com.company.armour.Breastplate;
import com.company.center.CHero;
import com.company.mps.Elf;
import com.company.mps.Human;
import com.company.mps.Ork;
import com.company.weapon.Sword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Сканер імені головного персонажа
        System.out.print("Введіть ім'я користувача: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();


        //Сканер раси головного персонажа
        System.out.print("Введіть расу користувача: ");
        Scanner scanner1 = new Scanner(System.in);
        String b = scanner1.nextLine();



        //Створення головного персонажа "CenHuman"
        CHero ps1 = new CHero(a, b);

        //Створення другорядного персонажа "Human"
        Human human = new Human("Valentin");

        //Створення другорядного персонажа "Ork"
        Ork ork = new Ork("Gull");

        Elf elf = new Elf("Ra");

        // Створення допоміжних матеріалів
        Sword sword = new Sword(1);
        Breastplate breastplate = new Breastplate(1);


        ps1.ShowAll();

        System.out.println(" ");



        //Виведення інформації на екран
        System.out.println(human.toString());
        System.out.println(ork.toString());
        ps1.tString();

        //Головний герой "CenHuman" атакує "Ork"
//        ork.setHealth(ps1.AttackObject(ork.getHealth()));
//        ork.setHealth(ps1.AttackObject(ork.getHealth()));
//        ork.setHealth(ps1.AttackObject(ork.getHealth()));

//        elf.setHealth(ps1.fireball(elf.getHealth()));

        System.out.println(" ");

        ps1.Save_Inventory(sword.getID(), sword.getLevel());
        ps1.Save_Inventory(breastplate.getID(), breastplate.getLevel());

        ps1.Show_Inventory();

        ps1.Use_Apple();

        ps1.Run(1);


        //ps1.regenerate();
        ps1.Use_Apple();

        System.out.println(" ");
        System.out.println(" вова лох! ");





        //Виведення інформації на екран
        System.out.println(human.toString());
        System.out.println(ork.toString());
        System.out.println(elf.toString());
        ps1.tString();
    }
}