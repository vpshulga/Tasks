package by.vpshulga.lesson18;

public class Item {
    private static int id;
    private Good good;
    private int quantity;
    private double cost;
    private double discount;
    private double discountSum;

    double getDiscountSum() {
        return discountSum;
    }

    Item(Good good, int quantity, double cost, double discount) {
        this.good = good;
        this.quantity = quantity;
        this.cost = cost;
        this.discount = discount;
    }

    public static void setId(int newId) {
        id = newId;
    }

    @Override
    public String toString() {
        discountSum = cost * discount * quantity;
        return String.format("%2d. %-16s quantity: %-2d cost = %4.2f  discount = %4.2f  discountAmount = %4.2f",
                ++id, good, quantity, cost, discount, discountSum);

    }
}
