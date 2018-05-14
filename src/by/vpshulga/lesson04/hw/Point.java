package by.vpshulga.lesson04.hw;

public class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    double distance(Point point) {
        return Math.sqrt((Math.pow((this.xCoordinate - point.xCoordinate), 2)) + Math.pow((this.yCoordinate - point.yCoordinate), 2));
    }
}
