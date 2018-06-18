package by.vpshulga.lesson13;

public class Main {
    public static void main(String[] args) {
//        task01();
//        task02();
//        task03();
//        task04();
//        task05();
    }

    private static void task01() {
        System.out.println("Task 01");
        System.out.println(CheckEMail.isEMail("vpshulgaa@gmail.com"));
        System.out.println("-------------------");
    }

    private static void task02() {
        System.out.println("Task 02");
        HexNumbers.printHexNums("0xFFF123F   0xafdc999228f asd asd 0x");
        System.out.println("-------------------");
    }

    private static void task03() {
        System.out.println("Task 03");
        ReplaceTags.replaceTags("<p sdsd = \"p1\"> asdasdas asdasd adasda <p  23  asd > \n<p asd asd as  asd> sda asdas<p>");
        System.out.println("-------------------");
    }

    private static void task04() {
        System.out.println("Task 04");
        ChangeTelNumber.changeNumberFormat("+375296622616asdas asdas +37525a6682777\n+375251111111 +375252222222 +375253333333 +375256682777" +
                "\n+375256682777 +375256682777");
        System.out.println("-------------------");
    }

    private static void task05() {
        System.out.println("Task 05");
        System.out.println(CheckIPAddress.isIPAddress("192.168.95.144"));
        System.out.println("-------------------");
    }
}
