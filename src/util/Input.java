package util;


import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Input {

    private final Scanner scanner;
    public Input(Scanner sc) {
        this.scanner = sc;
    }
    public Input() { this.scanner = new Scanner(System.in); } //may be more beneficial to others using code.
    private final StringBuilder items = new StringBuilder();
    private final Map<String, ArrayList<String>> itemMap = new HashMap<>();
    private ArrayList<String> selections = new ArrayList<>();
    public String getString() {
        return getString("Would you like to create a grocery list?");
    }

    public String getString(String prompt) {
        return prompt;
    }

    public boolean yesNo() {
        return yesNo("\ntype e to enter a new item.\n");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userAnswer = this.scanner.next().trim();
        return userAnswer.equalsIgnoreCase("e");
    }

    public int getInt(int min, int max) {
        return getInt(min, max, "Enter your choice: ");
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        int userInt = getInt();
        return (userInt >= min && userInt <= max) ? userInt : getInt(min, max);
    }

    public int getInt() {return Integer.parseInt(this.scanner.nextLine());}

    //grocery methods

    public String getQty() {
        System.out.print("Enter the quantity: ");
        String userQty = this.scanner.nextLine().trim();
        return (!userQty.equals("")) ? userQty : getQty();
    }


public String getList( Map<Integer, String> categories, List<String> categoriesArr) {
    String selectedCat = selectCat(categories, categoriesArr);
    System.out.println("enter a product");
    this.scanner.nextLine();
    String itemChoice = this.scanner.nextLine().trim();
        String amount = this.getQty();
        if (!selections.contains(itemChoice)) {
             selections.add(itemChoice);
        }
        itemMap.putIfAbsent(selectedCat, selections);
            items.append(itemChoice).append(", qty: ").append(amount).append("\n");
    if (this.yesNo()) return getList(categories, categoriesArr);
    else {
        String[] sorted = items.toString().split("\n");
        System.out.println(itemMap);
        System.out.println(Arrays.toString(sorted));
        return String.join("\n", sorted);
    }
}

    public StringBuilder selectCat(List<String> categories) {
        int num = 0;
        StringBuilder list = new StringBuilder();
        for (String category : categories) {
            ++num;
            list.append(num).append(". ").append(category).append("\n");
        }
        return list;
    }

    public String selectCat(String prompt, Map<Integer, String> categories, List<String> categoriesArr) {
        System.out.println(prompt);
        System.out.println(selectCat(categoriesArr));
        int choice = this.scanner.nextInt();
        if (categories.containsKey(choice)) {
            System.out.println(categories.get(choice));
            return categories.get(choice);
        }
        return "no category found";
    }

    public String selectCat(Map<Integer, String> categories, List<String> categoriesArr){
        return selectCat("select a category\n",  categories, categoriesArr);
    }

    public HashMap<Integer, String> categoryMap(List<String> categories) {
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
       return Double.parseDouble(this.scanner.nextLine());
    }

    public Scanner getScanner() {
        return scanner;
    }
}
