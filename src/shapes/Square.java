package shapes;


public class Square extends Rectangle {

    public Square(int side) {
        super(side);
    }



    @Override
    public int getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(this.side, 2);
    }
}
