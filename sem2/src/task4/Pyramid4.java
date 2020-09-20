package task4;

public class Pyramid4 extends Shape4 {

    private double s;
    private double h;

    public Pyramid4(double s, double h){
        super(1.0/3.0*s*h);
        this.s = s;
        this.h = h;
    }
}
