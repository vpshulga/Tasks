package by.vpshulga.lesson09;

import java.util.*;

class ListOfPupils {
    static void printReverseListOfPupilsWithCheats() {
        List<String> pupils = new ArrayList<>();
        int i = 1;
        while (i <= 20) {
            pupils.add("Pupil" + i);
            i++;
        }
        Collections.reverse(pupils);
        for (String pupil : pupils) {
            System.out.print(pupil + " ");
        }
        System.out.println();
    }

    static void printReverseListOfPupils() {
        List<String> pupils = new ArrayList<>();
        int i = 1;
        while (i <= 20) {
            pupils.add("Pupil" + i);
            i++;
        }

        for (i = pupils.size() - 1; i >= 0; i--) {
            System.out.print(pupils.get(i) + " ");
        }
        System.out.println();
    }
}
