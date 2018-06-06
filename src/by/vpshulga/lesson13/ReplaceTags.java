package by.vpshulga.lesson13;

public class ReplaceTags {

    static void replaceTags(String text) {
        if (text != null) {
            System.out.println(text.replaceAll("<p[^>]*>", "<p>"));
        } else {
            System.out.println("Need not null text");
        }
    }

}
