package Java2;

/**
 * Created by renecortez on 5/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        Input sc = new Input();

        System.out.println("Give me the radius");
        double radius = sc.getDouble();

        Circle c = new Circle(radius);

        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
