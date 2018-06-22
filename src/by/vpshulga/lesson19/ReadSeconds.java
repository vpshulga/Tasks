package by.vpshulga.lesson19;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ReadSeconds {
    static void readSeconds(){
        ExecutorService service = Executors.newSingleThreadExecutor();
        try (Scanner sc = new Scanner(System.in)) {
            int nextCountOfSeconds;
            do {
                nextCountOfSeconds = sc.nextInt();
                if (nextCountOfSeconds < 0){
                    nextCountOfSeconds = -1;
                }
                final int sec = nextCountOfSeconds;

                service.submit(() -> {
                    try {
                        Thread.sleep(1000 * sec);
                        System.out.println("I slept " + sec + " seconds(" + Thread.currentThread().getName() +")");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            } while (nextCountOfSeconds != -1);
        }
        service.shutdown();
    }
}
