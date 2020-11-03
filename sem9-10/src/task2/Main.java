package task2;

import java.util.Arrays;

public class Main {

    //перебор
    public static boolean enumeration(String[] myArray, String search){
        for (String myString: myArray){
            if (myString == search)
                return true;
        }
        return false;
    }

    public static boolean enumeration(double[] myArray, double search){
        for (double myDouble: myArray){
            if (myDouble == search)
                return true;
        }
        return false;
    }

    public static boolean enumeration(int[] myArray, int search){
        for (double myDouble: myArray){
            if (myDouble == search)
                return true;
        }
        return false;
    }

    public static boolean binarySearch(String[] myArray, String search, int start, int end){
        if 
    }

    public static void main(String[] args) {
        String[] arrayS = {"a", "b", "c"};
        System.out.println(enumeration(arrayS, "d"));

        double[] arrayD = {1.5, 2.5, 3.2};
        System.out.println(enumeration(arrayD, 1.5));

        int[] arrayI = {1, 5, 100};
        System.out.println(enumeration(arrayI, 7));

        Arrays.sort(arrayS);
    }

}
