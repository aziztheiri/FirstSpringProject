package tn.esprit.springproject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Projet;
import tn.esprit.springproject.services.IProjetService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProjetRestController {
    private IProjetService iProjetService;
    @PostMapping("/addProjet")
    public Projet addProjet(@RequestBody Projet projet) {
        return iProjetService.addProjet(projet);
    }

@PutMapping("/updateProjet")
    public Projet updateProjet(@RequestBody Projet projet) {
        return iProjetService.updateProjet(projet);
    }
    @GetMapping("/retrieveAllProjet")
    public List<Projet> retrieveAllProjet() {
        return iProjetService.retrieveAllProjet();
    }

    @GetMapping("retrieveProjetById/{idP}")
    public Projet retrieveProjetById(@PathVariable String idP) {
        return iProjetService.retrieveProjetById(idP);
    }

@DeleteMapping("/deleteProjetById/{idP}")
    public void deleteProjetById(@PathVariable String idP) {
        iProjetService.deleteProjetById(idP);
    }
}
