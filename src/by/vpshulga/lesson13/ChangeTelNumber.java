package by.vpshulga.lesson13;

import java.util.regex.*;

public class ChangeTelNumber {
    static void changeNumberFormat(String text) {
        if (text != null) {
            System.out.println(text.replaceAll("(\\+375)(\\d{2})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5"));
        } else {
            System.out.println("Need not null text");
        }
    }
}
