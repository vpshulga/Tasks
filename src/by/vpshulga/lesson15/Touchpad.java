package by.vpshulga.lesson15;

import java.io.Serializable;

public class Touchpad implements Serializable {
    private int width;
    private int height;

    public Touchpad(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Touchpad size: " + height + "x" + width + "mm.";
    }
}
