package by.vpshulga.lesson15;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    private Touchpad touchpad;
    private transient String manufacturer;

    Notebook(String model, int hddCapacity, int ram, Touchpad touchpad, String manufacturer) {
        super(model, hddCapacity, ram);
        this.touchpad = touchpad;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " " + touchpad + " " + "Manufactorer: " + manufacturer;
    }
}
