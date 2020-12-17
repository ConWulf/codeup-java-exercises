package util;


import java.util.*;

public class Input {

    private final Scanner scanner;
    public Input(Scanner sc) {
        this.scanner = sc;
    }
    public Input() { this.scanner = new Scanner(System.in); } //may be more beneficial to others using code.
    private final StringBuilder items = new StringBuilder();
    HashMap<String, String> itemMap = new HashMap<>();

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


public String getList( HashMap<Integer, String> categories, ArrayList<String> categoriesArr) {
    String selectedCat = selectCat(categories, categoriesArr);
    System.out.println("enter a product");
    this.scanner.nextLine();
    String itemChoice = this.scanner.nextLine();
        int amount = this.getInt(30);
        items.append(itemChoice).append(", qty: ").append(amount).append("\n");
        itemMap.putIfAbsent(itemChoice, selectedCat);
    if (this.yesNo()) {
        return getList(categories, categoriesArr);
    } else {
        String[] sorted = items.toString().split("\n");
        Arrays.sort(sorted);
        System.out.println(itemMap);
        return String.join("\n", sorted);
    }
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
        if (categories.containsKey(choice)) {
            System.out.println(categories.get(choice));
            return categories.get(choice);
        }
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
