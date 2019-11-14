package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ua.destro967.Database.Models.Cabinets;

import java.util.List;

public interface CabinetRepository extends CrudRepository<Cabinets,Long> {
    List<Cabinets>  findAll();
    List<Cabinets>  findAllByFree(@Param("free") String free);
    Cabinets        findById(@Param("id") long id);

    Cabinets        removeAllById(@Param("id") long id);
}
