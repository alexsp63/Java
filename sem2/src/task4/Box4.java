package task4;

public class Box4 extends Shape4 {

    public Box4(double volume){
        super(volume);
    }

    public boolean add(Shape4 shape){
        if (this.getVolume() - shape.getVolume() >= 0){
            this.setVolume(this.getVolume() - shape.getVolume());
            System.out.println("true");
            System.out.println("Осталось " + this.getVolume());
            return true;
        }
        else{
            System.out.println("Объём добавляемой фигуры " + shape.getVolume() + "!");
            System.out.println("false");
            return false;
        }
    }
}
