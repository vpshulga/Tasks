package by.vpshulga.lesson03;

/**
 * 5. Создать двухмерный квадратный массив, и заполнить его "бабочкой", т.е. таким образом:
 * <p>
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 * <p>
 * Вывести его на экран, заменив 1 символом *, а 0 - пробелом.
 */
public class DoubleArrayButterfly5 {
    static void butterflyArray() {
        System.out.println("Задача 5:");
        int[][] butterflyArray = {{1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}};

        for (int i = 0; i < butterflyArray.length; i++) {
            for (int j = 0; j < butterflyArray[i].length; j++) {
                if (butterflyArray[i][j] == 1) {
                    System.out.print("* ");
                } else if (butterflyArray[i][j] == 0) {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------------");
    }

}
