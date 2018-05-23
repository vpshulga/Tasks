package by.vpshulga.lesson07;

public class Rhombus extends Parallelogram {
    public Rhombus(double a, double degree) {
        super(a, a, degree);
    }

    @Override
    public double getSquare() {
        return getA() * getA() * (Math.sin(Math.toRadians(getDegree())));
    }
}
