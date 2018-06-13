package by.vpshulga.lesson16;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task01 {

    static void middleOfOdDivByFive(){
        Double res = Stream.of(10, 15, 20, 25, 5, 155, 12, 13, 50, 55, 125)
                .filter(i -> i % 2 != 0)
                .filter(i -> i % 5 == 0)
                .collect(Collectors.averagingInt(i -> i));
        System.out.println(res);
    }
}
