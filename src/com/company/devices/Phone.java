package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

import java.net.URL;
import java.util.*;


public class Phone extends Device implements Saleable  {

    public static final String DEFAULT_OS = "Android";
    public static final String DEFAULT_PROTOCOL = "https";
    public static final String DEFAULT_HOST = "pobierzapki.com";
    public static final String DEFAULT_FILE = "/1.0";

    final Double screenSize;
    Human owner;
    public String os;
    Set<Application> installedApps = new HashSet<>();

    public Phone(String producer, String model, Integer yearOfProduction, Double value, Double screenSize) {
        super(model, producer, yearOfProduction, value);
        this.screenSize = screenSize;
        this.os = DEFAULT_OS;
    }
    public Phone(String producer, String model, Integer yearOfProduction, Double value, Double screenSize, Human owner) {
        super(model, producer, yearOfProduction, value);
        this.screenSize = screenSize;
        this.owner = owner;
        this.os = DEFAULT_OS;
    }

    @Override
    public void turnOn(){
        System.out.println("Wciskam przycisk");
    }

    //toString
    public String toString()
    {
        return producer + " " + model + " rok produkcji: " + yearOfProduction + " wartość: " + value + " przekątna ekranu: " + screenSize + " cali System Operacyjny: " + os;
    }

    //---------- Zadanie 10 ----------//
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

    //---------- Zadanie 13 ----------//
    public void installAnApp(Application app)
    {
        if(this.owner.cash <= app.price)
        {
            System.out.println("Właściciel telefonu nie ma dość pieniędzy na zainstalowanie tej aplikacji");
        }
        else
        {
            this.owner.cash -= app.price;
            this.installedApps.add(app);
            System.out.println("Aplikacja " + app + " została zainstalowana na telefonie: " + this);
        }
    }

    public boolean isAppInstalled(Application app)
    {
        return this.installedApps.contains(app);
    }

    public boolean isAppInstalled(String appName)
    {
        for(Application apps : installedApps){
            return apps.name.contains(appName);
        }
        return false;
    }

    public void listFreeApps()
    {
        for(Application apps : installedApps){
            if(apps.price == 0.0){
                System.out.println(apps.name);
            }
        }
    }

    public void valueOfInstalledApps()
    {
        double value = 0;
        for(Application apps : installedApps){
                value += apps.price;
        }
        System.out.println("Wartość wszystkich zainstalowanych aplikacji: " + value);
    }

    public void installedAppsNames()
    {
        Set sortedApps = new TreeSet(new ApplicationNameComparator());
        sortedApps.addAll(installedApps);
        for(Object applications : sortedApps)
        {
            System.out.println(applications);
        }
    }

    public void appsSortedByPrice()
    {
        Set sortedApps = new TreeSet(new ApplicationPriceComparator());
        sortedApps.addAll(installedApps);
        for(Object applications : sortedApps)
        {
            System.out.println(applications);
        }
    }


    //zadanie 8
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        System.out.println("Próba sprzedania telefonu " + this);
        if(seller.mobile != this){
            throw new Exception("Sprzedawca nie posiada telefonu");
        } else if(buyer.cash < price){
            throw new Exception("Kupujący ma za mało kasy");
        }else{
            seller.cash += price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            this.owner = buyer;
            System.out.println("Telefon " + this + " został sprzedany za " + price);
        }
    }
}

