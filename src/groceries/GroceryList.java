package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {

    public static void main(String[] args) {

        ArrayList<String> categories = new ArrayList<>(Arrays.asList("produce", "bakery", "dairy", "frozen", "deli"));
        Input input = new Input();
        System.out.println(input.getString());
        String answer = input.getScanner().nextLine();
        if (answer.equalsIgnoreCase("y"))
            System.out.println(input.getList(input.categoryMap(categories), categories));



    }

}
