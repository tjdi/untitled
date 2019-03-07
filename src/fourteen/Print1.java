package fourteen;

public class Print1 implements Runnable {
    @Override
    public void run() {
//   1     try {
//            for (int i = 0; i < 5; System.out.printf("%-3s", "A"), i++) ;
//            {
//                Thread.sleep(2000);
//                System.out.printf("%-3s", "A");
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


//     2   for (int i = 0; i < 5; i++) {
//            Thread.yield();
//            System.out.printf("%-3s","A");
//        }

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.printf("%-3s", "Z");
            }
        });
        thread.start();
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("%-3s","A");
        }
    }
}


