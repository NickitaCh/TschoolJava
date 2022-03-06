package com.tschool.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PATIENT")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    private List<Purpose> patientPurpose;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    private List<Event> patientEvent;

    @Column(name = "PATIENT_NAME")
    private String name;

    @Column(name = "PATIENT_DIAGNOSIS")
    private String diagnosis;

    @Column(name = "PATIENT_INSURANCE")
    private int insurance;

    @Column(name = "PATIENT_DOCTOR")
    private String doctor;

    @Column(name = "PATIENT_STATUS")
    private String status;

    public Patient() {
    }

    public Patient(String name, String diagnosis, int insurance, String doctor, String status) {
        this.name = name;
        this.diagnosis = diagnosis;
        this.insurance = insurance;
        this.doctor = doctor;
        this.status = status;
    }

    public void addPurposeToPatient(Purpose purpose) {
        if(patientPurpose == null) {
            patientPurpose = new ArrayList<>();
        }
        patientPurpose.add(purpose);
        purpose.setPatient(this);
    }

    public void addEventToPatient(Event event) {
        if(patientEvent == null) {
            patientEvent = new ArrayList<>();
        }
        patientEvent.add(event);
        event.setPatient(this);
    }



    public List<Event> getPatientEvent() {
        return patientEvent;
    }

    public void setPatientEvent(List<Event> patientEvent) {
        this.patientEvent = patientEvent;
    }

    public List<Purpose> getPatientPurpose() {
        return patientPurpose;
    }

    public void setPatientPurpose(List<Purpose> patientPurpose) {
        this.patientPurpose = patientPurpose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
