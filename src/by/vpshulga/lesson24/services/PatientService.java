package by.vpshulga.lesson24.services;

import by.vpshulga.lesson24.entities.Patient;
import java.io.Serializable;

public interface PatientService {
    Patient save(Patient patient);
    Patient get(Serializable id);
    void update(Patient patient);
    int delete(Serializable id);
}
