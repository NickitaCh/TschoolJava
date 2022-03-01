package Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medicament")
public class Medicament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicament_id")
    private int id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "purpose_medicament",
            joinColumns = @JoinColumn(name = "medicament_id"),
            inverseJoinColumns = @JoinColumn(name = "purpose_id")
    )
    private List<Purpose> purposeMedicament;

    @Column(name = "MEDICAMENT_NAME")
    private String name;

    @Column(name = "MEDICAMENT_TYPE")
    private String type;

    public Medicament() {
    }

    public Medicament(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void addPurposeToMedicament(Purpose purpose){
        if(purposeMedicament == null) {
            purposeMedicament = new ArrayList<>();
        }
        purposeMedicament.add(purpose);
    }

    public List<Purpose> getPurpose() {
        return purposeMedicament;
    }

    public void setPurpose(List<Purpose> purposeMedicament) {
        this.purposeMedicament = purposeMedicament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
