package Java2;

public class Rectanlge {
    private double length;
    private double width;

    public Rectanlge(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return 2 * length + 2 * width;
    }

    public double getPerimeter(){
        return length * width;
    }

}
class Square extends Rectanlge{

    public Square(double side) {
        super(side, side);
    }
}
