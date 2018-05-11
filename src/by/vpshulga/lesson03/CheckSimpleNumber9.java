package by.vpshulga.lesson03;

/**
 * 9. Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class CheckSimpleNumber9 {
    static boolean checkNumber(int number) {
        System.out.println("Задача 9:");
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
            if (counter > 2){
                break;
            }
        }
        return counter == 2;
    }
}
