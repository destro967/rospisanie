package Database.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Groups")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "worckdays")
    private String worckdays;

    @OneToOne
    private LessonsList lessonsList;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private Facultets facultet;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private List<Students> students;


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
