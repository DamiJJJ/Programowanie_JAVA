package com.company.devices;

public abstract class Device {
    final String model;
    final String producer;
    final Integer yearOfProduction;

    Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    abstract public void turnOn();
}