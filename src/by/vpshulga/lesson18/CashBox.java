package by.vpshulga.lesson18;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Semaphore;

public class CashBox implements Runnable {
    private int id;
    private static int counter;
    private double resultSum;
    private Customer customer;
    private List<Item> items;
    private static List<Customer> customers;
    private boolean isFree;
    private static final Semaphore SEMAPHORE = new Semaphore(3, true);


    CashBox() {
        id = ++counter;
    }

    static List<Customer> getCustomers() {
        return customers;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        while (customers.size() > 0) {
            try {
                SEMAPHORE.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setCustomer(customers.remove(0));
            serviceCustomer();
            getRecepeit();
            System.out.println("Customer " + customer.getId() + " left the shop");
            if (isFree) {
                SEMAPHORE.release();
            }
        }
    }

    private synchronized void serviceCustomer() {

        isFree = false;
        items = new ArrayList<>();

        if (customer.isChooseSomething()) {
            System.out.println("CashBox " + id + " services customer " + customer.getId());
            for (Good good : customer.getShoppingBasket().keySet()) {
                if (customer.getShoppingBasket().get(good) > 0) {
                    System.out.println("CashBox " + id + " Handle " + good + "(" + customer.getShoppingBasket().get(good)
                            + "pcs.) of Customer " + customer.getId());
                    resultSum += good.getPrice() * customer.getShoppingBasket().get(good)
                            - good.getPrice() * customer.getShoppingBasket().get(good) * good.getDiscount();

                    items.add(new Item(good, customer.getShoppingBasket().get(good), good.getPrice(), good.getDiscount()));
                }
                int timeToHandleGoods = 500 * customer.getShoppingBasket().get(good);
                if (timeToHandleGoods > 0) {
                    try {
                        Thread.sleep(timeToHandleGoods);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private synchronized void getRecepeit() {
        Receipt receipt = new Receipt(customer.getId(), new Date(), items, resultSum, customer.pay(resultSum) - resultSum);
        System.out.println("Receipt for customer " + customer.getId());
        System.out.println(receipt);
        isFree = true;
    }

    static synchronized void setCustomers(int countOfCustomers) {
        Shop shop = new Shop(countOfCustomers, 3);
        customers = new ArrayList<>();
        for (int i = 0; i < shop.getCountOfCustomers(); i++) {
            customers.add(new Customer(shop));
        }
    }

    public boolean isFree() {
        return isFree;
    }
}
