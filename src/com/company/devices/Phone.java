package com.company.devices;

public class Phone {
    final String producer;
    final String model;
    final Double screenSize;
    public String os;

    public Phone(String producer, String model, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
    }

    //toString
    public String showPhone()
    {
        return "Producent: " + producer + " Model: " + model + " przekątna ekranu: " + screenSize + " cali System Operacyjny: " + os;
    }
}
