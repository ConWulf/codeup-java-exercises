package abstrClasses.interfaces;

import java.util.ArrayList;
import java.util.List;

public class AustinMcD extends McBurgerShop {


    public AustinMcD(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean isWorking) {
        super(menuItems, menuCategories, seatingCapacity, openTime, closeTime, isWorking);
    }

    @Override
    public void broilStuff(String menuItem) {
        System.out.printf("austin kitchen cooked %s\n", menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.printf("open from %s to %s\n", openTime, closeTime);
    }

    @Override
    public String iceCreamMachineWorking() {
        if (this.isWorking) return "Time for organic frozen dairy!";
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
