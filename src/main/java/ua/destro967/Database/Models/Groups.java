package ua.destro967.Database.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "groups")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "worck_days")
    private String worckdays;

    @OneToOne(cascade = CascadeType.ALL)
    private LessonsList lessonsList;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Facultets facultet;

    public Groups(long id, String worckdays, Facultets facultet) {
        this.id = id;
        this.worckdays = worckdays;
        this.facultet = facultet;
    }

    public Groups(String worckdays, LessonsList lessonsList, Facultets facultet, Collection<Students> students) {
        this.worckdays = worckdays;
        this.lessonsList = lessonsList;
        this.facultet = facultet;
    }

    public Groups(long id, String worckdays, LessonsList lessonsList, Facultets facultet, Collection<Students> students) {
        this.id = id;
        this.worckdays = worckdays;
        this.lessonsList = lessonsList;
        this.facultet = facultet;
    }

    public Groups(String worckdays, Facultets facultet) {
        this.worckdays = worckdays;
        this.facultet = facultet;
    }

    public Groups() {}

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


    @Override
    public String toString() {
        return "Groups{" +
                "id=" + id +
                ", worckdays='" + worckdays + '\'' +
                ", lessonsList=" + lessonsList +
                ", facultet=" + facultet +
                '}';
    }
}
