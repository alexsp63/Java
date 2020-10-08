package task3;

import java.util.*;

public class Main {

    public static <K,V> Map<V, Collection<K>> revertMap(Map<? extends K, ? extends V> map){
        Map <V, Collection<K>> resultMap = new HashMap<>();
        Set<K> keys = (Set<K>) map.keySet();
        for (K key: keys){
            V value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if (ks == null){
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }
        return resultMap;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(1, "Л");
        passportsAndNames.put(2, "И");
        passportsAndNames.put(3, "Л");
        System.out.println(passportsAndNames);
        System.out.println(Main.revertMap(passportsAndNames));
    }
}
