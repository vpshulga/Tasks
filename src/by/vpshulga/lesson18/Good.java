package by.vpshulga.lesson18;

public class Good {
    private int id;
    private static int counter;
    private String name;
    private double price;
    private double discount;

    Good(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        id = ++counter;
    }


    public String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return name + "(id:" + id + ")";
    }
}
