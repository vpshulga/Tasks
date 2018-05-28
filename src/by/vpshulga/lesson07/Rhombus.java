package by.vpshulga.lesson07;

public class Rhombus extends Parallelogram {
    Rhombus(double a, double degree) {
        super(a, a, degree);
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    @Override
    public String toString() {
        return "Rhombus{a=" + getA() +
                ", degree=" + getDegree() + "}";
    }
}
