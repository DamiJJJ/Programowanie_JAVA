package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

import java.util.LinkedList;
import java.util.List;

public abstract class Car extends Device implements Saleable, Comparable<Car> {

    //konfiguracja
    private static final Integer DEFAULT_TANK_CAPACITY = 40;
    private static final Double DEFAULT_FUEL_IN_TANK = 0.0;

    //pola
    public final Integer horsePower;
    public final Integer tankCapacity;
    public Double fuelInTank;
    List<Human> owners;

    //konstruktory
    public Car(String model, String producer, Integer yearOfProduction, Integer horsePower, Double value) {
        super(model, producer, yearOfProduction, value);
        this.horsePower = horsePower;
        this.tankCapacity = DEFAULT_TANK_CAPACITY;
        this.fuelInTank = DEFAULT_FUEL_IN_TANK;
    }

    public Car(String model, String producer, Integer yearOfProduction, Integer horsePower, Integer tankCapacity, Double value) {
        super(model, producer, yearOfProduction, value);
        this.horsePower = horsePower;
        this.tankCapacity = tankCapacity;
        this.fuelInTank = DEFAULT_FUEL_IN_TANK;
    }

    public Car(String model, String producer, Integer yearOfProduction, Integer horsePower, Integer tankCapacity, Double value, Human firstOwner) {
        super(model, producer, yearOfProduction, value);
        this.horsePower = horsePower;
        this.tankCapacity = tankCapacity;
        this.fuelInTank = DEFAULT_FUEL_IN_TANK;
        this.owners = new LinkedList<Human>();
        this.owners.add(firstOwner);
    }

    //metody
    public void turnOn() {
        System.out.println("Brum brum! Włączyłeś silnik w samochodzie " + model);
    }

    //toString
    public String toString()
    {
        return "Producent: " + producer + " Model: " + model + " rok produkcji: " + yearOfProduction + " wartoś: " + value + " Moc: " + horsePower + " kM";
    }

    //Sprzedaż auta
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        System.out.println("Próba sprzedania samochodu " + this);
        if(!seller.hasCar(this)){
            throw new Exception("Sprzedawca nie posiada samochodu");
        }
        else if(!buyer.hasFreeParkingLot()) {
            throw new Exception("Kupujący nie ma miejsca na nowe auto");
        }
        else if(!this.isLastOwner(seller)) {
            throw new Exception("Sprzedający nie jest ostatnim właścicielem auta");
        }
        else if(buyer.cash < price){
            throw new Exception("Kupujący ma za mało kasy");
        }
        else{
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            owners.add(buyer);
            System.out.println("Samochód " + this + " został sprzedany za " + price);
        }
    }

    //Zadanie 10.5
    public abstract void refuel(Double quantity, String fuelType);

    public boolean isLastOwner(Human human){
        return owners.get(owners.size()-1).equals(human);
    }

    public boolean wasAnOwner(Human human){
        return this.owners.contains(human);
    }

    public boolean doesASoldtoB(Human a, Human b){
        if(!wasAnOwner(a) || !wasAnOwner(b)){
            return false;
        } else {
            if(this.owners.indexOf(b) - this.owners.indexOf(a) == 1){
                return true;
            } else {
                return false;
            }
        }
    }

}
