package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input(new Scanner(System.in));
        CircleCreate.create(input, 1);
    }

}
