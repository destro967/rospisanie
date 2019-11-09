package ua.destro967.Database.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "facultets")
public class Facultets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "facultet_name")
    private String facultetName;


    public Facultets(long id, String facultetName, List<Groups> groups) {
        this.id = id;
        this.facultetName = facultetName;
    }

    public Facultets(String facultetName, List<Groups> groups) {
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

    public void setFacultetName(String facultetName) {
        this.facultetName = facultetName;
    }


    public String getFacultetName() {
        return facultetName;
    }


    @Override
    public String toString() {
        return "Facultets{" +
                "id=" + id +
                ", facultetName='" + facultetName + '\'' +
                '}';
    }
}
