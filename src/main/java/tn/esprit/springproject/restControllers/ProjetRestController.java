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
    public Projet retrieveProjetById(@PathVariable Long idP) {
        return iProjetService.retrieveProjetById(idP);
    }

    @DeleteMapping("/deleteProjetById/{idP}")
    public void deleteProjetById(@PathVariable Long idP) {
        iProjetService.deleteProjetById(idP);
    }

    @PutMapping("/affecterProjetDetailAProjet/{projetId}/{projetDetailId}")
    public void affecterProjetDetailAProjet(@PathVariable Long projetId, @PathVariable Long projetDetailId) {
        iProjetService.affecterProjetDetailAProjet(projetId, projetDetailId);
    }

    @PutMapping("/affecterProjetAEquipe/{projetId}/{equipeId}")
    public void affecterProjetAEquipe(@PathVariable Long projetId, @PathVariable Long equipeId) {
        iProjetService.affecterProjetAEquipe(projetId, equipeId);
    }

    @PostMapping("/ajouterProjetEtAffecterProjetDetail/{projetDetailId}")
    public Projet ajouterProjetEtAffecterProjetDetail(@RequestBody Projet projet,@PathVariable Long projetDetailId) {
     return    iProjetService.ajouterProjetEtAffecterProjetDetail(projet,projetDetailId);
    }
    @PutMapping("/DesaffecterProjetDetailDeProjet/{projetId}")
    public Projet DesaffecterProjetDetailDeProjet(@PathVariable Long projetId) {
     return   iProjetService.DesaffecterProjetDetailDeProjet(projetId);
    }
    @PutMapping("/desaffecterProjetDeEquipe/{projetId}/{equipeId}")
    public void desaffecterProjetDeEquipe(@PathVariable Long projetId, @PathVariable Long equipeId) {
        iProjetService.desaffecterProjetDeEquipe(projetId, equipeId);
    }

}

