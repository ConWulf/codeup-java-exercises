package lists;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to an ArrayList. The element type is the determined by the Object type within the angle brackets <>
        numbers.add(13);
        numbers.add(2);
        numbers.add(20);

//        Collections.sort(numbers,  Collections.reverseOrder());
//        System.out.println(numbers);
        // prints out ArrayList
//        System.out.println(numbers);

        // return length of the ArrayList with .size()
//        System.out.println(numbers.size());

        // return an element at the specified index
//        System.out.println(numbers.get(1));

        // returns index position of found element, -1 if not found.
//        System.out.println(numbers.indexOf(13));
//        System.out.println(numbers.indexOf(20));

        // TODO: Add a new Integer to the numbers ArrayList at index 1.
//        numbers.add(1, 20);
//        numbers.remove(Integer.valueOf(2));
//        System.out.println(numbers);

        // prints out ArrayList
//        System.out.println(numbers);
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.add("dark");
        roasts.add("medium");

        System.out.println(roasts);
        // .contains returns a boolean value based on whether or not a searched value exists in the ArrayList
        System.out.println(roasts.contains("dark"));
        // TODO: Check if the roasts list contains "espresso"
        System.out.println(roasts.contains("espresso"));
        // returns the last occurrence of a given value
        // TODO: Find the last "medium" roast in the list.
        System.out.println(roasts.lastIndexOf("medium"));
        // TODO: How could we check if the roasts list is empty?
        System.out.println(roasts.isEmpty());
        // TODO: Remove one medium roast from the list. If there are duplicate strings in the list, which one is removed first?
        System.out.println(roasts.remove("medium"));
        System.out.println(roasts);
        // TODO: Remove the element at index 4. Note the return value here vs. the previous remove method.
        System.out.println(roasts.remove(4));
        System.out.println(roasts);
        // BONUS TODO: How can we get the list of roasts in alphabetical order?
        roasts.sort(Collections.reverseOrder());
        System.out.println(roasts);
    }
}

