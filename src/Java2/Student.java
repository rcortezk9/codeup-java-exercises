package Java2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by renecortez on 5/22/17.
 */
public class Student {
    private String name;
    private ArrayList <Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public static void getStudentInfo(Map<String, Student>students, Scanner input){
        String mapCheck = input.nextLine();

        if (students.get(mapCheck) == null){
            System.out.println("Sorry, no student found with the gihub username of \"" + mapCheck + "\".");
            anotherSelection(students, input);
        } else {
            System.out.println("\nName: " + students.get(mapCheck).getName() + " - Github Username: " + mapCheck + " Current Average: " + students.get(mapCheck).getGradeAverage());
            anotherSelectiono(students, input);
        }
    }



    public double getGradeAverage(){
        int sum = 0;
        double average;
        for (int i = 0; i < grades.size(); i++)
            sum += grades.get(i);
        return average = ((double) sum) / grades.size();
    }
}
