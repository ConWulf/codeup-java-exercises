package shapes;

import util.Input;

public class CircleCreate {


    public static String create (Input input, int numOfCircles) {
        double radius = input.getDouble(1.0, 15.0);
        Circle circle = new Circle(radius);
        System.out.printf("Circle Area: %.2f\nCircle radius: %.2f\n",
                circle.getArea(), circle.getCircumference());
        if (input.yesNo()) {
            System.out.printf("number of circles created: %d\n", numOfCircles);
            return "goodbye";
        }
            return create(input, ++numOfCircles);
    }

}
