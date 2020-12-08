import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double randomNum = Math.ceil(Math.random() * 5);
        int count = 0;
        System.out.println("Guess the random number: ");
        double guessed = sc.nextDouble();
        System.out.println(guess(guessed, randomNum));


    }

    public static String guess(double userGuess, double randomNum) {
        Scanner sc = new Scanner(System.in);
        if (userGuess == randomNum) return "GOOD GUESS!";
        if (userGuess > randomNum) {
        System.out.println("Lower, guess again: " + randomNum);
        userGuess = sc.nextDouble();
        return guess(userGuess, randomNum);
        }
        System.out.println("Higher, guess again: " + randomNum);
        userGuess = sc.nextDouble();
        return guess(userGuess, randomNum);
    }


}
