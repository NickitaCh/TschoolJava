package Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PURPOSE")
public class Purpose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purpose_id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private Patient patient;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "purpose_medicament",
            joinColumns = @JoinColumn(name = "purpose_id"),
            inverseJoinColumns = @JoinColumn(name = "medicament_id")
    )
    private List<Medicament> medicamentPurpose;

    @Column(name = "SUPPLIES")
    private String supplies;

    @Column(name = "TIME_PATTERN")
    private String timePattern;

    @Column(name = "DATE")
    private String date;

    @Column(name = "DOZE")
    private String doze;

    public Purpose() {
    }

    public Purpose(String supplies, String timePattern, String date, String doze) {
        this.supplies = supplies;
        this.timePattern = timePattern;
        this.date = date;
        this.doze = doze;
    }

    public void addMedicamentToPurpose(Medicament medicament) {
        if(medicamentPurpose == null) {
            medicamentPurpose = new ArrayList<>();
        }
        medicamentPurpose.add(medicament);
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Medicament> getMedicamentPurpose() {
        return medicamentPurpose;
    }

    public void setMedicamentPurpose(List<Medicament> medicamentPurpose) {
        this.medicamentPurpose = medicamentPurpose;
    }

    public String getTimePattern() {
        return timePattern;
    }

    public void setTimePattern(String timePattern) {
        this.timePattern = timePattern;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoze() {
        return doze;
    }

    public void setDoze(String doze) {
        this.doze = doze;
    }
}
