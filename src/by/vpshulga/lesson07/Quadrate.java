package by.vpshulga.lesson07;

public class Quadrate extends Rhombus implements IDiagonal{
    public Quadrate(double a) {
        super(a, 90);
    }

    @Override
    public double getSquare() {
        return getA() * getA();
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(2) * getA();
    }
}
