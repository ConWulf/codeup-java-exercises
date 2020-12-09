import oopLec.Dish;
import oopLec.DishTools;

public class DishTest {

    public static void main(String[] args) {

        Dish dish = new Dish(1256, "homemade ramen", true);
        dish.setCostInCents(1376);
        DishTools.shoutDishName(dish);
        DishTools.analyzeDishCost(dish);
        DishTools.flipRecommendation(dish);
        DishTools.printSummary(dish);

        System.out.println("***-------------------***");

        Dish dish2 = new Dish();
        DishTools.shoutDishName(dish2);
        DishTools.analyzeDishCost(dish2);
        DishTools.flipRecommendation(dish2);
        DishTools.printSummary(dish2);

        System.out.println("***-------------------***");

        Dish dish3 = new Dish("1656", "Salmon", true);
        DishTools.shoutDishName(dish3);
        DishTools.analyzeDishCost(dish3);
        DishTools.flipRecommendation(dish3);
        DishTools.printSummary(dish3);






    }

}
