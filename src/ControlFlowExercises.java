import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean userInput = true;
        do {
            System.out.println("What is the max number you want?");
            int userInteger = scanner.nextInt();
            System.out.println("here is your table.");
            scanner.nextLine();
            System.out.print("number | squared | cubed \n------ | ------  | ------");
            for (int i = 1; i <= userInteger; i++) {
                double squared = Math.pow(i, 2);
                double cubed = Math.pow(i, 3);
                System.out.printf("%n%d      |%-8d |%d", i, (long) squared, (long) cubed);
            }
            System.out.println("\nwould you lake to continue[Y/N]?");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")){
                userInput = false;
            }
        } while (userInput);


//        do {
//            System.out.print("What is your number grade?\n");
//            int userGrade = scanner.nextInt();
//            System.out.println("your letter grade is: ");
//            if (userGrade <= 100 && userGrade >= 95) {
//                System.out.print("A+");
//            } else if (userGrade <= 94 && userGrade >= 88) {
//                System.out.print("A-");
//            } else if (userGrade <= 87 && userGrade >= 84) {
//                System.out.print("B+");
//            } else if (userGrade <= 83 && userGrade >= 80) {
//                System.out.print("B-");
//            } else if (userGrade <= 79 && userGrade >= 73) {
//                System.out.print("C+");
//            } else if (userGrade <= 73 && userGrade >= 67) {
//                System.out.print("C-");
//            } else if (userGrade <= 66 && userGrade >= 60) {
//                System.out.print("D");
//            } else if (userGrade <= 59 && userGrade >= 0) {
//                System.out.print("F");
//            }
//            System.out.println("\nwould you like to enter another grade[Y/N]?");
//        } while (scanner.next().equalsIgnoreCase("y"));

    }

}
