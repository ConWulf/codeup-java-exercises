package animalBonus;

import animalBonus.animals.Cat;
import animalBonus.animals.Dog;
import animalBonus.animals.Fish;

public class AnimalTester {

    public static void displayAnimalDetails(Animal animal) {
        System.out.println(animal.getAnimalInfo()+"\n");
    }

    public static void main(String[] args) {

        Animal dog = new Dog(4, "cold, snowy", "Barley", "Huskey", false);
        Animal fish = new Fish(0, "tropical", "nemo", "clownfish", "orange and white");
        Animal cat = new Cat(4, "all", "cat", true);
        displayAnimalDetails(dog);
        displayAnimalDetails(fish);
        displayAnimalDetails(cat);
    }

}
