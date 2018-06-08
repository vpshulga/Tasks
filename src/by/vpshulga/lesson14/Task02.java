package by.vpshulga.lesson14;

import by.vpshulga.lesson14.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class Task02 {
    private static final Logger LOGGER = Logger.getLogger(Task02.class);


    static void printWords() {
        File file = new File("src" + File.separator + "by" + File.separator
                + "vpshulga" + File.separator + "lesson14" + File.separator + "Task01.txt");
        ArrayList<String> list = FileUtils.addStringsFromFileToList(file);
        Pattern pattern = Pattern.compile("\\b[aAeEiIoOuUаАуУоОыЫиИэЭяЯюЮёЁеЕ][a-zA-Zа-яА-я0-9-]*\\b", Pattern.MULTILINE);
        if (list != null) {
            for (String s : list) {
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()) {
                    System.out.print(matcher.group() + " ");
                }
            }
            System.out.println("");
        }
    }
}
