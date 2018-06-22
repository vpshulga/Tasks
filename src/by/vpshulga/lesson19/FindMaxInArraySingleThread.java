package by.vpshulga.lesson19;

import java.util.Random;

class FindMaxInArraySingleThread {
    static int findMax(int[] array){
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static void timer(){
        long start = System.nanoTime();
        findMax(fillArray());
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) / 1000000 + "ms. (Single Thread)");
    }

    static int[] fillArray(){
        Random random = new Random();
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + random.nextInt(300);
        }
        return array;
    }
}
