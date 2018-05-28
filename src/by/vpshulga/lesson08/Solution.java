package by.vpshulga.lesson08;

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
    public void method5() {
        System.out.println("Method 5");
    }

    @Transactional
    public void method6() {
        System.out.println("Method 6");
    }
}
