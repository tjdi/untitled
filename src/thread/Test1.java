package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Sum0 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return 0;
    }
}

public class Test1 {
    public static void main(String[] args) throws InterruptedException{
        FutureTask<Integer> task = new FutureTask<>(new Sum0());
        new Thread(task).start();

        try {
            System.out.println(task.isDone());
            System.out.println(task.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
