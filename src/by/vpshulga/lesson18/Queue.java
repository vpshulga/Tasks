package by.vpshulga.lesson18;

class Queue {
    static void createThreads(int countOfCustomers) {
        Shop.setCustomers();

        for (int i = 0; i < countOfCustomers; i++) {
            new Thread(new Customer()).start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread(new CashBox()).start();
        }
    }
}
