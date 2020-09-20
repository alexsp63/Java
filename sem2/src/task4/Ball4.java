package task4;

public class Ball4 extends SolidOfRevolution4 {

    public Ball4(double radius){
        super(4.0/3.0*Math.PI*Math.pow(radius, 3), radius);
    }
}