package by.vpshulga.lesson09;

import java.util.*;

public class PositiveFirstNegativeLast {

    static List<Integer> fillList(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (list.size() < size) {
            list.add(-100 + random.nextInt(200));
        }
        return list;
    }

    static List<Integer> changeNumbers(List<Integer> list) {
        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();
        for (Integer integer : list) {
            if (integer >= 0) {
                posList.add(integer);
            } else {
                negList.add(integer);
            }
        }

        posList.addAll(negList);
        return posList;
    }
}
