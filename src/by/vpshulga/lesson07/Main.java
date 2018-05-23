package by.vpshulga.lesson07;

public class Main {
    public static void main(String[] args) {
        IFigure quadr = new Quadrate(10);
        System.out.println(quadr.getPerimeter());
        System.out.println(quadr.getSquare());

        Quadrate quadrate = new Quadrate(10);
        System.out.println(quadrate.getDiagonal());



        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect.getDiagonal());


        IFigure romb = new Rhombus(12, 170);
        System.out.println(romb.getSquare());
        System.out.println(romb.getPerimeter());

        System.out.println(ShapeUtils.isRectangle(romb));

        IFigure circle = new Circle(10);
        System.out.println(circle.getSquare());


    }
}
