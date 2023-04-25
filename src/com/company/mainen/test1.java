package com.company.mainen;


import com.company.center.CHero;
import com.company.mps.Elf;
import com.company.mps.Ork;

public class test1 {
    public static void main(String[] args) {
    //Тестовий класс, де тестуються методи і т. д.
        Elf ps1 = new Elf("Radiy", 3);
        Ork ork = new Ork("lox");

        ork.setHealth(ps1.ElfAttackOrk(ork.getHealth()));

        System.out.println(ps1.toString());
        System.out.println(ork.toString());
    }
}