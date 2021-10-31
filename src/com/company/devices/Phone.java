package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public class Phone extends Device implements Saleable {
    final Double screenSize;
    public String os;

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
