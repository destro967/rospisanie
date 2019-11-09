package ua.destro967.Database.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.destro967.Database.RepositoriesInterfaces.LessonListRepository;

@RestController
@Transactional
public class LessonListController {

    @Autowired
    LessonListRepository repository;

    @RequestMapping("lessonlist/delete/cabinet/{id}")
    public String deleteByCabinetId(@PathVariable long id){
        repository.removeAllByCabinetId(id);
        return "delete secces";
    }

///TODO write geter methods
}
