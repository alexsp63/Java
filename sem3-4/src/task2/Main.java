package task2;

import java.util.*;

public class Main {

    public static void buildDictionary(String text){
        text = text.toLowerCase();
        int[] result = new int ['я' - 'а' + 1];
        for (int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я'){
                result[ch - 'а']++;
            }
        }
        for (int i=0; i<result.length; i++){
            System.out.println((char) (i+'а') + " = " + result[i]);
        }
    }

    public static void buildDictionaryWithMap(String text){
        text = text.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<text.length(); i++){
            //получаем индексы каждого символа и получаем сам символ
            char ch = text.charAt(i);
            if ((ch >= 'а' && ch <= 'я') || ch == 'ё'){
                map.compute(ch, ((character, integer) -> integer == null ? 1 : integer + 1));
            }
        }
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for (Map.Entry<Character, Integer> enter: entries){
            System.out.println(enter.getKey() + " = " + enter.getValue());
        }
    }


    public static void main(String[] args) {
        //Main.buildDictionary("мапраморипоритьшгрпавсмить");
        Main.buildDictionaryWithMap("ффаариамуршквмшваомрволамтрвщрткмгор");
    }
}
