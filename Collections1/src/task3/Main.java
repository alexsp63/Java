package task3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void buildDictionaryWithMap(String text){
        text = text.toLowerCase();
        String[] words;
        words = text.split(" ");
        HashMap<String, Integer> map;
        map = new HashMap<>();
        for (int i = 0; i<words.length; i++){
            //получаем каждое слово
            String word = words[i];
            map.put(word, (map.get(word) == null) ? 1 : map.get(word) + 1);
            }
        System.out.println(map);
    }


    public static void main(String[] args) {
        //Main.buildDictionary("мапраморипоритьшгрпавсмить");
        Main.buildDictionaryWithMap("лол кек чебурек лол");
    }
}
