import inheritenceLec.polyLec.autoShop.Car;
import inheritenceLec.polyLec.autoShop.ControlCar;
import oopLec.Start;

import java.util.Scanner;

public class DriveCar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car(false, "Toyota", "LandCruiser", 200000, false, 0);
        Start.startCar(car, sc);
        System.out.println("press \"d\" to drive");
        String letter = sc.nextLine();
        ControlCar.moveForward(car, 0, letter, 1000);
    }

}
