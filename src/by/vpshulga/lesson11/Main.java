package by.vpshulga.lesson11;

import org.apache.log4j.Logger;

import java.io.IOException;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws MyException {
//        task01();
//        Task02();
//        task03();
//        task04();
//        task05();
//        task06();
        task07();

    }

    private static void task01() {
        System.out.println("Task01");
        Task01 task01 = null;
        try {
            task01.method();
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        }
        System.out.println("-------------------------");
    }

    private static void Task02() {
        System.out.println("Task02");
        int[] arr = new int[10];
        try {
            arr[11] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        System.out.println("-------------------------");
    }

    private static void task03() {
        System.out.println("Task03");
        try {
            MyException.method();
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------");
    }

    private static void task04() {
        System.out.println("Task04");
        try {
            MyRuntimeException.method();
        } catch (MyRuntimeException e) {
            e.printStackTrace();
        }
        MyRuntimeException.method();
        System.out.println("-------------------------");
    }

    private static void task05() throws MyException {
        System.out.println("Task05");
        MyException.causeException();
        System.out.println("-------------------------");
    }

    private static void task06() {
        System.out.println("Task06");
        try {
            RandomException.randomException();
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (MyException e) {
            System.out.println("My Exception");
        } catch (MyRuntimeException e) {
            System.out.println("My Runtime Exception");
        }
        System.out.println("-------------------------");
    }

    private static void task07() {
        System.out.println("Task07");
        try {
            FiftyFifty.fiftyFifty();
        } catch (MyException e) {
            LOGGER.warn("Exception was caught", e);
        } finally {
            System.out.println("Every case");
        }
        System.out.println("-------------------------");
    }
}
