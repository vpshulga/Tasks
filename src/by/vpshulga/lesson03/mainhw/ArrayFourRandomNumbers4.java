package by.vpshulga.lesson03.mainhw;

import java.util.Random;

/**
 * 4. Создать массив из 4 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class ArrayFourRandomNumbers4 {
    static void printRandomArrayAndCheckForRaise() {
        System.out.println("Задача 4:");
        boolean isRaise = false;
        int[] array = new int[4];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + rand.nextInt(90);
            System.out.print(array[i] + " ");
        }
        int maxIndex = TotalElementsBetweenMinAndMax3.findMaxIndex(array);
        for (int i = 0; i < array.length - 1; i++) {
            isRaise = maxIndex == (array.length - 1) && array[i] < array[i + 1];
            if (!isRaise) {
                break;
            }
        }
        System.out.println("");

        if (isRaise) {
            System.out.println("Строго возрастающая последовательность");
        } else {
            System.out.println("Не строго возрастающая последовательность");
        }
        System.out.println("--------------------------------------------------------");
    }
}
