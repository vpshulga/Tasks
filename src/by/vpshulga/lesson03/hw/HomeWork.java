package by.vpshulga.lesson03.hw;

public class HomeWork {
    public static void main(String[] args) {
        MoveElementsToTheRight1.moveElements();
        RemoveRepeatsFromArray2.removeRepeats();
        System.out.println("");
        MergeArrays3.merge();
        System.out.println("");
        for (int i = 0; i < LinearizeArrays4.linearize().length; i++) {
            System.out.print(LinearizeArrays4.linearize()[i] + " ");
        }
    }
}
