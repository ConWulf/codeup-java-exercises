import java.util.Scanner;

public class HighLow {

    private static int count = 1;

    public static void main(String[] args) { startGame();}

    public static void startGame() {
        Scanner sc = new Scanner(System.in);
        double randomNum = Math.ceil(Math.random() * 100);
        System.out.println("Guess the random number: ");
        double guessed = sc.nextDouble();
        System.out.println(guess(guessed, randomNum, sc));
    }

    public static String guess(double userGuess, double randomNum, Scanner sc) {
        if (count > 24) return "Sorry, you took too many guesses: " + count + " guesses";
        if (userGuess == randomNum) return "GOOD GUESS! You took " + count + " guesses";
        if (userGuess > randomNum) return high(randomNum, sc);
        return low(randomNum, sc);
    }

    public static String high(double randomNum, Scanner sc) {
        count += 1;
        System.out.printf("Lower, guess again: %d\n", (int) randomNum);
        double userGuess = sc.nextDouble();
        return guess(userGuess, randomNum, sc);
    }

    public static  String low(double randomNum, Scanner sc) {
        count += 1;
        System.out.printf("Higher, guess again: %d\n", (int) randomNum);
        double userGuess = sc.nextDouble();
        return guess(userGuess, randomNum, sc);
    }


}
