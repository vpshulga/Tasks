package by.vpshulga.lesson03.mainhw;

/**
 * 1. Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */

public class PrintAndReverseArray1 {


    static void printArray() {
        System.out.println("Задача 1:");
        int[] array = {1, 3, 4, 5, 10, 12};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------");
    }
}
