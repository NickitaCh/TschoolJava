package DAO;

import Entities.Patient;

public class PatientService {

    private PatientDAO patientDAO = new PatientDAO();

    public PatientService() {
    }

    public Patient findUser(int id) {
        return patientDAO.findById(id);
    }

    public void savePatient(Patient patient) {
        patientDAO.save(patient);
    }

    public void deleteUser(Patient patient) {
        patientDAO.delete(patient);
    }

    public void updateUser(Patient patient) {
        patientDAO.update(patient);
    }


}