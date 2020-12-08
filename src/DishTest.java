import oopLec.Dish;
import oopLec.DishTools;

public class DishTest {

    public static void main(String[] args) {

        Dish dish = new Dish();
        dish.cost(1256);
        dish.nameOfDish = "Homemade Ramen";
        dish.wouldRecommend = false;
        DishTools.shoutDishName(dish);
        DishTools.analyzeDishCost(dish);
        DishTools.flipRecommendation(dish);
        DishTools.printSummary(dish);


//        Dish dish2 = new Dish();
//        DishTools.printSummary(dish2);
//        DishTools.analyzeDishCost(dish2);
//        DishTools.shoutDishName(dish2);
//        DishTools.flipRecommendation(dish2);

//        Dish dish3 = new Dish();
//        dish3.cost("1656");
//        dish3.nameOfDish = "Salmon";
//        dish3.wouldRecommend = true;
//        DishTools.printSummary(dish3);
//        DishTools.analyzeDishCost(dish3);
//        DishTools.shoutDishName(dish3);
//        DishTools.flipRecommendation(dish3);






    }

}
