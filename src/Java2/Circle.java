package Java2;

/**
 * Created by renecortez on 5/17/17.
 */
public class Circle {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}
