package OopZoo;

import javax.crypto.Mac;

public class Zoo {

    public static void main(String[] args) {

        Fish fish = new Fish(1, 'F', 20);
        fish.sleep();
        fish.eat();
        fish.swim();
        fish.move();
        Penguin pengu = new Penguin(10, 'F', 15);
        pengu.eat();
        pengu.sleep();
        pengu.move();
        Macaw charlie = new Macaw(7,'F',4);
        charlie.fly();
        charlie.sleep();
    charlie.move();

    }

}
