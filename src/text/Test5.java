package text;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntToLongFunction;

public class Test5 {
    public static void main(String[] args) {

        IntToLongFunction f = (p)-> p + 1L;

        BinaryOperator<Integer> b = (o1,o2)-> o1+o2;

        BiPredicate<Integer,Double> b1 = (t,u)-> t > u;

    }
}
