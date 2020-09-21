package task4;

public abstract class SolidOfRevolution4 extends Shape4 {

    private double radius;

    public SolidOfRevolution4(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
