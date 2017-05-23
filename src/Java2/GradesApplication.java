package Java2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by renecortez on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wantsToContinue;
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

       students.forEach((key, value)->{
           System.out.println(key + value.getGradeAverage());
       });


    }
}
