package Filter;

import java.util.Arrays;
import java.util.function.Function;

public class Main {


    public static Object[] filter(Object[] array, Filter filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - offset);
    }

    public static <T> T[] filter2(T[] array, Function<? super T, Boolean>, filter) {
        int offset = 0;

        for(int i = 0; i< array.length; i++){
            if(!filter.apply(array[i])){
                offset++;
            } else{
                array[i - offset] = array[i];
            }
        }

        return Arrays.copyOf(array, array.length - offset);
    }

    public static void main(String[] args) {
        String array[] = {"hfhv", "dsrv", null, "1"};

        String[] newArray =  (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });
        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
        System.out.println();
        String newArray2[] = filter2(array, s -> s != null && s.lenght() > 5);
        for (int i = 0; i < newArray2.length; i++){
            System.out.println(newArray[i]);
        }
    }
}

