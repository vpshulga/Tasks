package by.vpshulga.lesson10;

import java.util.*;

class TwoPolinoms {

    private static Map<Integer, Integer> fillMap() {
        Map<Integer, Integer> map = new TreeMap<>();
        Random random = new Random();
        int i = 0;
        while (i < 10) {
            map.put(i, random.nextInt(10));
            i++;
        }
        return map;
    }

    static void resultPolinom() {
        Map<Integer, Integer> firstPolinom = fillMap();
        Map<Integer, Integer> secondPolinom = fillMap();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = firstPolinom.keySet().size() - 1; i >= 0; i--) {
            if (firstPolinom.get(i) != 0 || secondPolinom.get(i) != 0) {
                if (i == 0) {
                    stringBuilder.append(firstPolinom.get(i) + secondPolinom.get(i));
                } else if (i == 1) {
                    stringBuilder.append(firstPolinom.get(i) + secondPolinom.get(i)).append("x").append(" + ");
                } else {
                    if ((firstPolinom.get(i) + secondPolinom.get(i)) > 1) {
                        stringBuilder.append(firstPolinom.get(i) + secondPolinom.get(i)).append("x^").append(i).append(" + ");
                    } else {
                        stringBuilder.append("x^").append(i).append(" + ");
                    }
                }
            }
        }
        System.out.println(stringBuilder);
    }

}
