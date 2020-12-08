package oopLec;



public class Dish {
    private int costInCents = 982;
    public String nameOfDish = "Spaghetti";
    public boolean wouldRecommend = false;


    public  void cost (int cost) {
        this.costInCents = cost;
    }

    public  void cost (String cost) {
        try {
            this.costInCents = Integer.parseInt(cost);
        } catch (NumberFormatException fe) {
            this.costInCents = 0;
        }
    }

    public double getCost() {
        return costInCents;
    }




}
