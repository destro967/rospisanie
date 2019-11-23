package ua.destro9670.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro9670.springboot.models.Groups;

public interface GroupRepository extends JpaRepository<Groups,Long> {
}
