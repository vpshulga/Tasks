package by.vpshulga.lesson04.mainhw;

public class HomeWorkMain {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(39001);
        timeInterval.printResults();
        TimeInterval timeInterval1 = new TimeInterval(10, 21, 35);
        timeInterval1.printResults();
        Bankomat bankomat = new Bankomat(5, 1, 5);
        bankomat.takeMoney(130);

    }
}
