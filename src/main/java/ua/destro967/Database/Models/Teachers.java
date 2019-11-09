package ua.destro967.Database.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachrs")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column (name = "teacher_name")
    private String teacherName;

    @OneToOne
    private LessonsList lessonsList;

    @ManyToMany
    @JoinTable(name = "teachersassubjects",
                joinColumns = @JoinColumn(name= "teacher_id"),
                inverseJoinColumns =@JoinColumn(name = "subject_id") )
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

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setLessonsList(LessonsList lessonsList) {
        this.lessonsList = lessonsList;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public LessonsList getLessonsList() {
        return lessonsList;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", lessonsList=" + lessonsList +
                ", subjects=" + subjects +
                '}';
    }
}
