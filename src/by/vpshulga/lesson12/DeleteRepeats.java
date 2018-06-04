package by.vpshulga.lesson12;

public class DeleteRepeats {

    static StringBuilder deleteRepeats(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        if (text != null) {
            char[] chars = text.toCharArray();

            stringBuilder.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i - 1] != chars[i]) {
                    stringBuilder.append(chars[i]);
                }
            }
        } else {
            stringBuilder.append("Need not null String");
        }
        return stringBuilder;
    }
}
