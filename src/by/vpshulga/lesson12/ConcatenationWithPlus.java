package by.vpshulga.lesson12;

class ConcatenationWithPlus {
    private static String s1 = new String("abc");
    private static String s2 = new String("");

    static void concatenation() {
        int i = 10000;
        while (i > 0) {
            s2 += s1;
            i--;
        }
    }
}
