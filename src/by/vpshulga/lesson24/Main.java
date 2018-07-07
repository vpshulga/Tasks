package by.vpshulga.lesson24;

import by.vpshulga.lesson24.entities.Patient;
import by.vpshulga.lesson24.enums.Sex;
import by.vpshulga.lesson24.services.impl.PatientServiceImpl;

public class Main {
    public static void main(String[] args) {
        PatientServiceImpl psi = new PatientServiceImpl();
        Patient savedPatient = new Patient("Vladimir", "Putin", 65, Sex.UNDEFINED,
                "Moscow", "Lubianka", 1, 1, "Ustal");
        Patient newPatient = psi.save(savedPatient);
        System.out.println(psi.get(newPatient.getId()));
        newPatient.setFirstName("Alexander");
        psi.update(newPatient);
        psi.delete(58);
    }
}
