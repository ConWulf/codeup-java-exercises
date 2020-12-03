public class ControlFlowExercises {

    public static void main(String[] args) {
        double i = 2;
       do {
           System.out.printf("\"i\" is: %f%n", i);
           i = Math.pow(i, 2); //returns double
       } while (i <= 1000000);


    }

}
