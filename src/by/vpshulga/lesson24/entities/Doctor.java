package by.vpshulga.lesson24.entities;

import by.vpshulga.lesson24.enums.Sex;
import by.vpshulga.lesson24.enums.Specialties;

public class Doctor extends Person {
    private Specialties spetialty;

    public Doctor(String firstName, String secondName, int age, Sex sex, Specialties spetialty) {
        super(firstName, secondName, age, sex);
        this.spetialty = spetialty;
    }

    public Specialties getSpetialty() {
        return spetialty;
    }

    public void setSpetialty(Specialties spetialty) {
        this.spetialty = spetialty;
    }
}
