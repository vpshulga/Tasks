package by.vpshulga.lesson11;

public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String message) {
        super(message);
    }

    static void method(){
        throw new MyRuntimeException("My Runtime Exception");
    }
}
