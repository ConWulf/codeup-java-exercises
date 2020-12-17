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
        return getString("Would you like to create a grocery list?");
    }

    public String getString(String prompt) {
        return prompt;
    }

    public boolean yesNo() {
        return yesNo("\nwould you like to make another choice?\n");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userAnswer = this.scanner.next().trim();
        return userAnswer.equalsIgnoreCase("yes")
                || userAnswer.equalsIgnoreCase("y");
    }



    public int getInt(int min, int max) {
        return getInt(min, max, "Enter your choice: ");
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        int userInt = getInt();
        return (userInt >= min && userInt <= max) ? userInt : getInt(min, max);
    }

    public int getInt() {
       return this.scanner.nextInt();
    }


    public double getDouble(double min, double max) {
        return getDouble(min, max, "Enter a radius between "+min+" and "+max);
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
