package by.vpshulga.lesson04.mainhw;

public class HomeWorkMain {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(39001);
        timeInterval.printResults();
        TimeInterval timeInterval1 = new TimeInterval(10, 21, 35);
        timeInterval1.printResults();
        System.out.println("----------------");
        Bankomat bankomat = new Bankomat(5, 0, 5);
        bankomat.takeMoney(270);
        bankomat.takeMoney(110);
        bankomat.add20(5);
        bankomat.add50(2);
        bankomat.takeMoney(110);
        bankomat.takeMoney(80);
        bankomat.getCountOfNominals();
    }
}
