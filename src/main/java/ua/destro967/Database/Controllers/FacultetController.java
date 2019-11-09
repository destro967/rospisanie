package ua.destro967.Database.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.destro967.Database.Models.Facultets;
import ua.destro967.Database.RepositoriesInterfaces.FacultetRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FacultetController {

    @Autowired
    FacultetRepository repository;

    @GetMapping("/facultet/find/all")
    public List<Facultets> findAll(){
        List<Facultets> facultets = repository.findAll();
        List<Facultets> facultetsUI = new ArrayList<>();

        for (Facultets facultet: facultets) {
            facultetsUI.add(new Facultets(facultet.getFacultetName()));
        }
        return facultetsUI;
    }

    @RequestMapping("/facultets/update/{id}/{facultetName}")
    public String updateFacultet(@PathVariable long id, @PathVariable String facultetName){
        Facultets facultet = repository.findById(id);
        facultet.setFacultetName(facultetName);
        return "Update was secces";
    }

    @RequestMapping("/facultets/delete/{id}")
    public String removeFacultet(@PathVariable long id){
        return "delete was secces";
    }

    @RequestMapping("/facultets/create/{facultetName}")
    public String addFacultet(@PathVariable long id,@PathVariable String facultetName){
        Facultets facultet = repository.save(new Facultets(facultetName));
        return facultet.toString();
    }


}
