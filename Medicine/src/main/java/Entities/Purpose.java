package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PURPOSE")
public class Purpose extends MappedSuperclass {

    @Id
    @Column(name = "purpose_id")
    private int id;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "purpose_id")
//    private Patient patient;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Medicament",
//            joinColumns = @JoinColumn(name = "medicament_id")
//    )
//    private List<Medicament> medicament;

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

}
