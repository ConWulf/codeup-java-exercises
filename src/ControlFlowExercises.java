import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("What is the max number you want?");
        int userInteger = scanner.nextInt();
        System.out.println("here is your table.");
        System.out.print("number | squared | cubed \n------ | ------  | ------");
        for (int i = 1; i <= userInteger; i++) {
            double squared = Math.pow(i, 2);
            double cubed = Math.pow(i, 3);
            System.out.printf("%n%d     |%d     |%d", i, (int)squared, (int)cubed);
        }
        System.out.println("\nwould you lake to continue[Y/N]?");
        } while ((scanner.hasNextLine() && scanner.next().equalsIgnoreCase("y")) || (!scanner.hasNextLine() && scanner.next().equalsIgnoreCase("yes")));


    }

}
