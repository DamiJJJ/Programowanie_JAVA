package com.company.devices;

import java.util.Comparator;


public class Application {

    //pola
    public final String name;
    public Double version;
    public Double price;


    //konstruktory
    public Application(String name, Double version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    //toString
    public String toString()
    {
        return name + " v." + version + " cena: " + price;
    }
}
