package by.vpshulga.lesson09;

import java.util.*;


class ListOfMarks {
    static List<Integer> createListOfMarks() {
        Random random = new Random();
        List<Integer> marks = new ArrayList<>(20);
        ListIterator<Integer> listIterator = marks.listIterator();
        int count = 0;
        while (count < 20) {
            listIterator.add(random.nextInt(11));
            count++;
        }
        return marks;
    }

    static List<Integer> deleteBadMarks(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() <= 2) {
                listIterator.remove();
            }
        }
        return list;
    }

    static Integer maxMark(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        Integer max = listIterator.next();

        while (listIterator.hasNext()) {
            Integer tmp = listIterator.next();
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

}
