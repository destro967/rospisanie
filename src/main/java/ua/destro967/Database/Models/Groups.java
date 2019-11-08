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

    public Groups(String worckdays, LessonsList lessonsList, Facultets facultet, Collection<Students> students) {
        this.worckdays = worckdays;
        this.lessonsList = lessonsList;
        this.facultet = facultet;
        this.students = students;
    }

    public Groups(long id, String worckdays, LessonsList lessonsList, Facultets facultet, Collection<Students> students) {
        this.id = id;
        this.worckdays = worckdays;
        this.lessonsList = lessonsList;
        this.facultet = facultet;
        this.students = students;
    }

    public Groups(String worckdays, Facultets facultet) {
        this.worckdays = worckdays;
        this.facultet = facultet;
    }

    public Groups() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setWorckdays(String worckdays) {
        this.worckdays = worckdays;
    }

    public void setLessonsList(LessonsList lessonsList) {
        this.lessonsList = lessonsList;
    }

    public void setFacultet(Facultets facultet) {
        this.facultet = facultet;
    }

    public void setStudents(Collection<Students> students) {
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public String getWorckdays() {
        return worckdays;
    }

    public LessonsList getLessonsList() {
        return lessonsList;
    }



    public Facultets getFacultet() {
        return facultet;
    }

    public Collection<Students> getStudents() {
        return students;
    }
}
