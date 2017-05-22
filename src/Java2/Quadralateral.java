package Java2;

/**
 * Created by renecortez on 5/19/17.
 */
abstract class Quadralateral extends Shape implements Measurable{

    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    abstract void setLength(double length);

    abstract void setWidth(double width);

    public Quadralateral(double length, double width) {
        this.length = length;
        this.width = width;



    }
}
