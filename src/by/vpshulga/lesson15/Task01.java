package by.vpshulga.lesson15;

import java.io.*;
import java.nio.charset.Charset;

public class Task01 {

    private static void writeToFile(){
        File file = new File("src" + File.separator +  "by" + File.separator
                + "vpshulga" + File.separator + "lesson15" + File.separator + "Task01.txt");
        int counter = 0;
        if (file.exists()) {
            try (FileWriter fw = new FileWriter(file);
                ) {
                while (counter < 5242880) {
                    fw.write('a');
                    counter++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readFromFile(){
        File file = new File("src" + File.separator +  "by" + File.separator
                + "vpshulga" + File.separator + "lesson15" + File.separator + "Task01.txt");
        if (file.exists()) {
            try (FileReader fr = new FileReader(file)) {
                while (fr.ready()) {
                    fr.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeToFileBuffered(){
        File file = new File("src" + File.separator +  "by" + File.separator
                + "vpshulga" + File.separator + "lesson15" + File.separator + "Task01_buf.txt");
        int counter = 0;
        if (file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                while (counter < 5242880) {
                    bw.write('a');
                    counter++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readFromFileBuffered(){
        File file = new File("src" + File.separator +  "by" + File.separator
                + "vpshulga" + File.separator + "lesson15" + File.separator + "Task01_buf.txt");
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader( new FileReader(file))) {
                while (br.ready()) {
                    br.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void timer(){
        System.out.println("Write without buffering: ");
        long start = System.nanoTime();
        writeToFile();
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println("Write with Buffering: ");
        start = System.nanoTime();
        writeToFileBuffered();
        end = System.nanoTime();
        System.out.println(end - start);
        System.out.println("Read without buffering");
        start = System.nanoTime();
        readFromFile();
        end = System.nanoTime();
        System.out.println(end - start);
        System.out.println("Read with buffering");
        start = System.nanoTime();
        readFromFileBuffered();
        end = System.nanoTime();
        System.out.println(end - start);

    }
}
