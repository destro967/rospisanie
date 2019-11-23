package ua.destro9670.springboot.models;

import javax.persistence.*;

@Entity(name = "lessons_list")
public class LessonList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cabinet_id")
    private Cabinets cabinet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private Teachers teacher;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Groups group;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id")
    private Subjects subject;

    public LessonList(long id, Cabinets cabinet, Teachers teacher, Groups group, Subjects subject) {
        this.id = id;
        this.cabinet = cabinet;
        this.teacher = teacher;
        this.group = group;
        this.subject = subject;
    }

    public LessonList(Cabinets cabinet, Teachers teacher, Groups group, Subjects subject) {
        this.cabinet = cabinet;
        this.teacher = teacher;
        this.group = group;
        this.subject = subject;
    }

    public LessonList() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cabinets getCabinet() {
        return cabinet;
    }

    public void setCabinet(Cabinets cabinet) {
        this.cabinet = cabinet;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ", \"cabinet\":\"" + cabinet.toString() + "\"" +
                ", \"teacher:\"\"" + teacher.toString() + "\""+
                ", \"group\":\"" + group.toString() + "\""+
                ", \"subject\":\"" + subject.toString() + "\""+
                '}';
    }
}
