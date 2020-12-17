package util;

import java.text.DecimalFormat;
import java.util.*;

public class Input {

    private final Scanner scanner;
    private final DecimalFormat df = new DecimalFormat(".##");
    public Input(Scanner sc) {
        this.scanner = sc;
    }
    public Input() { this.scanner = new Scanner(System.in); } //may be more beneficial to others using code.
    private final HashMap<String, Integer> items = new HashMap<>();

    public String getString() {
        return getString("Would you like to create a grocery list?");
    }

    public String getString(String prompt) {
        return prompt;
    }

    public boolean yesNo() {
        return yesNo("\nwould you like to finalize list or enter a new item?\n");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userAnswer = this.scanner.next().trim();
        return userAnswer.equalsIgnoreCase("yes")
                || userAnswer.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        return getInt(min, max, "Enter your choice: ");
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        int userInt = getInt();
        return (userInt >= min && userInt <= max) ? userInt : getInt(min, max);
    }



    //grocery methods

    public int getInt(int max) {
        return getInt(max, "Enter the quantity: ");
    }

    public int getInt( int max, String prompt) {
        System.out.print(prompt);
        int userInt = getInt();
        return (userInt >= 0 && userInt <= max) ? userInt : getInt(max);
    }

    public int getInt() {
       return this.scanner.nextInt();
    }

    public HashMap<String, String> itemToCategory(ArrayList<String> items) {
        HashMap<String, String> itemMap = new HashMap<>();
        for (String item : items) {
            switch (item) {
                case "milk", "eggs":
                    itemMap.putIfAbsent(item, "dairy");
                    break;
                case "sliced turkey", "sliced ham":
                    itemMap.putIfAbsent(item, "meat");
                    break;
                case "red onion", "bell pepper":
                    itemMap.putIfAbsent(item, "produce");
                    break;
                case "frozen vegetable combo":
                    itemMap.putIfAbsent(item, "frozen");
                    break;
                case "french bread", "baguette":
                    itemMap.putIfAbsent(item, "bakery");
                    break;
            }
        }
        return itemMap;
    }

public HashMap<String, Integer> getList(String prompt, HashMap<String, String> item) {
    System.out.println(prompt);
    String itemChoice = this.scanner.nextLine();
    if (!item.containsKey(itemChoice)) {return getList(prompt, item);}
    else {
    int amount = this.getInt(30);
    items.putIfAbsent(itemChoice, amount);
    }
    if (this.yesNo()) return getList(prompt, item);
    else return items;
}

    public HashMap<String, Integer> getList(HashMap<String, String> item) {
        return getList("enter a product", item);
    }

    public StringBuilder selectCat(ArrayList<String> categories) {
        int num = 0;
        StringBuilder list = new StringBuilder();
        for (String category : categories) {
            ++num;
            list.append(num).append(". ").append(category).append("\n");
        }
        return list;
    }

    public String selectCat(String prompt, HashMap<Integer, String> categories, ArrayList<String> categoriesArr) {
        System.out.println(prompt);
        System.out.println(selectCat(categoriesArr));
        int choice = this.scanner.nextInt();
        if (categories.containsKey(choice)) return categories.get(choice);
        return "no category found";
    }

    public String selectCat(HashMap<Integer, String> categories, ArrayList<String> categoriesArr){
        return selectCat("select a category\n",  categories, categoriesArr);
    }

    public HashMap<Integer, String> categoryMap(ArrayList<String> categories) {
        int num = 0;
        HashMap<Integer, String> catMap = new HashMap<>();
        for (String category : categories) {
            ++num;
            catMap.putIfAbsent(num, category);
        }
        return catMap;
    }



    public double getDouble(double min, double max) {
        return getDouble(min, max, "Enter a radius between "+min+" and "+max);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.printf("%s\n", prompt);
        double userDouble = getDouble();
        return (userDouble > min && userDouble < max) ? userDouble : getDouble(min, max);
    }

    public double getDouble() {
       return this.scanner.nextDouble();
    }

    public Scanner getScanner() {
        return scanner;
    }
}
