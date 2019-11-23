package ua.destro9670.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro9670.springboot.models.Students;

public interface StudentRepository extends JpaRepository<Students,Long> {
}
