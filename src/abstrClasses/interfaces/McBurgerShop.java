package abstrClasses.interfaces;

import abstrClasses.BurgerShop;

import java.util.ArrayList;
import java.util.List;

public class McBurgerShop implements McFranchise{

    public static void main(String[] args) {
        List<String> menuItems = new ArrayList<>();
        menuItems.add("Big Mac");
        menuItems.add("Fries");
        List<String> menuCategories = new ArrayList<>();
        menuCategories.add("Entree");
        menuCategories.add("Side");
        McBurgerShop myShop2 = new McBurgerShop( menuItems, menuCategories, 30,800, 2300, true);
        myShop2.broilStuff(myShop2.getMenuItems().get(0));
        myShop2.businessHours(myShop2.getOpenTime(), myShop2.getCloseTime());
        myShop2.greetCustomer();
        for (String item: myShop2.getMenuItems()) {
            myShop2.broilStuff(item);
        }
        System.out.println(myShop2.iceCreamMachineWorking());
        AustinMcD myShop3 = new AustinMcD( menuItems, menuCategories, 30,800, 2200, true);
        myShop3.broilStuff(myShop3.getMenuItems().get(0));
        myShop3.businessHours(myShop3.getOpenTime(), myShop3.getCloseTime());
        for (String item: myShop3.getMenuItems()) {
            myShop3.broilStuff(item);
        }
        System.out.println(myShop3.iceCreamMachineWorking());
        BurgerShop myShop = new BurgerShop("tod", menuItems, menuCategories, 30,800, 2300, true);
        myShop.setManagerName("Tim");
        myShop.greetCustomer();
        myShop.broilStuff(myShop.getMenuItems().get(0));
        myShop.businessHours(myShop.getOpenTime(), myShop.getCloseTime());


    }

    public void greetCustomer() {
        //must have method body w/o abstract keyword
        System.out.println("welcome to "+this.companyName);
    }

    //properties
    protected List<String> menuItems;
    protected List<String> menuCategories;
    protected int seatingCapacity;
    protected int openTime;
    protected int closeTime;
    protected boolean isWorking;

    //constructor


    public McBurgerShop(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean isWorking) {
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.isWorking = isWorking;
    }

    //overrides
    @Override
    public void broilStuff(String menuItem) { System.out.printf("the kitchen cooked %s\n", menuItem);}

    @Override
    public void businessHours(int open, int close) { System.out.printf("open from %d to %d\n", open, close); }

    @Override
    public String iceCreamMachineWorking() {
        if (this.isWorking) return "Time for ice cream!";
        return "No ice cream.";
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(List<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
