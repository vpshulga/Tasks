package by.vpshulga.lesson11;

import org.apache.log4j.Logger;

import java.io.IOException;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) throws MyException {
//        System.out.println("Task01");
//        Task01 task01 = null;
//        try {
//            task01.method();
//        } catch (NullPointerException e){
//            System.out.println("Null pointer");
//        }
//        System.out.println("-------------------------");
//        System.out.println("Task02");
//        int[] arr = new int[10];
//        try {
//            arr[11] = 0;
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Array index out of bounds");
//        }
//        System.out.println("-------------------------");
//        System.out.println("Task03");
//        try {
//            MyException.method();
//        } catch (MyException e) {
//            e.printStackTrace();
//        }
//        System.out.println("-------------------------");
//        System.out.println("Task04");
//        try {
//            MyRuntimeException.method();
//        } catch (MyRuntimeException e){
//            e.printStackTrace();
//        }
//        MyRuntimeException.method();
//        System.out.println("-------------------------");
//        System.out.println("Task05");
//        MyException.causeException();
//        System.out.println("-------------------------");
//        System.out.println("Task06");
//        try {
//            RandomException.randomException();
//        } catch (IOException e) {
//            System.out.println("IOException");
//        } catch (MyException e){
//            System.out.println("My Exception");
//        } catch (MyRuntimeException e){
//            System.out.println("My Runtime Exception");
//        }
//        System.out.println("-------------------------");
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
