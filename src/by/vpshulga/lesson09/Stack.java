package by.vpshulga.lesson09;

import java.util.*;

public class Stack {
    private ArrayList<Integer> stack;
    private int size;

    Stack(int size) {
        stack = new ArrayList<>();
        this.size = size;
        fillStack();

    }

    public ArrayList<Integer> getStack() {
        return stack;
    }

    private int getSize() {
        return size;
    }

    Integer push(Integer element) {
        if (stack.size() >= getSize()) {
            System.out.println("Cтек переполнен");
        } else {
            stack.add(element);
        }
        return element;
    }

    Integer pop() {
        int index = 0;
        Integer printedElement = stack.get(stack.size() - 1);
        if (stack.size() > 0) {
            index = stack.size() - 1;
        }
        stack.remove(index);
        return printedElement;

    }

    private void fillStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вести число Integer:");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        if (str.replaceAll("-", "").length() <= getSize()) {
            for (int i = 1; i <= chars.length; i++) {
                if (chars[i - 1] == '-' && Character.isDigit(chars[i])) {
                    push(-(Character.getNumericValue(chars[i])));
                    i++;
                } else if (Character.isDigit(chars[i - 1])) {
                    push(Character.getNumericValue(chars[i - 1]));
                }
            }
        } else {
            System.out.println("Слишком большое число, стек переполнен");
        }
    }

    void printStack() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(pop());
        }
        System.out.println();
    }
}
