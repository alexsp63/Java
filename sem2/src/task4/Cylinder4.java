package task4;

public class Cylinder4 extends SolidOfRevolution4 {

    private double height;

    public Cylinder4(double radius, double height) {
        super(height*Math.PI*Math.pow(radius, 2), radius);
        this.height = height;
    }
}

