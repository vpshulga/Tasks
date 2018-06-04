package by.vpshulga.lesson12;

public class Main {
    public static void main(String[] args) {
        plus();
        append();

        task02();

        task03();

        task04();

        task05();

        task06();
    }


    private static void plus() {
        System.out.println("Task01");
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            ConcatenationWithPlus.concatenation();
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    private static void append() {
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            ConcatenationWithAppend.concatenation();
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println("--------------------");
    }

    private static void task02() {
        System.out.println("Task02");
        ChangeSadForHappy csh = new ChangeSadForHappy("aaaaaa bbbbb sdsd :( :(:( sdaadad:(");
        System.out.println(csh.changeSmiles());
        System.out.println("--------------------");
    }

    private static void task03() {
        System.out.println("Task03");
        System.out.println(StartsAndEndsWithWord.isStartsAndEndsWithWord("AAA ffff sadsad asAA", "AAA"));
        System.out.println("--------------------");
    }

    private static void task04() {
        System.out.println("Task04");
        System.out.println(Initials.getInitials("александр", "вольнов", "Павлович"));
        System.out.println("--------------------");
    }

    private static void task05() {
        System.out.println("Task05");
        System.out.println(CountOfWords.getCountOfWords("  j   sdfsdf sdf   sdf sdf sdd "));
        System.out.println("--------------------");
    }

    private static void task06() {
        System.out.println("Task06");
        System.out.println(DeleteRepeats.deleteRepeats("aaabbbbbcdeef"));
        System.out.println("--------------------");
    }
}
