package by.vpshulga.lesson11;

public class MyException extends Exception {
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException() {
    }

    static void method() throws MyException {
        throw new MyException();
    }

    static void causeException() throws MyException {
        try {
            String s = null;
            s.toUpperCase();
        } catch (NullPointerException e) {
            throw new MyException("My Exception", e);
        }
    }
}
