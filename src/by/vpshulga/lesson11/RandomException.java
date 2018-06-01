package by.vpshulga.lesson11;

import java.util.*;
import java.io.*;


public class RandomException {

    static void randomException() throws MyException, IOException {
        Random random = new Random();
        int exceptionNumber = random.nextInt(3);
        switch (exceptionNumber){
            case 0:
                throw new MyException();
            case 1:
                throw new MyRuntimeException("Runtime Exception");
            case 2:
                throw new IOException();
        }
    }
}
