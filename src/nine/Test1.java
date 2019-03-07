package nine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Integer[] arr = {1,3,2,4,6,7,8};

        List<Integer> list = Arrays.asList(arr);

        list.forEach(e -> System.out.printf("%-3d", e));

        System.out.println();

        List<Integer> list1 = new ArrayList<>(list);
        list1.add(9);
        list1.forEach(e -> System.out.printf("%-3d", e));

        Object[] arr1 = list1.toArray();
        Arrays.stream(arr1).forEach(e -> System.out.printf("%-3d", e));

        Integer[] arr2 = list1.toArray(new Integer[0]);
        Arrays.stream(arr2).forEach(e -> System.out.printf("%-3d", e));

        list1.subList(1,3).forEach(e -> System.out.printf("%-3d", e));

        List<Integer> list2 = Collections.unmodifiableList(list1);
    }
}
