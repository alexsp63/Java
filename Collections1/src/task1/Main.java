package task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {

    //Это метод
    public static <T> Collection<T> removeDuplicates(Collection<T> coll){
        return new HashSet<>(coll);
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList1 = new ArrayList<>();
        for (int i=0; i<10; i++){
            intList1.add(i);
        }
        for (int i=10; i>5; i--){
            intList1.add(i);
        }
        System.out.println(intList1);
        Collection<Integer> coll = Main.removeDuplicates(intList1);
        System.out.println(coll);
    }
}

