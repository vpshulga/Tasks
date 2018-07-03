package by.vpshulga.lesson24;

import by.vpshulga.lesson24.dao.impl.PatientDAOImpl;
import by.vpshulga.lesson24.entities.Patient;
import by.vpshulga.lesson24.enums.Sex;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            PatientDAOImpl.getInstance().save(new Patient("stas", "mikhailov", 22, Sex.FEMALE,
                    "Minsk", "Gintovta", 83, 96, "bolit zhopa"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
