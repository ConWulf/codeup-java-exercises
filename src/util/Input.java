package util;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;
    private final DecimalFormat df = new DecimalFormat(".##");
    public Input(Scanner sc) {
        this.scanner = sc;
    }

    public String getString() {
        System.out.println("would you like to enter a another radius?");
        return this.scanner.next();
    }

    public String getString(String prompt) {
        System.out.printf("%s", prompt);
        this.scanner.nextLine();
        System.out.println("would you like to enter a number?");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userAnswer = getString();
        return !userAnswer.equalsIgnoreCase("yes")
                && !userAnswer.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter an integer between %d and %d\n", min, max);
        int userInt = getInt();
        return (userInt > min && userInt < max) ? userInt : getInt(min, max);
    }

    public int getInt(int min, int max, String string) {
        System.out.printf("%s\n", string);
        this.scanner.nextLine();
        System.out.printf("Enter an integer between %d and %d\n", min, max);
        int userInt = getInt();
        return (userInt > min && userInt < max) ? userInt : getInt(min, max);
    }

    public int getInt() {
       return this.scanner.nextInt();
    }


    public double getDouble(double min, double max) {
        System.out.printf("Enter a radius between %.2f and %.2f\n", min, max);
        double userDouble = getDouble();
        return (userDouble > min && userDouble < max) ? Float.parseFloat(df.format(userDouble)) : getDouble(min, max);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.printf("%s\n", prompt);
        System.out.printf("Enter a decimal between %f and %f\n", min, max);
        double userDouble = getDouble();
        return (userDouble > min && userDouble < max) ? userDouble : getDouble(min, max);
    }

    public double getDouble() {
       return this.scanner.nextDouble();
    }



}
