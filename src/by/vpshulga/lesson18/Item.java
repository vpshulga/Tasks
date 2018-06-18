package by.vpshulga.lesson18;

public class Item {
    private int id;
    private static int counter;
    private Good good;
    private int quantity;
    private double cost;
    private double discount;

    Item(Good good, int quantity, double cost, double discount) {
        id = ++counter;
        this.good = good;
        this.quantity = quantity;
        this.cost = cost;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return good + "---" + " quantity: " + quantity + " cost = " + cost + " discount = " + discount;
    }
}
