package shapes;

 class Rectangle  {
    protected int length;
    protected int width;


     public Rectangle(int l, int w) {
         this.length = l;
         this.width = w;
     }


     public int getArea() {
         System.out.println("rectangle");
         return this.length * this.width;
     }

     public int getPerimeter() {
         System.out.println("rectangle");
         return (2*this.length) + (2*this.width);
     }
 }

