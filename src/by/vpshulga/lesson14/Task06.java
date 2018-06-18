package by.vpshulga.lesson14;

import java.io.File;

class Task06 {

    static void printAllFiles(File file) {
        if (file.exists() && file.isDirectory()) {
            System.out.println("Каталог: " + file.getPath());
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        System.out.print("\t");
                        printAllFiles(f);
                    } else {
                        System.out.println("\t\tФайл: " + f.getName());
                    }
                }
            }
        }
    }
}
