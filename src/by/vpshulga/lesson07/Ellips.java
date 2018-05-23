package by.vpshulga.lesson07;

public class Ellips implements IFigure {
    private double a;
    private double b;

    public Ellips(double a, double b) {
        if (a <= 0 || b <= 0) {
            this.a = 0;
            this.b = 0;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    @Override
    public double getSquare() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((a * a + b * b ) / 2);
    }

    @Override
    public boolean isEqual(IFigure figure) {
        return this.getSquare() == figure.getSquare();
    }
}
