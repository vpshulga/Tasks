package by.vpshulga.lesson07;

public class Rectangle extends Parallelogram implements IDiagonal{

    public Rectangle(double a, double b) {
        super(a, b, 90);
    }

    @Override
    public double getSquare() {
        return getA() * getB();
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt((getA() * getA() + getB() *getB()));    }

    @Override
    public String toString() {
        return "Rectangle{a=" + getA() +
                ", b=" + getB() + "}";
    }
}
