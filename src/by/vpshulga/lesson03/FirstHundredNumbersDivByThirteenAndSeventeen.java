package by.vpshulga.lesson03;

public class FirstHundredNumbersDivByThirteenAndSeventeen {
    /**
     * 2. Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
     */

    static void divisionByThirteenAndSeventeen(){
        int[] array = new int[100];
        int counter = 1;
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
}
