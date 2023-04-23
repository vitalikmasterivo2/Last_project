package com.company.mainen;


import com.company.center.CHero;
import com.company.mps.Ork;

public class test1 {
    public static void main(String[] args) {
    //Тестовий класс, де тестуються методи і т. д.
        CHero ps1 = new CHero("vov", "human");

        Ork ork = new Ork("test");

        ork.setHealth(ps1.AttackOrk(ork.getHealth(), ps1.getRasa()));
        ork.setHealth(ps1.AttackOrk(ork.getHealth(), ps1.getRasa()));


        System.out.println(ork.toString());
        ps1.tString();
    }
}