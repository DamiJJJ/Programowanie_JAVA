package com.company;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) {


        Phone p1 = new Phone("Oppo", "Reno 5 Lite", 2020, 1500.0, 6.3);
        Car bmw = new Car("M3", "BMW", 2004, 2.5, 10000.0);
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

        System.out.println("damian.car: " + damian.car);
        System.out.println("jan.car: " + jan.car);
        damian.car.sell(damian, jan, 2000.0);

        System.out.println("damian.car: " + damian.car);
        System.out.println("jan.car: " + jan.car);

        try {
            damian.mobile.sell(damian, jan, 2100.0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            //powiadomić użytkownika
            //wysłać mail do admina itp.
        }

        damian.pet.sell(damian, sister, 20.0);

        FarmAnimal pig = new FarmAnimal("swinia");
        pig.beEaten();
        pig.feed(5.0);
        pig.beEaten();

    }
}
