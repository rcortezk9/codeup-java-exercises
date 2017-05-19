package Java2;

public class Rectanlge {
    private double length;
    private double width;

    public Rectanlge(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

}

class Square extends Rectanlge{
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea(){
        return side * side;
    }
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
}
