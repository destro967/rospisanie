package ua.destro967.Database.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.destro967.Database.Models.Cabinets;
import ua.destro967.Database.RepositoriesInterfaces.CabinetRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
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
}