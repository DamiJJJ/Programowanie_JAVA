package com.company;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.HumanCashComparator;
import com.company.devices.*;
import com.company.creatures.Pet;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws MalformedURLException {


        //KOD TESTOWY

        Phone p1 = new Phone("Oppo", "Reno 5 Lite", 2020, 1500.0, 6.3);
        Pet dog = new Pet("canis");
        dog.name = "Szarik";
        p1.os = "Android 11";
        Human damian = new Human("Damian", "Mrozek");
        Human jan = new Human("Jan", "Dzban");
        Human sister = new Human("Kornelia", "Korwin");
        Diesel bmw = new Diesel("M3", "BMW", 2004, 350, 35, 10000.0, damian);
        sister.cash = 20.0;
        damian.cash = 5000.0;
        damian.mobile = p1;
        jan.cash = 2000.0;
        damian.addCar(bmw);
        damian.pet = jan;

        System.out.println("\nSprzedaż auta:\n============");
        System.out.println("damian.car: " + damian.garage[0]);
        System.out.println("jan.car: " + jan.garage[0]);
        bmw.sell(damian, jan, 2000.0);
        System.out.println("damian.car: " + damian.garage[0]);
        System.out.println("jan.car: " + jan.garage[0]);


        System.out.println("\nZadanko 10:\n============");
        bmw.fuelInTank = 3.0;
        bmw.refuel(20.0);

        Electric tesla = new Electric("S", "Tesla", 2014, 367, 85, 200000.0, damian);
        tesla.fuelInTank = 40.0;
        tesla.refuel(50.0);

        LPG kalos = new LPG("Kalos", "Chevrolet", 2004, 75, 30, 2500.00, damian);
        kalos.refuel(5.0);

        System.out.println("\nSprzedaż telefonu:\n============");
        try {
            damian.mobile.sell(damian, jan, 2100.0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            //powiadomić użytkownika
            //wysłać mail do admina itp.
        }

        System.out.println("\nSprzedaż ludzi:\n============");
        damian.pet.sell(damian, sister, 20.0);

        System.out.println("\nJedzenie i karmienie:\n============");
        FarmAnimal pig = new FarmAnimal("swinia");
        pig.beEaten();
        pig.feed(5.0);
        pig.beEaten();

        System.out.println("\nInstalowanie appek:\n============");
        p1.installAnApp("Instagram", "Facebook", "YouTube");
        p1.installAnApp("Instagram", 18.9, "http://www.ciezkieto.com/apka3");

        URL url = new URL("http", "pobierzapke.com", "/2.1");
        p1.installAnApp(url);

        System.out.println("\nTablice:\n============");

        jan.garage[0] = bmw;
        jan.garage[1] = tesla;
        jan.garage[2] = tesla;
        jan.getCarsValue();


        //SORTOWANIE
        System.out.println("\nSortowanie:\n============");

        Human brother = new Human("Jakub", "Jakubski");
        brother.cash = 300.0;
        sister.cash = 123423.0;
        damian.cash = 1.0;
        jan.cash = 0.0;

        List<Human> family = new ArrayList<>();
        family.add(damian);
        family.add(jan);
        family.add(sister);
        family.add(brother);

        Collections.sort(family);

        System.out.println("from list: ");
        for(Human human : family){
            System.out.println(human.firstName + " " + human.cash);
        }

        Human[] familyArray = new Human[4];
        familyArray[0] = brother;
        familyArray[1] = damian;
        familyArray[3] = jan;

        Arrays.sort(familyArray, new HumanCashComparator());

        System.out.println("from array: ");
        for(Human human : familyArray){
            if(human == null){
                System.out.println("null");
            } else {
                System.out.println(human.firstName + " " + human.cash);
            }
        }

    }

}
