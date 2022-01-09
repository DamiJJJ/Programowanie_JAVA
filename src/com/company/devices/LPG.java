package com.company.devices;

import com.company.creatures.Human;

public class LPG extends Car{


    //konstruktor
    public LPG(String model, String producer, Integer yearOfProduction, Integer horsePower, Integer tankCapacity, Double value, Human firstOwner) {
        super(model, producer, yearOfProduction, horsePower, tankCapacity, value, firstOwner);

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
