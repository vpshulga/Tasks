package by.vpshulga.lesson07;

public class ShapeUtils {
    static boolean isRectangle(IFigure figure){
        return (figure instanceof Rectangle || figure instanceof  Quadrate);
    }

    static boolean isTriangle(IFigure figure){
        return (figure instanceof Triangle);
    }
}
