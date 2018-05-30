package by.vpshulga.lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task01");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1231);
        list.add(13123);
        list.add(12);
        list.add(12);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(CountUnique.countUnique(list));
        System.out.println("-----------------------------");

        System.out.println("Task02");
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
        map.put("5", "e");
        map.put("6", "f");
        map.put("7", "g");
        map.put("8", "h");//
        System.out.println(UniqueMap.isUnique(map));
        System.out.println("-----------------------------");

        System.out.println("Task03");
        TwoPolinoms.resultPolinom();
        System.out.println("-----------------------------");

        System.out.println("Task04");
        BlackBox.addNumber(1);
        BlackBox.addNumber(2);
        BlackBox.addNumber(2);
        BlackBox.addNumber(6);
        BlackBox.addNumber(8);
        BlackBox.addNumber(11);
        BlackBox.addNumber(11);
        BlackBox.addNumber(12);
        BlackBox.getNMax(4);
        BlackBox.getKMin(4);
        System.out.println("-----------------------------");
    }
}
