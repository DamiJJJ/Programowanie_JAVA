package com.company.creatures;
import com.company.devices.Car;
import com.company.devices.CarYearComparator;
import com.company.devices.Phone;

import java.util.Arrays;

public class Human extends Animal implements Comparable<Human> {

    //konfiguracja
    private static final Double DEFAULT_SALARY = 1300.3;
    private static final String HUMAN_SPECIES = "homo sapiens";
    private static final int DEFAULT_GARAGE_SIZE = 4;

    //pola
    public String firstName;
    String lastName;
    public Phone mobile;
    public Animal pet;
    private Double salary;
    public Double cash;
    public Car[] garage;

    //konstruktory
    public Human(String firstName, String lastName) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = DEFAULT_SALARY;
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName, String lastName, int garageSize) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = 0.0;
        this.cash = 0.0;
        this.garage = new Car[garageSize];
    }
    //metody
    public void setSalary(Double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Należy odebrać aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty, nie ma co ukrywać dochodu :)");
        }
        else
        {
            System.out.println("Próbujesz przypisać ujemną wypłatę!");
        }
    }
    public void getCar(int parkingNo)
    {
        System.out.println(this.garage[parkingNo]);
    }

    public void setCar(Car car, int parkingNo)
    {
        if(salary > car.value)
        {
            System.out.println("Udało się kupić samochód za gotówkę!");
            this.garage[parkingNo] = car;
        }
        else if(salary > (car.value/12))
        {
            System.out.println("Udało się kupić samochód na kredyt!");
            this.garage[parkingNo] = car;
        }
        else
        {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę!");
        }
    }

    public void getCarsValue()
    {
        Double value = 0.0;
        for (Car car : garage) {
            if(car != null)
            {
                value += car.value;
            }
            else
            {
                break;
            }
        }
        System.out.println(value);
    }
    public void sortCarsByYear()
    {
        Arrays.sort(this.garage, new CarYearComparator());
        for(Car car : garage)
        {
            System.out.println(car);
        }
    }

    public Double getSalary(){

        System.out.println("Ostatnie pobieranie danych o wypłacie: 26.06.2021. Wartość: 3234zł");
        return this.salary;
    }

    //toString
    public String toString()
    {
        return "Imię: " + firstName + " Nazwisko: " + lastName + " Nr telefonu: " + mobile + " Zwierzę: " + pet + " Samochód:( " + garage[1] + ") Pensja: " + salary;
    }

    public boolean hasCar(Car newCar) {
        for(Car car : garage){
            if(car != null && car.equals(newCar)){
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        for(int i = 0; i < this.garage.length; i++)
        {
            if(garage[i] == null){
                return true;
            }
        }
        return false;
    }

    public void addCar(Car newCar) {
        for(int i = 0; i < this.garage.length; i++)
        {
            if(garage[i] == null){
                garage[i] = newCar;
                break;
            }
        }
    }

    public void removeCar(Car newCar) {
        for(int i = 0; i < this.garage.length; i++) {
            if (garage[i] == newCar) {
                garage[i] = null;
                break;
            }
        }
    }

    @Override
    public int compareTo(Human otherHuman){
        return this.cash.compareTo(otherHuman.cash);
    }
}
