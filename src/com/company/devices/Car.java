package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable {
    public final Double engineCapacity;

    public Car(String model, String producer, Integer yearOfProduction, Double engineCapacity, Double value) {
        super(model, producer, yearOfProduction, value);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void turnOn() {
        System.out.println("Brum brum! Włączyłeś silnik w samochodzie " + model);
    }

    //toString
    public String showCar()
    {
        return showDevice() + " Pojemność silnika: " + engineCapacity;
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

}
