package animalBonus.animals;

import animalBonus.Animal;

public class Cat extends Animal {
private boolean canMeow;


    public Cat(int numberOfLegs, String preferredClimate, String name) {
        super(numberOfLegs, preferredClimate, name);
    }

    public Cat(int numberOfLegs, String preferredClimate, String name, boolean canMeow) {
        super(numberOfLegs, preferredClimate, name);
        this.canMeow = canMeow;
    }

    public boolean isCanMeow() {
        return canMeow;
    }

    public void setCanMeow(boolean canMeow) {
        this.canMeow = canMeow;
    }

    @Override
    public String getAnimalInfo() {
        return super.getAnimalInfo()+"\nmeows: "+this.canMeow;
    }
}
