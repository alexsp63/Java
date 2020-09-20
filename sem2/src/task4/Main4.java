package task4;

public class Main4 {
    public static void main(String[] args) {
        Box4 box = new Box4(100);
        Cylinder4 cylinder1 = new Cylinder4(1, 5);
        box.add(cylinder1);
        Ball4 ball1 = new Ball4(2);
        box.add(ball1);
        Pyramid4 pyramid1 = new Pyramid4(17, 5);
        box.add(pyramid1);
        Ball4 ball2 = new Ball4(1);
        box.add(ball2);
        Pyramid4 pyramid2 = new Pyramid4(40, 5);
        box.add(pyramid2);
    }
}
