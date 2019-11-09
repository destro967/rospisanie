package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.Cabinets;
import ua.destro967.Database.Models.Facultets;

import java.util.List;

public interface FacultetRepository extends JpaRepository<Facultets,Long> {

    List<Facultets> findAll();
    List<Facultets> findByFacultetName(String name);
    Facultets       findById(long id);

    void            removeAllByFacultetName(String facultetName);
    void            removeById(long id);

    Facultets       save(Facultets facultets);

}
