package com.company.creatures;

import com.company.Saleable;

public abstract class Animal implements Saleable, Feedable {
    //konfiguracja
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.3;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;

    //pola / przechowywanie danych
    final String species;
    public String name;
    static Double weight;
    Integer age;
    static Boolean alive;
    Double value;

    //konstruktory
    public Animal(String species) {
        this.species = species; //wartość z parametru
        alive = true; //wartość domyślna

        if (this.species.equals("canis")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("felis")) {
            weight = DEFAULT_CAT_WEIGHT;
        } else {
            weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    //metody

    private void checkWeight(double weight){
        if(weight <= 0) {
            System.out.println("Zwierzątko nie żyje :(");
        }
            else{
            System.out.println("waga zwierzęcia " + this.species + " wynosi: " + this.weight);
            }
    }

    public void feed() {
        weight++;
        checkWeight(weight);
    }

    public void feed(Double foodWeight) {
        weight += foodWeight;
        checkWeight(weight);
    }

    void takeForAWalk(){
        weight--;
        checkWeight(weight);
    }

    void resetWeightToDefault(){
        weight = DEFAULT_ANIMAL_WEIGHT;
    }

    //toString
    public String toString()
    {
        return "Gatunek: " + species + " Imię: " + name + " Waga: " + weight + " kg Wiek: " + age + " lat " + alive;
    }

    //zadanie 8
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Próba sprzedania zwierzęcia " + this);
        if(seller.pet != this){ //this - obiekt tej klasy
            System.out.println("Sprzedawca nie posiada zwierzęcia");
        }
        else if(buyer.cash < price){
            System.out.println("Kupujący ma za mało kasy");
        }
        else if(this instanceof Human){ //czy obiekt klasy Animal jest obiektem klasy Human
            System.out.println("NIE MA TAKIEGO SPRZEDAWANIA LUDZI!");
        }
        else{
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Zwierzaczek " + this + " został sprzedany za " + price);
        }
    }

}
