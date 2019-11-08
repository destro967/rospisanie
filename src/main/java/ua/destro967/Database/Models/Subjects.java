package ua.destro967.Database.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "subjectscol")
    private String subjectscol;

    @ManyToMany
    @JoinTable(name = "teachershassubjects",
                joinColumns = @JoinColumn(name = "subject_id"),
                inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teachers> teachers;

    public Subjects(long id, String subjectscol) {
        this.id = id;
        this.subjectscol = subjectscol;
    }

    public Subjects(String subjectscol) {
        this.subjectscol = subjectscol;
    }

    public Subjects() {
    }

    public long getId() {
        return id;
    }

    public String getSubjectscol() {
        return subjectscol;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSubjectscol(String subjectscol) {
        this.subjectscol = subjectscol;
    }
}
