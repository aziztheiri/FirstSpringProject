package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Projet;
import tn.esprit.springproject.repositories.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetServiceIMP implements IProjetService{
    private ProjetRepository projetRepository;
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
    public Projet retrieveProjetById(String idP) {
        return projetRepository.findById(idP).orElse(null);
    }

    @Override
    public void deleteProjetById(String idP) {
        projetRepository.deleteById(idP);
    }
}
