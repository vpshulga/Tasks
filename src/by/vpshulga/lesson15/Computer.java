package by.vpshulga.lesson15;

import java.io.*;

public class Computer implements Serializable{
    private String model;
    private int hddCapacity;
    private int ram;

    Computer(String model, int hddCapacity, int ram) {
        this.model = model;
        this.hddCapacity = hddCapacity;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer model: " + model + ", HDD Capacity: " + hddCapacity + "Gb, " + "RAM: " + ram + "Gb.";
    }
}
