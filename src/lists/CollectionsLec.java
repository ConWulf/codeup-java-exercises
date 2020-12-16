package lists;

import lists.hashmaps.HashMaps;

import java.util.*;

public class CollectionsLec {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23, 4, 435, 34));


        for (int num: nums) {
            System.out.println(num);
        }

        HashMap<Character, String> answers = new HashMap<>();

        answers.putIfAbsent('A', "Sally");
        answers.putIfAbsent('B', "Sally");
        answers.putIfAbsent('C', "jimbo");
        answers.putIfAbsent('D', "bob");
        answers.putIfAbsent('E', "jim");

        Collection<String> people = answers.values();
      Set<Character> keys =  answers.keySet();
    }

}
