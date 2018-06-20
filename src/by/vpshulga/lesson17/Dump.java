package by.vpshulga.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dump {
    private static final List<PartsOfRobot> PARTS_ON_DUMP = new ArrayList<>();
    private static final PartsOfRobot[] PARTS_OF_ROBOTS = PartsOfRobot.values();
    private static Random random = new Random();
    private static int numberOfRandomPart;

    Dump() {
        fillList();
    }

    public List<PartsOfRobot> getList() {
        return PARTS_ON_DUMP;
    }

    private static void fillList() {
        for (int i = 0; i < 20; i++) {
            numberOfRandomPart = random.nextInt(PARTS_OF_ROBOTS.length);
            PARTS_ON_DUMP.add(PARTS_OF_ROBOTS[numberOfRandomPart]);
        }
    }

    public static void generateParts() {
        synchronized (PARTS_ON_DUMP) {
            int countOfParts = 1 + random.nextInt(4);
            for (int i = 0; i < countOfParts; i++) {
                numberOfRandomPart = random.nextInt(PARTS_OF_ROBOTS.length);
                PARTS_ON_DUMP.add(PARTS_OF_ROBOTS[numberOfRandomPart]);
            }
        }
    }

    public static List<PartsOfRobot> getPartsFromDumpEveryNight() {
        synchronized (PARTS_ON_DUMP) {
            List<PartsOfRobot> partsForOneNight = new ArrayList<>();
            int countOfParts = 1 + random.nextInt(4);
            if (PARTS_ON_DUMP.size() >= countOfParts) {
                for (int i = 0; i < countOfParts; i++) {
                    numberOfRandomPart = random.nextInt(PARTS_ON_DUMP.size());
                    partsForOneNight.add(PARTS_ON_DUMP.remove(numberOfRandomPart));
                }
            } else if (PARTS_ON_DUMP.size() > 0) {
                for (int i = 0; i < PARTS_ON_DUMP.size(); i++) {
                    numberOfRandomPart = random.nextInt(PARTS_ON_DUMP.size());
                    partsForOneNight.add(PARTS_ON_DUMP.remove(numberOfRandomPart));
                }
            }
            System.out.println(Thread.currentThread().getName() + " has taken: " + partsForOneNight);
            return partsForOneNight;
        }
    }

}
