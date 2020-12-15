package shapes;


public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getPerimeter() {
        System.out.println("square");
        return 4 * this.length;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(this.length, 2);
    }
}
