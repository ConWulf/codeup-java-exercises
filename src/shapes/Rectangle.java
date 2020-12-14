package shapes;

 class Rectangle  {
    protected int length;
    protected int width;
     protected int side;

     public Rectangle(int length, int width) {
         this.length = length;
         this.width = width;
     }

     public Rectangle(int side) {
         this.side = side;
     }

     public int getArea() {
         return this.length * this.width;
     }

     public int getPerimeter() {
         return (2*this.length) + (2*this.width);
     }
 }

