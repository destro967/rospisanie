package ua.destro9670.springboot.models;

import javax.persistence.*;

@Entity(name = "cabinets")
public class Cabinets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "free")
    private String free;

    public Cabinets(long id, String free) {
        this.id = id;
        this.free = free;
    }

    public Cabinets(String free) {
        this.free = free;
    }

    public Cabinets() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ",\n\"free\":\"" + free + "\"" +
                '}';
    }
}
