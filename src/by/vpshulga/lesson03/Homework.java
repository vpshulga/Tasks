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

    /**
     * 2. Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
     */

    private static void divisionByThirteenAndSeventeen(){
        int[] array = new int[100];
        int counter = 0;
        int index = 0;

        while (array[array.length - 1] == 0){
            if (counter % 13 == 0 || counter % 17 == 0){
                array[index] = counter;
                index++;
            }
            counter++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * 3. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
     */
}
