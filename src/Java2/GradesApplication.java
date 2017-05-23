package Java2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Java2.Student.anotherSelection;
import static Java2.Student.getStudentInfo;

/**
 * Created by renecortez on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Student> students = new HashMap<>();

        students.put("zgulde", new Student("Zach"));
        students.get("zgulde").addGrade(90);
        students.get("zgulde").addGrade(91);
        students.get("zgulde").addGrade(92);

        students.put("ryanorsinger", new Student("Ryan"));
        students.get("ryanorsinger").addGrade(90);
        students.get("ryanorsinger").addGrade(89);
        students.get("ryanorsinger").addGrade(88);

        students.put("jreich5", new Student("Jeremy"));
        students.get("jreich5").addGrade(93);
        students.get("jreich5").addGrade(92);
        students.get("jreich5").addGrade(91);

        students.put("MontealegreLuis", new Student("Luis"));
        students.get("MontealegreLuis").addGrade(94);
        students.get("MontealegreLuis").addGrade(95);
        students.get("MontealegreLuis").addGrade(96);

        System.out.println("Welcome!\nHere are the github usernames of our students:");

        students.forEach((key, value)->{
            System.out.print("| " + key +" | ");//value.getGradeAverage() to get perspective avg.
        });

        getStudentInfo(students, input);

        anotherSelection(students, input);

    }
}
