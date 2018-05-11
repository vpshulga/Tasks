package by.vpshulga.lesson03;

/**
 * 3. Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.
 */

public class TotalElementsBetweenMinAndMax3 {
    private static int[] sourceArray = {-10, 1, -23, 12, 35, 58, 96, 3, 15};

    private static int findMinIndex(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    static int findMaxIndex(int[] array) {
        int max = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    static void calculateTotal() {
        System.out.println("Задача 3:");
        int result = 0;
        int min = findMinIndex(sourceArray);
        int max = findMaxIndex(sourceArray);
        if (min < max) {
            for (int i = min + 1; i < max; i++) {
                result += sourceArray[i];
            }
        } else if (max < min) {
            for (int i = max + 1; i < min; i++) {
                result += sourceArray[i];
            }
        } else {
            result = sourceArray[min];
        }
        System.out.println(result);
        System.out.println("--------------------------------------------------------");
    }
}
