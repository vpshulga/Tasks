package by.vpshulga.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Customer implements Runnable {
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
        if (shoppingBasket.values().stream().filter(i -> i > 0).collect(Collectors.toList()).size() == 0) {
            isChooseSomething = false;
            System.out.println("Customer " + id + " hadn`t chosen anything and left the shop");
        } else {
            Shop.getCustomers().add(this);
            isChooseSomething = true;
        }
    }

    double pay(double price) {
        Random random = new Random();
        return price + price * random.nextInt(16) / 100;
    }
}
