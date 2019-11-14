package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ua.destro967.Database.Models.Facultets;


public interface FacultetRepository extends CrudRepository<Facultets,Long> {

}
