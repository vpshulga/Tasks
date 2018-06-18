package by.vpshulga.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Customer implements Runnable {
    private int id;
    private static int counter;
    private Map<Good, Integer> shoppingBasket;
    private Shop shop;
    private boolean isChooseSomething;


    Customer(Shop shop) {
        id = ++counter;
        this.shop = shop;
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
        for (Good good : shop.getAvailableGoods().keySet()) {
            int countOfGoods = random.nextInt(5);
            if (countOfGoods > shop.getAvailableGoods().get(good)) {
                countOfGoods = shop.getAvailableGoods().get(good);
            }
            shoppingBasket.put(good, countOfGoods);
            if (countOfGoods > 0) {
                isChooseSomething = true;
                System.out.println("Customer " + id + " put " + good + " in quantity " + countOfGoods + " pcs.");
            }
            shop.getAvailableGoods().put(good, shop.getAvailableGoods().get(good) - countOfGoods);
        }
        if (shoppingBasket.values().stream().filter(i -> i > 0).collect(Collectors.toList()).size() == 0) {
            isChooseSomething = false;
            System.out.println("Customer " + id + " hadn`t chosen anything and left the shop");
        } else {
            isChooseSomething = true;
        }
    }

    double pay(double price) {
        Random random = new Random();
        return price + price * random.nextInt(11) / 100;
    }
}
