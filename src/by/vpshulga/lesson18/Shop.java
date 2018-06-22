package by.vpshulga.lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Shop {
    private static Map<Good, Integer> availableGoods;

    static {
        fillMap();
    }





    static Map<Good, Integer> getAvailableGoods() {
        return availableGoods;
    }

    private static void fillMap() {
        availableGoods = new HashMap<>();
        Set<Good> goods = Stream.of(new Good("Beer", 2, 0),
                new Good("Vodka", 8, 0),
                new Good("Chips", 2, 0.1),
                new Good("Bread", 1, 0),
                new Good("Milk", 0.99, 0),
                new Good("Fish", 5.99, 0.3),
                new Good("Kefir", 1, 0),
                new Good("Loaf", 0.81, 0),
                new Good("Buckwheat", 3.55, 0.2),
                new Good("Sausages", 8.99, 0.25),
                new Good("Yogurt", 2, 0),
                new Good("Bun", 1.5, 0)).collect(Collectors.toSet());
        Random random = new Random();
        for (Good good : goods) {
            availableGoods.put(good, random.nextInt(50));
        }
    }
}
