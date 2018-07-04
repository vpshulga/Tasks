package by.vpshulga.lesson24.services.impl;

import by.vpshulga.lesson24.dao.PatientDAO;
import by.vpshulga.lesson24.dao.impl.PatientDAOImpl;
import by.vpshulga.lesson24.entities.Patient;
import by.vpshulga.lesson24.services.PatientService;
import java.io.Serializable;
import java.sql.SQLException;

public class PatientServiceImpl extends AbstractServiceImpl implements PatientService {
    private PatientDAO patientDAO = PatientDAOImpl.getInstance();

    @Override
    public Patient save(Patient patient) {
        try {
            startTransaction();
            patient = patientDAO.save(patient);
            commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patient;
    }

    @Override
    public Patient get(Serializable id) {
        Patient patient = new Patient();
        try {
            startTransaction();
            patient = patientDAO.get(id);
            commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patient;
    }

    @Override
    public void update(Patient patient) {
        try {
            startTransaction();
            patientDAO.update(patient);
            commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int delete(Serializable id) {
        int countDeletedRows = 0;
        try {
            startTransaction();
            countDeletedRows = patientDAO.delete(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countDeletedRows;
    }
}
