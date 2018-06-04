package by.vpshulga.lesson12;

class StartsAndEndsWithWord {

    static boolean isStartsAndEndsWithWord(String text, String word) {
        return text != null && word != null && text.startsWith(word) && text.endsWith(word);
    }
}
