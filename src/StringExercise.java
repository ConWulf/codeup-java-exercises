import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StringExercise {

    public static void main(String[] args) {

//        String pinkFloyd = "We don't need no education\nWe don't need no thought control";
//        String check = "Check \"this\" out!, \"s inside of \"s!";
//        String windows = "In windows, the main drive is usually C:\\";
//        String backslash = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
//        System.out.println(pinkFloyd);
//        System.out.println(check);
//        System.out.println(windows);
//        System.out.println(backslash);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a date");
        String userDate = sc.nextLine();
        System.out.println(dateConversion(userDate));
    }

    public static String dateConversion (String date) {
        date = date.trim();
        int month = parseInt(date.substring(0, date.indexOf("/")));
        String day = date.substring(date.indexOf("/") + 1, date.lastIndexOf("/"));
        StringBuilder year = new StringBuilder(date.substring(date.lastIndexOf("/") + 1));
        if (year.length() == 2) {
            year = year.insert(0, "20");
        }
        switch (month) {
            case 1:
                return "January " + day + ", " + year;
            case 2:
                return "February "  + day + ", " + year;
            case 3:
                return "March "  + day + ", " + year;
            case 4:
                return "April "  + day + ", " + year;
            case 5:
                return "May "  + day + ", " + year;
            case 6:
                return "June "  + day + ", " + year;
            case 7:
                return "July "  + day + ", " + year;
            case 8:
                return "August "  + day + ", " + year;
            case 9:
                return "September "  + day + ", " + year;
            case 10:
                return "October  "  + day + ", " + year;
            case 11:
                return "November "  + day + ", " + year;
            case 12:
                return "December "  + day + ", " + year;
        }
        return dateConversion("12/04/2020");

    }

}
