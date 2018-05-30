package by.vpshulga.lesson08;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//
        Pair<String, Integer> pair = new Pair<>("sa", 1);
        System.out.println(PairUtil.swap(pair).getKey());
        System.out.println(PairUtil.swap(pair).getValue());
//
//
        BigInteger bInt = BigInteger.valueOf(10);
        Double d = 0.1;
        Calculator<BigInteger, Double> calculator = new Calculator<>(bInt, d);
        System.out.println(calculator.add());
        System.out.println(calculator.minus());
        System.out.println(calculator.multiple());
        System.out.println(calculator.div());

        TransactionalAnalyzer.analyzeTransaction(TransactionsClass.class, "method1",
                "method2", "method3", "method4", "method5", "method6");

        ClassAnalyzer.analize(new Calculator<>(1, 2));
//        ClassAnalyzer.analize(System.class);
    }


}
