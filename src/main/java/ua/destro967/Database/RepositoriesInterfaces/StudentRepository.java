package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.repository.CrudRepository;
import ua.destro967.Database.Models.Students;


public interface StudentRepository extends CrudRepository<Students, Long> {

}
