package com.company.devices;

public class Car {
    final String model;
    final String producer;
    public final Integer year;
    public final Double value;

    public Car(String model, String producer, Integer year, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;
    }

    public void turnOn() {
        System.out.println("Brum brum! Włączyłeś silnik w samochodzie " + model);
    }

    //toString
    public String showCar()
    {
        return "Marka: " + producer + " Model: " + model + " Rok produkcji: " + year;
    }
}
