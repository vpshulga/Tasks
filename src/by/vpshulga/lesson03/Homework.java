package by.vpshulga.lesson03;

public class Homework {
    public static void main(String[] args) {
        printArray();
    }

    /**
     * 1. Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
     */

    private static void printArray() {
        int[] array = {1, 3, 4, 5, 10, 12};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("/n");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
