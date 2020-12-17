package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(ArrayList<Integer> grades){
        this.grades.addAll(grades);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int gradeSum = 0;
        for (int grade: this.grades) {
            gradeSum += grade;
        }
        return (double) gradeSum/grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public static int convertToDecimal(int binaryNum) {
        double decimal = 0;
       String[] binaryString = Integer.toString(binaryNum).split("");
        Collections.reverse(Arrays.asList(binaryString));
        for (int i = 0; i < binaryString.length; i++) {
            if (binaryString[i].equals("1")) decimal += Math.pow(2, i);
        }
       return (int) decimal;
    }
}
