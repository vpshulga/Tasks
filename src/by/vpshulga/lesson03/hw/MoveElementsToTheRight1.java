package by.vpshulga.lesson03.hw;

public class MoveElementsToTheRight1 {
    private static int[] array = {0, 1, 12, 43, 34, 25, 6, 7, 38};

    static void moveElements() {
        System.out.println("Задача 1:");

        int last = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = last;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------------");
    }
}
