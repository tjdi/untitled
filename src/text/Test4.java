package text;

import java.util.Arrays;
import java.util.Comparator;

//class IntCompare implements Comparable<Integer>{
//    @Override
//    public int compareTo(Integer o) {
//        if (o1 > o2) return 1;
//        else if (o1 == o2) return 0;
//        else return -1;
//    }
//}

public class Test4 {

    void f(final int i, double d) {
        d = d + 1;
        double j = 1.0;
        Comparator c = (x, y) -> {
            System.out.println(j);
            return 0;
        };

    }

    public static void main(String[] args) {

        Integer[] nums = {1,4,7,2,3,6,8};
        Arrays.sort(nums, Integer::compare);
        System.out.println(Arrays.toString(nums));

        }
    }

