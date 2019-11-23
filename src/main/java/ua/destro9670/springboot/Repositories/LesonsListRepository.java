package ua.destro9670.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro9670.springboot.models.LessonList;

public interface LesonsListRepository extends JpaRepository<LessonList,Long> {
}
