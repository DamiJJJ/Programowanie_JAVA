package com.company.devices;

import com.company.creatures.Human;

public class Diesel extends Car{


    //konstruktor
    public Diesel(String model, String producer, Integer yearOfProduction, Integer horsePower, Integer tankCapacity, Double value, Human firstOwner) {
        super(model, producer, yearOfProduction, horsePower, tankCapacity, value, firstOwner);
    }

    public void refuel(Double quantity, String fuelType){

        if(fuelType != "Diesel")
        {
            System.out.println("Nie ten typ paliwa koleżko! Musisz wybrać Diesla");
        }
        else
        {
            if(quantity < 0)
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
                System.out.println("Nalałeś " + quantity + " l diesla\n");
                System.out.println("W baku masz teraz " + fuel + " l diesla");
            }
        }
    }

    @Override
    public int compareTo(Car otherCar) {
        return this.yearOfProduction.compareTo(otherCar.yearOfProduction);
    }
}
