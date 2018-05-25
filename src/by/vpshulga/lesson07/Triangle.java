package by.vpshulga.lesson07;

public class Triangle implements IFigure, IAltitude {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            this.a =0;
            this.b =0;
            this.c =0;
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public boolean isEqual(IFigure figure) {
        return this.getSquare() == figure.getSquare();
    }

    @Override
    public double getAltitudeA() {
        double p = getPerimeter() / 2;
        return 2 * Math.sqrt(getSquare()) / a;
    }

    @Override
    public double getAltitudeB() {
        double p = getPerimeter() / 2;
        return 2 * Math.sqrt(getSquare()) / b;
    }

    @Override
    public double getAltitudeC() {
        double p = getPerimeter() / 2;
        return 2 * Math.sqrt(getSquare()) / c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
