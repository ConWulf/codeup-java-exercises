import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(add(5, 9));
//        System.out.println(subtract(9, 5));
//        System.out.println(multiply(500000L, 100000L));
//        System.out.println(multiply(500L, 100L));
//        System.out.println(divide(5, 2));
//        System.out.println(remainder(9, 2));
//        System.out.println(multiply2(500000L, 100000L));
//        System.out.println(multiply2(500L, 100L));
//        System.out.println(multiplyRecursive(5, 10));
//        System.out.println(multiplyRecursive(500000L, 1000L));
//        Scanner sc = new Scanner(System.in);
//        do {
//        int userInt =  getInteger(1,20);
//        System.out.println(factorial(userInt));
//            System.out.println("would you like to enter another number?");
//            String choice = sc.nextLine();
//            if (!choice.equalsIgnoreCase("y")) break;
//        } while (true);

    }

    public static int add (int x, int y) {
        return x + y;
    }

    public static int subtract (int x, int y) {
        return x - y;
    }

    public static long multiply (long x, long y) {
        return x * y;
    }

    public static double divide (double x, double y) {
        return x / y;
    }

    public static int remainder (int x, int y) {
        return x % y;
    }

    public static long multiply2 (long x, long y) {
        long multiply = 0L;
        for (long i = 0L; i < y; i++) {
           multiply += x;
        }
        return multiply;
    }

    public static long multiplyRecursive(long x, long y) {
        if (y == 1) {
            return  x;
        }
        return x + multiplyRecursive( x, y-1);
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number between 1 and 20: ");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        }
        return getInteger(min, max);
    }

    public static long factorial(long userInt) {
        if (userInt == 1) {
            return  userInt;
        }
        return userInt * factorial(userInt-1);
    }
    public static  String loopFactorial(long userInt) {
        int start = 1;
        for (int i = 1; i < userInt; i++) {
            start *= i;
        }
        return userInt + "!" + " = " + start;
    }

    public static int diceRoll(int numOfSides) {

    }




}
