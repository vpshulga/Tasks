package by.vpshulga.lesson18;

class Queue {
    static final CashBox[] CASH_BOXES = new CashBox[3];

    static void createThreads(int countOfCustomers) {
        for (int i = 0; i < CASH_BOXES.length; i++) {
            CASH_BOXES[i] = new CashBox();
        }

        for (int i = 0; i < countOfCustomers; i++) {
            new Thread(new Customer()).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
