package by.vpshulga.lesson10;

import java.util.*;

class UniqueMap {
    static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<>();
        set.addAll(map.values());
        return set.size() == map.values().size();
    }
}
