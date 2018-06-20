package by.vpshulga.lesson18;

import java.util.Date;
import java.util.List;

public class Receipt {
    private int id;
    private static int counter;
    private Date date;
    private Customer customer;
    private List<Item> items;
    private double totalSum;
    private double resultSum;
    private double paidSum;
    private double change;

    Receipt(Date date, Customer customer, List<Item> items, double totalSum, double resultSum, double paidSum , double change) {
        id = ++counter;
        this.customer = customer;
        this.date = date;
        this.items = items;
        this.totalSum = totalSum;
        this.resultSum = resultSum;
        this.paidSum = paidSum;
        this.change = change;
    }

    @Override
    public String toString() {
        double totalDiscount = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("_____________________________________________________________________________________\n")
                .append("|Receipt id: ").append(id).append("\n")
                .append("|Customer id: ").append(customer.getId()).append("\n")
                .append("|Date: ").append(date).append("\n");
        for (Item item : items) {
            sb.append("|").append(item).append("|\n");
            totalDiscount += item.getDiscountSum();
        }
        sb.append(String.format("|Total Sum = %-10.2f\n", totalSum))
                .append(String.format("|Your discount = %-10.2f\n", totalDiscount))
                .append(String.format("|Result Sum = %-10.2f\n", resultSum))
                .append(String.format("|You paid = %-10.2f\n", paidSum))
                .append(String.format("|Change = %-10.2f\n", change))
                .append("_____________________________________________________________________________________\n");
        return sb.toString();
    }
}
