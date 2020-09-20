package task3;

public class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double radius, double height) {
        super(height*Math.PI*Math.pow(radius, 2), radius);
        this.height = height;
    }
}
