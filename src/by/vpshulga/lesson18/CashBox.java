package by.vpshulga.lesson18;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CashBox{
    private int id;
    private static int counter;
    private double resultSum;
    private double totalSum;
    private List<Item> items;
    boolean isFree = true;

    CashBox() {
        id = ++counter;
    }


    synchronized void serviceCustomer(Customer customer) {
        items = new ArrayList<>();
        if (customer.isChooseSomething()) {
            System.out.println("CashBox " + id + " services customer " + customer.getId());

            for (Good good : customer.getShoppingBasket().keySet()) {
                if (customer.getShoppingBasket().get(good) > 0) {
                    System.out.println("CashBox " + id + " Handle " + good + "(" + customer.getShoppingBasket().get(good)
                            + "pcs.) of Customer " + customer.getId());

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

    synchronized void takeReceipt(Customer customer) {
        double paidSum = customer.pay(resultSum);
        Receipt receipt = new Receipt(new Date(), customer, items, totalSum, resultSum, paidSum, paidSum - resultSum);
        System.out.println(receipt);
        Item.setId(0);
    }
}
