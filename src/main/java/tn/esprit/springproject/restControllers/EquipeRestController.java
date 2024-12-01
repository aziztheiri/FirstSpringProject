package tn.esprit.springproject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Equipe;
import tn.esprit.springproject.services.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EquipeRestController {
    private IEquipeService iEquipeService;
    @PostMapping("/addEquipe")
    public Equipe addEquipe(@RequestBody Equipe equipe) {
        return iEquipeService.addEquipe(equipe);
    }

   @PutMapping("/updateEquipe")
    public Equipe updateEquipe(@RequestBody Equipe equipe) {
        return iEquipeService.updateEquipe(equipe);
    }

    @GetMapping("/retrieveAllEquipe")
    public List<Equipe> retrieveAllEquipe() {
        return iEquipeService.retrieveAllEquipe();
    }

    @GetMapping("/retrieveEquipeById/{idE}")
    public Equipe retrieveEquipeById(@PathVariable Long idE) {
        return iEquipeService.retrieveEquipeById(idE);
    }

    @DeleteMapping("/deleteEquipeById/{idE}")
    public void deleteEquipeById(Long idE) {
        iEquipeService.deleteEquipeById(idE);
    }
}
