package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.Cabinets;
import ua.destro967.Database.Models.Groups;
import ua.destro967.Database.Models.LessonsList;
import ua.destro967.Database.Models.Teachers;

import java.util.List;

public interface LessonListRepository extends JpaRepository<LessonsList,Long> {

    List<LessonsList> findAll();
    List<LessonsList> findAllByCabinet(Cabinets cabinet);
    List<LessonsList> findAllByTeacher(Teachers teacher);
    List<LessonsList> findAllByGroups(Groups group);
    List<LessonsList> findAllByTeacherAndCabinetAndGroup(Teachers teacher, Cabinets cabinet, Groups group);
    ///TODO write get/set methods

}
