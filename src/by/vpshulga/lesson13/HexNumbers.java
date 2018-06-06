package by.vpshulga.lesson13;

import java.util.regex.*;

public class HexNumbers {

    static void printHexNums(String text) {
        Pattern pattern = Pattern.compile("\\b-?0[xX](\\d+|[a-fA-F]+)(\\d|[a-fA-F])*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
