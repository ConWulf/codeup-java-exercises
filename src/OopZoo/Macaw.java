package OopZoo;

public class Macaw extends Bird implements Flyable{

    public Macaw(int age, char gender, int weightInPounds) {
        super(age, gender, weightInPounds);
    }

    @Override
    public void fly() {
      System.out.println("flying high");
    }

}
