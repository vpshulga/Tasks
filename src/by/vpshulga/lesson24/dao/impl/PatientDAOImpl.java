package by.vpshulga.lesson24.dao.impl;

import by.vpshulga.lesson24.dao.PatientDAO;
import by.vpshulga.lesson24.db.ConnectorManager;
import by.vpshulga.lesson24.entities.Patient;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDAOImpl implements PatientDAO {

    private static volatile PatientDAO INSTANCE = null;
    private static final String savePatientQuery = "INSERT INTO patients (first_name, last_name, age, sex, address, complaint) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String saveAddressQuery = "INSERT INTO addresses (city, street, house, apartament) VALUES (?, ?, ?, ?)";
    private static final String updateAddressQuery = "UPDATE addresses SET city=?, street=?, house=?, apartament=? WHERE id=?";
    private static final String getAddressQuery = "SELECT * FROM addresses WHERE id=?";
    private static final String deleteAddressQuery = "DELETE FROM addresses WHERE id=?";

    private PreparedStatement psAddressSave;
    private PreparedStatement psPatientSave;
    private PreparedStatement psUpdate;
    private PreparedStatement psGet;
    private PreparedStatement psDelete;

    {
        try {
            psAddressSave = ConnectorManager.getConnection().prepareStatement(saveAddressQuery, Statement.RETURN_GENERATED_KEYS);
            psPatientSave = ConnectorManager.getConnection().prepareStatement(savePatientQuery, Statement.RETURN_GENERATED_KEYS);
            psUpdate = ConnectorManager.getConnection().prepareStatement(updateAddressQuery);
            psGet = ConnectorManager.getConnection().prepareStatement(getAddressQuery);
            psDelete = ConnectorManager.getConnection().prepareStatement(deleteAddressQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PatientDAO getInstance() {
        PatientDAO patientDAO = INSTANCE;
        if (patientDAO == null) {
            synchronized (PatientDAOImpl.class) {
                patientDAO = INSTANCE;
                if (patientDAO == null) {
                    INSTANCE = patientDAO = new PatientDAOImpl();
                }
            }
        }

        return patientDAO;
    }


    @Override
    public Patient save(Patient patient) throws SQLException {
        psAddressSave.setString(1, patient.getCity());
        psAddressSave.setString(2, patient.getStreet());
        psAddressSave.setInt(3, patient.getHouse());
        psAddressSave.setInt(4, patient.getApartment());
        psAddressSave.executeUpdate();
        ResultSet rs = psAddressSave.getGeneratedKeys();
        psPatientSave.setString(1, patient.getFirstName());
        psPatientSave.setString(2, patient.getLastName());
        psPatientSave.setInt(3, patient.getAge());
        psPatientSave.setString(4, patient.getSex().toString());
        if (rs.next()) {
            psPatientSave.setInt(5, rs.getInt(1));
        }
        psPatientSave.setString(6, patient.getComplaint());
        psPatientSave.executeUpdate();
        return patient;
    }

    @Override
    public Patient get(Serializable id) throws SQLException {
        return null;
    }

    @Override
    public void update(Patient patient) throws SQLException {

    }

    @Override
    public int delete(Serializable id) throws SQLException {
        return 0;
    }
}
