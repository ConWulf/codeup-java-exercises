package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {

    public static void main(String[] args) {

        ArrayList<String> categories = new ArrayList<>(Arrays.asList("produce", "bakery", "dairy", "frozen", "deli"));
        ArrayList<String> items = new ArrayList<>(Arrays.asList("milk", "eggs", "sliced turkey", "sliced ham", "red onion",
                "bell pepper", "frozen vegetable combo", "french bread", "baguette"));
        Input input = new Input();
        System.out.println(input.itemToCategory(items));
//        System.out.println(input.categoryMap(categories));
        System.out.println(input.getString());
        String answer = input.getScanner().nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println(input.selectCat(input.categoryMap(categories), categories));
            System.out.println(input.getList(input.itemToCategory(items)));
        }


    }

}
