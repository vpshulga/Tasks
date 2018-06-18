package by.vpshulga.lesson15;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Task01.timer();
        String file = "src" + File.separator +  "by" + File.separator
                + "vpshulga" + File.separator + "lesson15" + File.separator + "ser.tmp";

        Computer comp = new Computer("Intel", 1000, 32);
        System.out.println(comp);
        SerializeUtils.serializeObject(comp, file);
        Computer deserializeComp = (Computer) SerializeUtils.deserializeObject(file);
        System.out.println(deserializeComp);
        Notebook note = new Notebook("Toshiba", 2000, 16, new Touchpad(10, 20), "Toshiba inc.");
        System.out.println(note);
        SerializeUtils.serializeObject(note, file);
        Notebook deserializeNote = (Notebook) SerializeUtils.deserializeObject(file);
        System.out.println(deserializeNote);
    }
}
