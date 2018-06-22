package by.vpshulga.lesson18;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Queue {
    private static final List<CashBox> CASH_BOXES = new CopyOnWriteArrayList<>();
    private static final List<Customer> CUSTOMERS_IN_QUEUE = new CopyOnWriteArrayList<>();


    static List<CashBox> getCashBoxes() {
        return CASH_BOXES;
    }

    static List<Customer> getCustomersInQueue() {
        return CUSTOMERS_IN_QUEUE;
    }

    static void createThreads(int countOfCustomers) {
        CASH_BOXES.add(new CashBox());
        CASH_BOXES.add(new CashBox());
        CASH_BOXES.add(new CashBox());


        for (int i = 0; i < countOfCustomers; i++) {
            new Thread(new Customer()).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (CASH_BOXES.size() <= countOfCustomers) {
            for (CashBox cashBox : CASH_BOXES) {
                new Thread(cashBox).start();
            }
        } else {
            for (int i = 0; i < countOfCustomers; i++) {
                new Thread(CASH_BOXES.get(i)).start();
            }
        }
    }
}
