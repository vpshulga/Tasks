package by.vpshulga.lesson07;

public abstract class Quadrilateral implements IFigure {
    private double a;
    private double b;
    private double c;
    private double d;

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    Quadrilateral(double a, double b, double c, double d) {
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public boolean isEqual(IFigure figure) {
        return this.getSquare() == figure.getSquare();
    }
}
