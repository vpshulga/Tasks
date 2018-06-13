package by.vpshulga.lesson16;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Task02 {
    static void countOfStringsMoreThanEightSymbols() {
        List<String> list = Stream.of("abcdefghjk", "0123456789", "12345", "01234567", "987654321", "0123456789")
                .collect(Collectors.toList());
        Set<String> set = list.stream().filter(s -> s.length() > 8)
                .collect(Collectors.toSet());

        System.out.println(set.size());
    }

}
