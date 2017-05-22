package Java2;



/**
 * Created by renecortez on 5/22/17.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stuName = new Student("Paul");
        System.out.println(stuName.getName());

        stuName.addGrade(90);
        stuName.addGrade(85);
        stuName.addGrade(84);
        stuName.addGrade(97);
        stuName.addGrade(70);

        System.out.println(stuName.getGradeAverage());


    }
}
