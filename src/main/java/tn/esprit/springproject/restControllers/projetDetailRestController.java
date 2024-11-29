package tn.esprit.springproject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.ProjetDetail;
import tn.esprit.springproject.services.IProjetDetailService;

import java.util.List;

@RestController
@AllArgsConstructor
public class projetDetailRestController {
    private IProjetDetailService projetDetailService;
    @PostMapping("/addProjetDetail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return projetDetailService.addProjetDetail(projetDetail);
    }
    @PutMapping("/updateProjetDetail")
    public ProjetDetail updateProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return projetDetailService.updateProjetDetail(projetDetail);
    }

    @GetMapping("/retrieveAllProjetDetail")
    public List<ProjetDetail> retrieveAllProjetDetail() {
        return projetDetailService.retrieveAllProjetDetail();
    }
    @GetMapping("/retrieveProjetDetailById/{idPd}")
    public ProjetDetail retrieveProjetDetailById(@PathVariable Long idPd) {
        return projetDetailService.retrieveProjetDetailById(idPd);
    }
    @DeleteMapping("/deleteProjetDetailById{idPd}")
    public void deleteProjetDetailById(@PathVariable Long idPd) {
        projetDetailService.deleteProjetDetailById(idPd);
    }
}
