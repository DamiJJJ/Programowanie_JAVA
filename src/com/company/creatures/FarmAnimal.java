package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{
    private final Boolean edible;
    public FarmAnimal(String species) {
        super(species);
        this.edible = true;
    }

    @Override
    public void beEaten() {
        if(!FarmAnimal.alive){
            System.out.println("Zwierze jest już martwe, nie można go zjeść!");
        }
        else if(FarmAnimal.weight < 3.0){
            System.out.println("Zwierzę waży zbyt mało, aby można było je zjeść!");
        }
        else{
            System.out.println("Zwierzę " + this.species + " zostało zjedzone");
        }
    }
}
