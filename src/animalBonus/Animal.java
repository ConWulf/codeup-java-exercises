package animalBonus;

public class Animal {
    private int numberOfLegs;
    private String preferredClimate;
    protected String animalName;

    public Animal(int numberOfLegs, String preferredClimate, String name) {
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
        this.animalName = name;
    }

    public Animal () {}

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }


    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalInfo() {
       return "Name: "+this.animalName+"\nnumber of legs: "+this.numberOfLegs+"\npreferred climate: "+this.preferredClimate;
    }
}
