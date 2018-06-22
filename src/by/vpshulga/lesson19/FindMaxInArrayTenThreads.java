package by.vpshulga.lesson19;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FindMaxInArrayTenThreads {
    static int findMax(){
        int[] array = FindMaxInArraySingleThread.fillArray();
        int[][] arrayOfArrays = new int[10][100000];
        int[] arrayOfMax = new int[10];
        for (int i = 0; i < arrayOfArrays.length; i++) {
            arrayOfArrays[i] = Arrays.copyOfRange(array, i * 100000, ((i + 1) * 100000 - 1));
        }

        ExecutorService service = Executors.newFixedThreadPool(10);
        long start = System.nanoTime();
        for (int i = 0; i < arrayOfArrays.length; i++) {
            int finalI = i;
            service.submit(() ->{
                arrayOfMax[finalI] = FindMaxInArraySingleThread.findMax(arrayOfArrays[finalI]);
            });
        }
        int result = FindMaxInArraySingleThread.findMax(arrayOfMax);
        service.shutdown();
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) / 1000000 +"ms.(Ten Threads)" );

        return result;
    }
}
