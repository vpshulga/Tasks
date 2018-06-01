package by.vpshulga.lesson11;

public class MyException extends Exception{
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException() {
    }

    static void method() throws MyException{
        throw new MyException();
    }

    static void causeException() throws MyException {
        try{
            Task01 task01 = null;
            task01.method();
        } catch (NullPointerException e){
            throw new MyException("My Exception",e);
        }
    }
}
