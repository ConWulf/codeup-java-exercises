package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Square box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape;
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        System.out.println(myShape.getLength()); //of type measurable
        Rectangle myShape2 = new Rectangle(5, 4);
        System.out.println(myShape2.getLength());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }
}
