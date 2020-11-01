package task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static ArrayList<Integer> toAddA(ArrayList<Integer> myList, long start){
        for (int i=0; i<1000000; i++){
            myList.add(0 + (int) (Math.random()*10));
        }
        long end = System.currentTimeMillis();
        long addArrayList = end - start;
        System.out.println("*** time ArrayList: " + addArrayList + " ms ***");
        return myList;
    }

    public static LinkedList<Integer> toAddL(LinkedList<Integer> myList, long start){
        for (int i=0; i<1000000; i++){
            myList.add(0 + (int) (Math.random()*10));
        }
        long end = System.currentTimeMillis();
        long addLinkedList = end - start;
        System.out.println("*** time LinkedList: " + addLinkedList + " ms ***");
        return  myList;
    }

    public static void randomChoiceA(ArrayList<Integer> list, long start){
        for (int i = 0; i < 100000; i++){
            list.get(0 + (int) (Math.random()*(list.size()-1)));
        }
        long end = System.currentTimeMillis();
        long chooseArrayList = end - start;
        System.out.println("*** time ArrayList: " + chooseArrayList + " ms ***");
    }

    public static void randomChoiceL(LinkedList<Integer> list, long start){
        for (int i = 0; i < 100000; i++){
            list.get(0 + (int) (Math.random()*(list.size()-1)));
        }
        long end = System.currentTimeMillis();
        long chooseLinkedList = end - start;
        System.out.println("*** time LinkedList: " + chooseLinkedList + " ms ***");
    }

    public static void main(String[] args) {

        long startL = System.currentTimeMillis();
        LinkedList<Integer> listL = new LinkedList<>();
        listL = Main.toAddL(listL, startL);

        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        list = Main.toAddA(list, start);
        System.out.println();

        //бытрее ArrayList (121ms) против 340 ms у LinkedList

        long startAC = System.currentTimeMillis();
        Main.randomChoiceA(list, startAC);

        long startLC = System.currentTimeMillis();
        Main.randomChoiceL(listL, startLC);

        //снова быстрее ArrayList (30 ms), у LinkedList - 67792 ms
    }
}
