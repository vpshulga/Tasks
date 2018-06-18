package by.vpshulga.lesson17;

import by.vpshulga.lesson17.scientists.Scientist;
import by.vpshulga.lesson17.threads.Factory;
import by.vpshulga.lesson17.threads.Servant;

public class Main {
    public static void main(String[] args) {
        Dump dump = new Dump();
        System.out.println("Start List: " + dump.getList());
        Scientist firstSc = new Scientist("First scientist");
        System.out.println("Starter pack of first scientist: " + firstSc.getPartsMap());
        Scientist secondSc = new Scientist("Second scientist");
        System.out.println("Starter pack of second scientist: " + secondSc.getPartsMap());

        Thread factory = new Thread(new Factory(), "Factory");
        Thread firstServant = new Thread(new Servant(firstSc), "First Servant Thread");
        Thread secondServant = new Thread(new Servant(secondSc), "Second Servant Thread");

        factory.start();
        firstServant.start();
        secondServant.start();

        try {
            firstServant.join();
            secondServant.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("First scientist made: " + firstSc.getCountOfCompleteRobots() + " ROBOTS");
        System.out.println("Second scientist made: " + secondSc.getCountOfCompleteRobots() + " ROBOTS");


    }
}
