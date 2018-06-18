package by.vpshulga.lesson17.threads;

import by.vpshulga.lesson17.scientists.Scientist;

public class Servant implements Runnable {
    private Scientist scientist;

    public Servant(Scientist scientist) {
        this.scientist = scientist;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            scientist.addPartsToMap();
            scientist.checkToCompleteRobot();
            System.out.println(scientist.getName() + " " + scientist.getPartsMap()
                    + "------>" + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; i++) {
            scientist.checkToCompleteRobot();
        }
    }
}
