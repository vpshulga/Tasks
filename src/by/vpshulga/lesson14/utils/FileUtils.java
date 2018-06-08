package by.vpshulga.lesson14.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class FileUtils {
    private static final Logger LOGGER = Logger.getLogger(FileUtils.class);

    public static ArrayList<String> addStringsFromFileToList(File file) {
        ArrayList<String> list = new ArrayList<>();
        if (file.exists()) {
            try (FileReader fr = new FileReader(file);
                 BufferedReader bf = new BufferedReader(fr)) {
                String line;
                while ((line = bf.readLine()) != null) {
                    list.add(line);
                }
            } catch (IOException e) {
                LOGGER.warn(e);
            }
        }

        return list;
    }

}
