package by.vpshulga.lesson24.entities;

import by.vpshulga.lesson24.enums.Educations;
import by.vpshulga.lesson24.enums.Sex;

public class RegistryWorker extends MedWorker {
    public RegistryWorker(String firstName, String secondName, int age, Sex sex,
                          Educations education, int experience) {
        super(firstName, secondName, age, sex, education, experience);
    }
}
