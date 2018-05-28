package by.vpshulga.lesson08;

import java.math.BigInteger;
import java.math.BigDecimal;

public class Calculator<K extends Number, V extends Number> {
    private K first;
    private V second;

    Calculator(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    @Deprecated
    @Transactional
    Number add() {
        if (isInteger(first) && isInteger(second)) {
            return first.longValue() + second.longValue();
        } else {
            return first.doubleValue() + second.doubleValue();
        }
    }

    Number minus() {
        if (isInteger(first) && isInteger(second)) {
            return first.longValue() - second.longValue();
        } else {
            return first.doubleValue() - second.doubleValue();
        }
    }

    Number multiple() {
        if (isInteger(first) && isInteger(second)) {
            return first.longValue() * second.longValue();
        } else {
            return first.doubleValue() * second.doubleValue();
        }
    }

    @Transactional
    Number div() {
        if (isInteger(first) && isInteger(second)) {
            try {
                return first.longValue() / second.longValue();
            } catch (ArithmeticException e) {
                System.out.println("Division by Zero!");
                return null;
            }

        } else {
            try {
                return first.doubleValue() / second.doubleValue();
            } catch (ArithmeticException e) {
                System.out.println("Division by Zero!");
                return null;
            }
        }
    }

    @Deprecated
    @Transactional
    private boolean isInteger(Number number) {
        return number instanceof Integer || number instanceof Long || number instanceof Short
                || number instanceof Byte || number instanceof BigInteger;

    }

    private boolean isDouble(Number number) {
        return number instanceof Double || number instanceof Float || number instanceof BigDecimal;
    }
}
