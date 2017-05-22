package Java2;

import java.util.ArrayList;

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

    public double getGradeAverage(){
        int sum = 0;
        double average;
        for (int i = 0; i < grades.size(); i++)
            sum += grades.get(i);
        return average = ((double) sum) / grades.size();
    }
}
