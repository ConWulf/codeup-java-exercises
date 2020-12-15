package shapes;


public class Square extends Quadrilateral {


    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    public void setLength(int length) {
        this.length = length;
        this.width = length;
    }

}
