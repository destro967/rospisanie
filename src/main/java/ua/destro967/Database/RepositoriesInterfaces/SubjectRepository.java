package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.repository.CrudRepository;
import ua.destro967.Database.Models.Subjects;


public interface SubjectRepository extends CrudRepository<Subjects,Long> {
}