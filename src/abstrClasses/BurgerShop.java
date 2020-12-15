package abstrClasses;

import java.util.ArrayList;
import java.util.List;

//San Antonio instillation of a Franchise
public class BurgerShop extends Franchise {
    //this will be an actual Mcd's store
//must follow all rules in Franchise abstract class


    //can have custom properties
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean isWorking;

    //constructor
    public BurgerShop(String managerName, List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean isWorking) {
        super(managerName);
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.isWorking = isWorking;
    }

    //override methods

    @Override
    public void broilStuff(String menuItem) {
        System.out.println("the kitchen cooked "+menuItem);
    }

    @Override
    public void businessHours(int open, int close) {
        System.out.printf("open from %d to %d", open, close);
    }

    @Override
    public boolean iceCreamMachineIsWorking() {
        //slightly more complex than getter
        if (this.openTime > 100) return this.isWorking;
        return false;
    }

    //getters and setters
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
