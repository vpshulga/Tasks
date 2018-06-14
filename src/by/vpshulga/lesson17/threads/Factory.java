package by.vpshulga.lesson17.threads;

import by.vpshulga.lesson17.Dump;

public class Factory implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Dump.addPartsToDumpEveryNight();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
