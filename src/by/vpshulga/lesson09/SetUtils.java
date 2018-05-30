package by.vpshulga.lesson09;

import java.util.*;

class SetUtils {
    static Set<Integer> fillSet(int size) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size() < size) {
            set.add(random.nextInt(10));
        }
        return set;
    }

    static Set<Integer> mergeSets(Set<Integer> firstSet, Set<Integer> secondSet) {
        firstSet.addAll(secondSet);
        return firstSet;
    }

    static Set<Integer> intersectionSet(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> intersection = new HashSet<>();
        if (firstSet.size() >= secondSet.size()) {
            firstSet.retainAll(secondSet);
            return firstSet;
        } else {
            secondSet.retainAll(firstSet);
            return secondSet;
        }
    }
}
