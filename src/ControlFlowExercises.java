public class ControlFlowExercises {

    public static void main(String[] args) {
        int i = 1;
       do {
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.printf("FizzBuzz %d%n", i);
           } else if (i % 3 == 0) {
               System.out.printf("Fizz %d%n", i);
           } else if (i % 5 == 0) {
               System.out.printf("Buzz %d%n", i);
           }
           i +=1; //returns double
       } while (i <= 100);

        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.printf("FizzBuzz %d%n", j);
            } else if (j % 3 == 0) {
                System.out.printf("Fizz %d%n", j);
            } else if (j % 5 == 0) {
                System.out.printf("Buzz %d%n", j);
            }

        }

    }

}
