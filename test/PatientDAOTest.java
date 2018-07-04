import by.vpshulga.lesson24.dao.PatientDAO;
import by.vpshulga.lesson24.dao.impl.PatientDAOImpl;
import by.vpshulga.lesson24.entities.Patient;
import by.vpshulga.lesson24.enums.Sex;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Test;

public class PatientDAOTest {
    private PatientDAO patientDAO = PatientDAOImpl.getInstance();

    @Test
    public void fullTest() throws SQLException {
        Patient patient = new Patient("a", "b", 10, Sex.MALE, "Minsk", "Surganova", 6, 211,
                "new complaint");
        Patient newPatient = patientDAO.save(patient);
        Assert.assertSame(newPatient, patient);

        newPatient.setFirstName("Valera");
        patientDAO.update(newPatient);

        System.out.println(newPatient.getId());

        System.out.println(newPatient);
        Assert.assertEquals("Bad method update", "Valera", newPatient.getFirstName());


        int rows = patientDAO.delete(newPatient.getId());
        Assert.assertNotSame("Bad delete method", 0, rows);

    }

}
