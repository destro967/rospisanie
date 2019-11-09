package ua.destro967.Database.Models;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;

    @ManyToOne(optional = false , cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Groups group;

    @Column(name ="student_name")
    private String studentName;

    public Students(long id, Groups group, String studentName) {
        this.id = id;
        this.group = group;
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public Students(long id, Groups group) {
        this.id = id;
        this.group = group;
    }

    public Students(Groups group) {
        this.group = group;
    }

    public Students() {
    }

    public long getId() {
        return id;
    }

    public Groups getGroup() {
        return group;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", group=" + group +
                '}';
    }
}
