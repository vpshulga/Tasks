package by.vpshulga.lesson04.hw;

public class Rectangle {
    private Point leftTopAngle;
    private Point rightBottomAngle;



    public Rectangle(Point leftTopAngle, Point rightBottomAngle) {
        this.leftTopAngle = leftTopAngle;
        this.rightBottomAngle = rightBottomAngle;
    }

    double areaOfRectangle(){
        return (leftTopAngle.distance(new Point(rightBottomAngle.getxCoordinate(), leftTopAngle.getyCoordinate()))) *
                (leftTopAngle.distance(new Point(leftTopAngle.getxCoordinate(), rightBottomAngle.getyCoordinate())));
    }

    double diagonal(){
        return Math.sqrt(Math.pow((leftTopAngle.distance(new Point(rightBottomAngle.getxCoordinate(), leftTopAngle.getyCoordinate()))), 2) +
                Math.pow((leftTopAngle.distance(new Point(leftTopAngle.getxCoordinate(), rightBottomAngle.getyCoordinate()))), 2));
    }
}
