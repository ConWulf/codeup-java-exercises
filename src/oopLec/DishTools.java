package oopLec;

import java.util.Locale;
import java.text.DecimalFormat;
public class DishTools {
    static DecimalFormat df = new DecimalFormat(".##");
    private static final int Avg_Cost_Of_Dish = 1300;

    public static void shoutDishName(Dish dish) {
        System.out.printf("%s\n==============\n", dish.nameOfDish.toUpperCase(Locale.ROOT));
    }

    public static void analyzeDishCost(Dish dish) {
        if (dish.getCost() > Avg_Cost_Of_Dish) {
            System.out.printf("%s is more expensive than average\n-----------------\n", dish.nameOfDish);
        }
        else System.out.printf("%s is less expensive than average\n-----------------\n", dish.nameOfDish);
    }

    public static void flipRecommendation(Dish dish) {
        if (dish.wouldRecommend) dish.wouldRecommend = false;
        else dish.wouldRecommend = true;
    }


    public static void printSummary (Dish dish) {
        if (dish.wouldRecommend && dish.nameOfDish.equalsIgnoreCase("homemade ramen")) System.out.println("Blasphemous!");
        else if (!dish.wouldRecommend && dish.nameOfDish.equalsIgnoreCase("homemade ramen")) dish.wouldRecommend = true;
        if (dish.getCost() != 0) System.out.printf("Cost: %s\nName: %s\nRecommended: %s\n",
                df.format(dish.getCost()/100), dish.nameOfDish, dish.wouldRecommend);
        else System.out.println("you did not enter a correct price.\n");
    }

}
