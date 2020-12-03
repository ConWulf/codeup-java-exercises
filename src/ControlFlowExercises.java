public class ControlFlowExercises {

    public static void main(String[] args) {
        for (int i = 100; i >= -10; i-=5) {
            System.out.printf("i is: %d%n", i);
        }
        for (double i = 2; i <= 1000000; i = Math.pow(i, 2)) {
            System.out.printf("i is: %f%n", i);
        }

    }

}
