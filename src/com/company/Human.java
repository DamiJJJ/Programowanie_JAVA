package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {

    //konfiguracja
    private static final Double DEFAULT_SALARY = 1300.3;
    private static final String HUMAN_SPECIES = "homo sapiens";

    //pola
    String firstName;
    String lastName;
    Phone mobile;
    Animal pet;
    private String car;
    private Double salary;

    //konstruktory
    Human(String firstName, String lastName) {
        super(HUMAN_SPECIES);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = DEFAULT_SALARY;
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
    public void setCar(Car vehicle)
    {
        if(salary > vehicle.value)
        {
            System.out.println("Udało się kupić samochód za gotówkę!");
            car = vehicle.showCar();
        }
        else if(salary > (vehicle.value/12))
        {
            System.out.println("Udało się kupić samochód na kredyt!");
            car = vehicle.showCar();
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
}
