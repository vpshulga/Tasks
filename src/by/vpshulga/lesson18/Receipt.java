package by.vpshulga.lesson18;

import java.util.Date;
import java.util.List;

public class Receipt {
    private int id;
    private Date date;
    private List<Item> list;
    private double totalSum;
    private double change;

    Receipt(int id, Date date, List<Item> list, double totalSum, double change) {
        this.id = id;
        this.date = date;
        this.list = list;
        this.totalSum = totalSum;
        this.change = change;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("__________________________________________________\n")
                .append("|Receipt id: ").append(id).append("|\n")
                .append("|Date: ").append(date).append("|\n");
        for (Item item : list) {
            sb.append("|").append(item).append("|\n");
        }
        sb.append("|Total Sum = ").append(totalSum).append("|\n")
                .append("|Change = ").append(change).append("|\n")
                .append("__________________________________________________");
        return sb.toString();
    }
}
