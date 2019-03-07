package fourteen;

import org.junit.Test;

public class Print_Test {
    @Test
    public void print() {
        new Print1().run();
        new Print2().run();
        new PrintNum().run();

        new Thread(new Print1()).start();
        new Thread(new Print2()).start();
        new Thread(new PrintNum()).start();
    }
}
