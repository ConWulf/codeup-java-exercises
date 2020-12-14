package oopLec;

import inheritenceLec.polyLec.autoShop.Car;

import java.util.Scanner;
//why did I make this a separate class?
public class Start {

    //any car could be started or stopped
    public static void startCar (Car car, Scanner sc) {
        System.out.println("would you like to start the car?");
        String start = sc.nextLine();
        if (start.equalsIgnoreCase("y")) car.setOn(true);
        else System.out.println("car turned off");
    }

}
