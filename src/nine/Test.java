package nine;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("tom",10);      map.put("ben", 9);
        map.put("Jerry", 3);      map.put("Tom", 5);
        System.out.println(map.get("Tom"));
        System.out.println(map.get("Jerry"));

        java.util.Set<String> keys = map.keySet();

        Set<String> keys1 = new HashSet<>(keys);

        keys1.add("sss");

        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(1);list.add(1);
        Set<String> keys2 = new HashSet(list);
        keys2.forEach(System.out::println);

        for (String key : map.keySet()) {
            System.out.printf("%-5s: %-3d", key, map.get(key));
        }

        System.out.println();

        map.forEach((a, b) -> System.out.printf("%-5s: %-3d", a, b));
    }
}
