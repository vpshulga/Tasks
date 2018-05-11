package by.vpshulga.lesson03.mainHW;

/**
 * 10. Написать алгоритм расчета факториала , используя циклы (for и while).
 */
public class Factorial10 {
    static void factorialFor(int number) {
        System.out.println("Задача 10:");
        String fact = "Факториал = ";
        if (number == 0) {
            System.out.println(fact + 1);
        } else if (number < 0) {
            System.out.println("Введено отрицательное число");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(fact + factorial);
        }
    }

    static void factorialWhile(int number) {
        String fact = "Факториал = ";
        if (number == 0) {
            System.out.println(fact + 1);
        } else if (number < 0) {
            System.out.println("Введено отрицательное число");
        } else {
            long factorial = 1;
            int counter = 1;
            while (counter <= number) {
                factorial *= counter;
                counter++;
            }
            System.out.println(fact + factorial);
        }
    }
}
