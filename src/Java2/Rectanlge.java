package Java2;

public class Rectanlge extends Quadralateral implements Measurable{

    public Rectanlge(double length, double width){
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }
}

class Square extends Quadralateral implements Measurable{

    public Square(double length, double width){
        super(length, width);
    }

    @Override
    public double getLength() {

        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    void setWidth(double width) {
        this.width = width;
        length = width;
    }

    @Override
    void setLength(double length) {
        this.length = length;
        width = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
