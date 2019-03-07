package thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class XXXX {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

        Runnable r = () -> concurrentHashMap.merge("Tom",1, Integer::sum);

        executorService.schedule(r,3, TimeUnit.SECONDS);
        executorService.shutdown();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(concurrentHashMap.get("Tom"));
    }
}
