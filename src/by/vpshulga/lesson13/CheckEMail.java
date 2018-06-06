package by.vpshulga.lesson13;

import java.util.regex.*;

public class CheckEMail {

    static boolean isEMail(String text) {
        Pattern pattern = Pattern.compile("^(\\w+)@(\\w{2,}\\.)+(\\w{2,})$");
        Matcher matcher = pattern.matcher(text);

        if (text != null) {
            return matcher.find();
        } else {
            return false;
        }
    }
}
