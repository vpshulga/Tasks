package by.vpshulga.lesson13;

import java.util.regex.*;

class CheckIPAddress {
    static boolean isIPAddress(String text) {
        if (text != null) {
            Pattern pattern = Pattern.compile("^((([0-1]?(?<!0)\\d?(?<!0)\\d)|(2[0-5])[0-5])(\\b|\\.)){3}");
            Matcher matcher = pattern.matcher(text);
            return matcher.find();
        } else {
            return false;
        }
    }
}
