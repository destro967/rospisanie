package ua.destro967.Database.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "groups")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "worckdays")
    private String worckdays;

    @OneToOne
    private LessonsList lessonsList;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Facultets facultet;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private Collection<Students> students;


    public Groups(long id, String worckdays, Facultets facultet) {
        this.id = id;
        this.worckdays = worckdays;
        this.facultet = facultet;
    }

    public Groups(String worckdays,Facultets facultet) {
        this.worckdays = worckdays;
        this.facultet = facultet;
    }

    public Groups() {
    }


}
