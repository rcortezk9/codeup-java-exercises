package Java2;


/**
 * Created by renecortez on 5/17/17.
 */
public class InputTest {

    public static void main(String[] args) {
        Input sc = new Input();

        System.out.println("Enter a string.");
        System.out.println(sc.getString());

        System.out.println("Do you want to turn on? (y/n)");
        System.out.println(sc.yesNo());

        System.out.println("Enter a number between 1 and 10");
        System.out.println("The number was in the range: " + sc.getInt(1, 10));//putting in the max and min

        System.out.println("Pick a number any number.");
        System.out.println(sc.getInt());

        System.out.println("Enter a number between 1 and 10");
        System.out.println("The number was in the range: " + sc.getDouble(1, 10));

        System.out.println("Pick a number any number.");
        System.out.println(sc.getDouble());



    }
}
