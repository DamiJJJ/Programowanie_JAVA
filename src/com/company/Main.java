package com.company;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.HumanCashComparator;
import com.company.devices.*;
import com.company.creatures.Pet;

import java.net.MalformedURLException;


public class Main {

    public static void main(String[] args) throws MalformedURLException {


        //KOD TESTOWY

        Human jan = new Human("Jan", "Dzban");
        jan.cash = 2000.0;

        System.out.println("\nZadanie 13: ");

        Application spotify = new Application("Spotify", 5.8, 29.99);
        Application instagram = new Application("Instagram", 3.4, 19.99);
        Application facebook = new Application("Facebook", 1.4, 0.0);
        Application youtube = new Application("YouTube", 5.4, 0.0);
        Application memehub = new Application("MemeHub", 1.7, 0.0);
        Phone p1 = new Phone("Oppo", "Reno 5 Lite", 2020, 1500.0, 6.3, jan);

        System.out.println("\nInstalowanie aplikacji: ");
        p1.installAnApp(instagram);
        p1.installAnApp(youtube);
        p1.installAnApp(memehub);
        p1.installAnApp(spotify);
        p1.installAnApp(facebook);

        System.out.println("\nCzy aplikacja " + instagram + " jest zainstalowana?");
        System.out.println(p1.isAppInstalled(instagram));
        System.out.println("\nCzy aplikacja Facebook jest zainstalowana");
        System.out.println(p1.isAppInstalled("Facebook"));
        System.out.println("\nWypisanie wszystkich zainstalowanych bezpłatnych aplikacji:\n");
        p1.listFreeApps();
        p1.valueOfInstalledApps();
        System.out.println("\nWypisanie wszystkich zainstalowanych aplikacji alfabetycznie:\n");
        p1.installedAppsNames();
        System.out.println("\nWypisanie wszystkich zainstalowanych aplikacji od najtańszych do najdroższych:\n");
        p1.appsSortedByPrice();
    }
}
