package Java2;

/**
 * Created by renecortez on 5/19/17.
 */
public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Rectanlge(2,4) {
            @Override
            public double getPerimeter() {
                return 2 * length + 2 * width;
            }

            @Override
            public double getArea() {
                return length * width;
            }
        };

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
