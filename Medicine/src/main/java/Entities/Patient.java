package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PATIENT")
public class Patient extends MappedSuperclass {

    @Id
    @Column(name = "patient_id")
    private int id;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
//    private List<Purpose> patientPurpose;

    @Column(name = "PATIENT_NAME")
    private String name;

    @Column(name = "PATIENT_DIAGNOSIS")
    private String diagnosis;

    @Column(name = "PATIENT_INSURANCE")
    private int insurance;

    @Column(name = "PATIENT_DOCTOR")
    private String doctor;

    @Column(name = "STATUS")
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
}
