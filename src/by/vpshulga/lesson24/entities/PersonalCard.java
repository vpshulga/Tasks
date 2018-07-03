package by.vpshulga.lesson24.entities;

import java.util.List;

public class PersonalCard {
    private Patient patient;
    private List<String> complaints;
    private List<String> diadnoses;
    private List<String> appointments;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<String> getComplaints() {
        return complaints;
    }

    public void setComplaints(List<String> complaints) {
        this.complaints = complaints;
    }

    public List<String> getDiadnoses() {
        return diadnoses;
    }

    public void setDiadnoses(List<String> diadnoses) {
        this.diadnoses = diadnoses;
    }

    public List<String> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<String> appointments) {
        this.appointments = appointments;
    }
}
