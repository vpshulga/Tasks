package by.vpshulga.lesson10;

import java.util.*;

class BlackBox {
    private static Set<Integer> blackBox = new TreeSet<>();

    private static boolean isEmpty(Collection<Integer> collection) {
        return collection.size() == 0;
    }

    static void addNumber(int number) {
        blackBox.add(number);
    }

    private static void getIndex(int i, List<Integer> list) {
        if (i >= 1) {
            if (!isEmpty(list)) {
                if (i <= list.size()) {
                    System.out.println(list.get(i - 1));
                } else {
                    System.out.println("Нет столько чисел");
                }
            } else {
                System.out.println("Нет чисел");
            }
        } else {
            System.out.println("Введите число больше либо равное 1");
        }
    }

    static void getKMin(int k) {
        List<Integer> blackList = new ArrayList<>();
        blackList.addAll(blackBox);
        getIndex(k, blackList);
    }

    static void getNMax(int n) {
        List<Integer> blackList = new ArrayList<>();
        blackList.addAll(blackBox);
        Collections.reverse(blackList);
        getIndex(n, blackList);
    }
}
