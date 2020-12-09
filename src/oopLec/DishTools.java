package oopLec;

import java.text.DecimalFormat;
import java.util.Locale;
public class DishTools {
    private static final DecimalFormat df = new DecimalFormat(".##");
    private static final int Avg_Cost_Of_Dish = 1300;

    public static void shoutDishName(Dish dish) {
        System.out.printf("%s\n==============\n", dish.getNameOfDish().toUpperCase(Locale.ROOT));
    }

    public static void analyzeDishCost(Dish dish) {
        if (dish.getCostInDollars() > Avg_Cost_Of_Dish) {
            System.out.printf("%s is more expensive than average\n-----------------\n", dish.getNameOfDish());
        }
        else System.out.printf("%s is less expensive than average\n-----------------\n", dish.getNameOfDish());
    }

    public static void flipRecommendation(Dish dish) {
        dish.setWouldRecommend(!dish.isWouldRecommend());
    }


    public static void printSummary (Dish dish) {
        if (dish.isWouldRecommend() && dish.getNameOfDish().equalsIgnoreCase("homemade ramen")) System.out.println("Blasphemous!");
        else if (!dish.isWouldRecommend() && dish.getNameOfDish().equalsIgnoreCase("homemade ramen")) dish.setWouldRecommend(true);
        if (dish.getCostInDollars() != 0) System.out.printf("Cost: %s\nName: %s\nRecommended: %s\n",
                df.format(dish.getCostInDollars()), dish.getNameOfDish(), dish.isWouldRecommend());
        else System.out.println("you did not enter a correct price.\n");
    }

}
