package ua.destro967.Database.RepositoriesInterfaces;

import jdk.internal.loader.AbstractClassLoaderValue;
import org.springframework.data.jpa.repository.JpaRepository;
import ua.destro967.Database.Models.Subjects;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subjects,Long> {
    List<Subjects> findAll();
    List<Subjects> findBySubjectscol(String subjectCol);
    List<Subjects> findBySubjectName(String subjectName);

    Subjects addFacultet(Subjects subject);
    Subjects updateFacultet(Subjects newSubject);
    void deleteFacultet(Subjects subject);

}
