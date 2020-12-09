package oopLec;

import java.util.Scanner;

public class ControlCar {


public static void moveForward(Car car, int speed, String letter, int wait) {
    car.setSpeed(speed);
    if (car.getSpeed() >= 66) return;
    if (wait <= 5) wait = 5;
    if (!car.isCarIsMoving()) {
        if (letter.equalsIgnoreCase("d")) {
            System.out.printf("%d\r", speed);
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            moveForward(car, ++speed, letter, wait - 15);
        }
    }
}




}
