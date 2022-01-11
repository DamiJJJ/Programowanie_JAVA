package com.company.devices;

import com.company.creatures.Human;

public class LPG extends Car{


    //konstruktor
    public LPG(String model, String producer, Integer yearOfProduction, Integer horsePower, Integer tankCapacity, Double value, Human firstOwner) {
        super(model, producer, yearOfProduction, horsePower, tankCapacity, value, firstOwner);

    }

    public void refuel(Double quantity, String fuelType){

        if(fuelType != "LPG")
        {
            System.out.println("Nie ten typ paliwa koleżko! Musisz wybrać LPG");
        }
        else
        {
            if(quantity < 0)
            {
                System.out.println("Próbujesz wylać gaz z baku?");
            }
            else if(quantity > tankCapacity || quantity > (tankCapacity-fuelInTank))
            {
                System.out.println("Za dużo chcesz nalać :)");
            }
            else
            {
                double fuel = fuelInTank + quantity;
                System.out.println("Nalałeś " + quantity + " l gazu\n");
                System.out.println("W baku masz teraz " + fuel + " l gazu");
            }
        }

    }

    @Override
    public int compareTo(Car otherCar) {
        return this.yearOfProduction.compareTo(otherCar.yearOfProduction);
    }
}
