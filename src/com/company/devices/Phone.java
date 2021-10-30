package com.company.devices;

import com.company.Saleable;

public class Phone extends Device {
    final Double screenSize;
    public String os;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn(){
        System.out.println("Wciskam przycisk");
    }
    //toString
    public String showPhone()
    {
        return "Producent: " + producer + " Model: " + model + " rok produkcji: " + yearOfProduction + " przekątna ekranu: " + screenSize + " cali System Operacyjny: " + os;
    }
}
