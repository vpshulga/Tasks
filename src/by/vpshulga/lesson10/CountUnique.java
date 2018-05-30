package by.vpshulga.lesson10;

import java.util.*;

class CountUnique {
    static int countUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        if (list.size() == 0) {
            return 0;
        } else {
            set.addAll(list);
            return set.size();
        }
    }
}
