package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Equipe;
import tn.esprit.springproject.entities.Projet;
import tn.esprit.springproject.entities.ProjetDetail;
import tn.esprit.springproject.repositories.EquipeRepository;
import tn.esprit.springproject.repositories.ProjetDetailRepository;
import tn.esprit.springproject.repositories.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetServiceIMP implements IProjetService{
    private ProjetRepository projetRepository;
    private ProjetDetailRepository projetDetailRepository;
    private EquipeRepository equipeRepository;
    @Override
    public Projet addProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public List<Projet> retrieveAllProjet() {
        return projetRepository.findAll();
    }

    @Override
    public Projet retrieveProjetById(Long idP) {
        return projetRepository.findById(idP).orElse(null);
    }

    @Override
    public void deleteProjetById(Long idP) {
        projetRepository.deleteById(idP);
    }

    @Override
    public void affecterProjetDetailAProjet(Long projetId, Long projetDetailId) {
        Projet projet = projetRepository.findById(projetId).orElse(null);
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).orElse(null);
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }

    @Override
    public void affecterProjetAEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).orElse(null);
        Equipe equipe = equipeRepository.findById(equipeId).orElse(null);
        equipe.getProjets().add(projet);
        equipeRepository.save(equipe);
    }

    @Override
    public Projet ajouterProjetEtAffecterProjetDetail(Projet projet, Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).orElse(null);
        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }

    @Override
    public Projet DesaffecterProjetDetailDeProjet(Long projetId) {
        Projet projet = projetRepository.findById(projetId).orElse(null);
        projet.setProjetDetail(null);
        return projetRepository.save(projet);
    }

    @Override
    public void desaffecterProjetDeEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).orElse(null);
        Equipe equipe = equipeRepository.findById(equipeId).orElse(null);
        equipe.getProjets().remove(projet);
        equipeRepository.save(equipe);

    }
}
