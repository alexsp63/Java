package task1;

public class Main {
    public static void main(String[] args) {
        StringBuilderWithUndo myString = new StringBuilderWithUndo("123456");
        myString.print();
        myString.append("098");
        myString.print();
        myString.reverse();
        myString.print();
        myString.delete(1,3);
        myString.print();
        myString.replace(1, 2, "asы");
        myString.print();
        myString.append("hello");
        myString.print();
        //для проверки отменю 7 последних действий
        for (int i=0; i<7; i++){
            myString.undo();
            myString.print();
        }
    }
}
