package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public abstract class Car extends Device implements Saleable {
    public final Integer horsePower;
    public final Integer tankCapacity;
    public Double fuelInTank = 0.0;

    public Car(String model, String producer, Integer yearOfProduction, Integer horsePower, Integer tankCapacity, Double value) {
        super(model, producer, yearOfProduction, value);
        this.horsePower = horsePower;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void turnOn() {
        System.out.println("Brum brum! Włączyłeś silnik w samochodzie " + model);
    }

    //toString
    public String showCar()
    {
        return showDevice() + " Moc: " + horsePower + " kM";
    }

    //zadanie 8
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Próba sprzedania samochodu " + showCar());
        if(seller.car != this){
            System.out.println("Sprzedawca nie posiada samochodu");
        } else if(buyer.cash < price){
            System.out.println("Kupujący ma za mało kasy");
        }else{
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Samochód " + showCar() + " został sprzedany za " + price);
        }
    }

    //Zadanie 10.5
    public abstract void refuel(Double quantity);

}
