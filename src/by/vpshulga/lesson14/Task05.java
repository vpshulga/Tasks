package by.vpshulga.lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import org.apache.log4j.Logger;

class Task05 {
    private static final Logger LOGGER = Logger.getLogger(Task05.class);

    private static File file = new File("src" + File.separator + "by" + File.separator
            + "vpshulga" + File.separator + "lesson14" + File.separator + "Task05");

    private static void writeIntsToFiles() {
        ArrayList<Integer> list = new ArrayList<>();
        if (file.exists()) {
            try (FileOutputStream fis = new FileOutputStream(file);
                 DataOutputStream dos = new DataOutputStream(fis)) {
                Random random = new Random();
                int i = 0;
                while (i < 20) {
                    int a = 1280 + random.nextInt(3000);
                    dos.writeInt(a);
                    list.add(a);
                    i++;
                }
            } catch (IOException e) {
                LOGGER.warn(e);
            }
        }
        System.out.println(list);
    }

    private static ArrayList<Integer> readIntsFromFile() {
        ArrayList<Integer> list = new ArrayList<>();
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file);
                 DataInputStream dataInputStream = new DataInputStream(fis)) {
                int i;
                while ((dataInputStream.available() > 0)) {
                    i = dataInputStream.readInt();
                    list.add(i);
                }
            } catch (IOException e) {
                LOGGER.warn(e);
            }
        }
        return list;
    }

    static void printResults() {
        writeIntsToFiles();
        ArrayList<Integer> list = readIntsFromFile();
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
            System.out.print(integer + " ");
        }
        System.out.println("");
        double middleArithmetic = (double) sum / list.size();
        System.out.println("Srednee arifmeticheskoe: " + middleArithmetic);
    }
}
