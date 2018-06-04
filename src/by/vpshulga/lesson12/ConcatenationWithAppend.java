package by.vpshulga.lesson12;

class ConcatenationWithAppend {
    private static StringBuilder sb = new StringBuilder();
    private static String s1 = new String("abc");

    static void concatenation(){
        int i = 10000;
        while (i > 0){
            sb.append(s1);
            i--;
        }
    }
}
