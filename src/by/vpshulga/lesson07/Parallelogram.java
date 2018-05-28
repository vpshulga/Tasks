package by.vpshulga.lesson07;

public class Parallelogram extends FourAngle {
    private double degree;

    double getDegree() {
        return degree;
    }

    Parallelogram(double a, double b, double degree) {
        super(a, b, a, b);
        if (degree <= 0 || degree >=180) {
            this.degree = 0;
            setA(0);
            setB(0);
            setC(0);
            setD(0);
        } else {
            setA(a);
            setB(b);
            this.degree = degree;
        }
    }

    @Override
    public double getSquare() {
        return getA() * getB() * (Math.sin(Math.toRadians(degree)));
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "degree=" + degree +
                 ", a=" + getA() +
                ", b=" + getB() + "}";
    }
}
