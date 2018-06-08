package by.vpshulga.lesson14;

import java.io.*;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Task07 {
    private static final Logger LOGGER = Logger.getLogger(Task01.class);
    private static File file = new File("src" + File.separator + "by" + File.separator
            + "vpshulga" + File.separator + "lesson14" + File.separator + "Main.java");
    private static File reversedFile = new File("src" + File.separator + "by" + File.separator
            + "vpshulga" + File.separator + "lesson14" + File.separator + "ReversedText.txt");

    static void reverseText(){
        if (file.exists()){
            try (BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(reversedFile))){
                ArrayList<String> list = new ArrayList<>();
                if (file.exists()){
                    String line;
                    while ((line = br.readLine()) != null){
                        list.add(line);
                    }
                }
                if (reversedFile.exists()){
                    for (String s : list) {
                        String string = new StringBuilder(s).reverse().toString();
                        bw.write(string);
                        bw.newLine();
                    }
                }
            } catch (IOException e) {
                LOGGER.warn(e);
            }
        }
    }
}
