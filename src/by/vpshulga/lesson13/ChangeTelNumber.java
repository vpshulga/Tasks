package by.vpshulga.lesson13;

import java.util.regex.*;

public class ChangeTelNumber {
    static void changeNumberFormat(String text) {
        Pattern pattern = Pattern.compile("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(text);
        StringBuilder sb = new StringBuilder();
        if (text != null) {
            while (matcher.find()) {
                matcher.appendReplacement(sb, matcher.group(1) + " (" + matcher.group(2) + ") "
                        + matcher.group(3) + "-" + matcher.group(4) + "-" + matcher.group(5));
            }
            System.out.println(sb);
        } else {
            System.out.println("Need not null text");
        }
    }
}
