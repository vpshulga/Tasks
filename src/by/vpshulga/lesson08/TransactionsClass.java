package by.vpshulga.lesson08;

public class TransactionsClass {
    @Transactional
    public void method1(){
        System.out.println("Method1");
    }

    @Transactional
    public void method2(){
        System.out.println("Method2");
    }

    public void method3(){
        System.out.println("Method3");
    }

    @Transactional
    public void method4(){
        System.out.println("Method4");
    }

}
