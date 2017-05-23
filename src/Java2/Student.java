package Java2;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by renecortez on 5/22/17.
 */
public class Student {
    private String name;
    private ArrayList<Integer> grades;

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
        System.out.println("\nWhat student would you like to see more information on?\n");
        String mapCheck = input.nextLine();

        if (!students.containsKey(mapCheck)){//if user selection is not in the array list
            System.out.println("Sorry, no student found with the gihub username of \"" + mapCheck + "\".");
            anotherSelection(students, input);
        } else {//if selected correct username the display the student info
            System.out.println("\nName: " + students.get(mapCheck).getName() + " - Github Username: " + mapCheck + " Current Average: " + students.get(mapCheck).getGradeAverage());
        }
        anotherSelection(students, input);
    }

    public static void anotherSelection(Map<String, Student>students, Scanner input){// could a recursion call take the place of a while loop
        System.out.println("Would you like to see another student?");
        String response = input.nextLine();
        if(response.equalsIgnoreCase("y")){
            getStudentInfo(students, input);
        } else if (response.equalsIgnoreCase("n")){
            System.out.println("Goodbye, and have a wonderful day!");
            System.exit(0);
        } else {//needed this incase user wanted to put in something other than what was except able.
            System.out.println("Incorrect selections, please make the proper selection (y/n)");
            anotherSelection(students, input);
        }

    }

    public double getGradeAverage(){
        int sum = 0;

        for (Integer grade : grades){//for loop thru array, assign it to grades
            sum += grade;//add up the grades assign it to sum
        }
        return (double) sum / grades.size();//get the avg
    }
}
