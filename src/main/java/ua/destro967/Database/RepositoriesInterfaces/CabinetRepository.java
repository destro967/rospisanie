package ua.destro967.Database.RepositoriesInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.Cabinets;

import java.util.List;

public interface CabinetRepository extends JpaRepository<Cabinets,Long> {
    List<Cabinets>  findAll();
    List<Cabinets>  findAllByFree(String free);
    Cabinets        findById(long id);

    void            removeById(long id);

    Cabinets        save(Cabinets cabinet);
}
