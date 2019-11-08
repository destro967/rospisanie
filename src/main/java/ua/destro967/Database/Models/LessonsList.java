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
}
