package ua.destro9670.springboot.models;

import javax.persistence.*;

@Entity(name = "facultets")
public class Facultets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "facultet_name")
    private String facultetName;

    public Facultets(long id, String facultetName) {
        this.id = id;
        this.facultetName = facultetName;
    }

    public Facultets(String facultetName) {
        this.facultetName = facultetName;
    }

    public Facultets() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFacultetName() {
        return facultetName;
    }

    public void setFacultetName(String facultetName) {
        this.facultetName = facultetName;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\"=" + id +
                ",\n\"facultetName\"=\"" + facultetName + '\"' +
                '}';
    }
}
