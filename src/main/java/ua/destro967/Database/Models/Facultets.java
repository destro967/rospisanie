package ua.destro967.Database.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "facultets")
public class Facultets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "facultet_name")
    private String facultetName;

    @OneToMany(mappedBy = "group_id", fetch = FetchType.LAZY)
    private List<Groups> groups ;



    public Facultets(long id, String facultetName, List<Groups> groups) {
        this.id = id;
        this.facultetName = facultetName;
        this.groups = groups;
    }

    public Facultets(String facultetName, List<Groups> groups) {
        this.facultetName = facultetName;
        this.groups = groups;
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

    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    public String getFacultetName() {
        return facultetName;
    }

    public List<Groups> getGroups() {
        return groups;
    }
}
