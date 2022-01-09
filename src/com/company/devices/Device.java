package com.company.devices;

import com.company.Saleable;

public abstract class Device {
    final String model;
    final String producer;
    final Integer yearOfProduction;
    public final Double value;

    Device(String model, String producer, Integer yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }
    public String toString()
    {
        return "Producent: " + producer + " Model: " + model + " rok produkcji: " + yearOfProduction + " wartoś: " + value;
    }

    abstract public void turnOn();


}