package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Integer x = 123;
        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.age = 4;

        System.out.println(dog.name);
        System.out.println(dog.species);
        System.out.println(dog.getWeight() + "kg");

//        Zadanie 1
        System.out.println("\n---ZADANIE 1---\n");
        dog.feed();

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        Animal cat = new Animal("felis");
        cat.name = "sierściuch";
        cat.age = 5;

        cat.feed();
        cat.feed();


//        Zadanie 2
        System.out.println("\n---ZADANIE 2---\n");
        Car c1 = new Car("Golf 4", "Volkswagen", 2002, 8000.0);
        Car c2 = new Car("308", "Peugeot", 2002, 10000.0);
        c1.turnOn();

        Human damian = new Human("Damian", "Mrozek");

//         Zadanie 3 i 4
        System.out.println("\n---ZADANIE 3 i 4---\n");
        damian.setSalary(2540.3);
        System.out.println(damian.getSalary());
        damian.setSalary(3300.25);
        System.out.println(damian.getSalary());

//          Zadanie 5
        System.out.println("\n---ZADANIE 5---\n");
        damian.setCar(c1);
        damian.getCar();

//          Zadanie 6
        System.out.println("\n---ZADANIE 6---\n");
        System.out.println(damian.showHuman());
        System.out.println(c2.showCar());
        System.out.println(cat.showAnimal());
        Phone p1 = new Phone("Oppo", "Reno 5 Lite", 2020, 6.3);
        p1.os = "Android 11";
        System.out.println(p1.showPhone());
    }
}
