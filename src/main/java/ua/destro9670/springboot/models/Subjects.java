package ua.destro9670.springboot.models;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity(name = "subjects")
public class Subjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "subjectcol")
    private String subjectCol;

    @Column(name = "subject_name")
    private String subjectName;

    @ManyToMany(mappedBy = "subjects")
    private List<Teachers> teachers;

    public Subjects(long id, String subjectCol, String subjectName) {
        this.id = id;
        this.subjectCol = subjectCol;
        this.subjectName = subjectName;
    }

    public Subjects(String subjectCol, String subjectName) {
        this.subjectCol = subjectCol;
        this.subjectName = subjectName;
    }

    public Subjects() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubjectCol() {
        return subjectCol;
    }

    public void setSubjectCol(String subjectCol) {
        this.subjectCol = subjectCol;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\"=" + id +
                ",\n\"subjectCol\"=\"" + subjectCol + '\"' +
                ",\n\"subjectName\"=\"" + subjectName + '\"' +
                '}';
    }
}
