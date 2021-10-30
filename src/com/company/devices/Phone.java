package com.company.devices;

public class Phone extends Device {
    final Double screenSize;
    public String os;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
    }

    //toString
    public String showPhone()
    {
        return "Producent: " + producer + " Model: " + model + " rok produkcji: " + yearOfProduction + " przekątna ekranu: " + screenSize + " cali System Operacyjny: " + os;
    }
}
