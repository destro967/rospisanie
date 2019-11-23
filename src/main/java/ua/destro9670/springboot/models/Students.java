package ua.destro9670.springboot.models;

import javax.persistence.*;

@Entity(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "group_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Groups group;

    public Students(long id, String studentName, Groups group) {
        this.id = id;
        this.studentName = studentName;
        this.group = group;
    }

    public Students(String studentName, Groups group) {
        this.studentName = studentName;
        this.group = group;
    }

    public Students() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\"=" + id +
                ", \"studentName\":\"" + studentName + '\"' +
                ", \"group\":\"" + group.toString() +
                "\"}";
    }
}
