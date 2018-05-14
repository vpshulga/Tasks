package by.vpshulga.lesson03.hw;

public class LinearizeArrays4 {
    private static int[][] startArray = {{1, 2, 2, 4, 5}, {1, 2, 4, 10, 11, 13} };

    static int[] linearize(){
        int length = 0;
        for (int i = 0; i < startArray.length; i++) {
            length += startArray[i].length;
        }
        int[] resArray = new int[length];
        for (int i = 0; i < resArray.length;) {
            for (int j = 0; j < startArray.length; j++) {
                for (int k = 0; k < startArray[j].length; k++) {
                    resArray[i] = startArray[j][k];
                    i++;
                }
            }
        }
        return resArray;
    }
}
