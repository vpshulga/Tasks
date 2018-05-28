package by.vpshulga.lesson08;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//
//        Pair<String, Integer> pair = new Pair<>("sa", 1);
//        System.out.println(pair.getKey());
//        System.out.println(pair.getValue());
//        System.out.println(PairUtil.swap(pair).getKey());
//        System.out.println(PairUtil.swap(pair).getValue());
//
//
//        BigInteger bInt = BigInteger.valueOf(10);
//        BigDecimal bDec = BigDecimal.valueOf(20);
//        Calculator<BigInteger, BigDecimal> calculator = new Calculator<>(bInt, bDec);
//        System.out.println(calculator.add());
//        System.out.println(calculator.minus());
//        System.out.println(calculator.multiple());
//        System.out.println(calculator.div());
//
        TransactionalAnalyzer.analyzeTransaction(TransactionsClass.class, "method1",
                "method2", "method3", "method4", "method5", "method6");
        Calculator<Integer, Integer> calculator = new Calculator<>(1, 2);
//
        ClassAnalyzer.analize(calculator);
//        ClassAnalyzer.analize(System.class);
    }


}
