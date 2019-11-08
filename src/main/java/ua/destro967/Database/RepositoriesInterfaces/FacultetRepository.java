package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.Cabinets;
import ua.destro967.Database.Models.Facultets;

import java.util.List;

public interface FacultetRepository extends JpaRepository<Facultets,Long> {

    List<Facultets> findAll();
    List<Facultets> findByName(String name);

    Facultets addFacultet(Facultets facultets);
    Facultets updateFacultet(Facultets newFacultet);
    void deleteFacultet(Facultets facultets);
}
