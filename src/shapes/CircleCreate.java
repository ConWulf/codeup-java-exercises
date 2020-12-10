package shapes;

import util.Input;

public class CircleCreate {


    public static String create (Input input, int numOfCircles) {
        double radius = input.getDouble(1.0, 15.0);
        Circle circle = new Circle(radius, 1);
        System.out.printf("Circle Area: %.2f\nCircle radius: %.2f\n",
                circle.getArea(), circle.getCircumference());
        if (!input.yesNo()) {
           return "number of circles created: "+numOfCircles+"\n";
        }
            return create(input, ++numOfCircles);
    }

}
