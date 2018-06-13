package by.vpshulga.lesson14;

import by.vpshulga.lesson14.utils.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task04 {
    static void printCuntOfNums() {
        File file = new File("src" + File.separator + "by" + File.separator
                + "vpshulga" + File.separator + "lesson14" + File.separator + "Task01_buf.txt");
        ArrayList<String> list = FileUtils.addStringsFromFileToList(file);
        Pattern pattern = Pattern.compile("\\d+");
        for (String s : list) {
            Matcher matcher = pattern.matcher(s);
            String max = "";
            while (matcher.find()) {
                if (matcher.group().length() > max.length()) {
                    max = matcher.group();
                }

            }
            if (!max.equals("")) {
                System.out.println("Line№" + (list.indexOf(s) + 1) + " Max = " + max + " Count of nums = " + max.length());
            }
        }


    }
}
