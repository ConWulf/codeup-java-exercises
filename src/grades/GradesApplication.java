package grades;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> github = new HashMap<>();
        Student kamala = new Student("kamala");
        kamala.addGrade(new ArrayList<>(Arrays.asList(88,  95, 99)));
        Student riri = new Student("riri");
        riri.addGrade(new ArrayList<>(Arrays.asList(100,  105, 100)));
        Student viv = new Student("viv vision");
        viv.addGrade(new ArrayList<>(Arrays.asList(Student.convertToDecimal(1100011),
                Student.convertToDecimal(1100100), Student.convertToDecimal(1100010))));
        Student amadeus = new Student("amadeus cho");
        amadeus.addGrade(new ArrayList<>(Arrays.asList(100,  100, 100)));
        github.putIfAbsent("kamala*", kamala);
        github.putIfAbsent("IronHeart", riri);
        github.putIfAbsent("vivision", viv);
        github.putIfAbsent("Brawn", amadeus);
        Set<String> usernames = github.keySet();
        boolean keepGoing = true;
        do {
        System.out.println("Welcome!\n\nhere are the GitHub usernames of our students\n");
        for (String username: usernames) {
            System.out.printf("|%s| ", username);
        }
        System.out.println("\n\nWhat student would you like to see more information on? (or to view all grades, type \"all\")");
        System.out.println("to view class average, type \"avg\".");
        System.out.print("\n> ");
        String choice = sc.nextLine();
        if (usernames.contains(choice)) {
            if (github.containsKey(choice)) {
                System.out.printf("Name: %s - ", github.get(choice).getName());
                for (String username: usernames) {
                    if (username.equals(choice)) System.out.printf("GitHub Username: %s\n", username);
                }
                System.out.printf("Current Average: %.1f\n",  github.get(choice).getGradeAverage());
                System.out.print("Student Grades: ");
                for (int grade: github.get(choice).getGrades()) {
                    System.out.print(grade + " ");
                }
            }
        } else if (choice.equalsIgnoreCase("all")) {
            System.out.println("All Class Grades: ");
            for (Student student: github.values()) {
                System.out.printf(" %s: %s\n",student.getName(), student.getGrades());
            }
        }  else if (choice.equalsIgnoreCase("avg")) {
            System.out.println("Class Avg: ");
            ArrayList<Integer> grades = new ArrayList<>();
            int avg = 0;
            for (Student student : github.values()) grades.addAll(student.getGrades());
            for (int grade : grades) avg += grade;
            System.out.println(avg / grades.size());
        } else System.out.println("\nSorry, no student found with the GitHub username of \"pizza\".");
            System.out.println("\nWould you like to see another student?");
            String answer = sc.nextLine();
            if (!answer.equalsIgnoreCase("y")) keepGoing = false;
        } while (keepGoing);
    }

}
