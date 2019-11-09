package ua.destro967.Database.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "subjectscol")
    private String subjectscol;

    @Column(name = "subject_name")
    private String subjectName;

    @ManyToMany
    @JoinTable(name = "teachershassubjects",
                joinColumns = @JoinColumn(name = "subject_id"),
                inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teachers> teachers;

    public Subjects(String subjectscol, String subjectName, LessonsList lessonsList, List<Teachers> teachers) {
        this.subjectscol = subjectscol;
        this.subjectName = subjectName;
        this.teachers = teachers;
    }

    public Subjects(long id, String subjectscol, String subjectName, LessonsList lessonsList, List<Teachers> teachers) {
        this.subjectscol = subjectscol;
        this.subjectName = subjectName;
        this.teachers = teachers;
    }

    public Subjects(String subjectscol, List<Teachers> teachers) {
        this.subjectscol = subjectscol;
        this.teachers = teachers;
    }

    public Subjects(long id, String subjectscol) {
        this.id = id;
        this.subjectscol = subjectscol;
    }

    public Subjects(String subjectscol) {
        this.subjectscol = subjectscol;
    }

    public Subjects() {
    }

    public void setTeachers(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public List<Teachers> getTeachers() {
        return teachers;
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

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", subjectscol='" + subjectscol + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
