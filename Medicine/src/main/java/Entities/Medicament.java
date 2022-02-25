package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "medicament")
public class Medicament extends MappedSuperclass{

    @Id
    @Column(name = "medicament_id")
    private int id;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Purpose",
//            joinColumns = @JoinColumn(name = "purpose_id")
//    )
//    private List<Purpose> purpose;

    @Column(name = "MEDICAMENT_NAME")
    private String name;

    @Column(name = "MEDICAMENT_TYPE")
    private String type;

}
