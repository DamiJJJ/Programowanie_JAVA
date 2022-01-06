package com.company;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.devices.*;
import com.company.creatures.Pet;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {


        //KOD TESTOWY

        Phone p1 = new Phone("Oppo", "Reno 5 Lite", 2020, 1500.0, 6.3);
        Diesel bmw = new Diesel("M3", "BMW", 2004, 350, 35, 10000.0);
        Pet dog = new Pet("canis");
        dog.name = "Szarik";
        p1.os = "Android 11";
        Human damian = new Human("Damian", "Mrozek");
        Human jan = new Human("Jan", "Dzban");
        Human sister = new Human("Karolina", "Korwin");
        sister.cash = 20.0;
        damian.cash = 5000.0;
        damian.mobile = p1;
        jan.cash = 2000.0;
        damian.car = bmw;
        damian.pet = jan;

        System.out.println("\nSprzedaż auta:\n============");
        System.out.println("damian.car: " + damian.car);
        System.out.println("jan.car: " + jan.car);
        damian.car.sell(damian, jan, 2000.0);

        System.out.println("damian.car: " + damian.car);
        System.out.println("jan.car: " + jan.car);

        System.out.println("\nZadanko 10:\n============");
        bmw.fuelInTank = 3.0;
        bmw.refuel(20.0);

        Electric tesla = new Electric("S", "Tesla", 2014, 367, 85, 200000.0);
        tesla.fuelInTank = 40.0;
        tesla.refuel(50.0);

        LPG kalos = new LPG("Kalos", "Chevrolet", 2004, 75, 30, 2500.00);
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
    }

}
