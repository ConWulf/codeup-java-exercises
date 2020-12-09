package oopLec;

public class Car {
    private boolean carOn;// car could be on or off
    private String color; //could have different color car
    private String model; // different models of cars
    private int mileage; // mileage af car constantly changes;
    private boolean carIsMoving; //car could be on, but stopped
    private int speed; //speed of car changes

    public Car(boolean carOn, String color, String model, int mileage, boolean carIsMoving, int speed) {
        this.carOn = carOn;
        this.color = color;
        this.model = model;
        this.mileage = mileage;
        this.carIsMoving = carIsMoving;
        this.speed = speed;
    }
//help so many getters and setters
    public boolean isOn() {
        return carOn;
    }

    public void setOn (boolean startCar) {
        this.carOn = startCar;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public String setModel(String model){
       return this.model = model;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isCarIsMoving() {
        return carIsMoving;
    }

    public void setCarIsMoving(boolean carIsMoving) {
        this.carIsMoving = carIsMoving;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
