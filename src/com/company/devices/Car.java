package com.company.devices;

import com.company.Saleable;

public class Car extends Device implements Saleable {
    public final Double value;

    public Car(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction);
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Brum brum! Włączyłeś silnik w samochodzie " + model);
    }

    //toString
    public String showCar()
    {
        return "Marka: " + producer + " Model: " + model + " Rok produkcji: " + yearOfProduction + " Wartość: " + value;
    }

    @Override
    public void sale() {

    }

    @Override
    public Double getPrice() {
        return null;
    }
}
