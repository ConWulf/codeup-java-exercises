package animalBonus.animals;

import animalBonus.Animal;

public class Fish extends Animal {
    private String species;
    private String scaleColors;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getScaleColor() {
        return scaleColors;
    }

    public void setScaleColor(String scaleColors) {
        this.scaleColors = scaleColors;
    }

    public Fish(int numberOfLegs, String preferredClimate, String name) {
        super(numberOfLegs, preferredClimate, name);
    }

    public Fish(int numberOfLegs, String preferredClimate, String name, String species, String scaleColors) {
        super(numberOfLegs, preferredClimate, name);
        this.species = species;
        this.scaleColors = scaleColors;
    }

    @Override
    public String getAnimalInfo() {
        return super.getAnimalInfo()+"\nspecies: "+this.species+"\nscale colors: "+this.scaleColors;
    }
}
