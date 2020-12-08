import oopLec.Person;

public class OopLecture {

    public static void main(String[] args) {

        // ======================== slide 3 (classes and objects)

//            oopLec.Person p1 = new oopLec.Person();
//        System.out.println(p1);
//        p1.firstName = "Rick";
//            p1.lastName = "Sanchez";
//            System.out.println(p1.firstName);
//            System.out.println(p1.lastName);

//            oopLec.Person p2 = new oopLec.Person();
//        System.out.println(p2);
//        oopLec.Person impostor = p2;
//        System.out.println(impostor);
//        p2.firstName = "Fred";
//        p2.lastName = "Smith";
//        System.out.println(p2.firstName);
//        System.out.println(p2.lastName);



        // -- Dog Example --


//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



        // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

        // -- Dog Method Example --

//            Dog d1 = new Dog();
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";
//
//            d1.callForDog("Tater");


        // ======================== slide 5 (class fields)


//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --




        // ======================== slide 7 (class vs. object fields)

//            oopLec.Person theBestDrummerAlive = new oopLec.Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            oopLec.Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(oopLec.Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



        // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.println(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead


    }

}