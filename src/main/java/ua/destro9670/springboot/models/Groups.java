package ua.destro9670.springboot.models;


import javax.persistence.*;

@Entity(name = "groups")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "work_days")
    private String workDays;

    @Column(name = "facultet_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Facultets facultet;

    public Groups(long id, String workDays, Facultets facultet) {
        this.id = id;
        this.workDays = workDays;
        this.facultet = facultet;
    }

    public Groups(String workDays, Facultets facultet) {
        this.workDays = workDays;
        this.facultet = facultet;
    }

    public Groups() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWorkDays() {
        return workDays;
    }

    public void setWorkDays(String workDays) {
        this.workDays = workDays;
    }

    public Facultets getFacultet() {
        return facultet;
    }

    public void setFacultet(Facultets facultet) {
        this.facultet = facultet;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\"=" + id +
                ", \"workDays\":\"" + workDays + '\"' +
                ", \"facultet\":\"" + facultet.toString() +
                "\"}";
    }
}
