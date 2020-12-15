package animalBonus.animals;

import animalBonus.Animal;

public class Dog extends Animal {
    private String breed;
    private boolean canBark;

    public Dog() {}

    public Dog(int numberOfLegs, String preferredClimate, String name) {
        super(numberOfLegs, preferredClimate, name);
    }

    public Dog(int numberOfLegs, String preferredClimate, String name, String breed, boolean canBark) {
        super(numberOfLegs, preferredClimate, name);
        this.breed = breed;
        this.canBark = canBark;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println("bark, bark");
    }

    public boolean isCanBark() {
        return canBark;
    }

    public void setCanBark(boolean canBark) {
        this.canBark = canBark;
    }

    @Override
    public String getAnimalInfo() {
        if (this.isCanBark()) bark();
       return super.getAnimalInfo()+"\nbarks: "+this.canBark+"\nbreed: "+this.breed;
    }
}
