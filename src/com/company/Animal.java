package com.company;

public class Animal implements Saleable {
    //konfiguracja
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.3;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;

    //pola / przechowywanie danych
    final String species;
    String name;
    private Double weight;
    Integer age;
    Boolean alive;
    Double value;

    //konstruktory
    Animal(String species) {
        this.species = species; //wartość z parametru
        this.alive = true; //wartość domyślna

        if (this.species.equals("canis")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("felis")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    //metody

    private void checkWeight(double weight){
        if(weight <= 0) {
            System.out.println("Zwierzątko nie żyje :(");
        }
            else{
                System.out.println("moja waga to: " + this.weight);
            }
    }

    void feed() {
        this.weight++;
        checkWeight(this.weight);
    }

    void feed(Double foodWeight) {
        this.weight += foodWeight;
        System.out.println("moja waga to: " + this.weight);
    }

    void takeForAWalk(){
        this.weight--;
        checkWeight(this.weight);
    }

    Double getWeight() {
        return this.weight;
    }

    void resetWeightToDefault(){
        this.weight = DEFAULT_ANIMAL_WEIGHT;
    }

    //toString
    String showAnimal()
    {
        return "Gatunek: " + species + " Imię: " + name + " Waga: " + weight + " kg Wiek: " + age + " lat " + alive;
    }

    //zadanie 8
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Próba sprzedania zwierzęcia " + showAnimal());
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
            System.out.println("Zwierzaczek " + showAnimal() + " został sprzedany za " + price);
        }
    }

}
