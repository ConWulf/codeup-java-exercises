package util;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;
    private final DecimalFormat df = new DecimalFormat(".##");
    public Input(Scanner sc) {
        this.scanner = sc;
    }
    public Input() { this.scanner = new Scanner(System.in); } //may be more beneficial to others using code.

    public String getString() {
        return this.scanner.next();
    }

    public String getString(String prompt) {
        System.out.println( prompt);
        return getString();
    }

    public boolean yesNo() {
        return yesNo("would you like to enter a another radius?");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userAnswer = getString();
        return userAnswer.equalsIgnoreCase("yes")
                || userAnswer.equalsIgnoreCase("y");
    }



    public int getInt(int min, int max) {
        return getInt(min, max, "Enter an integer between "+min+" and "+max);
//        System.out.printf("Enter an integer between %d and %d\n", min, max);
//        int userInt = getInt();
//        return (userInt > min && userInt < max) ? userInt : getInt(min, max);
    }

    public int getInt(int min, int max, String string) {
        System.out.printf("%s\n", string);
//        this.scanner.nextLine();
        int userInt = getInt();
        return (userInt > min && userInt < max) ? userInt : getInt(min, max);
    }

    public int getInt() {
       return this.scanner.nextInt();
    }


    public double getDouble(double min, double max) {
        return getDouble(min, max, "Enter a radius between "+min+" and "+max);
//        System.out.printf("Enter a radius between %.1f and %.1f\n", min, max);
//        double userDouble = getDouble();
//        return (userDouble > min && userDouble < max) ? Float.parseFloat(df.format(userDouble)) : getDouble(min, max);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.printf("%s\n", prompt);
        double userDouble = getDouble();
        return (userDouble > min && userDouble < max) ? userDouble : getDouble(min, max);
    }

    public double getDouble() {
       return this.scanner.nextDouble();
    }



}
