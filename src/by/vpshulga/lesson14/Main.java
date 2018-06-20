package by.vpshulga.lesson14;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();

    }

    private static void task01() {
        System.out.println("Task01:\n");
        Task01.readFile();
        System.out.println("------------------");
    }

    private static void task02() {
        System.out.println("Task02:\n");
        Task02.printWords();
        System.out.println("------------------");
    }

    private static void task03() {
        System.out.println("Task03:\n");
        Task03.printWords();
        System.out.println("------------------");
    }

    private static void task04() {
        System.out.println("Task04:\n");
        Task04.printCuntOfNums();
        System.out.println("------------------");
    }

    private static void task05() {
        System.out.println("Task05:\n");
        Task05.printResults();
        System.out.println("------------------");
    }

    private static void task06() {
        System.out.println("Task06:\n");
        File file = new File("src" + File.separator + "by" + File.separator + "vpshulga");
        Task06.printAllFiles(file);
        System.out.println("------------------");
    }

    private static void task07() {
        System.out.println("Task07:\n");
        Task07.reverseText();
        System.out.println("------------------");
    }
}
