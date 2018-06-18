package by.vpshulga.lesson18;

class Queue {
    static void createThreads(int countOfCustomers) {

        CashBox.setCustomers(countOfCustomers);

        for (Customer customer : CashBox.getCustomers()) {
            new Thread(customer).start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread(new CashBox()).start();
        }
    }
}
