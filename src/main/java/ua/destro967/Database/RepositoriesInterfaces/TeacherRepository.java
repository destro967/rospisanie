package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.Teachers;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teachers,Long> {

    List<Teachers> findAll();
    List<Teachers> findByTeacherName(String name);
}
