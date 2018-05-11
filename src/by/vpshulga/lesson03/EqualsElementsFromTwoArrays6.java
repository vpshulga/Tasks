package by.vpshulga.lesson03;

/**
 * 6. Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 * 2-х двумерных массивов.
 */
public class EqualsElementsFromTwoArrays6 {
    private static int[][] first = {{1, 2, 3, 4}, {2, 6, 7}, {9, 10, 11, 12}, {5, 14, 15, 19}};
    private static int[][] second = {{1, 1, 3, 6}, {5, 6, 7, 8}, {7, 11, 11, 12}, {13, 4, 15, 16}};

    private static boolean checkBounds(int[][] firstArray, int[][] secondArray, int indexI, int indexJ) {
        boolean isEnter = true;
        if (indexI >= firstArray.length || indexI >= secondArray.length) {
            isEnter = false;
        } else {
            if (indexJ >= firstArray[indexI].length) {
                isEnter = false;
            }

            if (indexJ >= secondArray[indexI].length) {
                isEnter = false;
            }
        }
        return isEnter;
    }

    static void equals(int indexI, int indexJ) {
        System.out.println("Задача 6:");

        if (checkBounds(first, second, indexI, indexJ)) {
            if (first[indexI][indexJ] == second[indexI][indexJ]) {
                System.out.println("Элементы массивов равны");
            } else {

                System.out.println("Элементы массивов не равны");
            }
        } else {
            System.out.println("Выход за пределы массива");
        }
        System.out.println("--------------------------------------------------------");
    }

    private static void printEqualsForLongestArray(int[][] firstArray, int[][] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i].length <= secondArray[i].length) {
                for (int j = 0; j < firstArray[i].length; j++) {
                    if (firstArray[i][j] == secondArray[i][j]) {
                        System.out.println("Элемент first[" + i + "]" + "[" + j + "] равен элементу second[" + i + "]" + "[" + j + "]");
                    } else {
                        System.out.println("Элемент first[" + i + "]" + "[" + j + "] не равен элементу second[" + i + "]" + "[" + j + "]");
                    }
                }
            } else {
                for (int j = 0; j < secondArray[i].length; j++) {
                    if (secondArray[i][j] == firstArray[i][j]) {
                        System.out.println("Элемент first[" + i + "]" + "[" + j + "] равен элементу second[" + i + "]" + "[" + j + "]");
                    } else {
                        System.out.println("Элемент first[" + i + "]" + "[" + j + "] не равен элементу second[" + i + "]" + "[" + j + "]");
                    }
                }
            }
        }
    }


    static void equlsEachElement() {

        if (first.length <= second.length) {
            printEqualsForLongestArray(first, second);
        } else {
            printEqualsForLongestArray(second, first);
        }
        System.out.println("--------------------------------------------------------");
    }
}
