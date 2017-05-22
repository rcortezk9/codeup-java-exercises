package Java2;


public class ShapeTest {
    public static void main(String[] args) {
        Rectanlge box1 = new Rectanlge(5,4);
        Square box2 = new Square(5,5);

        System.out.println("Area of the Rectangle is: " + box1.getArea());
        System.out.println("Perimeter of the Rectangle is: " + box1.getPerimeter());

        System.out.println("Area of the Rectangle is: " + box2.getArea());
        System.out.println("Perimeter of the Rectangle is: " + box2.getPerimeter());
    }
}
