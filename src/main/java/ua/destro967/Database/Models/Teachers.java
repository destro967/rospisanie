package ua.destro967.Database.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachrs")
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToOne
    private LessonsList lessonsList;

    @ManyToMany
    @JoinTable(name = "teachersassubjects",
                joinColumns = @JoinColumn(name= "teacher_id"),
                inverseJoinColumns =@JoinColumn(name = "subject_id") )
    List<Subjects> subjects;


    public Teachers(long id) {
        this.id = id;
    }

    public Teachers() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
