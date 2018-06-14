package by.vpshulga.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dump {
    private static final List<PartsOfRobot> list = new ArrayList<>();
    private static final PartsOfRobot[] PARTS_OF_ROBOTS = PartsOfRobot.values();
    private static Random random = new Random();
    private static int numberOfRandomPart;

    Dump() {
        fillList();
    }

    public List<PartsOfRobot> getList() {
        return list;
    }

    private static void fillList() {
        for (int i = 0; i < 20; i++) {
            numberOfRandomPart = random.nextInt(PARTS_OF_ROBOTS.length);
            list.add(PARTS_OF_ROBOTS[numberOfRandomPart]);
        }
    }

    public static void addPartsToDumpEveryNight() {
        synchronized (list) {
            int countOfParts = 1 + random.nextInt(4);
            for (int i = 0; i < countOfParts; i++) {
                numberOfRandomPart = random.nextInt(PARTS_OF_ROBOTS.length);
                list.add(PARTS_OF_ROBOTS[numberOfRandomPart]);
            }
        }
    }

    public static List<PartsOfRobot> getPartsFromDumpEveryNight() {
        synchronized (list) {
            List<PartsOfRobot> partsForOneNight = new ArrayList<>();
            int countOfParts = 1 + random.nextInt(4);
            if (list.size() >= countOfParts) {
                for (int i = 0; i < countOfParts; i++) {
                    numberOfRandomPart = random.nextInt(list.size());
                    partsForOneNight.add(list.remove(numberOfRandomPart));
                }
            } else if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    numberOfRandomPart = random.nextInt(list.size());
                    partsForOneNight.add(list.remove(numberOfRandomPart));
                }
            }
            System.out.println(Thread.currentThread().getName() + " has taken: " + partsForOneNight);
            return partsForOneNight;
        }
    }

}
