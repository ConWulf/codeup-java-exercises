package inheritenceLec;

 class Employee {
     protected String name;
    private int id;

    public Employee () {

    }

     public Employee(String name) {
         this.name = name;
     }
     public int getId() {
         return id;
     }

     public void work() {
         System.out.println("do work");
     }

     public void setId(int id) {
         this.id = id;
     }


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
