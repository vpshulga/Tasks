package by.vpshulga.lesson04.hw;

public class HomeWork {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0, 5), new Point(10, 0));
        System.out.println(rectangle.areaOfRectangle());
        System.out.println(rectangle.diagonal());
    }
}
