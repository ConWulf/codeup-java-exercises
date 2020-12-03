import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args) {
//        double PI = 3.14159;
//        System.out.printf("The value of PI is %.2f %n", PI);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        System.out.println("enter an integer:");
//        int userInteger = scanner.nextInt();
//        System.out.println(userInteger);
//
//        System.out.println("enter 3 words:");
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        String str3 = scanner.next();
//        System.out.printf("%s %n%s %n%s", str1, str2, str3);
//        scanner.nextLine();
//
//        System.out.println("\nenter a sentence");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

//System.out.println("enter a length and width:");
//String width = scanner.nextLine();
//String length = scanner.nextLine();
//System.out.println("enter a height");
//String height = scanner.nextLine();
//float w = Float.parseFloat(width);
//float l = Float.parseFloat(length);
//float h = Float.parseFloat(height);
//
//System.out.printf("the area of the room is: %f %n", w*l);
//System.out.printf("the perimeter of your room is %f%n", 2*l+2*w);
//System.out.printf("the volume of your room is: %f %n", w*l*h);
//System.out.printf("your width was %f, your length was %f and your height was %f%n", w, l, h);

        System.out.println("enter a length and width and height:");
//        float width1 = Float.parseFloat(scanner.nextLine());
//        float length1 = Float.parseFloat(scanner.nextLine());
//        float height1 = Float.parseFloat(scanner.nextLine());
        float width1 = scanner.nextFloat();
        float length1 = scanner.nextFloat();
        float height1 = scanner.nextFloat();


        System.out.printf("the area of the room is: %f %n", width1*length1);
        System.out.printf("the perimeter of your room is %f%n", 2*length1+2*width1);
        System.out.printf("the volume of your room is: %f %n", width1*length1*height1);
        System.out.printf("your width was %f, your length was %f and your height was %f", width1, length1, height1);


//        float e = .1F;
//        float f = .2F;
//        double a = .1;
//        double b = .2;
//        System.out.println(Float.sum(e, f)  == 0.3);
//        System.out.println(Float.sum(e, f));
//        System.out.println(e + f);
//        System.out.println(a + b);
//        System.out.println(.8 + .9);
    }

}
