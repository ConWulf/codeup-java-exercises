package util;

import util.Input;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input(new Scanner(System.in));
        do  {
            input.getInt(2, 15);
            input.getDouble(2.5, 10.8);
            if (!input.yesNo()) System.exit(0);
        } while (true);

    }

}
