package by.vpshulga.lesson14;

import java.io.*;

import org.apache.log4j.Logger;

public class Task01 {
    private static final Logger LOGGER = Logger.getLogger(Task01.class);

    static void readFile() {
        File file = new File("src" + File.separator + "by" + File.separator
                + "vpshulga" + File.separator + "lesson14" + File.separator + "Task01.txt");
        if (file.exists()) {
            try (FileReader fr = new FileReader(file);
                 BufferedReader bf = new BufferedReader(fr)) {
                String line;
                while ((line = bf.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                LOGGER.warn(e);
            }
        }
    }
}
