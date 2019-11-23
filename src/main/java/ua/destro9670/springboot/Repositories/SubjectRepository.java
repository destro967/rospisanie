package ua.destro9670.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro9670.springboot.models.Subjects;

public interface SubjectRepository extends JpaRepository<Subjects,Long> {
}
