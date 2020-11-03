package task2;

public class Enumeration {

    public static boolean enumeration(String[] myArray, String search){
        for (String myString: myArray){
            if (myString == search)
                return true;
        }
        return false;
    }

}
