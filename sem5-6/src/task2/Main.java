package task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Объект №1");
        StringBuilderWithAlerts myString = new StringBuilderWithAlerts("Hello");
        Listener listener1 = new Listener("listener1");
        myString.setListener(listener1);
        myString.print();
        myString.append(", ");
        myString.append("World!");
        myString.isChangeHappened();
        System.out.println();
        System.out.println("Объект №2");
        StringBuilderWithAlerts myString1 = new StringBuilderWithAlerts("Hi!");
        Listener listener2 = new Listener("listener2");
        myString1.setListener(listener2);
        myString1.print();
        myString1.isChangeHappened();
        System.out.println();
        System.out.println("Объект №3");
        StringBuilderWithAlerts myString2 = new StringBuilderWithAlerts("Hi!");
        Listener listener3 = new Listener("listener3");
        myString2.setListener(listener3);
        myString2.print();
        myString2.replace(0, 1, "No");
        myString2.isChangeHappened();
    }
}
