import org.junit.Test;
import test.User;

import static org.junit.Assert.*;

public class Test2Test {
    @Test
    public void test1() {
        User tom = new User(1,"Tom");
        System.out.println(tom);
    }

    @Test
    public void test2() {
        User jerry = new User(2,"jerry");
        System.out.println(jerry);
    }
}