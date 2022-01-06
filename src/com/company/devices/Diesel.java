package com.company.devices;

public class Diesel extends Car{


    //konstruktor
    public Diesel(String model, String producer, Integer yearOfProduction, Integer horsePower, Integer tankCapacity, Double value) {
        super(model, producer, yearOfProduction, horsePower, tankCapacity, value);

    }

    public void refuel(Double quantity){

        if(quantity <= 0)
        {
            System.out.println("Próbujesz wylać paliwo z baku?");
        }
        else if(quantity > tankCapacity || quantity > (tankCapacity-fuelInTank))
        {
            System.out.println("Za dużo chcesz nalać :)");
        }
        else
        {
            double fuel = fuelInTank + quantity;
            System.out.println("Nalałeś " + quantity + " l\n");
            System.out.println("W baku masz teraz " + fuel + " l");
        }

    }
}
