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

        Human damian = new Human("Damian", "Mrozek");
        Human jan = new Human("Jan", "Dzban");
        Human sister = new Human("Kornelia", "Korwin");
        sister.cash = 20.0;
        damian.cash = 5000.0;
        jan.cash = 2000.0;


        Diesel bmw = new Diesel("M3", "BMW", 2005, 350, 35, 10000.0, jan);
        Electric tesla = new Electric("S", "Tesla", 2014, 367, 85, 200000.0, damian);
        LPG kalos = new LPG("Kalos", "Chevrolet", 2004, 75, 30, 2500.00, damian);

        System.out.println("\nSuma wartości pojazdów jana: ");

        jan.addCar(bmw);
        jan.addCar(tesla);
        jan.addCar(kalos);
        jan.getCarsValue();

        System.out.println("\nPojazdy jana posortowane wg. roku produkcji: ");
        jan.sortCarsByYear();

        damian.addCar(tesla);
        damian.addCar(kalos);

        System.out.println("\nSprzedaż auta:\n============");
        System.out.println("Auta Damiana:\n");
        damian.sortCarsByYear();
        System.out.println("Auta Jana:\n");
        jan.sortCarsByYear();
        try {
            bmw.sell(jan, damian, 2000.0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Auta Damiana:\n");
        damian.sortCarsByYear();
        System.out.println("Auta Jana:\n");
        jan.sortCarsByYear();


        //SORTOWANIE
        System.out.println("\nSortowanie ludzi (z zajęć):\n============");

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
