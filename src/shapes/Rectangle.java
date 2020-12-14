package shapes;

 class Rectangle extends Quadrilateral implements Measurable {


     public Rectangle(int length, int width) {
         super(length, width);
     }

     @Override
     public void setLength(int length) {

     }

     @Override
     public double getPerimeter() {
         return 0;
     }

     @Override
     public double getArea() {
         return 0;
     }

     @Override
     public int getWidth() {
         return 0;
     }

     @Override
     public void setWidth(int width) {

     }
 }

