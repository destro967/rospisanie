package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.Groups;
import ua.destro967.Database.Models.Students;

import java.util.List;

public interface StudentRepository extends JpaRepository<Students, Long> {

    List<Students> findAll();
    List<Students> findAllStudentsByGroup(Groups group);
}
