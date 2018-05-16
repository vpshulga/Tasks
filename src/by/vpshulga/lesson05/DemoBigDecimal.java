package by.vpshulga.lesson05;

import java.math.BigDecimal;

public class DemoBigDecimal {
    private long argOne;
    private long argTwo;
    private double argThree;
    private double argFour;

    public DemoBigDecimal(int argOne, int argTwo) {
        this.argOne = argOne;
        this.argTwo = argTwo;
    }

    public DemoBigDecimal(double argThree, double argFour) {
        this.argThree = argThree;
        this.argFour = argFour;
    }

    public long getArgOne() {
        return argOne;
    }

    public void setArgOne(int argOne) {
        this.argOne = argOne;
    }

    public long getArgTwo() {
        return argTwo;
    }

    public void setArgTwo(int argTwo) {
        this.argTwo = argTwo;
    }

    public double getArgThree() {
        return argThree;
    }

    public void setArgThree(double argThree) {
        this.argThree = argThree;
    }

    public double getArgFour() {
        return argFour;
    }

    public void setArgFour(double argFour) {
        this.argFour = argFour;
    }

    BigDecimal demoAdd() {
        BigDecimal bd1 = BigDecimal.valueOf(getArgOne());
        BigDecimal bd2 = BigDecimal.valueOf(getArgTwo());
        BigDecimal bd3 = BigDecimal.valueOf(getArgThree());
        BigDecimal bd4 = BigDecimal.valueOf(getArgFour());
        if (argOne != 0) {
            return bd1.add(bd2);
        } else {
            return bd3.add(bd4);
        }
    }

    BigDecimal demoSubtract() {
        BigDecimal bd1 = BigDecimal.valueOf(getArgOne());
        BigDecimal bd2 = BigDecimal.valueOf(getArgTwo());
        BigDecimal bd3 = BigDecimal.valueOf(getArgThree());
        BigDecimal bd4 = BigDecimal.valueOf(getArgFour());
        if (argOne != 0) {
            return bd1.subtract(bd2);
        } else {
            return bd3.subtract(bd4);
        }
    }

    BigDecimal demoMultiply() {
        BigDecimal bd1 = BigDecimal.valueOf(getArgOne());
        BigDecimal bd2 = BigDecimal.valueOf(getArgTwo());
        BigDecimal bd3 = BigDecimal.valueOf(getArgThree());
        BigDecimal bd4 = BigDecimal.valueOf(getArgFour());
        if (argOne != 0) {
            return bd1.multiply(bd2);
        } else {
            return bd3.multiply(bd4);
        }
    }

    BigDecimal demoDivide() {
        BigDecimal bd1 = BigDecimal.valueOf(getArgOne());
        BigDecimal bd2 = BigDecimal.valueOf(getArgTwo());
        BigDecimal bd3 = BigDecimal.valueOf(getArgThree());
        BigDecimal bd4 = BigDecimal.valueOf(getArgFour());
        if (argOne != 0) {
            return bd1.divide(bd2, 5, BigDecimal.ROUND_DOWN);
        } else {
            return bd3.divide(bd4, 5, BigDecimal.ROUND_DOWN);
        }
    }
}
