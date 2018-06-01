package by.vpshulga.lesson11;

import java.util.Random;

public class FiftyFifty {
    static void fiftyFifty() throws MyException {
        Random random = new Random();
        int chance = random.nextInt(2);
        if (chance == 0){
            System.out.println("No Exceptions");
        } else {
            throw new MyException();
        }
    }
}
