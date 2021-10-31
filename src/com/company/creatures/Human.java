package com.company.creatures;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {

    //konfiguracja
    private static final Double DEFAULT_SALARY = 1300.3;
    private static final String HUMAN_SPECIES = "homo sapiens";

    //pola
    String firstName;
    String lastName;
    public Phone mobile;
    public Animal pet;
    public Car car;
    private Double salary;
    public Double cash;

    //konstruktory
    public Human(String firstName, String lastName) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = DEFAULT_SALARY;
        this.cash = 0.0;
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
    public void setCar(Car car)
    {
        if(salary > car.value)
        {
            System.out.println("Udało się kupić samochód za gotówkę!");
            this.car = car;
        }
        else if(salary > (car.value/12))
        {
            System.out.println("Udało się kupić samochód na kredyt!");
            this.car = car;
        }
        else
        {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę!");
        }
    }

    public Double getSalary(){

        System.out.println("Ostatnie pobieranie danych o wypłacie: 26.06.2021. Wartość: 3234zł");
        return this.salary;
    }
    public void getCar()
    {
        System.out.println(this.car);
    }

    //toString
    String showHuman()
    {
        return "Imię: " + firstName + " Nazwisko: " + lastName + " Nr telefonu: " + mobile + " Zwierzę: " + pet + " Samochód:( " + car + ") Pensja: " + salary;
    }

//    OVERRIDE - metoda ważniejsza od metody rodzica
//    public void sell(Human seller, Human buyer, Double price)
//    {
//        System.out.println("CHYBA CIE POTEGOWALO");
//    }
}
