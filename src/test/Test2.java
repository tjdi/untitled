package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test2 {

    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(1);
//        list.add(10);
//        list.add(9);
//        list.forEach(System.out::println);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(10);
        list1.add(9);
        list1.forEach(System.out::println);
        list1.remove(0);
        list1.forEach(e -> System.out.printf("%-3d", e));

        System.out.println("\n" + list1.get(0));

        list1.sort(Integer::compareTo);
        Optional<Integer> max =
                list1.stream().max(Integer::compareTo);
        System.out.println(max.get());

    }
}
