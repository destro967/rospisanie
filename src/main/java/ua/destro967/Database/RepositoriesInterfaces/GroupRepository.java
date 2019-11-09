package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.Cabinets;
import ua.destro967.Database.Models.Facultets;
import ua.destro967.Database.Models.Groups;

import java.util.List;

public interface GroupRepository extends JpaRepository<Groups,Long> {

    List<Groups> findAll();
    List<Groups> findAllByWorckdays(String workdays);
    List<Groups> findAllByFacultet(Facultets facultet);
}
