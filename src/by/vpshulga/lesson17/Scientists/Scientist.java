package by.vpshulga.lesson17.Scientists;

import by.vpshulga.lesson17.Dump;
import by.vpshulga.lesson17.PartsOfRobot;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Scientist {
    private int countOfCompleteRobots;
    private Map<PartsOfRobot, Integer> partsMap;
    private String name;

    public Scientist(String name) {
        this.name = name;
        fillMap();
    }

    public String getName() {
        return name;
    }

    public int getCountOfCompleteRobots() {
        return countOfCompleteRobots;
    }

    public Map<PartsOfRobot, Integer> getPartsMap() {
        return partsMap;
    }

    private void fillMap() {
        partsMap = new HashMap<>();
        for (PartsOfRobot part : PartsOfRobot.values()) {
            partsMap.put(part, 0);
        }
    }

    public void addPartsToMap() {
        List<PartsOfRobot> parts = Dump.getPartsFromDumpEveryNight();
        for (PartsOfRobot part : parts) {
            int currentValue = partsMap.get(part);
            partsMap.put(part, currentValue + 1);
        }
    }

    public void checkToCompleteRobot() {
        if (partsMap.values().stream()
                .filter(i -> i > 0)
                .collect(Collectors.toList()).size() == partsMap.values().size()) {
            System.out.println("ROBOT WAS MADE BY " + this.getName() + "!!!!!!");
            countOfCompleteRobots++;
            for (PartsOfRobot part : partsMap.keySet()) {
                int currentValue = partsMap.get(part);
                partsMap.put(part, currentValue - 1);
            }
        }
    }
}
