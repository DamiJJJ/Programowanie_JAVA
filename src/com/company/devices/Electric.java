package com.company.devices;

import com.company.creatures.Human;

public class Electric extends Car {


    //konstruktor
    public Electric(String model, String producer, Integer yearOfProduction, Integer horsePower, Integer tankCapacity, Double value, Human firstOwner) {
        super(model, producer, yearOfProduction, horsePower, tankCapacity, value, firstOwner);
    }

    public void refuel(Double quantity) {

        if(quantity <= 0)
        {
            System.out.println("Próbujesz rozładować akumulatory?");
        }
        else if(quantity > tankCapacity || quantity > (tankCapacity-fuelInTank))
        {
            System.out.println("Za dużo chcesz naładować :)");
        }
        else
        {
            double fuel = fuelInTank + quantity;
            System.out.println("Naładowałeś " + quantity + " kWh\n");
            System.out.println("Akumulator jest naładowany na " + fuel + " kWh");
        }
    }
}