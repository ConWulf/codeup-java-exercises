package shapes;

 class Circle {

    private double radius;
    private static int numOfCircles;
    public Circle(double radius, int numOfCircles) {
        this.radius = radius;
        Circle.numOfCircles = numOfCircles;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2) ;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static int getNumOfCircles() {
        return numOfCircles;
    }

    public static void setNumOfCircles(int numOfCircles) {
        Circle.numOfCircles = numOfCircles;
    }
}
