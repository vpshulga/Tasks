package by.vpshulga.lesson16;

import java.util.stream.Stream;

class Task05 {
    static void fullNameOfOldestPerson(){
        Person person = Stream.of(
                new Person("Aaaa", "Bbbb", 17),
                new Person("Aaaabbb", "Bbbbbbbbb", 21),
                new Person("Aaaa", "Bbbbbbbbbbbbb", 33),
                new Person("Vvvv", "Xxxx", 28),
                new Person("Cccc", "Dddd", 26),
                new Person("Aaaazzz", "Bbbbxxxxx", 1))
                .filter(p -> (p.getFirstName().length() + p.getLastName().length()) <= 15)
                .sorted((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()))
                .findFirst().orElse(new Person("Default name", "Default lastName", 0));
        System.out.println(person.getFirstName() + " " + person.getLastName());



    }

}
