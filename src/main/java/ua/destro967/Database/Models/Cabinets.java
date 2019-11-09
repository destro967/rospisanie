package ua.destro967.Database.Models;

import javax.persistence.*;

@Entity
@Table(name="cabinets")
public class Cabinets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "free")
    private String free;

/*    @OneToOne
    private LessonsList lessonsList;*/

    public Cabinets() {}

    public Cabinets(long id, String free) {
        this.id = id;
        this.free = free;
    }

    public void setId(long id) {
        this.id = id;
    }

   /* public void setLessonsList(LessonsList lessonsList) {
        this.lessonsList = lessonsList;
    }

    public LessonsList getLessonsList() {
        return lessonsList;
    }*/

    /*public Cabinets(String free, LessonsList lessonsList) {
        this.free = free;
        this.lessonsList = lessonsList;
    }*/

    /*public Cabinets(long id, String free, LessonsList lessonsList) {
        this.id = id;
        this.free = free;
        this.lessonsList = lessonsList;
    }*/

    public Cabinets(String free) {
        this.free = free;
    }

    public long getId() {
        return id;
    }

    public String getFree() {
        return free;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Cabinets{" +
                "id=" + id +
                ", free='" + free + '\'' +
       //         ", lessonsList=" + lessonsList +
                '}';
    }
}

