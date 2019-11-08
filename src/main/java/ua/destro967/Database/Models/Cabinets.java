package ua.destro967.Database.Models;

import javax.persistence.*;

@Entity
@Table(name="cabinets")
public class Cabinets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "free")
    private String free;

    @OneToOne
    private LessonsList lessonsList;

    public Cabinets() {}

    public Cabinets(int id, String free) {
        this.id = id;
        this.free = free;
    }

    public Cabinets(String free) {
        this.free = free;
    }

    public int getId() {
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
}
