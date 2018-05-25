package by.vpshulga.lesson07;

public class Circle extends Ellips {
    public Circle(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Circle{radius=" + getA() + "}";
    }
}
