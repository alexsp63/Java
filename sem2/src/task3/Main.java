package task3;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(100);
        Cylinder cylinder1 = new Cylinder(1, 5);
        box.add(cylinder1);
        Ball ball1 = new Ball(2);
        box.add(ball1);
        Pyramid pyramid1 = new Pyramid(17, 5);
        box.add(pyramid1);
        Ball ball2 = new Ball(1);
        box.add(ball2);
        Pyramid pyramid2 = new Pyramid(40, 5);
        box.add(pyramid2);
    }
}
