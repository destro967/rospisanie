package ua.destro967.Database.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ua.destro967.Database.Models.Cabinets;
import ua.destro967.Database.RepositoriesInterfaces.CabinetRepository;
import ua.destro967.Database.RepositoriesInterfaces.LessonListRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@Transactional
public class CabinetController {

    @Autowired
    CabinetRepository repository;

    @GetMapping("/cabinets/find/all")
    public List<Cabinets> findAll(){
        List<Cabinets> cabinets = repository.findAll();
        List<Cabinets> cabinetsUI = new ArrayList<>();

        for (Cabinets cabinet: cabinets) {
            cabinetsUI.add(new Cabinets(cabinet.getId(),cabinet.getFree()/*,cabinet.getLessonsList()*/));
        }
        return cabinetsUI;
    }

    @RequestMapping("/cabinets/delete/{id}")
    public String deleteCabinete(@PathVariable long id){
        repository.removeById(id);
        return "Delete was secces";
    }

    @RequestMapping("/cabinets/update/{id}/{free}")
    public String updateById(@PathVariable long id, @PathVariable String free){
        Cabinets cabinets = repository.findById(id);
        cabinets.setFree(free);
        return cabinets.toString();
    }

    @RequestMapping("/cabinets/create/{free}")
    public String addNewCabinet(@PathVariable String free){
        Cabinets cabinet = repository.save(new Cabinets(free));
        return cabinet.toString();
    }
}