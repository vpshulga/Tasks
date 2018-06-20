package by.vpshulga.lesson18;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Semaphore;

public class CashBox implements Runnable {
    private int id;
    private static int counter;
    private double resultSum;
    private double totalSum;
    private Customer customer;
    private List<Item> items;
    private boolean isFree;
    private static final Semaphore SEMAPHORE = new Semaphore(3, true);

    CashBox() {
        id = ++counter;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        while (Shop.getCustomers().size() > 0) {
            try {
                SEMAPHORE.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setCustomer(Shop.getCustomers().remove(0));
            serviceCustomer();
            takeReceipt();
            System.out.println("Customer " + customer.getId() + " left the shop");
            if (isFree) {
                SEMAPHORE.release();
            }
        }
    }

    private synchronized void serviceCustomer() {
        isFree = false;
        items = new ArrayList<>();
        if (customer.isChooseSomething() && customer != null) {
            System.out.println("CashBox " + id + " services customer " + customer.getId());
            for (Good good : customer.getShoppingBasket().keySet()) {
                if (customer.getShoppingBasket().get(good) > 0) {
                    System.out.println("CashBox " + id + " Handle " + good + "(" + customer.getShoppingBasket().get(good)
                            + "pcs.) of Customer " + customer.getId() + "---->" + Thread.currentThread().getName());
                    totalSum += good.getPrice() * customer.getShoppingBasket().get(good);
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

    private synchronized void takeReceipt() {
        double paidSum = customer.pay(resultSum);
        Receipt receipt = new Receipt(new Date(), customer, items, totalSum, resultSum, paidSum ,paidSum - resultSum);
        System.out.println("Receipt for customer " + customer.getId());
        System.out.println(receipt);
        Item.setId(0);
        isFree = true;
    }
}
