package fr.iut.rm;

import fr.iut.rm.persistence.domain.Room;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="accessEvent")
public class AccessEvent {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String nomPers;

    @Column(nullable = false)
    private String evenement;

    @Column(nullable = false)
    private Date dataHeure;

    @ManyToOne
    Room room;
}
