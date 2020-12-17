package OopZoo;

public abstract class Animal {

    //properties
    private int age;
    private char gender;
    private int weightInPounds;

    public void eat() {
        System.out.println("eating...");
    }

    public void sleep()  {
        System.out.println("sleeping...");
    }

    public Animal(int age, char gender, int weightInPounds) {
        this.age = age;
        this.gender = gender;
        this.weightInPounds = weightInPounds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }



    public abstract void move();
}


