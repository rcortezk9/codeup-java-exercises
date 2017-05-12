/**
 * Created by renecortez on 5/11/17.
 */
public class methodExercise {

    public static double add(double x, double y) {

        return x + y;
    }

    public static double subtract(double x, double y){
        return x - y;
    }

    public static double multiply(double x, double y){
        return x * y;
    }

    public static double divide(double x, double y){
        return x/y;
    }

    public static double modulus(double x, double y){
        return x % y;
    }

    public static void main(String[] args) {
        System.out.println(add(4,5));
        System.out.println(subtract(5,4));
        System.out.println(multiply(4,5));
        System.out.println(divide(9,0));
        System.out.println(modulus(4, 5));

    }


}
