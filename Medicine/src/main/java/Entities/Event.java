package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "EVENT")
public class Event extends  MappedSuperclass{

    @Id
    @Column(name = "event_id")
    private int id;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Patient",
//            joinColumns = @JoinColumn(name = "patient_id")
//    )
//    private List<Patient> patient;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "Purpose",
//            joinColumns = @JoinColumn(name = "purpose_id")
//    )
//    private List<Purpose> purposes;

    @Column(name = "STATUS")
    private int status;

    @Column(name = "TYPE")
    private String type;


    public Event() {

    }
}
