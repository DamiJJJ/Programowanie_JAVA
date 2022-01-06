package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

import java.net.URL;


public class Phone extends Device implements Saleable  {
    final Double screenSize;
    public String os;
    public static final String DEFAULT_PROTOCOL = "https";
    public static final String DEFAULT_HOST = "pobierzapki.com";
    public static final String DEFAULT_FILE = "/1.0";


    public Phone(String producer, String model, Integer yearOfProduction, Double value, Double screenSize) {
        super(model, producer, yearOfProduction, value);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn(){
        System.out.println("Wciskam przycisk");
    }

    //toString
    public String showPhone()
    {
        return showDevice() + " przekątna ekranu: " + screenSize + " cali System Operacyjny: " + os;
    }

    public void installAnApp(String AppName)
    {
        System.out.println("Aplikacja " + AppName + " została zainstalowana");
    }

    public void installAnApp(String AppName, Double AppVersion)
    {
        System.out.println("Aplikacja " + AppName + " ver. " + AppVersion + " została zainstalowana");
    }

    public void installAnApp(String AppName, Double AppVersion, String AppURL)
    {
        System.out.println("Aplikacja " + AppName + " ver. " + AppVersion + " została zainstalowana z serwera " + AppURL);
    }

    public void installAnApp(String AppName1, String AppName2, String AppName3)
    {
        System.out.println("Aplikacje " + AppName1 + " " + AppName2 + " " + AppName3 + " zostały zainstalowane");
    }
    public void installAnApp(URL url)
    {
        System.out.println("Aplikacja z linku " + url + " została zainstalowana");
    }


    //zadanie 8
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        System.out.println("Próba sprzedania telefonu " + showPhone());
        if(seller.mobile != this){
            throw new Exception("Sprzedawca nie posiada telefonu");
        } else if(buyer.cash < price){
            throw new Exception("Kupujący ma za mało kasy");
        }else{
            seller.cash += price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            System.out.println("Telefon " + showPhone() + " został sprzedany za " + price);
        }
    }
}
