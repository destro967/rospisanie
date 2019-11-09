package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.*;

import java.util.List;

public interface LessonListRepository extends JpaRepository<LessonsList,Long> {

    List<LessonsList> findAll();
    List<LessonsList> findAllByCabinet(Cabinets cabinet);
    List<LessonsList> findAllByTeacher(Teachers teacher);
    List<LessonsList> findAllByGroup(Groups group);
    List<LessonsList> findAllBySubject(Subjects subject);
    List<LessonsList> findAllByTeacherAndCabinetAndGroupAndSubject(Teachers teacher, Cabinets cabinet, Groups group, Subjects subject);
}
