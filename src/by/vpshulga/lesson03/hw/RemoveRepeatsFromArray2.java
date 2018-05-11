package by.vpshulga.lesson03.hw;

public class RemoveRepeatsFromArray2 {
    private static int[] array = {100, 123123, 1, 0, 2, 4, 3, -100, 2, 2, 2, 33, 7};

    static void removeRepeats(){
        int[] sortedArr = sort(array);
        int count = 1;

        for (int i = 0; i < sortedArr.length - 1; i++) {
            if (sortedArr[i] != sortedArr[i + 1]){
                count++;
            }
        }
        int[] resultArray = new int[count];
        resultArray[0] = sortedArr[0];
        for (int i = 0, j = 0; i < sortedArr.length - 1; i++) {
            if (sortedArr[i + 1] != resultArray[j]){
                resultArray[j + 1] = sortedArr[i + 1];
                j++;
            }
        }

        for (int i = 0; i <resultArray.length ; i++) {
            System.out.print(resultArray[i] +" ");
        }

    }

    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
}
