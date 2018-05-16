package by.vpshulga.lesson05;

import java.math.BigDecimal;

public class DemoBigDecimal {
    private BigDecimal bigDecimalOne;
    private BigDecimal bigDecimalTwo;

    DemoBigDecimal(long argOne, long argTwo) {
        bigDecimalOne = BigDecimal.valueOf(argOne);
        bigDecimalTwo = BigDecimal.valueOf(argTwo);

    }

    DemoBigDecimal(double argOne, double argTwo) {
        bigDecimalOne = BigDecimal.valueOf(argOne);
        bigDecimalTwo = BigDecimal.valueOf(argTwo);
    }




    BigDecimal demoAdd() {
        return bigDecimalOne.add(bigDecimalTwo);
    }

    BigDecimal demoSubtract() {
        return bigDecimalOne.subtract(bigDecimalTwo);
    }

    BigDecimal demoMultiply() {
        return bigDecimalOne.multiply(bigDecimalTwo);
    }

    BigDecimal demoDivide() {
        return bigDecimalOne.divide(bigDecimalTwo, 5, BigDecimal.ROUND_DOWN);
    }
}
