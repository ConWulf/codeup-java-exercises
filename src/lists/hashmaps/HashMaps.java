package lists.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // We'll start by defining a hash map
        HashMap<String, String> usernames = new HashMap<>();

        // and putting some data into it
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);
        // TODO: Add more key-value pairs to usernames
usernames.put("Connor", "username1");
usernames.put("Connor2", "username1");
        // obtaining values from the hash map by key
        // TODO: Get the value stored in key "Ryan"
        System.out.println(usernames.get("Ryan"));
        // TODO: Get the value stored in key "Phillip". What is the result?
        usernames.getOrDefault("Jason", "gocodeup"); // "gocodeup"

        // checking if keys or values are present
        // TODO: Check if key "Justin" exists in the HashMap
        System.out.println(usernames.containsKey("Justin"));
        System.out.println(usernames.containsValue("username1"));
        // TODO: Check if the value "fmendozaro"
//        usernames.put("Ryan", "ryanorsinger2");

        System.out.println(usernames); // {Ryan=ryanorsinger}

        usernames.putIfAbsent("Zach", "zgulde");
        usernames.putIfAbsent("Zach", "coderdude24");
        System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde}

        // TODO: Remove key "Zach" and the value associated with it
        usernames.remove("Zach");
        System.out.println(usernames); // {Ryan=ryanorsinger}

        // TODO: Replace Ryan's username with "torvalds"
        usernames.replace("Ryan", "torvalds");
        System.out.println(usernames); // {Ryan=torvalds}
        System.out.println(usernames.isEmpty());
        usernames.clear();
        System.out.println(usernames.isEmpty());
    }
}
