package inheritenceLec;

 class Teacher extends Employee {
     public Teacher () {

     }

     public Teacher (String name) {
        super(name);
     }

     @Override
     public void work() {
         System.out.println("teaching students");
     }

     public static void main(String[] args) {

         Teacher jane = new Teacher("jane");
         System.out.println(jane.getName());
         jane.work();

     }

}
