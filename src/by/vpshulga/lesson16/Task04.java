package by.vpshulga.lesson16;

import java.util.stream.Stream;

class Task04 {
    static void concatNumbers() {
        Stream.of(5, 2, 4, 2, 1, 10, 11, 123)
                .forEach(System.out::print);
        System.out.println();
    }
}
