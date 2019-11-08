package ua.destro967.Database.Models;

import javax.persistence.*;

@Entity
@Table(name = "lessonsList")
public class LessonsList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToOne
    @JoinColumn(name ="cabinet_id")
    private Cabinets cabinet;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teachers teacher;

    @OneToOne
    @JoinColumn(name = "group_id")
    private Groups group;

    @OneToOne
    @JoinColumn(name = "subject_id")
    private Subjects subject;

    public LessonsList() {
    }

    public LessonsList(Cabinets cabinet, Teachers teacher, Groups group, Subjects subject) {
        this.cabinet = cabinet;
        this.teacher = teacher;
        this.group = group;
        this.subject = subject;
    }

    public LessonsList(long id, Cabinets cabinet, Teachers teacher, Groups group, Subjects subject) {
        this.id = id;
        this.cabinet = cabinet;
        this.teacher = teacher;
        this.group = group;
        this.subject = subject;
    }

    public LessonsList(Cabinets cabinet, Teachers teacher, Groups group) {
        this.cabinet = cabinet;
        this.teacher = teacher;
        this.group = group;
    }

    public LessonsList(long id , Cabinets cabinet, Teachers teacher, Groups group) {
        this.id = id;
        this.cabinet = cabinet;
        this.teacher = teacher;
        this.group = group;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCabinet(Cabinets cabinet) {
        this.cabinet = cabinet;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public Cabinets getCabinet() {
        return cabinet;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public Groups getGroup() {
        return group;
    }


}
