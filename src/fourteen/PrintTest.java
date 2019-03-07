package fourteen;

import org.junit.Test;

public class PrintTest {
    @Test
    public void print() {
        new Thread(() -> {
            for (int i =0; i < 10; i++)
                System.out.printf("%-3d",0);
        }).start();

        new Thread(() -> {
            for (int i =0; i < 10; i++)
                System.out.printf("%-3d",1);
        }).start();
    }
}
