package by.vpshulga.lesson05;

public class HomeWork {
    public static void main(String[] args) {
        DemoBigDecimal dbd1 = new DemoBigDecimal(3, 13);
        System.out.println(dbd1.demoAdd());
        System.out.println(dbd1.demoSubtract());
        System.out.println(dbd1.demoMultiply());
        System.out.println(dbd1.demoDivide());
        DemoBigDecimal dbd2 = new DemoBigDecimal(3.0, 4.0);
        System.out.println(dbd2.demoAdd());
        System.out.println(dbd2.demoSubtract());
        System.out.println(dbd2.demoMultiply());
        System.out.println(dbd2.demoDivide());
    }
}
