package by.vpshulga.lesson03.hw;

public class MergeArrays3 {
    private static int[] firstArray = {1, 2, 3, 4, 5};
    private static int[] secondArray = {5, 6, 7};

    static void merge() {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        if (firstArray.length >= secondArray.length) {
            for (int i = 0, j = 0; i < resultArray.length && j < secondArray.length; i++, j++) {
                resultArray[i] = firstArray[j];
                i++;
                resultArray[i] = secondArray[j];
            }
            for (int i = secondArray.length * 2; i < resultArray.length; i++) {
                resultArray[i] = firstArray[i - secondArray.length];
            }
        } else {
            for (int i = 0, j = 0; i < resultArray.length && j < firstArray.length; i++, j++) {
                resultArray[i] = firstArray[j];
                i++;
                resultArray[i] = secondArray[j];
            }
            for (int i = firstArray.length * 2; i < resultArray.length; i++) {
                resultArray[i] = secondArray[i - firstArray.length];
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }

    }

}
