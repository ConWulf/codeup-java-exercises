package oopLec;

public class PersonLec {



//        // SLIDE 3
//        public String firstName;
//        public String lastName;


        // SLIDE 4

//        // instance variables
        public String firstName;
        public String lastName;

//
//        // instance method
        public String sayHello() {
                return lastName + ", " + firstName + " says hi!";
        }

    public String sayHello(char punctuation) {
        return lastName + ", " + firstName + " says hi!" + punctuation;
    }


        // SLIDE 7
        public static long worldPopulation = 7_500_000_000L; // class property
        public String name;                                  // instance property

        public static void main(String[] args) {

                System.out.println(PersonLec.worldPopulation);
                PersonLec.worldPopulation -= 1;
                System.out.println(worldPopulation);


                PersonLec theBestDrummerAlive = new PersonLec();
                theBestDrummerAlive.name = "Neil Peart";
                PersonLec.worldPopulation += 1; // accessing a static property
                // this also works, but is usually not a good idea
                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
                // DONT DO THIS, it will not compile
//                 System.out.println(oopLec.Person.name);
        }

}
