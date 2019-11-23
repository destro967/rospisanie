package ua.destro9670.springboot.models;

import javax.persistence.*;
import java.util.List;

@Entity(name = "teachers")
public class Teachers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="teacher_name")
    private String teacherName;

    @ManyToMany
    @JoinTable(
            name = "subjects",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
            )
    private List<Subjects> subjects;

    public Teachers(long id, String teacherName) {
        this.id = id;
        this.teacherName = teacherName;
    }

    public Teachers(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teachers() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\"=" + id +
                ",\n\"teacherName\"=\"" + teacherName + "\"" +
                '}';
    }
}
