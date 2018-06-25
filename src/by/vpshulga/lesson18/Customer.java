package by.vpshulga.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Customer implements Runnable {
    private static final Semaphore SEMAPHORE = new Semaphore(3, true);
    private int id;
    private static int counter;
    private Map<Good, Integer> shoppingBasket;
    private boolean isChooseSomething;

    Customer() {
        id = ++counter;
        System.out.println("Customer " + id + " came in the shop");
    }

    int getId() {
        return id;
    }

    boolean isChooseSomething() {
        return isChooseSomething;
    }

    Map<Good, Integer> getShoppingBasket() {
        return shoppingBasket;
    }

    @Override
    public void run() {
        putGoodsInBasket();
        System.out.println("Customer`s " + id + " Basket: " + shoppingBasket);
        goToCashBox();
    }

    private synchronized void putGoodsInBasket() {
        shoppingBasket = new HashMap<>();
        Random random = new Random();
        for (Good good : Shop.getAvailableGoods().keySet()) {
            int countOfGoods = random.nextInt(5);
            if (countOfGoods > Shop.getAvailableGoods().get(good)) {
                countOfGoods = Shop.getAvailableGoods().get(good);
            }
            shoppingBasket.put(good, countOfGoods);
            if (countOfGoods > 0) {
                isChooseSomething = true;
                System.out.println("Customer " + id + " put " + good + " in quantity " + countOfGoods + " pcs.");
            }
            Shop.getAvailableGoods().put(good, Shop.getAvailableGoods().get(good) - countOfGoods);
        }

        if (!isChooseSomething){
            System.out.println("Customer " + id + " didn't choose anything and left the shop");
        }
    }

    private void goToCashBox() {
        int cashBoxNumber = -1;
        if (isChooseSomething) {
            System.out.println("Customer " + id + " stayed in queue");
            try {
                SEMAPHORE.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Queue.CASH_BOXES){
                for (int i = 0; i < Queue.CASH_BOXES.length; i++) {
                    if (Queue.CASH_BOXES[i].isFree){
                        cashBoxNumber = i;
                        Queue.CASH_BOXES[i].isFree = false;
                        System.out.println("Customer " + id + " goes to CashBox number " + (i + 1));
                        break;
                    }
                }
            }
            Queue.CASH_BOXES[cashBoxNumber].serviceCustomer(this);
            Queue.CASH_BOXES[cashBoxNumber].takeReceipt(this);

            synchronized (Queue.CASH_BOXES){
                Queue.CASH_BOXES[cashBoxNumber].isFree = true;
            }
            SEMAPHORE.release();
            System.out.println("Customer " + id + " left the shop.");
        }
    }

    double pay(double price) {
        Random random = new Random();
        return price + price * random.nextInt(16) / 100;
    }
}
