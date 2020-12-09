package oopLec;

public class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public Dish(int cost, String dishName, boolean recommendation) {
        this.costInCents = cost;
        this.nameOfDish = dishName;
        this.wouldRecommend = recommendation;
    }

    public Dish(String cost, String dishName, boolean recommendation) {
        try {
            this.costInCents = Integer.parseInt(cost);
            this.nameOfDish = dishName;
            this.wouldRecommend = recommendation;
        } catch (NumberFormatException nfe) {
            this.costInCents = 0;
        }
    }

    public Dish() {
        this.costInCents = 998;
        this.nameOfDish = "Spaghetti";
        this.wouldRecommend = false;
    }



public double getCostInDollars() {
    return (double) costInCents/100;
}

public void setCostInCents (int cost) {
    this.costInCents = cost;
}

public String getNameOfDish() {
    return this.nameOfDish;
}

public void setNameOfDish(String dishName) {
    this.nameOfDish = dishName;
}

public boolean isWouldRecommend() {
        return wouldRecommend;
}

public void setWouldRecommend(boolean recommendation) {
        this.wouldRecommend = recommendation;
}


}
