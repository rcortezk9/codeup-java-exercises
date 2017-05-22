package Java2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by renecortez on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Bob", 90);
        students.put("Bob", 80);
        students.put("Bob", 97);
        students.put("Bob", 91);

        students.put("Tim", 99);
        students.put("Tim", 89);
        students.put("Tim", 95);
        students.put("Tim", 83);

        students.put("Paul", 88);
        students.put("Paul", 88);
        students.put("Paul", 88);
        students.put("Paul", 88);

        students.put("Chris", 90);
        students.put("Chris", 90);
        students.put("Chris", 90);
        students.put("Chris", 90);
    }
}
