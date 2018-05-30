package by.vpshulga.lesson09;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 01");
        List<Integer> list = ListOfMarks.createListOfMarks();
        System.out.println(list);
        ListOfMarks.deleteBadMarks(list);
        System.out.println(list);
        System.out.println("---------------------------------");

        System.out.println("Task02");
        System.out.println(ListOfMarks.maxMark(list));
        System.out.println("---------------------------------");

        System.out.println("Task03");
        ListOfPupils.printReverseListOfPupilsWithCheats();
        ListOfPupils.printReverseListOfPupils();
        System.out.println("---------------------------------");

        System.out.println("Task04");
        Stack stack = new Stack(10);
        stack.printStack();
        System.out.println("---------------------------------");

        System.out.println("Task05");
        Set<Integer> first = SetUtils.fillSet(8);
        Set<Integer> second = SetUtils.fillSet(5);
        System.out.println(first);
        System.out.println(second);
        System.out.println(SetUtils.mergeSets(first, second));
        Set<Integer> third = SetUtils.fillSet(8);
        Set<Integer> fourth = SetUtils.fillSet(5);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(SetUtils.intersectionSet(third, fourth));
        System.out.println("---------------------------------");

        System.out.println("Task06");
        FrequencyDictionary dictionary = new FrequencyDictionary("один, два, три один два три. один два три");
        dictionary.printFrequency();
        System.out.println("---------------------------------");

        System.out.println("Task07");
        List<Integer> list1 = PositiveFirstNegativeLast.fillList(20);
        System.out.println(list1);
        System.out.println(PositiveFirstNegativeLast.changeNumbers(list1));
        System.out.println("---------------------------------");

    }
}
