package com.company.devices;

public class Car extends Device {
    public final Double value;

    public Car(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction);
        this.value = value;
    }

    public void turnOn() {
        System.out.println("Brum brum! Włączyłeś silnik w samochodzie " + model);
    }

    //toString
    public String showCar()
    {
        return "Marka: " + producer + " Model: " + model + " Rok produkcji: " + yearOfProduction + " Wartość: " + value;
    }
}
